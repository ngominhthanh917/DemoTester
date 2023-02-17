package com.mycompany.mavenproject1;

import java.io.IOException;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        int x = 10;
        if(x > 10)
            App.setRoot("secondary");
    }
}
