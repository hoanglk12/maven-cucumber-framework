package commons;

import java.io.File;

public class GlobalConstants {
	public static final String DEV_URL = "https://demo.nopcommerce.com/";
	public static final String LIVE_GURU_URL = "http://live.techpanda.org/";
	public static final long SHORT_TIMEOUT = 7;
	public static final long LONG_TIMEOUT = 30;
	public static final String PROJECT_PATH = System.getProperty("user.dir");
	public static final String UPLOAD_FOLDER_PATH = PROJECT_PATH + File.separator + "uploadFiles" + File.separator;
	public static final String DOWNLOAD_FOLDER_PATH = PROJECT_PATH + File.separator + "downloadFiles";
	public static final String BROWSER_LOGS_FOLDER_PATH = PROJECT_PATH + File.separator + "browserLogs";
}
