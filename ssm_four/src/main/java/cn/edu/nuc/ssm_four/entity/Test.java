package cn.edu.nuc.ssm_four.entity;

public class Test {
    private Integer testid;

    private Integer pid;

    private Integer sid;

    public Integer getTestid() {
        return testid;
    }

    public void setTestid(Integer testid) {
        this.testid = testid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

	@Override
	public String toString() {
		return "Test [testid=" + testid + ", pid=" + pid + ", sid=" + sid + "]";
	}
    
}