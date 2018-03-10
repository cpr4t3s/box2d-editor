package aurelienribon.bodyeditor.io;

import org.json.JSONException;
import org.json.JSONObject;

public final class JsonHelper {
	
	public static Double getDouble(JSONObject obj, String fieldName, Double defaultValue) {
		try {
			return obj.getDouble(fieldName);
		} catch (JSONException e) {
			return defaultValue;
		}
	}
	
	public static String getString(JSONObject obj, String fieldName, String defaultValue) {
		try {
			return obj.getString(fieldName);
		} catch (JSONException e) {
			return defaultValue;
		}
	}
}
