package ProjetoClinica;

import java.util.Scanner;

public class Clinica {
    public static void main (String args[]){
        Paciente paciente = new Paciente();
        Medico medico = new Medico();
        AtendimentoMedico atendimento = new AtendimentoMedico();

        //Cadastro de paciente
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe o nome do Paciente: ");
        paciente.nome = sc.next();
        System.out.println("Informe a idade do Paciente: ");
        paciente.idade = sc.nextInt();
        System.out.println("Informe o CPF do paciente: ");
        paciente.cpf = sc.nextInt();
        System.out.println("Informe o RG do paciente: ");
        paciente.rg = sc.nextInt();
        System.out.println("Informe o gênero do Paciente: ");
        paciente.genero = sc.next();
        System.out.println("Informe o estado civil do paciente: ");
        paciente.estadoCivil = sc.next();
        System.out.println("Informe a profissão do paciente: ");
        paciente.profissao = sc.next();
        System.out.println("Informe o CEP do Paciente: ");
        paciente.cep = sc.nextInt();
        System.out.println("Informe a rua do paciente: ");
        paciente.rua = sc.next();
        System.out.println("Informe o bairro: ");
        paciente.bairro = sc.next();
        System.out.print("Informe a cidade do paciente: ");
        paciente.cidade = sc.next();
        System.out.print("Informe o Estado do paciente");
        paciente.estado = sc.next();
        System.out.print("Informe a altura do paciente: ");
        paciente.altura = sc.nextDouble();
        System.out.print("Informe o peso do paciente: ");
        paciente.peso = sc.nextDouble();
        System.out.println("Informe a pressão arterial do paciente");
        System.out.print("Sistole: ");
        paciente.pressaoSistolica = sc.nextInt();
        System.out.print("Diastole: ");
        paciente.pressaoDiastolica = sc.nextInt();


    }
}
