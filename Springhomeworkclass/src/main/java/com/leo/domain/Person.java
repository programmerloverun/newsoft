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
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Person {
    private String pid;
    private String pname;
    private String pwd;
}
