package loja.testes;

import loja.dao.CategoriaDAO;
import loja.dao.ProdutoDAO;
import loja.modelo.Categoria;
import loja.modelo.Produto;
import loja.util.JPAUtil;

import javax.persistence.EntityManager;
import java.math.BigDecimal;
import java.util.List;

public class CadastroDeProduto {

    public static void main(String[] args) {
        cadastrarProduto();
        Long id = 1l;

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDAO produtoDAO = new ProdutoDAO(em);

        Produto p = produtoDAO.buscarPorId(1l);
        System.out.println(p.getPreco());

        List<Produto> todos = produtoDAO.buscarTodos();
        todos.forEach(p2 -> System.out.println(p.getNome()));
    }

    private static void cadastrarProduto() {
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
