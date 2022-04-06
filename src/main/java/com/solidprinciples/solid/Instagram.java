package com.solidprinciples.solid;

import com.solidprinciples.solid.SocialMedia;

public class Instagram implements SocialMedia,SocialMediaUniversal,PostMediaManager {
    public void openApp(String medium) {
        // Logic to Integrate Instagram Api
    }

    //Liskov
    public void publishPost(Object post) {

    }

    public void chatWithFriend() {

    }

    public void sendPhotosAndVideos() {

    }
}