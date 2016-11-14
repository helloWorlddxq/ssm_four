package cn.edu.nuc.ssm_four.entity;

import java.math.BigDecimal;

public class Student {
    private Integer sid;

    private Integer aid;

    private String sname;

    private Integer ssex;

    private String spro;

    private String sclass;

    private String spass;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }


    public Integer getSsex() {
		return ssex;
	}

	public void setSsex(Integer ssex) {
		this.ssex = ssex;
	}

	public String getSpro() {
        return spro;
    }

    public void setSpro(String spro) {
        this.spro = spro == null ? null : spro.trim();
    }

    public String getSclass() {
        return sclass;
    }

    public void setSclass(String sclass) {
        this.sclass = sclass == null ? null : sclass.trim();
    }

    public String getSpass() {
        return spass;
    }

    public void setSpass(String spass) {
        this.spass = spass == null ? null : spass.trim();
    }

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", aid=" + aid + ", sname=" + sname + ", ssex=" + ssex + ", spro=" + spro
				+ ", sclass=" + sclass + ", spass=" + spass + "]";
	}
    
}