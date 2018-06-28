package com.bycuimiao.demo;

import com.google.common.base.Splitter;

public class Demo11 {
    public static void main(String args[]){
        Demo11 tester = new Demo11();
        tester.testSplitter();
    }

    private void testSplitter(){
        System.out.println(Splitter.on(',')
                .trimResults()
                .omitEmptyStrings()
                .split("the ,quick, , brown         , fox,              jumps, over, the, lazy, little dog."));
    }
}