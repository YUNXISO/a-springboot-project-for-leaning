package com.jshen.girl.PO;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class JsonTest {
    private Date date;
    private String name;

    public JsonTest(Date date, String name) {
        this.date = date;
        this.name = name;
    }

    @JsonFormat(pattern = "yyyy-mm-dd hh:mm:ss",locale = "zh",timezone = "GMT+8")
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
