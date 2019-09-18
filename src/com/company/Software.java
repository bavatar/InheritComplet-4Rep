package com.company;

public class Software extends Product {
    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    @Override
    public String toString(){
        return "Code:                " + getCode() + "\n" +
                "Description:        " + getDescription() + "\n" +
                "Price:              " + getFormattedPrice() + "\n" +
                "Software written by " + getProgrammer();
    }

    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
