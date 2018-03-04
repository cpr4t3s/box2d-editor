package aurelienribon.bodyeditor;

import aurelienribon.bodyeditor.models.RigidBodyModel;
import aurelienribon.utils.notifications.ChangeableObject;
import aurelienribon.utils.notifications.ObservableList;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Aurelien Ribon | http://www.aurelienribon.com/
 */
public class RigidBodiesManager extends ChangeableObject {
	public static final String PROP_SELECTION = "selection";

	private final ObservableList<RigidBodyModel> models = new ObservableList<RigidBodyModel>(this);
	private List<RigidBodyModel> selectedModels = new LinkedList<>();

	public RigidBodiesManager() {
		models.addListChangedListener(new ObservableList.ListChangeListener<RigidBodyModel>() {
			@Override public void changed(Object source, List<RigidBodyModel> added, List<RigidBodyModel> removed) {
				for(RigidBodyModel rb : removed) {
					selectedModels.remove(rb);
				}
				if(selectedModels.size() == 0) {
					select(null);
				} else {
					selectMultiple(selectedModels);
				}
			}
		});
	}

	public ObservableList<RigidBodyModel> getModels() {
		return models;
	}

	public RigidBodyModel getSelectedModel() {
		//assert selectedModel == null || models.contains(selectedModel);
		return selectedModels.get(0);
	}
	
	public List<RigidBodyModel> getSelectedModels() {
		//assert selectedModel == null || models.contains(selectedModel);
		return selectedModels;
	}

	public void select(RigidBodyModel model) {
		assert model == null || models.contains(model);
		selectedModels.clear();
		selectedModels.add(model);
		firePropertyChanged(PROP_SELECTION);
	}
	
	public void selectMultiple(List<RigidBodyModel> models) {
		//assert models == null || models.contains(model);
		selectedModels = models;
		firePropertyChanged(PROP_SELECTION);
	}

	public RigidBodyModel getModel(String name) {
		for (RigidBodyModel model : models)
			if (model.getName().equals(name)) return model;
		return null;
	}
}
