import com.qacart.todo.api.LoginApi;
import com.qacart.todo.api.RegisterApi;
import com.qacart.todo.objects.User;
import com.qacart.todo.pages.LoginPage;
import com.qacart.todo.utils.ConfigUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.http.Cookies;
import io.restassured.response.Response;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

import static io.restassured.RestAssured.given;
@Test (enabled = false)
public class domy  {


    public static void main(String[] args)  {

       LoginApi loginApi = new LoginApi();

       loginApi.logIn();
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();

        LoginPage loginPage = new LoginPage(driver);

       loginPage.load();





        System.out.println(loginApi.getToken());
        System.out.println(loginApi.getUserID());

     /*   RegisterApi registerApi = new RegisterApi();

        registerApi.register();

        System.out.println(registerApi.getFirstName());
        System.out.println(registerApi.getLastName());
        System.out.println(registerApi.getToken());
        System.out.println(registerApi.getUserID());*/
/*
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver( ) ;

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(ConfigUtils.getInstance().getBaseUrl());


        RegisterApi registerApi = new RegisterApi();

        registerApi.register();



       //  driver.manage().addCookie(firstNameCookie);

        driver.get(ConfigUtils.getInstance().getBaseUrl());

*/






    }
}
