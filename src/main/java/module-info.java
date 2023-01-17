module com.estudos.projetocaneta {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.estudos.projetocaneta to javafx.fxml;
    exports com.estudos.projetocaneta;
}