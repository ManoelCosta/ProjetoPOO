package ProjetoClinica;

import java.util.Scanner;

public class Clinica {

    public static void main (String args[]){
        int a = 0, b;
        AtendimentoMedico atendimentoMedico = new AtendimentoMedico();
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Escolha a opção: ");
            System.out.println("1 ----- Iniciar Atendimento");
            System.out.println("2 ----- Cadastrar Paciente");
            System.out.println("3 ----- Cadastrar Medico");
            System.out.println("5 ----- Fechar aplicação ");
            b = sc.nextInt();
            switch (b){
                case 1:
                    atendimentoMedico.cadPaciente();
                    atendimentoMedico.addMedico();
                    System.out.println("Informe o horário de inicio a atendimento: ");
                    atendimentoMedico.horarioInicio = sc.nextLine();
                    atendimentoMedico.horarioInicio = sc.nextLine();
                    System.out.println("Informe o horário de termino do paciente: ");
                    atendimentoMedico.horarioTermino = sc.nextLine();
                    System.out.println("Informe a data de atendimento: ");
                    atendimentoMedico.dataAtendimento = sc.nextLine();
                    System.out.println("Informe a historia da doença Atual: ");
                    atendimentoMedico.historiaDoencaAtula = sc.nextLine();
                    System.out.println("Informe a historia clinica do paciente: ");
                    atendimentoMedico.historiaMedica = sc.nextLine();
                    System.out.println("Informe os sintomas do paciente: ");
                    atendimentoMedico.sintoma = sc.nextLine();
                    a = 0;
                    break;
                case 2:
                    atendimentoMedico.cadPaciente();
                    break;
                case 3:
                    atendimentoMedico.addMedico();
                    break;

                case 5:
                    a = 5;
                    break;

            }
        }while (a == 0);


    }
}
