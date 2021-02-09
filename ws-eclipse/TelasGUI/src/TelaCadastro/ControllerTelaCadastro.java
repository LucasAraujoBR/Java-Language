package TelaCadastro;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import parteFuncionario.FunCAD;
import parteFuncionario.Funcionario;

public class ControllerTelaCadastro implements Initializable {

	@FXML
	private TextField nomeTXT;

	@FXML
	private TextField cpfTXT;

	@FXML
	private TextField emailTXT;

	@FXML
	private TextField telefoneTXT;

	@FXML
	private ListView<Funcionario> listViewCadastro;

	ObservableList<String> list = FXCollections.observableArrayList("Gerente: gerente159   |   Senha: 1234");

	@FXML
	private Button adicionarBTM;
	@FXML
	private TextField cargoTXT;

	@FXML
	private Button removerBTM;

	@FXML
	private TextField codFuncionarioTXT;
	/*private String cod = codFuncionarioTXT.getText();
	public String getCod() {
		return cod;
	}

	public void setCod(String cod) {
		this.cod = cod;
	}*/

	@FXML
	private Button interBTM;

	@FXML
	private Button voltaBTM;

	@FXML
	void acaoAdicionarBTM(ActionEvent event) {

		String nomeF = nomeTXT.getText();
		String cpfF = cpfTXT.getText();
		String emailF = emailTXT.getText();
		String telefoneF = telefoneTXT.getText();
		String codF = codFuncionarioTXT.getText();
		String cargoF = cargoTXT.getText();
		if (nomeF.length() == 0 || cpfF.length() == 0 || emailF.length() == 0 || telefoneF.length() == 0
				|| codF.length() == 0 || cargoF.length() == 0) {
			Alert alerta = new Alert(Alert.AlertType.WARNING);
			alerta.setTitle("Alerta");
			alerta.setHeaderText(null);
			alerta.setContentText("Favor,informar todos os campos!");
			alerta.show();
		}else {
		Funcionario f = new Funcionario(nomeF, cpfF, telefoneF, emailF, codF, cargoF);
		FunCAD cad = new FunCAD();
		cad.cadrastarFuncionario(f);
		cad.cadrastarCodFuncionario(codF);
		System.out.println("CodFuncionario:" +cad.listarCodFuncionario());
		if (cad.isJaCadastrado() == false) {
			listViewCadastro.getItems().addAll(cad.listarFuncionario());
			nomeTXT.clear();
			cpfTXT.clear();
			emailTXT.clear();
			telefoneTXT.clear();
			codFuncionarioTXT.clear();
			cargoTXT.clear();
		} else {
			Alert alerta = new Alert(Alert.AlertType.ERROR);
			alerta.setTitle("Erro");
			alerta.setHeaderText(null);
			alerta.setContentText("Funcion�rio j� cadastrado,favor chegar os dados");
			alerta.show();
			nomeTXT.clear();
			cpfTXT.clear();
			emailTXT.clear();
			telefoneTXT.clear();
			codFuncionarioTXT.clear();
			cargoTXT.clear();
		}
		}

	}

	@FXML
	void listarFuncionarios(ActionEvent event) {
		FunCAD cad = new FunCAD();
		Funcionario f = new Funcionario("ADMIN", "874.521.856-23", "00", "00", "gerente159", "Gerente");
		cad.cadrastarFuncionario(f);
		listViewCadastro.getItems().addAll(cad.listarFuncionario());
		listViewCadastro.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

	}

	@FXML
	void acaoRemoverBTM(ActionEvent event) {
		FunCAD cad = new FunCAD();
	//	listViewCadastro.getItems().remove(0)
	//	cad.removerFuncionario();
	}

	@FXML
	void acaoBTMInter(ActionEvent event) {
		Alert alerta = new Alert(Alert.AlertType.INFORMATION);
		alerta.setTitle("Ajuda");
		alerta.setHeaderText(null);
		alerta.setContentText(
				"Tela de cadastro:\n Voc� deve preencher as informa��es do novo funcion�rio\nVoltar: volta para tela de Login\n"
						+ "Cadastrar: cadastra o novo funcionario\n Remover: remove o funcionario do sistema");
		alerta.show();

	}

	@FXML
	void acaoBTMVoltar(ActionEvent event) {
		Main.changeScreen("Login");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// listViewCadastro.setItems(list);
		listarFuncionarios(null);

	}
}
