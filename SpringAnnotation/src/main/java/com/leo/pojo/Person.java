package com.leo.pojo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author leijiong
 * @version 1.0
 */

@Component
@Data
public class Person {
    @Value("100")
    private Integer pid;
    @Value("张三")
    private String pname;
}
