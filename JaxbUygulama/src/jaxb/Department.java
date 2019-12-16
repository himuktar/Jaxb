package jaxb;

public class Department {
	
	private int departmentID;
	private String departmentName;
	
	public Department() {
		super();
	}
	
	public Department(int departmentID, String departmentName) {
		super();
		this.departmentID = departmentID;
		this.departmentName = departmentName;
	}
	
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	
	@Override
    public String toString() {
        return "Department [department id=" + departmentID + ", department name=" + departmentName + "]";
    }
}