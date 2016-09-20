package main;


import Zoo.Zoo;
import animal.Gazelle;
import animal.Lion;
import animal.Monkey;

public class Main {

	public static void main(String[] args) {

		Zoo zoo = new Zoo();

		zoo.addAnimal(new Gazelle());
		zoo.addAnimal(new Gazelle());
		zoo.addAnimal(new Gazelle());

		zoo.addAnimal(new Lion());
		zoo.addAnimal(new Lion());

		zoo.addAnimal(new Monkey());
		zoo.addAnimal(new Monkey());
		zoo.addAnimal(new Monkey());
		zoo.addAnimal(new Monkey());
		
		zoo.getGardien().compterLesAnimaux();
		
		
	}
	
	
}
