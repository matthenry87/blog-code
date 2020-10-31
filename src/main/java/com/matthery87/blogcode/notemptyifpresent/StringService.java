package com.matthery87.blogcode.notemptyifpresent;

import org.springframework.stereotype.Service;

@Service
public class StringService {

    void doSomething(String string) {

        if (string != null && !string.isEmpty()) {

            System.out.println();
        }
    }

}
