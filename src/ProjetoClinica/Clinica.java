package ProjetoClinica;

public class Clinica {

    public static void main (String args[]){
        Paciente paciente = new Paciente();
        paciente.nome = "Manoel Silva Costa";
        paciente.cpf = "007.706.262-03";
        paciente.endereco = "Viela São Francisco";
        paciente.cartaoSus = "654654";

        Medico medico = new Medico();
        medico.nome = "João Carlos";
        medico.especialidade = "Cardiologista";
        medico.crm = "987487";

        AtendimentoMedico atendimentoMedico = new AtendimentoMedico();
        atendimentoMedico.dataConsulta = "29/03/2019";
        atendimentoMedico.paciente = paciente;
        atendimentoMedico.medico = medico;




    }
}
