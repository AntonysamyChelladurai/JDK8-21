package com.jbeans;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8to21 {

    public void funcPrg() {
        LamdaImpl limpl = new LamdaImpl();
        double total = limpl.getPrice(10, 25);
        System.out.println(total);
    }

    public void quice() {
        char[] vow = {'a', 'e', 'i', 'o', 'u'};
        String note = "black raisins";
        long count = note.chars().filter(ch -> 'a' == ch || 'e' == ch || 'i' == ch || 'o' == ch || 'u' == ch).count();
        System.out.println("Count :: " + count);
        StringBuilder notesb = new StringBuilder(note);
        notesb.chars().filter(ch -> 'a' == ch || 'e' == ch || 'i' == ch || 'o' == ch || 'u' == ch).forEach(i->{System.out.println("index :: "+notesb.indexOf(String.valueOf((char)i)));
            int idx=notesb.indexOf(String.valueOf((char)i));
            notesb.setCharAt(idx,'#');
        });

      /* note.chars().filter(ch->'a'==ch ||'e'==ch||'i'==ch||'o'==ch||'u'==ch).mapToObj(note::indexOf).peek(e->System.out.println(e));
        Arrays.stream(note.split("")).map(Stream.of(vow).);*/

    }
}
