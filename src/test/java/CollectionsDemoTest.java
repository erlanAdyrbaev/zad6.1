import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsDemoTest {

    @org.junit.jupiter.api.Test
    void countStartWith() {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("d");
        arr.add("der");
        arr.add("dom");
        arr.add("feed");
        arr.add("tea");
        assertEquals(3, CollectionsDemo.countStartWith(arr,'d'));
        assertEquals(1,CollectionsDemo.countStartWith(arr,'f'));
    }

    @org.junit.jupiter.api.Test
    void testCountStartWith() {
    }

    @org.junit.jupiter.api.Test
    void getNamesakes() {
    }

    @org.junit.jupiter.api.Test
    void deleteHuman() {
        Human a = new Human("иван","иванов","иванович",23);
        Human b = new Human("иван","иванов","иванович",23);
        Human c = new Human("иван","иванов","иванович",13);
        ArrayList<Human> abc = new ArrayList<>();
        ArrayList<Human> q = new ArrayList<>();

        abc.add(a);
        abc.add(b);
        abc.add(c);
        List<Human> now = CollectionsDemo.deleteHuman(abc, a);
        Set<Integer> one = new HashSet<>();
        one.add(1);
        one.add(4);
        one.add(6);
        one.add(2);
        one.add(3);
        Set<Integer> two = new HashSet<>();
        two.add(2);
        Set<Integer> three = new HashSet<>();
        three.add(3);
        ArrayList<Set<Integer>> sets = new ArrayList<>();
        sets.add(one);
        sets.add(two);
        sets.add(three);
        ArrayList<Set<Integer>> setsNow =  CollectionsDemo.equalIntNum(sets, two);
        System.out.println(setsNow.toString());


        System.out.println();



    }
}