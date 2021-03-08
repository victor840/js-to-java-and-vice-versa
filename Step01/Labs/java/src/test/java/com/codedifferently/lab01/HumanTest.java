package com.codedifferently.lab01;

import org.junit.Assert;
import org.junit.Test;

public class HumanTest {

    /**
     * Sample test, you must complete the rest
     */
    @Test
    public void getNameTest(){
        //given
        Human human = new Human();
        human.setName("Victor");


        //when
        String expected = "Victor";
        String actual = human.getName();

        //then
        Assert.assertEquals(expected, actual);
    }
}
