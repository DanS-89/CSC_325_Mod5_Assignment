package org.example.csc_325_mod5_assignment;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;

public class HelloController {
    @FXML
    private TextField firstNameTextField, lastNameTextField, departmentTextField, majorTextField, emailTextField, imageTextField;

    @FXML
    private Button clearButton, addButton, deleteButton, editButton;

    @FXML
    private ImageView imageViewStudent;

    @FXML
    private TableView<Student> studentTable;

    @FXML
    private TableColumn<Student, Integer> idColumn;

    @FXML
    private TableColumn<Student, String> firstNameColumn, lastNameColumn, departmentColumn, majorColumn, emailColumn, imageColumn;

    @FXML
    private MenuBar mainMenuBar;

    @FXML
    private Menu fileMenu, editMenu, themeMenu, helpMenu;

    @FXML
    private MenuItem closeMenuItem, deleteMenuItem, actionOneMenuItem, aboutMenuItem;

}