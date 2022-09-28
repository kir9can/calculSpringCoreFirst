package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class MainCalc {

    public static void main( String[] args){
        AnnotationConfigApplicationContext applicationContext=
                new AnnotationConfigApplicationContext(RootConfig.class);

        Application application =(Application) applicationContext.getBean("application");
        application.start();

    }


}
