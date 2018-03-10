package aurelienribon.bodyeditor.models;

import com.badlogic.gdx.math.Vector2;

public class ShapeVertice {
	public final Vector2 vertex;
	// Powerups
	public String type;
	public Float value = null;
	// CamPath
	public Float velocity = null;

	public ShapeVertice(Vector2 vertice, String type, Float value, Float velocity) {
		this.vertex = vertice;
		this.type = type;
		this.value = value;
		this.velocity = velocity;
	}
}
