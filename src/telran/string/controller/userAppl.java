package telran.string.controller;

import telran.string.user.User;

public class userAppl {
    public static void main(String[] args) {
        User user = new User("mail@mail.com","12345");
        System.out.println(user);
        user.setEmail("mary@gmail.com");
        System.out.println(user);
    }
}
