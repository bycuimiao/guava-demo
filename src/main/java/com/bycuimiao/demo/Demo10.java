package com.bycuimiao.demo;

import java.util.Arrays;
import com.google.common.base.Joiner;

public class Demo10 {
    public static void main(String args[]){
        Demo10 tester = new Demo10();
        tester.testJoiner();
    }

    private void testJoiner(){
        System.out.println(Joiner.on(",")
                .skipNulls()
                .join(Arrays.asList(1,2,3,4,5,null,6)));
    }
}