module com.javafx.ai_voice_teaching {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.javafx.ai_voice_teaching to javafx.fxml;
    exports com.javafx.ai_voice_teaching;
}