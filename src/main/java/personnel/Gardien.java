package personnel;

import java.util.ArrayList;

import Zoo.Zoo;
import animal.animal;

public class Gardien {

	Zoo zoo ;
	
	public Gardien(Zoo z) {
		zoo = z;
	}
	
	public ArrayList<compteAnimal> compterLesAnimaux()
	{
		ArrayList<compteAnimal> compteurAnimal = new ArrayList<compteAnimal>();
	    ArrayList<animal> lesAnimauxDuZoo =	zoo.getPensionnaires();
	    
	    for (int i = 0 ; i < lesAnimauxDuZoo.size() ; i++)
	    {
	    	String nomAnimal = lesAnimauxDuZoo.get(i).crier().getNomAnimal().replaceAll("animal.", "");
	    	
	    	if ( trouveAnimalinAList ( compteurAnimal , nomAnimal ) != -1)
	    	{
	    		compteurAnimal.get(trouveAnimalinAList ( compteurAnimal , nomAnimal )).nombre++;
	    	}
	    	else
	    	{
	    		compteAnimal c = new compteAnimal();
	    		c.nombre++;
	    		c.nom = nomAnimal;
	    		compteurAnimal.add(c);
	    	}
	    }
	    
	    
		
		for (int i = 0 ; i < compteurAnimal.size() ; i++)
			System.out.println(compteurAnimal.get(i).nom + " : " + compteurAnimal.get(i).nombre);
	    
	    return compteurAnimal;
	}
	
	
	private int trouveAnimalinAList(ArrayList<compteAnimal> compteurAnimal , String valRecherchee)
	{
		for (int i = 0 ; i < compteurAnimal.size() ; i++)
		{
			if ( compteurAnimal.get(i).nom.equals(valRecherchee))
				return i;
		}
		return -1;
	}
	
	
	private class compteAnimal
	{
		int nombre = 0;
		String nom = "";
	}
	
}
