package com.leo.mapper;

import com.leo.domain.Person;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author leijiong
 * @version 1.0
 */
@Repository
public class PersonMapperImp implements PersonMapper{
    //使用属性list存储Person数据，模拟数据库
    private List<Person> List;
    {
        //使用代码块属性赋初始值，代码块值在类被实例化的时候调用
        List=new ArrayList<Person>();
        List.add(new Person("100","leo","123"));
    }

    @Override
    public Person selectPersonByNameAndPwd(String name, String pwd) {
        for (Person person : List) {
            if(person.getPname().equals(name) && person.getPwd().equals(pwd)){
                return person;
            }
        }
        return null;
    }

    @Override
    public java.util.List<Person> selectAll() {
        return List;
    }

    @Override
    public boolean insertPerson(Person person) {
        // 查看如果有用户名相同的用户，返回false
        for (Person p : List) {
            if(p.getPname().equals(person.getPname())){
                return false;
            }
        }
        // 执行插入操作
        person.setPid(UUID.randomUUID().toString().replace("-",""));
        return List.add(person);
    }

    @Override
    public Person selectPersonByName(String name) {
        for (Person person : List) {
            if(person.getPname().equals(name)){
                return person;
            }
        }
        return null;
    }

    @Override
    public boolean delByName(String name) {
        for (Person person : List) {
            if(person.getPname().equals(name)){
                return List.remove(person);
            }
        }
        return false;
    }

    @Override
    public boolean alter(Person person) {
        for (Person p : List) {
            if(p.getPname().equals(person.getPname())){
                p.setPwd(person.getPwd());
                return true;
            }
        }
        return false;
    }
}
