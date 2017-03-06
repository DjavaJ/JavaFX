package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    ObservableList<Contact> contacts = FXCollections.observableArrayList();


    @FXML
    ListView list;

    @FXML
    TextField textName;

    @FXML
    TextField textPhone;

    @FXML
    TextField textEmail;

    public void addItem(){
    System.out.println("addItem");

    if (textName.getText().isEmpty()||textPhone.getText().isEmpty()||textEmail.getText().isEmpty()){

    } else{
        contacts.add(new Contact (textName.getText(), textPhone.getText(), textEmail.getText()));
    }
        textName.setText("text");
        textPhone.setText("text");
        textEmail.setText("text");
    }

    public void removeItem(){
        //System.out.println("removeItem");
        contacts.remove(new Contact (textName.getText(), textPhone.getText (),textEmail.getText()));
    }

    @Override
    public void initialize(URL location, ResourceBundle resources){
        list.setItems(contacts);
    }



}
