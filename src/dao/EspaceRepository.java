package dao;

import java.util.List;

import entities.Espace;
import entities.Personne;
import entities.Type_abonnement;

public class EspaceRepository extends Repository<Espace>{

	public EspaceRepository() {
		super(Espace.class);
		// TODO Auto-generated constructor stub
	}
		
	public Espace findBy(String nom, Personne gerant)
	{
		return (Espace) em.createQuery("from "+entityClass.getSimpleName()+ " where nom_esp='"+nom+"' AND id_gerer='"+ gerant.getId_personne() +"'").getSingleResult();
	}
	
	public List<Espace> findEspaceByGerant(Long id)
	{
		return em.createQuery("from "+entityClass.getSimpleName()+" where id_gerer = '"+id+"'").getResultList();
	}



}
