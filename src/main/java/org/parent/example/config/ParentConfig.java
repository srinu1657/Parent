package org.parent.example.config;

import org.parent.example.beans.C;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class ParentConfig {

    static {
        System.out.println("ParentConfig static block");
    }
    {
        System.out.println("ParentConfig NON static block");

    }

    public ParentConfig(){
        System.out.println("ParentConfig Constructor");
    }

   // @Bean
    public C getC(){
        System.out.println("ParentConfig creating C object");
        C c=new C();
        return c;
    }

}
