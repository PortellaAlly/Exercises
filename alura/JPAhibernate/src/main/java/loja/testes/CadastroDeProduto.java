package loja.testes;

import loja.dao.ProdutoDAO;
import loja.modelo.Categoria;
import loja.modelo.Produto;
import loja.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProduto {

    public static void main(String[] args) {
        Produto celular = new Produto("Xiaomi Redmi", "Bem massa visse", new BigDecimal("800"), Categoria.CELULARES);

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDAO dao = new ProdutoDAO(em);

        em.getTransaction().begin();
        dao.cadastrar(celular);
        em.getTransaction().commit();
        em.close();
    }
}
