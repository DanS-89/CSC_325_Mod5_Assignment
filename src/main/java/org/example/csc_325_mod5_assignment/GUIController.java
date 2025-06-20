package org.example.csc_325_mod5_assignment;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;

import java.io.File;

public class GUIController {

    private ObservableList<Student> studentList = FXCollections.observableArrayList();
    private Image selectedImage = null;
    private final Image defaultImage = new Image(getClass().getResource("/images/profile.png").toString());

    @FXML
    private TextField firstNameTextField, lastNameTextField, departmentTextField, majorTextField, emailTextField, imageTextField;

    @FXML
    private Button clearButton, addButton, deleteButton, editButton;

    @FXML
    private ImageView imageViewStudent;

    @FXML
    private TableView<Student> studentTableView;

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

    @FXML
    public void initialize() {
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        departmentColumn.setCellValueFactory(new PropertyValueFactory<>("department"));
        majorColumn.setCellValueFactory(new PropertyValueFactory<>("major"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));

        studentTableView.setItems(studentList);

        closeMenuItem.setOnAction(event -> javafx.application.Platform.exit());

        studentTableView.setOnMouseClicked(event -> {
            Student selected = studentTableView.getSelectionModel().getSelectedItem();
            if (selected != null) {
                firstNameTextField.setText(selected.getFirstName());
                lastNameTextField.setText(selected.getLastName());
                departmentTextField.setText(selected.getDepartment());
                majorTextField.setText(selected.getMajor());
                emailTextField.setText(selected.getEmail());

                Image defaultImage = new Image(getClass().getResourceAsStream("/images/profile.png"));
                if(selected.getImageUrl() != null) {
                    imageViewStudent.setImage(selected.getImageUrl());
                    selectedImage = selected.getImageUrl();
                } else {
                    imageViewStudent.setImage(defaultImage);
                    selectedImage = null;
                }
            }
        });
    }

    @FXML
    private void onAddButtonClick() {
        int newId = studentList.size() + 1;

        Student newStudent = new Student(
                newId,
                firstNameTextField.getText(),
                lastNameTextField.getText(),
                departmentTextField.getText(),
                majorTextField.getText(),
                emailTextField.getText(),
                selectedImage
        );
        studentList.add(newStudent);
        clearFields();
    }

    @FXML
    private void clearFields() {
        firstNameTextField.clear();
        lastNameTextField.clear();
        departmentTextField.clear();
        majorTextField.clear();
        emailTextField.clear();
        imageViewStudent.setImage(defaultImage);
        selectedImage = null;
    }

    @FXML
    private void onDeleteButtonClick() {
        Student selected = studentTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            studentList.remove(selected);
            clearFields();
        }
    }

    @FXML
    private void onEditButtonClick() {
        Student selected = studentTableView.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setFirstName(firstNameTextField.getText());
            selected.setLastName(lastNameTextField.getText());
            selected.setDepartment(departmentTextField.getText());
            selected.setMajor(majorTextField.getText());
            selected.setEmail(emailTextField.getText());
            selected.setImageUrl(selectedImage);

            studentTableView.refresh();
            clearFields();
        }
    }

    @FXML
    private void onImageViewButtonClick() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Add a Student Image");
        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif")
        );

        File selectedFile = fileChooser.showOpenDialog(imageViewStudent.getScene().getWindow());

        if(selectedFile != null) {
            selectedImage = new Image(selectedFile.toURI().toString());
            imageViewStudent.setImage(selectedImage);
        }
    }
}