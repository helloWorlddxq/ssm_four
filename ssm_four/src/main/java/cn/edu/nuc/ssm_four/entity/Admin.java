package cn.edu.nuc.ssm_four.entity;

public class Admin {
    private Integer aid;

    private String aname;

    private String apass;

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname == null ? null : aname.trim();
    }

    public String getApass() {
        return apass;
    }

    public void setApass(String apass) {
        this.apass = apass == null ? null : apass.trim();
    }

	@Override
	public String toString() {
		return "Admin [aid=" + aid + ", aname=" + aname + ", apass=" + apass + "]";
	}
    
}