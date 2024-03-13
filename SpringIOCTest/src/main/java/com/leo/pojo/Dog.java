package com.leo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author leijiong
 * @version 1.0
 */


public class Dog {
    private Integer did;
    private String dname;


    public Dog() {
    }

    public Dog(Integer did) {
        this.did = did;

    }

    public Dog(String dname) {
        this.dname = dname;
    }

    public Dog(Integer did, String dname) {
        this.did = did;
        this.dname = dname;
    }

    /**
     * 获取
     *
     * @return did
     */
    public Integer getDid() {
        return did;
    }

    /**
     * 设置
     *
     * @param did
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * 获取
     *
     * @return dname
     */
    public String getDname() {
        return dname;
    }

    /**
     * 设置
     *
     * @param dname
     */
    public void setDname(String dname) {
        this.dname = dname;
    }

    public String toString() {
        return "Dog{did = " + did + ", dname = " + dname + "}";
    }
}
