package dao;

import javax.persistence.EntityManager;

import model.UF;
import model.Usuario;
import util.PersistenceUtil;

public class UsuarioDAO {

	private static UsuarioDAO usuarioDAO;
	public static UsuarioDAO getInstance() {
		if (usuarioDAO == null) usuarioDAO = new UsuarioDAO();
		return usuarioDAO;
	}
	
	/** 
	 * Persiste objeto Usuario 
	 * @param Usuario
	 * @return objeto Usuario 
	 */
	public Usuario persistir(Usuario usuario) {
		EntityManager em = PersistenceUtil.getEntityManager();
		try {
			em.getTransaction().begin();
			usuario = em.merge(usuario);
			//em.persist(usuario);
			em.getTransaction().commit();
			System.out.println("Registro gravado com sucesso");
		} catch (Exception e) {
			em.getTransaction().rollback();
			e.printStackTrace();
		}
		return usuario;
		//return PersistenceUtil.getEntityManager().merge(usuario);
		
	}

}
