package personnel;

import java.util.ArrayList;

import Zoo.Zoo;
import animal.animal;

public class Gardien {

	Zoo zoo ;
	ArrayList<compteAnimal> listeReference = new ArrayList<compteAnimal>();
	
	public Gardien(Zoo z) {
		zoo = z;
		listeReference.add(new compteAnimal(3 , "Gazelle"));
		listeReference.add(new compteAnimal(2 , "Lion"));
		listeReference.add(new compteAnimal(4 , "Monkey"));
	}
	
	
	public boolean bonNombreAnimaux()
	{
		ArrayList<compteAnimal> ALanim =  compterLesAnimaux();
		
		for (int iref = 0 ; iref < listeReference.size() ; iref++)
		{

			boolean categorieAnimalTrouve = false;
			
			for (int ilist = 0 ; ilist < ALanim.size() ; ilist++)
			{
				if ( listeReference.get(iref).nom.equals(ALanim.get(ilist).nom)) //les deux categorie ont été trouvée
				{
					categorieAnimalTrouve = true;
					if(listeReference.get(iref).nombre != ALanim.get(ilist).nombre)
						return false;
				}
				
			}
			
			if ( ! categorieAnimalTrouve )
				return false;
		}
		
		
		
			
		return true;
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

		public compteAnimal() {
		}
		
		public compteAnimal(int nmb , String name) {
			nombre = nmb;
			nom = name;
		}
	}
	
}
