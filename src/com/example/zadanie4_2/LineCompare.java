package com.example.zadanie4_2;

public class LineCompare {
    // odwołanie do klasy reprezentowanej przez Line
    public Line longerLine(Line l1, Line l2){
        int l1lenght = l1.getP2().getX()-l1.getP1().getX(); // ogarnąć kurwa
        int l2lenght = 5;
        if(l1lenght>l2lenght)
            return l1;
        else
            return l2;
    }

}



