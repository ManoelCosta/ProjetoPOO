package ProjetoClinica;


import java.sql.SQLOutput;
import java.util.Scanner;

public class AtendimentoMedico {
    String horarioInicio, horarioTermino, dataAtendimento, historiaDoencaAtula, sintoma,
            historiaMedica;

    void cadPaciente (){
        Paciente paciente = new Paciente();
        Scanner sc = new Scanner(System.in);
        System.out.println("******* Cadastro de Paciente******");
        System.out.println("********* Dados pessoais *********");
        System.out.println("Informe o nome do paciente: ");
        paciente.nome = sc.nextLine();
        System.out.println("Informe a idade do paciente: ");
        paciente.idade = sc.nextInt();
        System.out.println("Informe o Genero do paciente: ");
        paciente.genero = sc.nextLine();
        paciente.genero = sc.nextLine();
        System.out.println("informe o CPF do paciente; ");
        paciente.cpf = sc.nextLine();
        System.out.println("Informe o RG do Paciente: ");
        paciente.rg = sc.nextLine();
        System.out.println("Informe o Estado Civil do Paciente: ");
        paciente.estadoCivil = sc.nextLine();
        System.out.println("Informe a Profissão do Paciente: ");
        paciente.profissao = sc.nextLine();
        System.out.println("************ Endereço *************");
        System.out.println("Informe o CEP do Paciente: ");
        paciente.cep = sc.nextLine();
        System.out.println("Informe a rua: ");
        paciente.rua = sc.nextLine();
        System.out.println("Informe o bairro: ");
        paciente.bairro = sc.nextLine();
        System.out.println("Informe a cidade: ");
        paciente.cidade = sc.nextLine();
        System.out.println("Informe o Estado: ");
        paciente.estado = sc.nextLine();
        System.out.println("********** Dados Clinicos *********");
        System.out.println("Informe a altura do paciente: ");
        paciente.altura = sc.nextDouble();
        System.out.println("Informe o peso do paciente");
        paciente.peso = sc.nextDouble();
    }

    void addMedico(){
        Medico medico = new Medico();
        Scanner sc = new Scanner(System.in);
        System.out.println("********** Cadastro do Medico *******");
        System.out.println("Informe o nome do médico");
        medico.nome = sc.nextLine();
        System.out.println("Informe a especialidade do medico: ");
        medico.especialidade = sc.nextLine();
        System.out.println("Informe o CRM do medico: ");
        medico.crm = sc.nextLine();

    }

}
