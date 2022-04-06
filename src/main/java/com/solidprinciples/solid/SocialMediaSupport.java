package com.solidprinciples.solid;

import com.solidprinciples.solid.Support;

public class SocialMediaSupport extends Chat {

    private Support sp;

    public SocialMediaSupport(Support sp) {
        this.sp = sp;
    }

    public void invoke(String medium){
            sp.invoke("Whatsapp");
    }

    public static void main(String[] args) {

    }
}
