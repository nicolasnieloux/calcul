package org.example;

public class Calculator {

private int a;
private int b;


public int add(int a, int b){
        return a+b;
}

public String divise(int a, int b){
        if (b==0){
                return ("division par zero impossible");
        }
        else {
                return String.valueOf(a/b);
        }
}

}
