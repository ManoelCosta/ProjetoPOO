package ProjetoClinica;

import java.util.Scanner;

public class Clinica {

    public static void main (String args[]){
        Paciente paciente = new Paciente();
        Medico medico = new Medico();
        AtendimentoMedico atendimento = new AtendimentoMedico();

        //Cadastro de paciente
        Scanner sc = new Scanner(System.in);

        atendimento.cadPaciente(paciente);


    }
}
