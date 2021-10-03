package liveguru.stepDefinitions;

import java.util.HashMap;
import java.util.Map;

public class DataContext {
	private Map<String, Object> dataContext;
	public DataContext() {
		dataContext = new HashMap<>();
	}
	public void setContext(Context key, Object value) {
		dataContext.put(key.toString(), value);
	}
	public String getContext(Context key) {
		return (String) dataContext.get(key.toString());
	}
}
