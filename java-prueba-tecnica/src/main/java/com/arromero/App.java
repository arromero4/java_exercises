package com.arromero;

import java.time.LocalDate;
import java.util.*;

public class App {
    //invertir una cadena
    public void m1InvertingString(String text){
/*        String[] array = text.split("");
        StringBuilder newText =new StringBuilder();
        for (int i = array.length; i > 0; i--) {
            newText.append(array[i-1]);
        }
        System.out.println(newText);*/

        String newText = new StringBuilder(text).reverse().toString();
        System.out.println(newText);
    }

    public void m2IsCapicua(int number){
        String numberText = String.valueOf(number);
        String reverserNumber = new StringBuilder(numberText).reverse().toString();

        if(numberText.equals(reverserNumber)){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
    }

    public void m3CountCharacterTimes(String text){
        int i, length, counter[] = new int[256];
        length = text.length();

        for (i = 0; i < length; i++) {
            //counter[text.charAt(i)] = counter[text.charAt(i)] + 1;
            counter[text.charAt(i)]++;
        }
        for (i = 0; i < 256; i++) {
            if (counter[i] != 0){
                System.out.println((char)i + ":" + counter[i]);
            }
        }

    }

    public void m4RepeatedCharacters(String text){
        int i, length, counter[] = new int[256];
        length = text.length();

        for (i = 0; i < length; i++) {
            //counter[text.charAt(i)] = counter[text.charAt(i)] + 1;
            counter[text.charAt(i)]++;
        }
        for (i = 0; i < 256; i++) {
            if (counter[i] > 1){
                System.out.println((char)i + ":" + counter[i]);
            }
        }
    }

    public void m5IsMultipleof2(int number){
        if(number % 2 == 0){
            System.out.println("Es multiplo");
        }else{
            System.out.println("No es multiplo");
        }
    }

    public void m6IsLeapYear(int year){
        boolean isLeapYear = LocalDate.of(year, 1, 1).isLeapYear();
        System.out.println(isLeapYear);
    }

    public void m7RandomOrderString(String text){
        String[] array = text.split("");
        List<String> list = Arrays.asList(array);
        Collections.shuffle(list);
        list.forEach(System.out::println);

    }

    public void m8getOnlyNotDuplicate(List<Integer> list){
        Set<Integer> set = new HashSet<>(list);
        set.forEach(System.out::println);
    }

    public void m9CheckifVowel(String text){
/*        String[] array = text.split("");
        boolean isPresent = false;
        for (String s: array){
            if(s.equals("a") || s.equals("e") ||s.equals("i") ||s.equals("o") ||s.equals("u")){
                System.out.println("vowel is present");
                isPresent = true;
                break;
            }
        }*/
        boolean result = text.matches(".*[aeiou].*");
        System.out.println(result);
    }

    public boolean m10Palindrome(String text){
        boolean result =true;
        int length = text.length();

        for (int i = 0; i < length/2; i++) {
            if(text.charAt(i) != text.charAt(length - i - 1)){
                result = false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args){
        App app = new App();
        //app.m1InvertingString("arromero");
        //app.m2IsCapicua(5235);
        //app.m3CountCharacterTimes("arromero");
        //app.m4RepeatedCharacters("arromero");
        //app.m5IsMultipleof2(4);
        //app.m6IsLeapYear(2024);
        //app.m7RandomOrderString("arromero");
        //app.m8getOnlyNotDuplicate(Arrays.asList(1,2,3,4,5,5,1,2,9));
        //app.m9CheckifVowel("arromero");
        //System.out.println(app.m10Palindrome("anitalavalatina"));


    }




}
