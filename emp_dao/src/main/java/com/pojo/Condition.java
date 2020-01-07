package com.pojo;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author Aiden
 * @version 1.0
 * @description 封装查询条件
 * @date 2019-12-9 14:52:41
 */
@Component
public class Condition {
    private String cname;
    private Double csalarystart;
    private Double csalaryend;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date cdatestart;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date cdateend;
    private Integer cdept;

    public Condition() {
    }

    public Condition(String cname, Double csalarystart, Double csalaryend, Date cdatestart, Date cdateend, Integer cdept) {
        this.cname = cname;
        this.csalarystart = csalarystart;
        this.csalaryend = csalaryend;
        this.cdatestart = cdatestart;
        this.cdateend = cdateend;
        this.cdept = cdept;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Double getCsalarystart() {
        return csalarystart;
    }

    public void setCsalarystart(Double csalarystart) {
        this.csalarystart = csalarystart;
    }

    public Double getCsalaryend() {
        return csalaryend;
    }

    public void setCsalaryend(Double csalaryend) {
        this.csalaryend = csalaryend;
    }

    public Date getCdatestart() {
        return cdatestart;
    }

    public void setCdatestart(Date cdatestart) {
        this.cdatestart = cdatestart;
    }

    public Date getCdateend() {
        return cdateend;
    }

    public void setCdateend(Date cdateend) {
        this.cdateend = cdateend;
    }

    public Integer getCdept() {
        return cdept;
    }

    public void setCdept(Integer cdept) {
        this.cdept = cdept;
    }

    @Override
    public String toString() {
        return "Condition{" +
                "cname='" + cname + '\'' +
                ", csalarystart=" + csalarystart +
                ", csalaryend=" + csalaryend +
                ", cdatestart=" + cdatestart +
                ", cdateend=" + cdateend +
                ", cdept=" + cdept +
                '}';
    }
}
