package CaioProject;

public class FirstProject {

	public static void main(String[] args) {
		String ambiente = args[0];
			if(ambiente.equalsIgnoreCase("DEV")) {
				System.out.print("Ambiente Dev");
				
			}else if(ambiente.equalsIgnoreCase("Teste")) {
				System.out.print("Ambiente de teste");
			}else {
				System.out.print("Modo usuário");
			}

	}

}