import java.io.*;
import java.util.*; 

interface Webpage{
	public void openWebpage();
}

class Homepage implements Webpage{
	public void openWebpage(){
		System.out.println("Homepage opened");
	}
}

class WebpageDecorator implements Webpage{
	protected Webpage webpage;
	
	public WebpageDecorator(Webpage webpage){
		this.webpage = webpage;
	}
	
	public void openWebpage(){
		webpage.openWebpage();
	}
}

class ProfilePage extends WebpageDecorator{
	public ProfilePage(Webpage webpage){
		super(webpage);
	}
	public void openWebpage(){
		webpage.openWebpage();
		System.out.println("Profile Page opened");
	}
}


class DecoratorWeb{
	public static void main(String[] args){
		Webpage webpage = new ProfilePage(new Homepage());
		webpage.openWebpage();
	}
}
