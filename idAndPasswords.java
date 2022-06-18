import java.util.HashMap;

public class idAndPasswords {
	
	HashMap<String, String> info = new HashMap<String, String>();
	
	idAndPasswords() {
		info.put("Solomon", "Blue");
		info.put("Lee", "Corn");
	}
	
	protected HashMap getInfo() {
		return info;
	}
}
