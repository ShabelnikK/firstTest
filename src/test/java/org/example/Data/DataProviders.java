package org.example.Data;

import org.testng.annotations.DataProvider;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {

    @DataProvider
    Iterator<Object[]> newContact (){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Kostya", "Shabel", "BigJ"});
        list.add(new Object[]{"Kostya456", "Shabelnik321", "Big Jj"});
        list.add(new Object[]{"Kostya7890", "Shabelnik321234", "Big Jj kk"});
        return list.iterator();
    }

    @DataProvider
    Iterator<Object[]> searchText (){
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Okay"});
        list.add(new Object[]{"Crist"});
        list.add(new Object[]{"Arbeit"});
        return list.iterator();
    }
}
