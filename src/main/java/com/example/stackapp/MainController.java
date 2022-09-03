package com.example.stackapp;

import java.io.IOException;

public class MainController {

    private static final String LOGIN_PAGE = "pages/log-in.fxml";
    private final Main window = new Main();

    public void openLoginPage() throws IOException {
        window.changePage(LOGIN_PAGE);
    }

}
