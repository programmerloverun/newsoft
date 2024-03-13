package com.leo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @author leijiong
 * @version 1.0
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {

    private String username;
    private String password;


}
