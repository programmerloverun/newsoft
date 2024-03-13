package com.leo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author leijiong
 * @version 1.0
 */
@Data
//@NoArgsConstructor
//@AllArgsConstructor
@ToString
public class Person {
    private Integer pid;
    private String pname;
    private Integer pwd;

    public Person() {
    }

    public Person(Integer pid, String pname, Integer pwd) {
        this.pid = pid;
        this.pname = pname;
        this.pwd = pwd;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public Integer getPwd() {
        return pwd;
    }

    public void setPwd(Integer pwd) {
        this.pwd = pwd;
    }
}
