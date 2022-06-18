public class main {
	public static void main(String[] args) {
		
		idAndPasswords idandPassword = new idAndPasswords();
		
		loginPage loginpage = new loginPage(idandPassword.getInfo());
		
	}
}

