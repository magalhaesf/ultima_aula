import java.util.Date;
import java.util.Scanner;

public class Programa{

    public static void main (String[] args){
        
        Scanner sc = new Scanner(System.in);

        Aluno aluno1 = new Aluno();
       
       aluno1.nome = "Fernanda";
       aluno1.sobrenome = "Magalhães";
       aluno1.dataNascimento = new Date(2008, 3, 1);
       aluno1.sexo = "Feminino";
       aluno1.contato = "45 66411351";
       aluno1.cpf = "21314654";

       Endereco enderecoDoAluno1 = new Endereco();

       enderecoDoAluno1.bairro = "Parque São Paulo";
       enderecoDoAluno1.rua = "Nilo Peçanha";
       enderecoDoAluno1.num = "459";

       aluno1.endereco = enderecoDoAluno1;




       Aluno aluno2 = new Aluno();
       
       aluno2.nome = "José";
       aluno2.sobrenome = "Silva";
       aluno2.dataNascimento = new Date(2008, 3, 1);
       aluno2.sexo = "Masculino";
       aluno2.contato = "45 99855146";
       aluno2.cpf = "89752354";

       Endereco enderecoDoaluno2 = new Endereco();

       enderecoDoaluno2.bairro = "Parque São Paulo";
       enderecoDoaluno2.rua = "Rua das Abobrinhas";
       enderecoDoaluno2.num = "2459";

       aluno2.endereco = enderecoDoaluno2;
       
        sc.close();
    }
}


