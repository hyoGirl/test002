package cn.xulei.annoation.logger;

public class User {

	private String username;

	private String userpassword;

	public String getUsername() {
		return username;
	}

	public String getUserpassword() {
		return userpassword;
	}

	public void setUserpassword(String userpassword) {
		this.userpassword = userpassword;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", userpassword=" + userpassword + "]";
	}

}
