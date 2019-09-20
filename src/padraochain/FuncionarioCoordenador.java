package padraochain;

public class FuncionarioCoordenador extends Funcionario {

    public FuncionarioCoordenador(Funcionario superior) {
        listaDocumentos.add(TipoDocumentoMatricula.getTipoDocumentoMatricula());
        setFuncionarioSuperior(superior);
    }
   
    @Override
    public String getDescricaoCargo() {
        return "Coordenador";
    }
    
}
