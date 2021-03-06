package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import parteFuncionario.FunCAD;
import parteFuncionario.Funcionario;
import TelaCadastro.ControllerTelaCadastro;

/*OBS: SISTEMA DE VALIDA��O DO LOGIN COM CODIGO AINDA N�O DISCUTIDO*/
public class controllerLogin implements Initializable {
	@FXML
	private Button BTM01;
	@FXML
	private TextField CodTXT;

	@FXML
	private TextField senhaTXT;

	@FXML
	private Button BTMCadastrar;

	@FXML
	void acaBTMCadastrar(ActionEvent event) {
		String senha = senhaTXT.getText();
		String codigo = CodTXT.getText();

		if (senha.equals("1234") && codigo.equals("gerente159")) {
			Main.changeScreen("Cadastro");
			CodTXT.clear();
			senhaTXT.clear();
		} else {
			Alert alerta = new Alert(Alert.AlertType.WARNING);
			alerta.setTitle("Erro");
			alerta.setHeaderText(null);
			alerta.setContentText("Somente o gerente pode acessar,favor informar Codigo e senha!");
			alerta.show();

		}
	}

	@FXML
	void acaoBotao(ActionEvent event) throws IOException {
		String codigoFuncionario = CodTXT.getText();
		String senhaGerente = senhaTXT.getText();
		if (codigoFuncionario.length() == 0) {
			Alert alerta = new Alert(Alert.AlertType.WARNING);
			alerta.setTitle("Alerta");
			alerta.setHeaderText(null);
			alerta.setContentText("Favor,informar o campo <C�digo de usu�rio>");
			alerta.show();
		}	
		/*ArrayList<String> valorArrayCOD = new ArrayList<String>();
		ControllerTelaCadastro cd = new ControllerTelaCadastro();
		String valorCOD = cd.getCod();
		valorArrayCOD.add(valorCOD);
		
		for(String p: valorArrayCOD) {
			p.equals(codigoFuncionario);
			System.out.println("VALOR CADASTRADO");
		}*/
		
		
		if (codigoFuncionario.length() != 0 && senhaGerente.length() == 0) {
			FunCAD fc = new FunCAD();
			boolean tem = true;
			fc.cadrastarCodFuncionario(codigoFuncionario);
			System.out.println(fc.listarCodFuncionario());
			
			if(tem == true) {
			Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
			alerta.setTitle("Login realizado com sucesso!");
			alerta.setHeaderText(null);
			alerta.setContentText("Clique em OK para continuar");
			alerta.show();
			Main.changeScreen("Mesas");
			CodTXT.clear();
			senhaTXT.clear();
			}else {
				Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
				alerta.setTitle("C�digo de funcion�rio inv�lido!");
				alerta.setHeaderText(null);
				alerta.setContentText("insira novamente o c�digo");
				alerta.show();
				CodTXT.clear();
				}

		} else {
			Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
			alerta.setTitle("C�digo de funcion�rio inv�lido!");
			alerta.setHeaderText(null);
			alerta.setContentText("insira novamente o c�digo");
			alerta.show();
			CodTXT.clear();
		}
		int senhaG = Integer.parseInt(senhaGerente);
		if (codigoFuncionario.length() != 0 && senhaG == 1234) {
			Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
			alerta.setTitle("Login realizado com sucesso!");
			alerta.setHeaderText(null);
			alerta.setContentText("Bem vindo Gerente, clique em OK para continuar");
			alerta.show();
			Main.changeScreen("Mesas");
			CodTXT.clear();
			senhaTXT.clear();
		}

		if (senhaG != 1234) {
			Alert alerta = new Alert(Alert.AlertType.ERROR);
			alerta.setTitle("Alerta");
			alerta.setHeaderText(null);
			alerta.setContentText("Senha errada!");
			alerta.show();

		}

	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		FunCAD fu = new FunCAD();
		Funcionario f = new Funcionario("nome", "a", "a", "a", "1212", "Gerente");
		fu.cadrastarFuncionario(f);
		fu.cadrastarCodFuncionario("1313");
		System.out.println(fu.listarFuncionario());
		System.out.println(fu.listarCodFuncionario());

	}
}
