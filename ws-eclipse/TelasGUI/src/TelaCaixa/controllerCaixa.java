package TelaCaixa;

import java.net.URL;
import java.util.ResourceBundle;

import Mesas.ControleMesa;
import Mesas.Mesa;
import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import TelaMesas.controllerMesas;

public class controllerCaixa implements Initializable{

    @FXML
    private Button BTMfecharConta;

    @FXML
    private Button BTMfecharCaixa;
    /*SUBSTITUIR STRING PELA CLASSE CONTAS*/
    @FXML
    private ListView<Mesa> listContasAbertas;
    @FXML
    private Button BTMInter;
    
    @FXML
    void acaBTMInter(ActionEvent event) {
    	Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    	alerta.setTitle("Ajuda");
    	alerta.setHeaderText(null);
    	alerta.setContentText("Caixa\nFechar Conta: abrir� tela de pagamento e remover� a conta da lista\nFechar Caixa: finaliza o caixa e exibe tela com contas do dia\n");
    	alerta.show();
    }
    @FXML
	void listarContas(ActionEvent event) {
    	ControleMesa mesa = new ControleMesa();
    	Mesa m1 = new Mesa(4, 5);
		Mesa m2 = new Mesa(4, 4);
		Mesa m3 = new Mesa(4, 3);
		Mesa m4 = new Mesa(4, 2);
		Mesa m5 = new Mesa(4, 1);
		mesa.cadrastarMesas(m1);
		mesa.cadrastarMesas(m2);
		mesa.cadrastarMesas(m3);
		mesa.cadrastarMesas(m4);
		mesa.cadrastarMesas(m5);
		listContasAbertas.getItems().addAll(mesa.listarMesas());
    	listContasAbertas.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}
    @FXML
	void acaoBTMFecharConta(ActionEvent event) {
		
    	
    	/*if(sele==null||sele.isEmpty()) {
    		Alert alerta = new Alert(Alert.AlertType.WARNING);
        	alerta.setTitle("ERRO");
        	alerta.setHeaderText(null);
        	alerta.setContentText("Favor selecionar uma Conta para executar");
        	alerta.show();
    	}
    	Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    	alerta.setTitle("Aten��o");
    	alerta.setHeaderText(null);
    	alerta.setContentText("Sistema ainda n�o implementado");
    	alerta.show();*/
	}
	@FXML
	void acaoBTMFecharCaixa() {
		Alert alerta = new Alert(Alert.AlertType.INFORMATION);
    	alerta.setTitle("Fechar caixa");
    	alerta.setHeaderText(null);
    	alerta.setContentText("Caixa encerrado!");
    	alerta.show();
    	Main.changeScreen("Login");
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		listarContas(null);
		
	}

}
