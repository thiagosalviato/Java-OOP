module com.example.hello {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.hello to javafx.fxml;
    exports com.example.hello;
}