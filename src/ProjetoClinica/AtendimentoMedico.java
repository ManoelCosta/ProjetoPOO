package ProjetoClinica;

import java.util.Scanner;

public class AtendimentoMedico {
    String horarioInicio, horarioTermino, dataAtendimento, historiaDoencaAtula, sintoma,
            historiaMedica, alergias, habitos, inspecao, palpacao, percussao, ausculta;
    Medico medico;
    Paciente paciente;

    void cadPaciente(Paciente paciente){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome");
        paciente.nome = sc.next();
        System.out.println("Informe o CPF: ");
        paciente.cpf = sc.nextInt();
        System.out.println("Informe o RG: ");
        paciente.rg = sc.nextInt();
        System.out.println("Informe a idade: ");
        paciente.idade = sc.nextInt();
        System.out.println("Informe o gênero: ");
        paciente.genero = sc.next();
        System.out.println("Informe o Estado Civil: ");
        paciente.estadoCivil = sc.next();
        System.out.println("Informe a profissão do paciente: ");
        paciente.profissao = sc.next();
        System.out.println("Informe o Peso: ");
        paciente.peso = sc.nextDouble();
        System.out.println("Informe a altura: ");
        paciente.altura = sc.nextDouble();
        System.out.println("Informe o CEP: ");
        paciente.cep = sc.nextInt();
        System.out.println("Informe a rua: ");
        paciente.rua = sc.next();
        System.out.println("Informe o Bairro: ");
        paciente.bairro = sc.next();
        System.out.println("Informe a cidade: ");
        paciente.cidade = sc.next();
        System.out.println("Informe o Estado: ");
        paciente.estado = sc.next();
        System.out.println("Informe a Pressão arterial");
        System.out.print("Sistole: ");
        paciente.pressaoSistolica = sc.nextInt();
        System.out.print("Diastole: ");
        paciente.pressaoDiastolica = sc.nextInt();

    }
}
