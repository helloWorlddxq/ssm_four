package cn.edu.nuc.ssm_four.entity;

public class Teacher {
    private Integer tid;

    private Integer aid;

    private String tname;

    private String tcourse;

    private String tpass;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname == null ? null : tname.trim();
    }

    public String getTcourse() {
        return tcourse;
    }

    public void setTcourse(String tcourse) {
        this.tcourse = tcourse == null ? null : tcourse.trim();
    }

    public String getTpass() {
        return tpass;
    }

    public void setTpass(String tpass) {
        this.tpass = tpass == null ? null : tpass.trim();
    }

	@Override
	public String toString() {
		return "Teacher [tid=" + tid + ", aid=" + aid + ", tname=" + tname + ", tcourse=" + tcourse + ", tpass=" + tpass
				+ "]";
	}
    
}