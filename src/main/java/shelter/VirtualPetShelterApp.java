package shelter;

import java.util.InputMismatchException;
import java.util.Scanner;

class VirtualPetShelterApp {

    public void start() { //creates pets and starts incrementing time/input
        Scanner input = new Scanner(System.in);
        createPets(input);

        startIncrementingTime();

        playGame(input);


    }

    public void startIncrementingTime() {
        TimeIncrementer thread = new TimeIncrementer();
        thread.start(); // starts the thread that increments the pets attributes
    }

    public void createPets(Scanner input) {


        System.out.println("How many pets do you have?");

        int pets = input.nextInt();

        input.nextLine(); // clears input buffer

        VirtualPetsContainer d = VirtualPetsContainer.getInstance();

        for (int i = 0; i < pets; i++) {

            VirtualPet newPet = new VirtualPet();
            System.out.println("Please enter pet name!");
            newPet.name = input.nextLine();
            d.array.add(newPet); // creates a new object of the class Pet and pushes it into the singleton

        }

    }

    public void playGame(Scanner input2) {
        VirtualPetsContainer d = VirtualPetsContainer.getInstance();


        while (d.running) {
            try {
                System.out.println("This is the status of your pets:");
                System.out.println("");
             /*   System.out.println("Name     | Hunger | Thirst | Boredom");

                for (int i = 0; i < d.array.size(); i++) {

                    System.out.println((i + 1) + ": " + d.array.get(i).name + "|" + d.array.get(i).hunger + "|" + d.array.get(i).thirst + "|" + d.array.get(i).boredom); // prints out pet names

                }*/


                System.out.println("");

                while (true) {
                    // String name = d.array.get(selection).name;
                    System.out.println("Please make a selection:");


                    d.array.get(0).printAttributes();


                    int answer = input2.nextInt();
                /*if (d.arrayDead.contains(name)){

                    System.out.println("This pet is no longer in the shelter, please select another pet");
                    System.out.println("");
                    break;

                }*/
                    if (25 < 24) {

                    } else if (answer == 1) { // compares user input to selectable options

                        for (int i = 0; i < d.array.size(); i++) {
                            d.array.get(i).feed();
                        }


                    } else if (answer == 2) {

                        for (int i = 0; i < d.array.size(); i++) {
                            d.array.get(i).drink();
                        }
                    } else if (answer == 3) {

                        System.out.println("Who do you want to play with?");
                        int newAnswer = input2.nextInt() - 1;
                        d.array.get(newAnswer).play();
                    } else if (answer == 4) {
                        for (int i = 0; i < d.array.size(); i++) {
                            d.array.get(i).sleep();
                        }

                    } else if (answer == 6) {
                        break; // breaks out of while loop and goes back to the pet selection screen
                    } else if (answer == 9) {
                        System.out.println("Thank you for playing!");
                        input2.close();
                        d.running = false;
                    } else if (answer == 7) {
                        System.out.println("Please enter the corresponding number for the pet you want to adopt:");
                        int test = input2.nextInt() - 1;
                        d.array.remove(test);
                        break;

                    } else if (answer == 8) {
                        input2.nextLine();
                        VirtualPet newPet = new VirtualPet();
                        System.out.println("Please enter your new pet's name:");
                        newPet.name = input2.nextLine();
                        System.out.println("Please enter your new pet's hunger");

                        newPet.hunger = input2.nextInt();
                        System.out.println("Please enter your new pet's thirst");
                        newPet.thirst = input2.nextInt();
                        System.out.println("Please enter your new pet's boredom");
                        newPet.boredom = input2.nextByte();
                        System.out.println("Please enter your new pet's tiredness");
                        newPet.tiredness = input2.nextInt();


                        d.array.add(newPet);

                    }
                }


            } catch (InputMismatchException e) {
                System.out.println("Please input an integer!");
                input2.nextLine();

            }
        }
    }
}
