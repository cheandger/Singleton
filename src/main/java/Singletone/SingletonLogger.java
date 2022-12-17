package Singletone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class SingletonLogger {

    private static SingletonLogger lazySingleTone;

  private   SingletonLogger() {
    }


    static SingletonLogger getInstance() {

        if (lazySingleTone == null) {

            lazySingleTone = new SingletonLogger();
        }

        return lazySingleTone;
    }

    public void classLogg(Object obj) {

        //Log needed time stamp;

        String datetime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("MM.dd.yyy, hh.mm.ss a"));
        ;

        System.out.println("Log info:\n" + obj.getClass() + "\n" + "\nTimeStamp:\n  " + datetime + "\n" + "\n");

        System.out.println("ClassFields/values:\n");

        if (obj.getClass().getDeclaredFields().length > 0) {
            Arrays.stream(obj.getClass().getDeclaredFields()).forEach(f -> {
                try {
                    System.out.println(f.getName() + "  " + f.getType().toString().
                            replaceAll("^.*?(\\w+)\\W*$", "$1" + ":") + "  " + f.get(obj));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            });
        } else {
            System.out.println("There is no fields in this class");
        }
        System.out.println("\nMethods:\n");
        if (obj.getClass().getDeclaredMethods().length > 0) {

            Arrays.stream(obj.getClass().getDeclaredMethods()).forEach(m -> System.out.println(
                    m.getName().replaceAll("^.*?(\\w+)\\W*$", "$1")));
        } else {
            System.out.println("There is no any methods in this class");
        }

    }
}
