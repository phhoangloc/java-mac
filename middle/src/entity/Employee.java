package entity;

public class Employee extends User {

	public Employee(int id,String fullname, String username, String email, String password, String proSkill) {
		super(id, fullname, username, email, password);
		this.proSkill=proSkill;
	}
	private String proSkill;
	
	@Override
	public String toString() {
		return "User [id=" + getId() + ", fullName=" + getFullName() + ", userName=" + getUserName() + ", email="
				+ getEmail() + ", password=" + getPassword() + "]"+ "[proSkill=" + proSkill + "]";
	}
	
	
}
