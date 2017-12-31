package test;


import com.qtpselenium.facebook.pages.inbox.LandingPage;
import com.qtpselenium.facebook.pages.login.LoginPage;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		LoginPage l = new LoginPage();
		LandingPage landingPage = l.doLogin("cp.murali@gmail.com", "mu5ra5li");
		landingPage.gotoProfile();
		
	}

}
