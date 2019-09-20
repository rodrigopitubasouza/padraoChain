package padraochain;

public class FuncionarioSecretaria extends Funcionario {

    public FuncionarioSecretaria(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoHistorico.getTipoDocumentoHistorico());
        setFuncionarioSuperior(superior);
    }
   
    @Override
    public String getDescricaoCargo() {
        return "Secretaria";
    }
    
}
