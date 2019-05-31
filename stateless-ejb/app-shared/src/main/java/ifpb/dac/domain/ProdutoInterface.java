package ifpb.dac.domain;

import java.util.List;


public interface ProdutoInterface {
    
    void adicionar(Produto produto);
    
    void remover(Produto produto);
    
    void atualizar(Produto produto);
    
    List<Produto> todososproduto();
    
    Produto buscardescricao(String descricao);
}
