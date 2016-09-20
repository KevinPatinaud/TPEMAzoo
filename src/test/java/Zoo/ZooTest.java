package Zoo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import animal.Gazelle;
import animal.Lion;
import animal.Monkey;

public class ZooTest {
	
	
	@Test
	public void test() {
	
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

		
		if (  ! zoo.getGardien().bonNombreAnimaux())
			fail("Le nombre d'animaux est incorrect");
		
	}

	
	@Test
	public void testAjout_animal() {
	
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

		//ajout d'un singe
		zoo.addAnimal(new Monkey());
		
		if ( zoo.getGardien().bonNombreAnimaux() )
			fail("Le gardien compte mal");
		
	}


	
	@Test
	public void testzooVide() {
	
		Zoo zoo = new Zoo();
		
		if ( zoo.getGardien().bonNombreAnimaux() )
			fail("Le gardien compte mal et le zoo est vide");
		
	}

}
