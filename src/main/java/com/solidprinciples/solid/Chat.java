package com.solidprinciples.solid;

import com.solidprinciples.solid.Support;

public class Chat implements Support {


    public void invoke(String medium) {

        if (medium.equals("whatsapp"))
        {
            System.out.println("Invoke Whatsapp");
        }


    }
}
