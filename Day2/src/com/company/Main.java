package com.company;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //part 1

        int horizontal = 0;
        int depth = 0;

        try {
            Scanner x = new Scanner(new File("input.txt"));

            while(x.hasNext()) {
                if(x.hasNext("forward")){
                    x.next();
                    horizontal=horizontal+x.nextInt();
                }
                if(x.hasNext("up")){
                    x.next();
                    depth=depth-x.nextInt();
                }
                if(x.hasNext("down")){
                    x.next();
                    depth=depth+x.nextInt();
                }
            }

        } catch (IOException e) {
            System.out.println("Error accessing input file!");
        }

        //part 2
        int h = 0;
        int d = 0;
        int a = 0;

        try {
            Scanner x = new Scanner(new File("input.txt"));

            while(x.hasNext()) {
                if(x.hasNext("forward")){
                    x.next();
                    int temp=x.nextInt();
                    h=h+temp;
                    d=d+(a*temp);
                }
                if(x.hasNext("up")){
                    x.next();
                    a=a-x.nextInt();
                }
                if(x.hasNext("down")){
                    x.next();
                    a=a+x.nextInt();
                }
            }

        } catch (IOException e) {
            System.out.println("Error accessing input file!");
        }

        //

        System.out.println("Part 1");
        System.out.println("horizontal: " + horizontal);
        System.out.println("depth: " + depth);
        System.out.println("position: " + horizontal*depth);

        System.out.println("Part 2");
        System.out.println("horizontal: " + h);
        System.out.println("depth: " + d);
        System.out.println("position: " + h*d);
    }
}
