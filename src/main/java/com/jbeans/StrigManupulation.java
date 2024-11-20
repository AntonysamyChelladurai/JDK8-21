package com.jbeans;

public class StrigManupulation {

    int lengthOfLastWord(String s){
       String[] arrstr= s.split(" ");
       int index=arrstr.length;
       System.out.println("Last word :: "+ arrstr[index-1]);
      return arrstr[index-1].length();
    }
}
