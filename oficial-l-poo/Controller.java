//controller
   import java.util.Scanner;


    class Controller {
    public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);



		// Classe Pessoa.

		Pessoa pessoa = new Pessoa(null, null);

		System.out.println("Sobre a classe Pessoa");

		System.out.println();

		System.out.println("informe o seu nome abaixo: ");

		pessoa.setNome(ler.next());

		System.out.println("informe seu sobrenome abaixo: ");

		pessoa.setSobrenome(ler.next());

		System.out.println(pessoa.getNomeCompleto());

		System.out.println();

		System.out.println("*****************************************");


		// Classe Funcionario.

		Funcionario funcionario = new Funcionario(0, 0);

		// Gerenciando a Classe Pessoa.

		System.out.println("sobre a Classe Funcionario");

		System.out.println();

		System.out.println("Informe seu nome abaixo: ");

		funcionario.setNome(ler.next());

		System.out.println("informe seu sobrenome abaixo: ");

		funcionario.setSobrenome(ler.next());

		System.out.println(funcionario.getNomeCompleto());

		//Gerenciando a Classe Funcionario.

		System.out.println("qual seu número de matrícula: ");

		funcionario.setMatricula(ler.nextInt());

		System.out.println(funcionario.getMatricula());

		// Primeira Parcela (Salário Funcionário)
		System.out.println("informe o seu salário: ");

		funcionario.setSalario(ler.nextDouble());

		System.out.println(" informe a Primeira parcela do seu Salário: " + funcionario.getSalarioPrimeiraParcela());

		// Segunda Parcela (Salário Funcionário).
		System.out.println(" Informe a Segunda parcela do seu Salário: " + funcionario.getSalarioSegundaParcela());

		System.out.println();

		System.out.println("---------------------------------------------------------------------");

		// Classe Professor.

		Professor professor = new Professor(0, 0);

		// Gerenciando a Classe Pessoa.

		System.out.println("sobre a Classe Professor");

		System.out.println();

		System.out.println("Informe seu nome abaixo: ");

		professor.setNome(ler.next());

		System.out.println("informe seu sobrenome abaixo: ");

		professor.setSobrenome(ler.next());

		System.out.println(professor.getNomeCompleto());

		// Gerenciando a Classe Funcionario.

		System.out.println("informe o numero da sua matrícula: ");

		professor.setMatricula(ler.nextInt());

		System.out.println(professor.getMatricula());

		// Gerenciando a Classe Professor.

		// primeira parcela (pagamento )
		System.out.println("Informe seu salário: ");

		professor.setSalario(ler.nextDouble());

		System.out.println("Sua primeira parcela do Salário é: " + professor.getSalarioPrimeiraParcela());

		// segunda parcela (pagamento)
		System.out.println("Sua segunda parcela do Salário é: " + professor.getSalarioSegundaParcela());

	}

}


	

  
