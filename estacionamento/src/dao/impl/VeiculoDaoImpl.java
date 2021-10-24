package dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import dao.VeiculoDao;
import mode.Veiculo;
import mode.util.JpaUtil;

public class VeiculoDaoImpl implements VeiculoDao{

	private EntityManager em;
	private EntityTransaction et;
	
	@Override
	public void salvar(Veiculo veiculo) {
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.persist(veiculo);
			et.commit();
		}	catch (Exception e) {
			if (em.isOpen()) {
				et.rollback();
			}	
			System.out.println("Erro de transação");
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}
		
	}

	@Override
	public void altera(Veiculo veiculo) {
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.merge(veiculo);
			et.commit();
		}	catch (Exception e) {
			if(em.isOpen()) {
				et.rollback();
			} System.out.println("Erro de transação.");
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}
		
	}

	@Override
	public void remover(String placa) {
		try {
			this.em = JpaUtil.getEntityManager();
			et = em.getTransaction();
			et.begin();
			em.remove(em.find(Veiculo.class, placa));
			et.commit();
		}	catch (Exception e) {
			if(em.isOpen()) {
				et.rollback();
			}	System.out.println("Erro de Trasação");
		}
		
	}

	@Override
	public Veiculo pesquisar(String placa) {
		Veiculo veiculo = new Veiculo();
		try {
			this.em = JpaUtil.getEntityManager();
			veiculo = em.find(Veiculo.class, placa);
		}	catch (Exception e) {
			if(em.isOpen()) {
				et.rollback();
			}System.out.println("Erro de trasação");
		} finally {
			if (em.isOpen()) {
				em.close();
			}
		}
		return veiculo;
	}

	@Override
	public List<Veiculo> listaTodos() {
		this.em = JpaUtil.getEntityManager();
		Query query = em.createQuery("from Veiculo e");
		List<Veiculo> listaVeiculo = query.getResultList();
		em.close();
		return listaVeiculo;
	}

}
