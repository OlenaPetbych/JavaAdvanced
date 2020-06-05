package ua.lviv.olena.service;

public class MessageService {
    private UserService userService;

    public MessageService(UserService userService) {
        this.userService = userService;
    }

    public String generateDefaultMessage() {
        return "Hello!";
    }

    public String generateMessageForAdmin() {
        String admin = userService.getAdminName();
        return "Hello " + admin;

    }

    public String generateMessageForUser() {
        String user = userService.getUserName();
        return "Hello " + user;
    }
}
