package Elementos;

import org.openqa.selenium.By;

public class elementos {
	

	private By btnUser = By.id("menuUser");
	
	private By btnCreateNew = By.xpath("/html/body/login-modal/div/div/div[3]/a[2]");
	
	private By cmUsername = By.name("usernameRegisterPage");
	
	private By cmEmail = By.name("emailRegisterPage");
	
	private By cmSenha = By.name("passwordRegisterPage");
	
	private By cmConfirSenha = By.name("confirm_passwordRegisterPage");
	
	private By cmPrimeiroNome = By.name("first_nameRegisterPage");
	
	private By cmUltimoNome = By.name("last_nameRegisterPage");
	
	private By cmTelefone = By.name("phone_numberRegisterPage");
	
	private By cmPais = By.xpath("//*[@id=\"formCover\"]/div[3]/div[1]/sec-view[1]/div/select/option[30]");
	
	private By cmCidade = By.name("cityRegisterPage");
	
	private By cmEndereco = By.name("addressRegisterPage");
	
	private By cmEstado = By.name("state_/_province_/_regionRegisterPage");
	
	private By cmCep = By.name("postal_codeRegisterPage");
	
	private By btnIgree = By.name("i_agree");
	
	private By btnRegistrer = By.id("register_btnundefined");

	private By btnUserss = By.cssSelector("#menuUserLink > span");
	
	private By btnSingOut = By.cssSelector("#loginMiniTitle > label:nth-child(3)");
	
	private By cmUsernameLogin = By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[1]/div/input");
	
	private By cmPassword = By.xpath("/html/body/login-modal/div/div/div[3]/sec-form/sec-view[2]/div/input");
	
	private By btnSingIn = By.id("sign_in_btnundefined");

	public By getBtnUser() {
		return btnUser;
	}

	public By getBtnCreateNew() {
		return btnCreateNew;
	}

	public By getCmUsername() {
		return cmUsername;
	}

	public By getCmEmail() {
		return cmEmail;
	}

	public By getCmSenha() {
		return cmSenha;
	}

	public By getCmConfirSenha() {
		return cmConfirSenha;
	}

	public By getCmPrimeiroNome() {
		return cmPrimeiroNome;
	}

	public By getCmUltimoNome() {
		return cmUltimoNome;
	}

	public By getCmTelefone() {
		return cmTelefone;
	}

	public By getCmPais() {
		return cmPais;
	}

	public By getCmCidade() {
		return cmCidade;
	}

	public By getCmEndereco() {
		return cmEndereco;
	}

	public By getCmEstado() {
		return cmEstado;
	}

	public By getCmCep() {
		return cmCep;
	}

	public By getBtnIgree() {
		return btnIgree;
	}

	public By getBtnRegistrer() {
		return btnRegistrer;
	}

	public By getBtnUserss() {
		return btnUserss;
	}

	public By getBtnSingOut() {
		return btnSingOut;
	}

	public By getCmUsernameLogin() {
		return cmUsernameLogin;
	}

	public By getCmPassword() {
		return cmPassword;
	}

	public By getBtnSingIn() {
		return btnSingIn;
	}
	
	
	
	
	

}
