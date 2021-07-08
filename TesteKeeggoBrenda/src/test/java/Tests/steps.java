package Tests;

import Elementos.elementos;
import Pages.metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {

	// CENARIO VALIDAR CADASTRO

	metodos Met = new metodos();
	elementos El = new elementos();
	
	@Given("^que eu esteja no site \"([^\"]*)\"$")
	public void que_eu_esteja_no_site(String site) throws Throwable {
		Met.abrirSite(site, "CHROME");
		Met.pausa(5000);
	}

	@When("^eu clicar na funcionalidade de criar nova conta$")
	public void eu_clicar_na_funcionalidade_de_criar_nova_conta() throws Throwable {
		Met.clicar(El.getBtnUser());
		Met.pausa(3000);
		Met.clicar(El.getBtnCreateNew());
		Met.pausa(4000);
	}

	@Then("^valide o cadastro$")
	public void valide_o_cadastro() throws Throwable {
		Met.prencher(El.getCmUsername(),Met.getNome(null));
		Met.prencher(El.getCmEmail(),Met.getEmail());
		Met.prencher(El.getCmSenha(), "Fc23097878");
		Met.screnShoot("CT-Validar campos do cadastro");
		Met.prencher(El.getCmConfirSenha(), "Fc23097878");
		Met.prencher(El.getCmPrimeiroNome(), "Sinab");
		Met.prencher(El.getCmUltimoNome(), "Silva");
		Met.prencher(El.getCmTelefone(), "11993420794");
		Met.clicar(El.getCmPais());
		Met.screnShoot("CT-Validar campos do cadastro");
		Met.prencher(El.getCmCidade(), "Sao Paulo");
		Met.prencher(El.getCmEndereco(), "rua parnapoa 201");
		Met.prencher(El.getCmEstado(), "Sp");
		Met.prencher(El.getCmCep(), "04810060");
		Met.clicar(El.getBtnIgree());
		Met.screnShoot("CT-Validar campos do cadastro");
		Met.clicar(El.getBtnRegistrer());
		Met.pausa(4000);
		Met.fechar();
	}


	
	
	// CENARIO VALIDAR LOGIN

	@Given("^clique na funcionalidade de login$")
	public void clique_na_funcionalidade_de_login(String site) throws Throwable {
		Met.abrirSite(site, "CHROME");
		Met.pausa(4000);
		
	}
	@When("^preencher os dados solicitados$")
	public void preencher_os_dados_solicitados() throws Throwable {
		Met.clicar(El.getBtnUser());
		Met.pausa(4000);
		Met.prencher(El.getCmUsernameLogin(), "user45879966" );
		Met.prencher(El.getCmPassword(), "Fc23097878");
		
	}
	@Then("^valide os campos de username e passoword com o login cadastrado anteriormente$")
	public void valide_os_campos_de_username_e_passoword_com_o_login_cadastrado_anteriormente() throws Throwable {
		Met.screnShoot("CT-Validar campos do login");
		Met.clicar(El.getBtnSingIn());
	}
}
