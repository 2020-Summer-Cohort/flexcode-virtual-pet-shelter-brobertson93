package shelter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class VirtualPetShelterTest {

    @Test
    public void testFeed () {
        VirtualPet pet = new VirtualPet("Charles",
                "He is a good dog",
                100,
                100,
                100,
                100
                );
        pet.feed();
        assertEquals(pet.getHunger(),120);
        assertEquals(pet.getThirst(),95);


    }

    @Test
    public void testDrink() {
        VirtualPet pet = new VirtualPet("Charles",
                "He is a good dog",
                100,
                100,
                100,
                100
        );
        pet.drink();
        assertEquals(pet.getThirst(), 120);
        assertEquals(pet.getHunger(),95);
    }
    @Test
    public void testPlay() {
        VirtualPet pet = new VirtualPet("Charles",
                "He is a good dog",
                100,
                100,
                100,
                100
        );
        pet.play();

        assertEquals(pet.getHunger(),95);
        assertEquals(pet.getThirst(),92);
        assertEquals(pet.getBoredom(),120);
        assertEquals(pet.getTiredness(),85);
    }

    @Test
    public void testSleep() {
        VirtualPet pet = new VirtualPet("Charles",
                "He is a good dog",
                100,
                100,
                100,
                100
        );
        pet.sleep();

        assertEquals(pet.getHunger(),75);
        assertEquals(pet.getThirst(),82);
        assertEquals(pet.getTiredness(),145);
    }

    @Test
    public void testIncrementer() {
        VirtualPet pet = new VirtualPet("Charles",
                "He is a good dog",
                100,
                100,
                100,
                100
        );

        pet.incrementAttributes();

        assertEquals(pet.getHunger(),98);
        assertEquals(pet.getThirst(),97);
        assertEquals(pet.getBoredom(),99);
        assertEquals(pet.getTiredness(),98);
    }

    @Test
    public void petStatusDead() {
        VirtualPet pet = new VirtualPet("Charles",
                "He is a good dog",
                0,
                100,
                100,
                100
        );
        pet.petStatus();
        assertFalse(false);
    }

    @Test
    public void petStatusAlive() {
        VirtualPet pet = new VirtualPet("Charles",
                "He is a good dog",
                100,
                100,
                100,
                100
        );
        pet.petStatus();
        assertTrue(true);

    }
}
