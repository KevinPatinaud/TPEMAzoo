package Zoo;

import java.util.ArrayList;

import animal.Gazelle;
import animal.Lion;
import animal.Monkey;
import animal.animal;
import personnel.Gardien;

public class Zoo {

	ArrayList<animal> pensionnaires = new ArrayList<animal>();
	Gardien gardien;
	
	public Zoo() {
		gardien = new Gardien(this);
		
		
		addAnimal(new Gazelle());
		addAnimal(new Gazelle());
		addAnimal(new Gazelle());

		addAnimal(new Lion());
		addAnimal(new Lion());
		addAnimal(new Lion());
		addAnimal(new Lion());

		addAnimal(new Monkey());
		addAnimal(new Monkey());
	}
	
	
	public void addAnimal(animal nouveauPensionnaire)
	{
		pensionnaires.add(nouveauPensionnaire);
	}
	
	public ArrayList<animal> getPensionnaires()
	{
		return pensionnaires;
	}
	
	public Gardien getGardien()
	{
		return gardien;
	}
	
	
}
