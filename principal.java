package sample;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;


public class principal {


    @FXML


    int cnt = 0;

    public void clicked(MouseEvent mouseEvent) {
        cnt++;
                System.out.println(cnt);




    }
}
