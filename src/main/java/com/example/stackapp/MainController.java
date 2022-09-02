package com.example.stackapp;

import java.io.IOException;

public class MainController {

    private static final String LOGIN_PAGE = "pages/log-in.fxml";
    private static final Main window = new Main(); //

    public void openLoginPage() throws IOException {
        System.out.println("TEST CODE OPEN LOGIC PAGE");
        window.changePage(LOGIN_PAGE);
    }

    public void shouldPrintAnytext() {
        System.out.println("ANY TEST");
    }

}
