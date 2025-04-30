module at.htlle.pos3.javafx {
    requires javafx.controls;
    requires javafx.fxml;

    opens at.htlle.pos3.javafx to javafx.fxml;
    exports at.htlle.pos3.javafx;
}
