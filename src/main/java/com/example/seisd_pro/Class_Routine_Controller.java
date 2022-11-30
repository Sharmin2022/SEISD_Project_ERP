package com.example.seisd_pro;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.ResourceBundle;

public class Class_Routine_Controller{
    static Connection c1;
    static Statement s;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    @FXML
    private VBox ClassRoutineSelectSession;

    @FXML
    private TableView ClassRoutine;

    @FXML
    private TableColumn<?, ?> ClassRoutineDay;
    @FXML
    private TableColumn<?, ?> ClassRoutineTime;
    @FXML
    private TableColumn<?, ?> ClassRoutineRoom112;
    @FXML
    private TableColumn<?, ?> ClassRoutineRoom116;
    @FXML
    private TableColumn<?, ?> ClassRoutineRoom118;
    @FXML
    private Button ShowReport;

    @FXML
    void ShowReportOn(ActionEvent event) {

    }

    @FXML
    void initialize() {
        this.c1 = jdbc.c1;
        this.s = jdbc.s;

    }
}