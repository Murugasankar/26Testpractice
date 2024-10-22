package StepPackage;

import java.sql.Driver;

import org.openqa.selenium.WebElement;

import Basepackage.Baseclass;
import LocatorPackage.Locatorclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepclass extends Baseclass{
	
	Locatorclass locator = new Locatorclass();
	
	@Given("User open browser")
	public void user_open_browser() {
		browser();
	}

	@Then("User enter the url")
	public void user_enter_the_url() {
		url();
		maximize();
	}
	
	@Then("click Signup \\/ Login button")
	public void click_signup_login_button() throws InterruptedException {
		driver.findElement(locator.login).click();
		delay();
	  
	}

	@Then("enter Enter name and email address")
	public void enter_enter_name_and_email_address() {
		driver.findElement(locator.entername).sendKeys("Sankar");
		driver.findElement(locator.enteremail).sendKeys("murugasankar.ms@gmail.com");
	   
	}

	@Then("click signup")
	public void click_signup() throws InterruptedException {
		driver.findElement(locator.signupbutton).click();
		delay();
		WebElement scroll1 = driver.findElement(locator.scrollemail);
		scrollcreateaccount(scroll1);
	    
	}

	@Then("Title, Name, Email, Password, Date of birth")
	public void title_name_email_password_date_of_birth() {
		driver.findElement(locator.setpassword).sendKeys("Agpalayam@7");
//		driver.findElement(locator.selectdate).click();
//		WebElement scroll2 = driver.findElement(locator.selectdate15);
//		mouseover(scroll2);
//		driver.findElement(locator.selectdate15).click();
	   
	}

	@Then("select Sign up for our newsletter and Receive special offers from our partners")
	public void select_sign_up_for_our_newsletter_and_receive_special_offers_from_our_partners() {
		driver.findElement(locator.selectnewsletter).click();
		driver.findElement(locator.receivespecialoffers).click();
	}

	@Then("enter First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number")
	public void enter_first_name_last_name_company_address_address2_country_state_city_zipcode_mobile_number() throws InterruptedException {
	  WebElement scroll3 = driver.findElement(locator.scrolladdressinfo);
		scrollcreateaccount(scroll3);
		delay();
		driver.findElement(locator.entername2).sendKeys("Muruga");
		driver.findElement(locator.enterlastname).sendKeys("Sankar");
		driver.findElement(locator.address).sendKeys("110/26, ponniamman koil street");
		WebElement scroll4 = driver.findElement(locator.scrolladdressinfo);
		scrollcreateaccount(scroll4);
		delay();
		driver.findElement(locator.state).sendKeys("Tamilnadu");
		driver.findElement(locator.city).sendKeys("Chennai");
		driver.findElement(locator.zipcode).sendKeys("600100");
		driver.findElement(locator.mobilenumber).sendKeys("8508503998");
	}

	@Then("click create account and continue")
	public void click_create_account_and_continue() throws InterruptedException {
		driver.findElement(locator.createaccount).click();
		delay();
		driver.findElement(locator.continueafteraccount).click();
		delay();
	   
	}

	@Then("click Delete Account button and continue")
	public void click_delete_account_button_and_continue() throws InterruptedException {
	 driver.findElement(locator.accdelete).click();
	 delay();
	 driver.findElement(locator.continueafterdelete).click();
	 delay();
	}
	
//CASE - 2	
	
	@Then("enter name and email address")
	public void enter_name_and_email_address() {
	    driver.findElement(locator.loginemail).sendKeys("murugasankar.ms@gmail.com");
	    driver.findElement(locator.Loginpass).sendKeys("Agpalayam@7");
	    
	}

	@Then("click login")
	public void click_login() throws InterruptedException {
		driver.findElement(locator.loginbutton).click();
	    delay();
	   
	}

	@Then("Delete Account and continue")
	public void delete_account_and_continue() throws InterruptedException {
		driver.findElement(locator.accdelete).click();
		 delay();
		 driver.findElement(locator.continueafterdelete).click();
		 delay();
	   
	}

//CASE - 3 
	
	@Then("enter wrong name and email address")
	public void enter_wrong_name_and_email_address() {
		driver.findElement(locator.loginemail).sendKeys("murugasankar.ms@gmail.com");
	    driver.findElement(locator.Loginpass).sendKeys("Bgpalayam@7");
	     
	}

	@Then("click for login")
	public void click_for_login() {
		driver.findElement(locator.loginbutton).click();
	}
	


//CASE - 4 

	@Then("enter correct name and email address")
	public void enter_correct_name_and_email_address() {
		 driver.findElement(locator.loginemail).sendKeys("murugasankar.ms@gmail.com");
		    driver.findElement(locator.Loginpass).sendKeys("Agpalayam@7");
	   
	}
	
	@Then("click again for login")
	public void click_again_for_login() throws InterruptedException {
		driver.findElement(locator.loginbutton).click();
	    delay();
	   
	}
	
	@Then("click Logout")
	public void click_logout() {
		driver.findElement(locator.logout).click();
	 
	}

//CASE - 5

	@Then("Enter name and already registered email address")
	public void enter_name_and_already_registered_email_address() {
		driver.findElement(locator.entername).sendKeys("Sankar");
		driver.findElement(locator.enteremail).sendKeys("murugasankar.ms@gmail.com");
	    
	}
	
	@Then("click signupforsameemail")
	public void click_signupforsameemail() throws InterruptedException {
		driver.findElement(locator.signupbutton).click();
		delay();
	}
	
	//CASE - 6
	
	@Then("click Contact Us")
	public void click_contact_us() throws InterruptedException {
	   driver.findElement(locator.contactus).click();
	   delay();
	}
	
	@Then("scroll contact us")
	public void scroll_contact_us() {
		WebElement scroll5 = driver.findElement(locator.scrollgetintouch);
		scrollcreateaccount(scroll5);
	  
	}
	
	@Then("Enter name, email, subject and message")
	public void enter_name_email_subject_and_message() {
		driver.findElement(locator.contactusname).sendKeys("sankar");
		driver.findElement(locator.contactusemail).sendKeys("murugasankar.ms@gmail.com");
		driver.findElement(locator.contactussubject).sendKeys("contactus");
		driver.findElement(locator.contactustext).sendKeys("Hi");
	}
	
	@Then("click Upload file")
	public void click_upload_file() throws InterruptedException {
		driver.findElement(locator.choosefile).click();
		delay();
		delay();
		delay();
		delay();
		delay();
	    
	}
	
	@Then("click Submit button")
	public void click_submit_button() {
	   driver.findElement(locator.contactussubject).click();
	}
	
	@Then("click Ok button")
	public void click_ok_button() {
	   
	}
	
	//CASE - 7
	
	@Then("click test cases")
	public void click_test_cases() {
	  driver.findElement(locator.testcase).click();
	}
	
	//CASE - 8
	
	@Then("click products page")
	public void click_products_page() {
		driver.findElement(locator.productspage).click();
	   
	}

	@Then("scrolldown product page")
	public void scrolldown_product_page() {
	   WebElement scroll6 = driver.findElement(locator.scrollproductpage);
	   scrollcreateaccount(scroll6);
	}

	@Then("click first product")
	public void click_first_product() {
		driver.findElement(locator.viewfirstproduct).click();
		 
	}
	
	//CASE - 9 
	
	@Then("search product name")
	public void search_product_name() {
	   driver.findElement(locator.searchproduct).sendKeys("Stylish Dress");
	}

	@Then("click search option")
	public void click_search_option() {
		driver.findElement(locator.searchproductbutton).click();
	  
	}

	@Then("scroll for product page")
	public void scroll_for_product_page() {
		WebElement scroll7 = driver.findElement(locator.scrollproductpage);
	   scrollcreateaccount(scroll7);
	}
	
	//CASE - 10
	
	@Then("scroll down to subscrption page")
	public void scroll_down_to_subscrption_page() throws InterruptedException {
	    WebElement scroll7 = driver.findElement(locator.scrollhomeforsubscription);
	    scrollcreateaccount(scroll7);
	    delay();
	}

	@Then("enter email address and submit")
	public void enter_email_address_and_submit() {
	    driver.findElement(locator.emailforsubscribe).sendKeys("murugasankar.ms@gmail.com");
	    driver.findElement(locator.emailforsubscribebutton).click();
	}
	
	//CASE - 11
	
	@Then("click cart button")
	public void click_cart_button() {
	   driver.findElement(locator.clickcart).click();
	}

	@Then("enter email for subscrption")
	public void enter_email_for_subscrption() {
	   driver.findElement(locator.enteremailforsubscribe).sendKeys("murugasankar.ms@gmail.com");
	}

	@Then("submit for subscription")
	public void submit_for_subscription() {
		driver.findElement(locator.submitsubscribe).click();
	   
	}

	//CASE - 12
	
	@Then("click add to cart button")
	public void click_add_to_cart_button() throws InterruptedException {
	  driver.findElement(locator.addtocart).click();
	  delay();
	  driver.findElement(locator.viewcart).click();
	  delay();
	  
	}
	
	//CASE - 13
	
	@Then("increase quantity to {int}")
	public void increase_quantity_to(Integer int1) {
		driver.findElement(locator.increaseqty).clear();
	   driver.findElement(locator.increaseqty).sendKeys("4");
	}

	@Then("add to cart")
	public void add_to_cart() throws InterruptedException {
		 driver.findElement(locator.addtocart).click();
		 delay();
	  
	}

	@Then("view cart")
	public void view_cart() throws InterruptedException {
	   driver.findElement(locator.viewcart).click();
	   delay();
	}

	//CASE - 14
	
	@Then("click proceedtocheckout")
	public void click_proceedtocheckout() throws InterruptedException {
	   driver.findElement(locator.proceedtocheckout).click();
	   delay();
	}

	@Then("click login and enter sigin in details and click cart button")
	public void click_login_and_enter_sigin_in_details_and_click_cart_button() throws InterruptedException {
	  driver.findElement(locator.registeragain).click();
	  delay();
	  driver.findElement(locator.loginemail).sendKeys("murugasankar.ms@gmail.com");
	    driver.findElement(locator.Loginpass).sendKeys("Agpalayam@7");
	    driver.findElement(locator.loginbutton).click();
	    delay();
	    driver.findElement(locator.topcartbutton).click();
	    delay();
	}

	@Then("click proceed to checkout again")
	public void click_proceed_to_checkout_again() throws InterruptedException {
		 driver.findElement(locator.proceedtocheckout).click();
		   delay();
	  
	}

	@Then("scroll down for details")
	public void scroll_down_for_details() throws InterruptedException {
	  WebElement scroll6 = driver.findElement(locator.scrollforrevieworder);
	  scrollcreateaccount(scroll6);
	  driver.findElement(locator.commentfrorder).sendKeys("nil");
	  driver.findElement(locator.placeorder).click();
	  delay();
	  
	}

	@Then("click place order")
	public void click_place_order() throws InterruptedException {
		WebElement scroll5 = driver.findElement(locator.scrollpaymentpage);
		scrollcreateaccount(scroll5);
		delay();
		driver.findElement(locator.nameoncard).sendKeys("Murugasankar");
		driver.findElement(locator.cardnumber).sendKeys("5623456852642358");
		driver.findElement(locator.cvc).sendKeys("526");
		driver.findElement(locator.cardexpiry).sendKeys("07");
		driver.findElement(locator.cardexpiryyear).sendKeys("2027");
		driver.findElement(locator.payandconfirm).click();
		delay();
	  
	}
	
	//CASE - 24
	
	@Then("download invoice from case {int}")
	public void download_invoice_from_case(Integer int1) throws InterruptedException {
	    driver.findElement(locator.downloadinvoice).click();
	    delay();
	    driver.findElement(locator.lastcontinueafterinvoice).click();
	    delay();
	}
	
	//CASE - 17
	
	@Then("remove product from cart")
	public void remove_product_from_cart() throws InterruptedException {
	
		driver.findElement(locator.removeqtyfromcart).click();
	}

	//CASE - 18 
	
	@Then("Click on Women category")
	public void click_on_women_category() throws InterruptedException {
		WebElement scroll7 = driver.findElement(locator.scrolltestcases);
		   scrollcreateaccount(scroll7);
		   delay();
	  driver.findElement(locator.womencategoryplusbutton).click();
	}

	@Then("click any subcategory")
	public void click_any_subcategory() throws InterruptedException {
		driver.findElement(locator.slectdressinwomencategory).click();
		delay();
	}

	@Then("click MEN category")
	public void click_men_category() throws InterruptedException {
	   driver.findElement(locator.mencategoryplusbutton).click();
	   driver.findElement(locator.selectinmencategory).click();
	   delay();
	}

	//CASE - 18
	
	@Then("click on Product button")
	public void click_on_product_button() throws InterruptedException {
	   driver.findElement(locator.productspageclick).click();
	   delay();
	   WebElement scroll7 = driver.findElement(locator.scrollproductpage);
	   scrollcreateaccount(scroll7);
	}

	@Then("click any brand name")
	public void click_any_brand_name() throws InterruptedException {
	   driver.findElement(locator.clickpolobrand).click();
	   delay();
	}

	@Then("click any other brand link")
	public void click_any_other_brand_link() throws InterruptedException {
	 driver.findElement(locator.clickHMbrand).click();
	 delay();
	}

	//CASE - 21
	
	@Then("Click on Products button")
	public void click_on_products_button() throws InterruptedException {
		 driver.findElement(locator.productspageclick).click();
		   delay();
		   WebElement scroll7 = driver.findElement(locator.scrollproductpage);
		   scrollcreateaccount(scroll7);
	}

	@Then("click on view product button")
	public void click_on_view_product_button() throws InterruptedException {
		driver.findElement(locator.viewfirstproduct).click();
		delay();
	}

	@Then("enter name, email and review")
	public void enter_name_email_and_review() {
	   WebElement scroll7 = driver.findElement(locator.scrollforreview);
	   scrollcreateaccount(scroll7);
	   driver.findElement(locator.inputnameforreview).sendKeys("Sankar");
	   driver.findElement(locator.inputemailforreview).sendKeys("murugasankar.ms@gmail.com");
	   driver.findElement(locator.productreview).sendKeys("HI");
	   
	}

	@Then("click submit to button")
	public void click_submit_to_button() {
		driver.findElement(locator.preoductreviewsubmit).click();
	}

	//CASE - 22
	
	@Then("scroll down to bottom of the page")
	public void scroll_down_to_bottom_of_the_page() throws InterruptedException {
	WebElement scroll8 = driver.findElement(locator.scrolltorecommendedproduct);
	scrollcreateaccount(scroll8);
	delay();
	delay();
	}

	@Then("Click on Add To Cart on Recommended product")
	public void click_on_add_to_cart_on_recommended_product() throws InterruptedException {
	   driver.findElement(locator.addrecommendedproduct).click();
	   delay();
	}

	@Then("click on View cart button")
	public void click_on_view_cart_button() {
		driver.findElement(locator.viewcartrecommendeditems).click();
	    
	}
	
	//CASE - 25
	
	@Then("full scroll down")
	public void full_scroll_down() throws InterruptedException {
		WebElement scroll8 = driver.findElement(locator.scrolltorecommendedproduct);
		scrollcreateaccount(scroll8);
		delay(); 
	}

	@Then("full scroll up")
	public void full_scroll_up() throws InterruptedException {
		driver.findElement(locator.fullscrollupbutton).click();
	   delay();
	}

	//CASE - 26
	
	@Then("last full scrolldown")
	public void last_full_scrolldown() throws InterruptedException {
		WebElement scroll8 = driver.findElement(locator.scrolltorecommendedproduct);
		scrollcreateaccount(scroll8);
		delay();
	}

	@Then("last full scrollup")
	public void last_full_scrollup() {
	   WebElement scroll7 = driver.findElement(locator.fullscrollmanual);
	   scrollcreateaccount(scroll7);
	}

}

