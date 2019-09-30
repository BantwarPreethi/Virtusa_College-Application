package com.virtusa.integrate;

import java.util.ResourceBundle;

public class DataSource {
	//any value we retrieve from the properties file should be a string
		private String driver;
		private String url;
		private String username;
		private String password;
		
		public DataSource() {
			ResourceBundle resourceBundle=ResourceBundle.getBundle("DB");
			//by default resource bundle will read properties file from the class path
			this.driver=resourceBundle.getString("driver"); //we r reading putting the value in the datasource object
			this.url=resourceBundle.getString("url");
			this.username=resourceBundle.getString("username");
			this.password=resourceBundle.getString("password");
			
		}

		public String getDriver() {
			return driver;
		}

		public void setDriver(String driver) {
			this.driver = driver;
		}

		public String getUrl() {
			return url;
		}

		public void setUrl(String url) {
			this.url = url;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		
	}



