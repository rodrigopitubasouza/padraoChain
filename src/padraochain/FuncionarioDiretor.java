package padraochain;

public class FuncionarioDiretor extends Funcionario {

    public FuncionarioDiretor(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoCertificado.getTipoDocumentoCertificado());
        setFuncionarioSuperior(superior);
    }
   
    @Override
    public String getDescricaoCargo() {
        return "Diretor";
    }
    
}
