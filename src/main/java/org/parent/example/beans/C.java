package org.parent.example.beans;

import org.springframework.stereotype.Component;

@Component
public class C {
    {
        System.out.println("C non static block");//1
    }
    static {
        System.out.println("C static block");
    }
    public void getResult(String name,int id){
        System.out.println("C getResult");
        System.out.println("Welcome :"+name+" id:"+id);
    }

    public C(){
        System.out.println("C constructor");
    }

}
