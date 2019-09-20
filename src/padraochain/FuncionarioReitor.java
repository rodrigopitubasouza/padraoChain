package padraochain;

public class FuncionarioReitor extends Funcionario {

    public FuncionarioReitor(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoDiploma.getTipoDocumentoDiploma());
        setFuncionarioSuperior(superior);
    }
   
    @Override
    public String getDescricaoCargo() {
        return "Reitor";
    }
    
}
