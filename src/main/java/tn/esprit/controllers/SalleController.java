package tn.esprit.controllers;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import tn.esprit.entities.Salle;
import tn.esprit.services.SalleService;

public class SalleController {
    private final SalleService ss = new SalleService();

    @FXML
    private TableColumn<?, ?> addEmployee_col_date;

    @FXML
    private TableColumn<?, ?> addEmployee_col_descriptionSA;

    @FXML
    private TableColumn<?, ?> addEmployee_col_phoneNum;

    @FXML
    private TableColumn<?, ?> addEmployee_col_position;

    @FXML
    private Button addSalle_btn;

    @FXML
    private TableColumn<?, ?> addSalle_col_adresseSA;

    @FXML
    private TableColumn<?, ?> addSalle_col_idSA;

    @FXML
    private TableColumn<?, ?> addSalle_col_nomSA;

    @FXML
    private TextField addSalle_search;

    @FXML
    private TableView<?> addSalle_tableView;

    @FXML
    private TextField adresseSA;

    @FXML
    private Button close;

    @FXML
    private TextField descriptionSA;

    @FXML
    private Button home_btn;

    @FXML
    private AnchorPane home_form;

    @FXML
    private Button home_form_addBtn;

    @FXML
    private Button home_form_clearBtn;

    @FXML
    private Button home_form_deleteBtn;

    @FXML
    private Button home_form_importBtn;

    @FXML
    private Button home_form_updateBtn;

    @FXML
    private ImageView imageSA;

    @FXML
    private Button logout;

    @FXML
    private AnchorPane main_form;

    @FXML
    private Button minimize;

    @FXML
    private TextField nomSA;

    @FXML
    private Button salary_btn;

    @FXML
    private Label username;

    @FXML
    void ajouter(ActionEvent event){
        ss.add(new Salle(nomSA.getText(), adresseSA.getText(),descriptionSA.getText()));

    }

    @FXML
    void clear(ActionEvent event) {

    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void update(ActionEvent event) {

    }

}






//    @FXML
//    void ajouter(ActionEvent event){
//            ss.add(nomSA.getText(), adresseSA.getText(),descriptionSA.getText(), imageSA.getText());
//        tableReadAll();
//
//    }
//    @FXML
//    void tableReadAll() {
//        addSalle_col_nomSA.setCellValueFactory(new PropertyValueFactory<>("nomSA"));
//        addSalle_col_adresseSA.setCellValueFactory(new PropertyValueFactory<>("adresseSA"));
//        addEmployee_col_descriptionSA.setCellValueFactory(new PropertyValueFactory<>("descriptionSA"));
//
//        SalleService ss = new SalleService();
//        addSalle_tableView.setItems(ss.readAll());
//        addSalle_tableView.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
//            if (newSelection != null) {
//                Salle  selectedUser = newSelection;
//                // Now you can use selectedUser object
//                nomSA.setText(selectedUser.getNom());
//                adresseSA.setText(selectedUser.getAdresse());
//                descriptionSA.setText(selectedUser.getDescription());
//                imageSA.setText(selectedUser.getDescription());
//                idTextField.setText(String.valueOf(selectedUser.getId()));

//        });








