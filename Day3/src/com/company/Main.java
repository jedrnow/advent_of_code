package com.company;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            File file = new File("input.txt");
            Scanner myReader = new Scanner(file);
            List<String> list = new ArrayList<String>();
            int[] tab = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            char[] tab_char1 = new char[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
            char[] tab_char2 = new char[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                list.add(data);
            }
            myReader.close();

            for(int i=0;i<list.size();i++){
                String tmp=list.get(i);
                for(int j=0;j<tmp.length();j++){
                    if(tmp.charAt(j)=='1'){
                        tab[j]+=1;
                    }
                }
            }


            for(int i=0;i<12;i++){
                if(tab[i]>list.size()/2){
                    tab_char1[i]='1';
                    tab_char2[i]='0';
                }
                else{
                    tab_char1[i]='0';
                    tab_char2[i]='1';
                }
            }

            String str1=String.copyValueOf(tab_char1);
            String str2=String.copyValueOf(tab_char2);
            System.out.println("Gamma rate:");
            System.out.println(str1);
            int decimal1=Integer.parseInt(str1,2);
            System.out.println(decimal1);
            System.out.println("Epsilon rate:");
            System.out.println(str2);
            int decimal2=Integer.parseInt(str2,2);
            System.out.println(decimal2);
            System.out.println("Power consumption:");
            System.out.println(decimal1*decimal2);

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}