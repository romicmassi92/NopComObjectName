package WebTest;

import org.openqa.selenium.By;

public class GuestCheckout extends Utils{
    LoadProp loadProp = new LoadProp();
    private By _checkoutguest = By.xpath("//input[@value='Checkout as Guest']");
    private By _firstname = By.xpath("//input[@name='BillingNewAddress.FirstName']");
    private String firstName = "Romic";
    private By _lastname = By.xpath("//input[@name='BillingNewAddress.LastName']");
    private String lastName ="Masih";
    private By _email = By.id("BillingNewAddress_Email");
    private String email = "romic.massi@gmail.com";
    private By _dropdown = By.id("BillingNewAddress_CountryId");
    private String _country = "United Kingdom";
    private By _city = By.xpath("//input[@name = 'BillingNewAddress.City']");
    private String city = "London";
    private By _address = By.xpath("//input[@name='BillingNewAddress.Address1']");
    private String address = "123 London Road";
    private By _postcode = By.xpath("//input[@name ='BillingNewAddress.ZipPostalCode']");
    private String postcode = "AB1 1CD";
    private By _phonenum = By.xpath("//input[@name='BillingNewAddress.PhoneNumber']");
    private String phonenum = "07912345678";
    private By _continue = By.xpath("//input[@onclick='Billing.save()']");



    public void checkoutAsGuest(){

        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        clickOnElement(_checkoutguest);
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        SendText(_firstname,firstName);
        SendText(_lastname,lastName);
        SendText(_email,email);
        SelectFromDropDownByValue(_dropdown,"233");
        SendText(_city,city);
        SendText(_address,address);
        SendText(_postcode,postcode);
        SendText(_phonenum,phonenum);

        clickOnElement(_continue);

    }
}
