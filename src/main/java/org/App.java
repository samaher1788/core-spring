package org;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {


        var iocContainer = new AnnotationConfigApplicationContext(AppContextConfig.class);
        var Scanner =iocContainer.getBean(Scanner.class);
        var bookUI = iocContainer.getBean(BookUI.class);

       while (true){
           System.out.printf("Add a new book (1): or Serach book (2) ");

           var opation=Scanner.nextInt();
           Scanner.nextLine();

           if(opation == 1){
               bookUI.addNewBook();
           }else if (opation == 2){
               bookUI.findBooksByTitle();
           }else{

               break;
           }




    }
}}