package com.pojo;

public class Computers {
    private Long id;

    private String brand;

    private Float price;

    private Float runmem;

    private String cpu;

    private Float xianka;

    private String status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getRunmem() {
        return runmem;
    }

    public void setRunmem(Float runmem) {
        this.runmem = runmem;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu == null ? null : cpu.trim();
    }

    public Float getXianka() {
        return xianka;
    }

    public void setXianka(Float xianka) {
        this.xianka = xianka;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}