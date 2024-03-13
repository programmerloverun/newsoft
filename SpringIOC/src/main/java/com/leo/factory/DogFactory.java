package com.leo.factory;

import com.leo.pojo.Dog;

/**
 * @author leijiong
 * @version 1.0
 */
public class DogFactory {
    public static Dog getstaticDog() {
        return new Dog("静态旺财", 3);
    }
    public Dog getDog() {
        return new Dog("旺财", 3);
    }
}
