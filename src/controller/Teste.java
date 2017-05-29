package controller;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.*;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Teste extends Application

{

	public static void main(String[] args)

	{
		System.out.println("Oi");
		// Parte da tela
		Application.launch(Teste.class, (java.lang.String[]) null);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		try {
			AnchorPane root = (AnchorPane) FXMLLoader.load(Teste.class.getResource("MainController.fxml"));

			//AnchorPane page = (AnchorPane) FXMLLoader.load(Teste.class.getResource("MainController.fxml"));
			Scene scene = new Scene(root);
			primaryStage.setScene(scene);
			primaryStage.setTitle("7ª LISTA DE EXERCICIOS - RENAN DA SILVA ALVES - AVALIACAO DE DESEMPENHO DE SISTEMAS");
			primaryStage.show();
		}

		catch (Exception e) {
			Logger.getLogger(Teste.class.getName()).log(Level.SEVERE, null, e);
		}
	}
	// inicializando a matriz

}
