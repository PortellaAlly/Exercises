package loja.testes;

import loja.dao.CategoriaDAO;
import loja.dao.ProdutoDAO;
import loja.modelo.Categoria;
import loja.modelo.Produto;
import loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;

public class CadastroDeProduto {

    public static void main(String[] args) {
        EntityManager em = JPAUtil.getEntityManager();

        Categoria celulares = new Categoria("CELULARES");

        Produto celular = new Produto("Xiaomi Redmi", "Bem massa visse", new BigDecimal("800"), celulares);

        CategoriaDAO categoriaDAO = new CategoriaDAO(em);
        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        em.getTransaction().begin();

        categoriaDAO.cadastrar(celulares);
        produtoDAO.cadastrar(celular);
        
        em.getTransaction().commit();
        em.close();
    }
}
