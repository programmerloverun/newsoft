package com.leo.mapper;

import com.leo.domain.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @author leijiong
 * @version 1.0
 */
public class PersonMapperImp implements PersonMapper{
    //使用属性list存储Perwson数据，模拟数据库
    private List<Person> List;
    {
        //使用代码块属性赋初始值，代码块值在类被实例化的时候调用
        List=new ArrayList<Person>();
        List.add(new Person(100,"xl",123));
    }
}
