import java.util.ArrayList;

public class RegraNegocioEmpresa {


    private ArrayList<Empresa> empresas = new ArrayList<>();

    public void cadastrarEmpresa(Empresa empresa) {
        empresas.add(empresa);
    }

    public ArrayList<Empresa> listarEmpresa() {
        return empresas;
    }
    
}


