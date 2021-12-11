package entity;

public class Admin extends User{
	public Admin(int id,String fullname, String username, String email, String password, int expInYear) {
		super(id, fullname, username, email, password);
		this.expInYear=expInYear;
	}

	private int expInYear;

	@Override
	public String toString() {
		return "User [id=" + getId() + ", fullName=" + getFullName() + ", userName=" + getUserName() + ", email="
				+ getEmail() + ", password=" + getPassword() + "]"+"Employee [expInYear=" + expInYear + "]";
	}
	
	
}
