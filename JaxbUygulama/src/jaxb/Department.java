package jaxb;

public class Department {

	private int departmentID;

	private String departmentName;

	private String title;

	private String companyName;

	public Department(int departmentID, String departmentName, String title, String companyName) {
		this.departmentID = departmentID;
		this.departmentName = departmentName;
		this.title = title;
		this.companyName = companyName;
	}

	public int getDepartmentID() {
		return departmentID;
	}

	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
}
