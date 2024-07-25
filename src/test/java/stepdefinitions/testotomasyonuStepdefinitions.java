package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.TestOtomasyonuPage;
import utilites.ConfigReader;
import utilites.Driver;
import utilites.REusableMedhods;

public class testotomasyonuStepdefinitions {
    TestOtomasyonuPage testOtomasyonuPage = new  TestOtomasyonuPage();

    @Given("kullanici testotomasyonu anasayfaya gider")
    public void kullanici_testotomasyonu_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }
    @When("arama kutusuna phone yazip enter tusuna basar")
    public void arama_kutusuna_phone_yazip_enter_tusuna_basar() {

        testOtomasyonuPage.aramaKutusu.sendKeys("phone"+ Keys.ENTER);

    }
    @Then("arama sonucunda ürün bulunabildiğini test eder")
    public void arama_sonucunda_ürün_bulunabildiğini_test_eder() {

        int actualBulunanUrunSayisi = testOtomasyonuPage.bulunanUrunElementleriList.size();

        Assert.assertTrue(actualBulunanUrunSayisi > 0 );

    }
    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

        Driver.quitDriver();
    }

    @When("arama kutusuna dress yazip enter tusuna basar")
    public void aramaKutusunaDressYazipEnterTusunaBasar() {
        testOtomasyonuPage.aramaKutusu.sendKeys("dress"+Keys.ENTER);
    }

    @When("arama kutusuna baby yazip enter tusuna basar")
    public void aramaKutusunaBabyYazipEnterTusunaBasar() {
        testOtomasyonuPage.aramaKutusu.sendKeys("baby"+Keys.ENTER);
    }

    @When("arama kutusuna java yazip enter tusuna basar")
    public void aramaKutusunaJavaYazipEnterTusunaBasar() {
        testOtomasyonuPage.aramaKutusu.sendKeys("java"+Keys.ENTER);
    }

    @Then("arama sonucunda ürün bulunamadiğini test eder")
    public void aramaSonucundaÜrünBulunamadiğiniTestEder() {
        int actualBulunanUrunSayisi = testOtomasyonuPage.bulunanUrunElementleriList.size();

        Assert.assertEquals(0,actualBulunanUrunSayisi == 0 );
    }

    @When("arama kutusuna nutella yazip enter tusuna basar")
    public void aramaKutusunaNutellaYazipEnterTusunaBasar() {
        testOtomasyonuPage.aramaKutusu.sendKeys("nutella"+Keys.ENTER);
    }

    @When("arama kutusuna {string} yazip enter tusuna basar")
    public void aramaKutusunaYazipEnterTusunaBasar(String aranacakKelime) {

        testOtomasyonuPage.aramaKutusu.sendKeys(aranacakKelime+Keys.ENTER);

    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int saniye) {

        REusableMedhods.bekle(saniye);
    }
}
