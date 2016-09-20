package Zoo;

import java.util.ArrayList;

import animal.Gazelle;
import animal.Lion;
import animal.Monkey;
import animal.animal;
import personnel.Gardien;

public class Zoo {

	private ArrayList<animal> pensionnaires;
	private Gardien gardien;
	
	public Zoo() {
		gardien = new Gardien(this);
		pensionnaires = new ArrayList<animal>();
		
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
