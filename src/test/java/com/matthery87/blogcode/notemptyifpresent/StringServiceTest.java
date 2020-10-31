package com.matthery87.blogcode.notemptyifpresent;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringServiceTest {

    private final StringService stringService = new StringService();

    @Test
    void doSomething() {

        stringService.doSomething(null);
    }

    @Test
    void doSomething2() {

        stringService.doSomething("");
    }

    @Test
    void doSomething3() {

        stringService.doSomething("foo");
    }

}