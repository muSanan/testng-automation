package tests;

import com.github.javafaker.Faker;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.Config;
import utilities.Driver;

public class Google {

    @Test
    public void search(){

        Faker faker = new Faker();
        String testData = faker.lorem().word();
        Driver.getDriver().get("https://google.com");
        Driver.quit();
        System.out.println("Test");

    }

    @Test
    public void googleImage(){
        Driver.getDriver().get("https://google.com");
        System.out.println("Checking some image");
        Driver.quit();
    }
}
