module com.javafx.test {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.javafx.test to javafx.fxml;
    exports com.javafx.test;
}