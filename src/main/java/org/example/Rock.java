package org.example;

import org.springframework.stereotype.Component;

@Component()
public class Rock implements Music {
    public void Init(){
        System.out.println("Open");
    }
    public void doDelete(){
        System.out.println("Close");
    }
    @Override
    public String getSong() {
        return "Rock";
    }
}
