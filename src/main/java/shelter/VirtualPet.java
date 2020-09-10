package shelter;

public class VirtualPet {
    String name;
    int hunger = 100;
    int thirst = 100;
    int boredom = 100;
    int tiredness = 100;


    public void printAttributes() {
        VirtualPetsContainer d = VirtualPetsContainer.getInstance();
        System.out.println("Name     | Hunger | Thirst | Boredom");

        for (int i = 0; i < d.array.size(); i++) {

            System.out.println((i + 1) + ": " + d.array.get(i).name + "|" + d.array.get(i).hunger + "|" + d.array.get(i).thirst + "|" + d.array.get(i).boredom + "|" + d.array.get(i).tiredness); // prints out pet names

        }

        /*System.out.println("Hunger: " + hunger);//prints out all the options for interacting with the pet
        System.out.println("Thirst: " + thirst);
        System.out.println("Boredom: " + boredom);
        System.out.println("Tiredness: " + tiredness);*/

        System.out.println("");
        System.out.println("1: Feed all of the pets");
        System.out.println("2: Give all of the pets water");
        System.out.println("3: Play with a pet");
        System.out.println("4: put all of the pets to sleep");
        System.out.println("5: Do nothing.");
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("7: Allow pet to be adopted");
        System.out.println("8: Take in a homeless pet");
        System.out.println("9: Quit the program");
    }

    public int getHunger() {

        return hunger;
    }

    public int getThirst() {

        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public int getTiredness() {
        return tiredness;
    }

    public void feed() {
        //brings in singleton array
        hunger = hunger + 20;//updates hunger
        thirst = thirst - 5; //updates thirst



    }

    public void drink() {
        thirst = thirst + 20;
        hunger = hunger - 5;


    }

    public void play() {
        boredom = boredom + 20;
        hunger = hunger - 5;
        thirst = thirst - 8;
        tiredness = tiredness - 15;




    }

    public void sleep() {


        hunger = hunger - 25;
        thirst = thirst - 18;
        tiredness = tiredness + 45;



    }

    public void incrementAttributes() {


        hunger = hunger - 2;

        thirst = thirst - 3;

        boredom = boredom - 1;

        tiredness = tiredness - 2;




    }


    public boolean petStatus() {
        VirtualPetsContainer pets = VirtualPetsContainer.getInstance();
        if (hunger < 0) {
            System.out.println("");
            System.out.println("***" + name + " died from hunger!***"); //lets you know which pet died from a particular attribute hitting < 0
            pets.arrayDead.add(name);

            return false;


        } else if (hunger < 40) {
            System.out.println("");
            System.out.println("***" + name + " is dying from hunger!***"); // warns that a pet is getting closed to dying
            System.out.println("");
        }

        if (thirst < 0) {
            System.out.println("");
            System.out.println("***" + name + " died from  thirst!***");
            return false;

        } else if (thirst < 40) {
            System.out.println("");
            System.out.println("***" + name + " is dying from thirst!***"); // warns that a pet is getting closed to dying
            System.out.println("");
        }
        if (tiredness < 0) {
            System.out.println("");
            System.out.println("***" + name + " died from tiredness!***");
            return false;

        } else if (tiredness < 40) {
            System.out.println("");
            System.out.println("***" + name + " is dying from tiredness!***"); // warns that a pet is getting closed to dying
            System.out.println("");
        }

        if (boredom < 0) {
            System.out.println("");
            System.out.println("***" + name + " died from boredom!***");
            return false;

        } else if (boredom < 40) {
            System.out.println("");
            System.out.println("***" + name + " is dying from boredom!***"); // warns that a pet is getting closed to dying
            System.out.println("");
        }
        return true;

    }
}
 


