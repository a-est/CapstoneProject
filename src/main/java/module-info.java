module edu.miracosta.cs112.capstoneproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.miracosta.cs112.capstoneproject to javafx.fxml;
    exports edu.miracosta.cs112.capstoneproject;
}