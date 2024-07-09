import java.util.ArrayList;

public class RegraNegocioFuncionario {

    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public ArrayList<Funcionario> listarFuncionario() {
        return funcionarios;
    }

}
