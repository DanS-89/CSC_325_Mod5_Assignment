module org.example.csc_325_mod5_assignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.csc_325_mod5_assignment to javafx.fxml;
    exports org.example.csc_325_mod5_assignment;
}