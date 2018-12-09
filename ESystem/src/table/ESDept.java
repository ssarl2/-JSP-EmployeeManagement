package table;

public class ESDept {

	protected int deptNo;
	protected String deptName;
	protected String manager;
	
	public int getDeptNo() {
		return deptNo;
	}
	public ESDept setDeptNo(int deptNo) {
		this.deptNo = deptNo;
		return this;
	}
	public String getDeptName() {
		return deptName;
	}
	public ESDept setDeptName(String deptName) {
		this.deptName = deptName;
		return this;
	}
	public String getManager() {
		return manager;
	}
	public ESDept setManager(String manager) {
		this.manager = manager;
		return this;
	}
	
	

}
