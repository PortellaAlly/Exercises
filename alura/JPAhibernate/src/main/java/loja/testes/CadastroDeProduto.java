package loja.testes;

import loja.dao.ProdutoDAO;
import loja.modelo.Produto;
import loja.util.JPAUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.math.BigDecimal;

public class CadastroDeProduto {

    public static void main(String[] args) {
        Produto celular = new Produto();

        celular.setNome("Xiaomi Redmi");
        celular.setDescricao("Bem massa visse");
        celular.setPreco(new BigDecimal("800"));

        EntityManager em = JPAUtil.getEntityManager();
        ProdutoDAO dao = new ProdutoDAO(em);

        em.getTransaction().begin();
        dao.cadastrar(celular);
        em.getTransaction().commit();
        em.close();
    }
}
