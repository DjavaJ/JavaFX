package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

import javax.swing.text.html.ListView;
import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    ObservableList<Contact> contacts = FXCollections.observableArrayList();


    @FXML
    ListView setItem;

    @FXML
    TextField textName;

    @FXML
    TextField textPhone;

    @FXML
    TextField textEmail;

    public void addItem(){
    System.out.println("addItem");
        contacts.add(new Contact (textName.getText(textPhone textEmail));
        textName.setText("");
    }

    public void removeItem(){
        //System.out.println("removeItem");
        contacts.remove(new Contact (textName.getText(textPhone textEmail));
        textName.setText("");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources){
        setItem.text(contacts);
    }



}
