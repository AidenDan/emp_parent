package com.pojo;

import org.springframework.stereotype.Component;

@Component
public class Dept {
    private Integer did;

    private String dname;

    private String dtel;

    public Dept() {
    }

    public Dept(Integer did, String dname, String dtel) {
        this.did = did;
        this.dname = dname;
        this.dtel = dtel;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "did=" + did +
                ", dname='" + dname + '\'' +
                ", dtel='" + dtel + '\'' +
                '}';
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname == null ? null : dname.trim();
    }

    public String getDtel() {
        return dtel;
    }

    public void setDtel(String dtel) {
        this.dtel = dtel == null ? null : dtel.trim();
    }
}