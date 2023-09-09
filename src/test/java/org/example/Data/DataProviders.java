package org.example.Data;

import com.github.javafaker.Faker;
import net.bytebuddy.asm.Advice;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.internal.invokers.Arguments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class DataProviders {

    @DataProvider
    Iterator<Object[]> newContact (){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Kostya", "Shabel", "Vad"});
       /* list.add(new Object[]{"Kostya456", "Shabel456", "Vad456"});
        list.add(new Object[]{"Kostya7890", "Shabel7890", "Vad7890"});*/
        return list.iterator();
    }

    @DataProvider
    Iterator<Object[]> searchContact (){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Kostya"});
        list.add(new Object[]{"Shabel456"});
        list.add(new Object[]{"Risker"});
        /*list.add(new Object[]{"Koch"});
        list.add(new Object[]{"Vad7890"});*/
        return list.iterator();
    }
    @DataProvider
    Iterator<Object[]> removeContactFromList (){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Kostya"});
        return list.iterator();
    }
    @DataProvider
    Iterator<Object[]> removeContactData () {
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Erma"});
        list.add(new Object[]{"Koch"});
        list.add(new Object[]{"Vad7890"});
        return list.iterator();
    }
}

