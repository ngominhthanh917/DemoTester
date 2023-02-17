package com.mycompany.mavenproject1;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int x = 20;
        if(x == 20 && x%2 == 0)
            App.setRoot("secondary");
    }
}
