package cn.edu.nuc.ssm_four.entity;

public class Paper {
    private Integer pid;

    private Integer tid;

    private String pname;

    private String ptype;

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype == null ? null : ptype.trim();
    }

	@Override
	public String toString() {
		return "Paper [pid=" + pid + ", tid=" + tid + ", pname=" + pname + ", ptype=" + ptype + "]";
	}
    
}