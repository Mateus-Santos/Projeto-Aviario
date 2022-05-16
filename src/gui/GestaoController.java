package gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import dados.DadosCliente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import modelagem.Cliente;

public class GestaoController implements Initializable {

	private DadosCliente dadosCliente;

	@FXML
	private TableView<Cliente> tableViewGestaoPessoa;

	@FXML
	private TableColumn<Cliente, String> tableColumnData;

	@FXML
	private TableColumn<Cliente, String> tableColumnNome;

	@FXML
	private TableColumn<Cliente, String> tableColumnEmail;

	@FXML
	private Button btCadastrar;

	@FXML
	private ObservableList<Cliente> obsList;

	@FXML
	public void onBtCadastrarAction() {

		System.out.println("Teste");

	}

	public void setDadosCliente(DadosCliente dadosCliente) {
		this.dadosCliente = dadosCliente;
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		initializeNodes();

	}

	private void initializeNodes() {
		tableColumnData.setCellValueFactory(new PropertyValueFactory<>("data_cadastro"));
		tableColumnNome.setCellValueFactory(new PropertyValueFactory<>("nome"));
		tableColumnEmail.setCellValueFactory(new PropertyValueFactory<>("email"));

		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewGestaoPessoa.prefHeightProperty().bind(stage.heightProperty());
	}

	public void updateTableView() {
		if (dadosCliente == null) {
			throw new IllegalStateException("Service was null");
		}
		List<Cliente> list = dadosCliente.findAll();
		obsList = FXCollections.observableArrayList(list);
		tableViewGestaoPessoa.setItems(obsList);
	}

}
