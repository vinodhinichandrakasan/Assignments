package week3.day2;

public class Automation extends MultipleLangauge{

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("MultipleLangauge is ruby");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("TestTool is selenium");
		
	}

	public void Java() {
		// TODO Auto-generated method stub
		
		System.out.println("Language is Java");
		
	}
	
	public static void main(String[] args) {
		Automation au=new Automation();
		au.python();
		au.ruby();
		au.Selenium();
		au.Java();
		
	}

}
