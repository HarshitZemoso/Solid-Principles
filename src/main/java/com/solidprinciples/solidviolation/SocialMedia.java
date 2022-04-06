package com.solidprinciples.solidviolation;

public interface SocialMedia {

    //@support WhatsApp,Facebook,Instagram
    public void chatWithFriend();

    //@support Facebook,Instagram
    public void publishPost(Object post);

    //@support WhatsApp,Facebook,Instagram
    public void sendPhotosAndVideos();

    //@support WhatsApp,Facebook
    public void groupVideoCall(String... users);
}
