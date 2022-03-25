package com.GroupTasks;

public class Task4 {
}
class Registration {
        private String email;
        private String userName;
        private String password;



        public void getEmail(String email) {
        if (email.contains("@yahoo")) {
            System.out.println("Email : " + email);
        } else {
            System.out.println("Wrong email type");
        }
        }
        public void getUserName(String userName) {
                this.userName=userName;
        if (userName.isEmpty() || userName.length() < 6) {
            System.out.println("Username must have 7 characters or more");
        } else {
            System.out.println("Username : " + userName);
        }
        }
        public void getPassword(String password) {

        if (password.isEmpty() || password.length() < 6 || password.contains(userName)) {
            System.out.println("Password must have 7 characters or more and can not contain username");
        } else {
            System.out.println("Password : " + password);
        }
        }
        }
        class Tester {
            public static void main(String[] args) {
        Registration obj = new Registration();
        obj.getEmail("pawel@yahoo.com");
        obj.getUserName("Pawel12345");
        obj.getPassword("Baranpopo33");
        }
        }
