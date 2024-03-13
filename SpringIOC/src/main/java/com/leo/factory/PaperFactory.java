package com.leo.factory;

import com.leo.pojo.Paper;

/**
 * @author leijiong
 * @version 1.0
 */
public class PaperFactory {
    public static Paper createstaticPaper() {
        return new Paper( "静态A4", "100");
    }
    public Paper createPaper() {
        return new Paper( "A4", "100");
    }
}
