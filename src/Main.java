import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner ler =  new Scanner(System.in);

        TipoTelefone tipoTelefone;
        Pessoa pessoa = new Pessoa();

        System.out.println("Digite um nome: ");
        String nome = ler.next();
        System.out.println("Digite um sobre nome: ");
        String sobreNome = ler.next();
        System.out.println("Digite um CPF: ");
        String CPF = ler.next();
        System.out.println("Digite um email Valido por favor: ");
        String email = ler.next();
        System.out.println("Digite a data de nascimento: ");
        String nascimento = ler.next();
        System.out.println("Digite o nome da rua: ");
        String rua = ler.next();
        System.out.println("Digite o número da casa: ");
        int numero = ler.nextInt();
        System.out.println("Digite o Bairro");
        String bairro = ler.next();

        Endereco endereco = new Endereco(rua, numero, bairro );
        pessoa.setNome(nome);
        pessoa.setSobrenome(sobreNome);
        pessoa.setCPF(CPF);
        pessoa.setEmail(email);
        pessoa.setDataNascimento(nascimento);

        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Sobre nome: " + pessoa.getSobrenome());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("CPF: " + pessoa.getCPF());
        System.out.println("Email: " + pessoa.getEmail());
        System.out.println("Rua: " + endereco.getEndereco());
        System.out.println("Número: " + endereco.getNumero());
        System.out.println("Bairro: " + endereco.getBairro());

    }
}
