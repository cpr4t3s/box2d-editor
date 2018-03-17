package aurelienribon.bodyeditor.models;

import com.badlogic.gdx.math.Vector2;

import sun.security.provider.certpath.Vertex;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Aurelien Ribon | http://www.aurelienribon.com/
 */
public class ShapeModel {
	public enum Type {POLYGON, CIRCLE}

    private final List<ShapeVertice> vertices = new ArrayList<ShapeVertice>();
	private final Type type;
	private boolean isClosed = false;

	public ShapeModel(Type type) {
		this.type = type;
	}

	public List<ShapeVertice> getDetailVertices() {
		return vertices;
	}

	private List<Vector2> detailVerticesToVertices() {
		List<Vector2> retList = new ArrayList<>();
		for(ShapeVertice dVertice : vertices) {
			retList.add(dVertice.vertex);
		}

		return retList;
	}

	public List<Vector2> getVertices() {
		return detailVerticesToVertices();
	}

	public void addVertex(int index, Vector2 element) {
		vertices.add(
				index,
				new ShapeVertice(
						element,
						null,
						null,
						null
				)
		);
	}
	
	public void addVertex(Vector2 element) {
		vertices.add(
				new ShapeVertice(
						element,
						null,
						null,
						null
				)
		);
	}
	
	public void addAll(List<Vector2> vertices) {
		for(Vector2 v : vertices) {
			addVertex(v);
		}
	}

	public boolean containVertex(Vector2 vertex) {
		for(ShapeVertice dVertice : vertices) {
			if(dVertice.vertex.equals(vertex)) {
				return true;
			}
		}

		return false;
	}

	public void removeVertex(Vector2 vertex) {
		List<ShapeVertice> toRemove = new ArrayList<>();

		for(ShapeVertice dVertice : vertices) {
			if(dVertice.vertex.equals(vertex)) {
				toRemove.add(dVertice);
			}
		}

		for(ShapeVertice dVertice : toRemove) {
			vertices.remove(dVertice);
		}
	}

	public Type getType() {
		return type;
	}

	public void close() {
		isClosed = true;
	}

	public boolean isClosed() {
		return isClosed;
	}
}
