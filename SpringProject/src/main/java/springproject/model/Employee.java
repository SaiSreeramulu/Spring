package springproject.model;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	
	int empid;
	String name;
	String dept;
	public Employee() {
		empid=2222;
		name="Mahesh";
		dept="Quality";
	}
	public Employee(int empid, String name, String dept) {
		super();
		this.empid = empid;
		this.name = name;
		this.dept = dept;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", dept=" + dept + "]";
	}
	

}