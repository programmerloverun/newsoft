package com.leo.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author leijiong
 * @version 1.0
 */

public class Person {
    private String pname;
    private Integer page;
    private Dog dog;
    private List<String> list;
    private List<Dog> listDog;
    private Set<String> set;
    private Set<Dog> setDog;
    private Map<String, String> map;
    private Map<String, Dog> mapDog;

    public Person() {
    }

    public Person(String pname, Integer page, Dog dog, List<String> list, List<Dog> listDog, Set<String> set, Set<Dog> setDog, Map<String, String> map, Map<String, Dog> mapDog) {
        this.pname = pname;
        this.page = page;
        this.dog = dog;
        this.list = list;
        this.listDog = listDog;
        this.set = set;
        this.setDog = setDog;
        this.map = map;
        this.mapDog = mapDog;
    }

    /**
     * 获取
     * @return pname
     */
    public String getPname() {
        return pname;
    }

    /**
     * 设置
     * @param pname
     */
    public void setPname(String pname) {
        this.pname = pname;
    }

    /**
     * 获取
     * @return page
     */
    public Integer getPage() {
        return page;
    }

    /**
     * 设置
     * @param page
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * 获取
     * @return dog
     */
    public Dog getDog() {
        return dog;
    }

    /**
     * 设置
     * @param dog
     */
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    /**
     * 获取
     * @return list
     */
    public List<String> getList() {
        return list;
    }

    /**
     * 设置
     * @param list
     */
    public void setList(List<String> list) {
        this.list = list;
    }

    /**
     * 获取
     * @return listDog
     */
    public List<Dog> getListDog() {
        return listDog;
    }

    /**
     * 设置
     * @param listDog
     */
    public void setListDog(List<Dog> listDog) {
        this.listDog = listDog;
    }

    /**
     * 获取
     * @return set
     */
    public Set<String> getSet() {
        return set;
    }

    /**
     * 设置
     * @param set
     */
    public void setSet(Set<String> set) {
        this.set = set;
    }

    /**
     * 获取
     * @return setDog
     */
    public Set<Dog> getSetDog() {
        return setDog;
    }

    /**
     * 设置
     * @param setDog
     */
    public void setSetDog(Set<Dog> setDog) {
        this.setDog = setDog;
    }

    /**
     * 获取
     * @return map
     */
    public Map<String, String> getMap() {
        return map;
    }

    /**
     * 设置
     * @param map
     */
    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    /**
     * 获取
     * @return mapDog
     */
    public Map<String, Dog> getMapDog() {
        return mapDog;
    }

    /**
     * 设置
     * @param mapDog
     */
    public void setMapDog(Map<String, Dog> mapDog) {
        this.mapDog = mapDog;
    }

    public String toString() {
        return "Person{pname = " + pname + ", page = " + page + ", dog = " + dog + ", list = " + list + ", listDog = " + listDog + ", set = " + set + ", setDog = " + setDog + ", map = " + map + ", mapDog = " + mapDog + "}";
    }
}
