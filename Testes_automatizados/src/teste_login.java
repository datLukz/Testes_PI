import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class teste_login {
	
	private static final String KEY = "webdriver.gecko.driver";
	private static final String VALUE = "C:\\Users\\181710089\\Desktop\\Automatizados\\eclipse\\geckodriver.exe";
	
	FirefoxDriver pagina;
	
	@Before
	public void antes() {
		System.setProperty(KEY, VALUE);
		pagina = new FirefoxDriver();
		pagina.get("http://localhost/PI_UC12/index.php");
	}
	

	@Test
	public void test() {
		
		WebElement login = pagina.findElementByName("txtLogin");
		login.sendKeys("tamires@vieira.com");
		WebElement senha = pagina.findElementByName("txtSenha");
		senha.sendKeys("12345");
		
        WebElement entrar = pagina.findElementById("Entrar");
        entrar.click();
        
		
	}

}