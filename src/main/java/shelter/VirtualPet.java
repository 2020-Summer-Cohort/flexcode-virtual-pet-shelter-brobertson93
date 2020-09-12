package shelter;


public class VirtualPet {

    String name;
    String description;
    int hunger;
    int thirst;
    int boredom;
    int tiredness;

    public VirtualPet(String nameInput, String descriptionInput, int hungerInput, int thirstInput, int boredomInput, int tirednessInput) {

        this.name = nameInput;
        this.description = descriptionInput;
        this.hunger = hungerInput;
        this.thirst = thirstInput;
        this.boredom = boredomInput;
        this.tiredness = tirednessInput;

    }


    public void printAttributes() {
        VirtualPetsContainer d = VirtualPetsContainer.getInstance();
        int numberOfCharacters = 0;
         for (int i = 0; i < d.array.size(); i++) {

             if (numberOfCharacters < d.array.get(i).name.length()){
                 numberOfCharacters = d.array.get(i).name.length();
             }



         }
        System.out.print("Name");
         for (int i = 0 ; i < numberOfCharacters; i++) {
             System.out.print(" ");
         }

        System.out.println("| Hunger | Thirst | Boredom | Tiredness");
        //System.out.println("Name     | Hunger | Thirst | Boredom");


       // if (d.array.get(i).name.length() != numberOfCharacters) {
         //   int numberOfSpaces = numberOfCharacters - d.array.get(i).name.length();

        //}

        for (int i = 0; i < d.array.size(); i++) {
            if (d.array.get(i).name.length() != numberOfCharacters) {
                int numberOfSpaces = numberOfCharacters - d.array.get(i).name.length();
                System.out.print((i + 1) + ": " + d.array.get(i).name);

                    for (int k = 0; k < numberOfSpaces; k++) {
                        System.out.print(" ");
                    }

            }
            else {
                System.out.print((i + 1) + ": " + d.array.get(i).name);
            }

            System.out.print(" |");
            if (String.valueOf(d.array.get(i).hunger).length() == 3) {
                System.out.print("  " + d.array.get(i).hunger + "   |");
            }

            else if(String.valueOf(d.array.get(i).hunger).length() == 2) {
                System.out.print("  " + d.array.get(i).hunger + "    |");
            }
            else if(String.valueOf(d.array.get(i).hunger).length() == 1) {
                System.out.print("  " + d.array.get(i).hunger + "     |");
            }

            if (String.valueOf(d.array.get(i).thirst).length() == 3) {
                System.out.print("  " + d.array.get(i).thirst + "   |");
            }

            else if(String.valueOf(d.array.get(i).thirst).length() == 2) {
                System.out.print("   " + d.array.get(i).thirst + "   |");
            }
            else if(String.valueOf(d.array.get(i).thirst).length() == 1) {
                System.out.print("    " + d.array.get(i).thirst + "     |");
            }

            if (String.valueOf(d.array.get(i).boredom).length() == 3) {
                System.out.print("  " + d.array.get(i).boredom + "    |");
            }

            else if(String.valueOf(d.array.get(i).boredom).length() == 2) {
                System.out.print("   " + d.array.get(i).boredom + "    |");
            }
            else if(String.valueOf(d.array.get(i).boredom).length() == 1) {
                System.out.print("    " + d.array.get(i).boredom + "      |");
            }

            if (String.valueOf(d.array.get(i).tiredness).length() == 3) {
                System.out.println("  " + d.array.get(i).tiredness + "   ");
            }

            else if(String.valueOf(d.array.get(i).tiredness).length() == 2) {
                System.out.println("   " + d.array.get(i).tiredness + "   ");
            }
            else if(String.valueOf(d.array.get(i).tiredness).length() == 1) {
                System.out.println("    " + d.array.get(i).tiredness + "     ");
            }

















            //  System.out.print(" |  ");
         //   System.out.format("%4d",d.array.get(i).hunger);


           // System.out.println("|  " + d.array.get(i).thirst + "    |  " + d.array.get(i).boredom + "     |  " + d.array.get(i).tiredness); // prints out pet names

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

  /*  public void arraySize() {
        VirtualPetsContainer pet = VirtualPetsContainer.getInstance();
        Scanner input2 = new Scanner(System.in);
        if (pet.array.size() == 0) {

           VirtualPet newPet = new VirtualPet();

            System.out.println("Please enter your new pet's name:");
            newPet.name = input2.nextLine();
            System.out.println("Please describe your new pet:");
            newPet.description = input2.nextLine();
            System.out.println("Please enter your new pet's hunger");
            newPet.hunger = input2.nextInt();
            System.out.println("Please enter your new pet's thirst");
            newPet.thirst = input2.nextInt();
            System.out.println("Please enter your new pet's boredom");
            newPet.boredom = input2.nextByte();
            System.out.println("Please enter your new pet's tiredness");
            newPet.tiredness = input2.nextInt();


            pet.array.add(newPet);

        }
    }*/


    public boolean petStatus() {
        VirtualPetsContainer pets = VirtualPetsContainer.getInstance();
        if (hunger < 0) {
            System.out.println("***" + name + " died from hunger!***"); //lets you know which pet died from a particular attribute hitting < 0
            pets.arrayDead.add(name);

            return false;


        } else if (hunger < 40) {
            System.out.println("***" + name + " is dying from hunger!***"); // warns that a pet is getting closed to dying
        }

        if (thirst < 0) {
            System.out.println("***" + name + " died from  thirst!***");
            return false;

        } else if (thirst < 40) {
            System.out.println("***" + name + " is dying from thirst!***"); // warns that a pet is getting closed to dying
        }
        if (tiredness < 0) {
            System.out.println("***" + name + " died from tiredness!***");
            return false;

        } else if (tiredness < 40) {
            System.out.println("***" + name + " is dying from tiredness!***"); // warns that a pet is getting closed to dying
        }

        if (boredom < 0) {
            System.out.println("***" + name + " died from boredom!***");
            return false;

        } else if (boredom < 40) {
            System.out.println("***" + name + " is dying from boredom!***"); // warns that a pet is getting closed to dying
        }
        return true;

    }
}
 


