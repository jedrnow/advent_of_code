package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // reading file
        String filePath = "input.txt";
        BufferedReader file = null;
        List<Integer> list = new ArrayList<>();

        try {
            file = new BufferedReader(new FileReader(filePath));
            String n = file.readLine();
            while (n != null) {
                int x = Integer.parseInt(n);
                list.add(x);
                n = file.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (file != null) {
                file.close();
            }
        }

        //part 1

        int counter1 = 0;

        for(int i=1;i<list.size();i++){
            if(list.get(i)>list.get(i-1)){
                counter1++;
            }
        }

        //part 2

        int counter2 = 0;
        List<Integer> tempList = new ArrayList<>();
        int sum;

        for(int i=2;i<list.size();i++){
            sum=list.get(i)+list.get(i-1)+list.get(i-2);
            tempList.add(sum);
        }

        for(int i=1;i<tempList.size();i++){
            if(tempList.get(i)>tempList.get(i-1)){
                counter2++;
            }
        }

        System.out.println("Part 1");
        System.out.println(counter1);
        System.out.println("Part 2");
        System.out.println(counter2);

    }
}
