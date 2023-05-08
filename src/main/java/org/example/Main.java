package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        accout accout1 = (accout) context.getBean("account1");
        accout accout2 = (accout) context.getBean("account2");
        System.out.println("accout1");
        System.out.println(accout1.getId());
        System.out.println(accout1.getName());
        System.out.println(accout1.getLuong());
        System.out.println("accout2");
        System.out.println(accout2.getId());
        System.out.println(accout2.getName());
        System.out.println(accout2.getLuong());
        System.out.println("ok cô");
    }
}