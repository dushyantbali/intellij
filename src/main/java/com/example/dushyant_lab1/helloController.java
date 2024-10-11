package com.example.dushyant_lab1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import com.example.dushyant_lab1.attendance;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class helloController implements Initializable {      @FXML
private TableView<attendance> tableView;
    @FXML
    private TableColumn<attendance,Integer > id;
    @FXML
    private TableColumn<attendance, String> name;
    @FXML
    private TableColumn<attendance,String> subject;
    @FXML
    private TableColumn<attendance,Integer> room;      ObservableList<attendance> list = FXCollections.observableArrayList();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        id.setCellValueFactory(new
                PropertyValueFactory<attendance,Integer>("id"));         name.setCellValueFactory(new
                PropertyValueFactory<attendance,String>("name"));         subject.setCellValueFactory(new
                PropertyValueFactory<attendance,String>("doctor"));         room.setCellValueFactory(new
                PropertyValueFactory<attendance,Integer>("room"));

        tableView.setItems(list);
    }
    @FXML
    protected void onHelloButtonClick() {

        populateTable();
    }

    public void populateTable() {

        // Establish a database connection
        String jdbcUrl = "jdbc:mysql://localhost:3306/intellij";
        String dbUser = "root";
        String dbPassword = "";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser, dbPassword)) {
            // Execute a SQL query to retrieve data from the database
            String query = "SELECT * FROM tbl_appointment";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            // Populate the table with data from the database
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String doctor = resultSet.getString("subject");
                int room = resultSet.getInt("room");

                tableView.getItems().add(new attendance(id, name, subject, room));


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    }