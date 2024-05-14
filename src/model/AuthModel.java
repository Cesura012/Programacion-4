package model;

public class AuthModel {
	
	 private String username;
	    private String password;
	 
	    public AuthModel(){
	 
	    }
	 
	    public AuthModel(String username, String password){
	        this.username = username;
	        this.password = password;
	    }
	    public String getPassword() {
	        return password;
	    }
	    public void setPassword(String password) {
	        this.password = password;
	    }
	    public String getUserName() {
	        return username;
	    }
	    public void setUserName(String userName) {
	        this.username = userName;
	    }
}
