package serenityswag.authentication.actions;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.thucydides.core.annotations.Step;

public class LoginActions extends UIInteractionSteps {

    //We can login using different users to avoid repetition so we change the method AsAStandardUser for:

    @Step("Log in as {0}")
    public void as(User user){
        openUrl("https://www.saucedemo.com/");

        //$("[data-test='username']").sendKeys(user.getUsername());
        //in here we can also use the $ notation instead of find as a shortcut
        find(By.id("user-name")).sendKeys(user.getUsername());

        //$("[data-test='password']").sendKeys(user.getPassword());
        find(By.id("password")).sendKeys(user.getPassword());

       // $("[data-test='login-button']").click();
        find(By.id("login-button")).click();

    }

    /*public void AsAStandardUser() {
        // driver.get("https://www.saucedemo.com/");
        openUrl("https://www.saucedemo.com/");

        //Login as a standard_user
        // driver.findElement(By.cssSelector("[data-test='username']")).sendKeys("standard_user");
        // driver.findElement(By.cssSelector("[data-test='password']")).sendKeys("secret_sauce");
        // driver.findElement(By.cssSelector("[data-test='login-button']")).click();


        //We can change find for $
        // find("[data-test='username']").sendKeys("standard_user");
        $("[data-test='username']").sendKeys("standard_user");
        $("[data-test='password']").sendKeys("secret_sauce");
        $("[data-test='login-button']").click();

    }*/
}
