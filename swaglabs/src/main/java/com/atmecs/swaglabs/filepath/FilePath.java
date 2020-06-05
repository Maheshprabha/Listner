package com.atmecs.swaglabs.filepath;

import java.io.File;

public class FilePath {
	public final static long page_load_timeout = 30;
	public final static long implicit_wait = 60;
	public static final String User_Home = System.getProperty("user.dir") + File.separator;
	public static final String Driver_Path = "./Driver/chromedriver.exe";
	public static final String Locatio_Reader = "./src/main/java/com/atmecs/swaglabs/utils/LocationReader.java";
	public static final String Config_Path = "./src/test/resources/config.properties"; 
	public static final String locator_path = "./src/test/resources/Locators/loginpage.properties";
	public static final String User_data = "./src/test/resources/userdata/userdetails.property";
	
}


