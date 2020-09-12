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

        //    VirtualPet newPet = new VirtualPet();

         //   newPet.name = input.nextLine();

        //   newPet.description = input.nextLine();
          //  d.array.add(newPet); // creates a new object of the class Pet and pushes it into the singleton
            System.out.println("Please enter pet name!");
         String name = input.nextLine();
            System.out.println("Please enter your pet's description!");
         String description = input.nextLine();
         int startingLevels = 100;

         VirtualPet pet = new VirtualPet(name,description, startingLevels, startingLevels, startingLevels, startingLevels);
         d.array.add(pet);

        }

    }

    public void playGame(Scanner input2) {
        VirtualPetsContainer d = VirtualPetsContainer.getInstance();


        while (d.running) {
            try {
                //  VirtualPet sizeCheck = new VirtualPet();
                //sizeCheck.arraySize();
                if (d.array.size() == 0) {
                    System.out.println("The Shelter is empty!");
                    System.out.println("Please enter a new pet name");
                    String name = input2.nextLine();
                    System.out.println("Please enter your pets description");
                    String description = input2.next();

                    input2.nextLine();
                    System.out.println("Please enter your pets hunger");
                    int hunger = input2.nextInt();
                    System.out.println("Please enter your pets thirst");
                    int thirst = input2.nextInt();
                    System.out.println("Please enter your pets boredom");
                    int boredom = input2.nextInt();
                    System.out.println("Please enter your pets tiredness");
                    int tiredness = input2.nextInt();

                    VirtualPet pets = new VirtualPet(name, description, hunger, thirst, boredom, tiredness);
                    d.array.add(pets);


                }
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
                    if (answer == 1) { // compares user input to selectable options
                        if (d.array.size() == 0) {

                            break;
                        }

                        for (int i = 0; i < d.array.size(); i++) {
                            d.array.get(i).feed();
                        }


                    } else if (answer == 2) {

                            if (d.array.size() == 0) {
                                System.out.println("The Shelter is empty!");
                                System.out.println("Please enter a new pet name");
                                String name = input2.nextLine();
                                System.out.println("Please enter your pets description");
                                String description = input2.next();

                                input2.nextLine();
                                System.out.println("Please enter your pets hunger");
                                int hunger = input2.nextInt();
                                System.out.println("Please enter your pets thirst");
                                int thirst = input2.nextInt();
                                System.out.println("Please enter your pets boredom");
                                int boredom = input2.nextInt();
                                System.out.println("Please enter your pets tiredness");
                                int tiredness = input2.nextInt();

                                VirtualPet pets = new VirtualPet(name, description, hunger, thirst, boredom, tiredness);
                                d.array.add(pets);
                                break;
                            }
                            for (int i = 0; i < d.array.size(); i++) {
                                d.array.get(i).drink();
                            }
                        } else if (answer == 3) {
                            if (d.array.size() == 0) {
                                System.out.println("The Shelter is empty!");
                                System.out.println("Please enter a new pet name");
                                String name = input2.nextLine();
                                System.out.println("Please enter your pets description");
                                String description = input2.next();

                                input2.nextLine();
                                System.out.println("Please enter your pets hunger");
                                int hunger = input2.nextInt();
                                System.out.println("Please enter your pets thirst");
                                int thirst = input2.nextInt();
                                System.out.println("Please enter your pets boredom");
                                int boredom = input2.nextInt();
                                System.out.println("Please enter your pets tiredness");
                                int tiredness = input2.nextInt();

                                VirtualPet pets = new VirtualPet(name, description, hunger, thirst, boredom, tiredness);
                                d.array.add(pets);
                                break;
                            }
                            System.out.println("Who do you want to play with?");

                            int newAnswer = input2.nextInt() - 1;

                            if (newAnswer <= (d.array.size() - 1)) {
                                d.array.get(newAnswer).play();
                            } else {
                                System.out.println("Incorrect selection");
                                System.out.println("");
                            }
                        } else if (answer == 4) {
                            if (d.array.size() == 0) {
                                System.out.println("The Shelter is empty!");
                                System.out.println("Please enter a new pet name");
                                String name = input2.nextLine();
                                System.out.println("Please enter your pets description");
                                String description = input2.next();

                                input2.nextLine();
                                System.out.println("Please enter your pets hunger");
                                int hunger = input2.nextInt();
                                System.out.println("Please enter your pets thirst");
                                int thirst = input2.nextInt();
                                System.out.println("Please enter your pets boredom");
                                int boredom = input2.nextInt();
                                System.out.println("Please enter your pets tiredness");
                                int tiredness = input2.nextInt();

                                VirtualPet pets = new VirtualPet(name, description, hunger, thirst, boredom, tiredness);
                                d.array.add(pets);
                                break;
                            }
                            for (int i = 0; i < d.array.size(); i++) {
                                d.array.get(i).sleep();
                            }

                        } else if (answer == 6) {
                            break; // breaks out of while loop and goes back to the pet selection screen
                        } else if (answer == 9) {
                            System.out.println("Thank you for playing!");
                            input2.close();
                            Runtime.getRuntime().exit(0);
                        } else if (answer == 7) {
                            System.out.println("Please enter the corresponding number for the pet you want to adopt:");
                            for (int i = 0; i < d.array.size(); i++) {

                                System.out.println((i + 1) + ": " + d.array.get(i).name + " - " + d.array.get(i).description);

                            }
                            int test = input2.nextInt() - 1;
                            d.array.remove(test);
                            break;

                        } else if (answer == 8) {
                            input2.nextLine();

                            System.out.println("Please enter a new pet name");
                            String name = input2.nextLine();
                            System.out.println("Please enter your pets description");
                            String description = input2.next();

                            input2.nextLine();
                            System.out.println("Please enter your pets hunger");
                            int hunger = input2.nextInt();
                            System.out.println("Please enter your pets thirst");
                            int thirst = input2.nextInt();
                            System.out.println("Please enter your pets boredom");
                            int boredom = input2.nextInt();
                            System.out.println("Please enter your pets tiredness");
                            int tiredness = input2.nextInt();

                            VirtualPet pets = new VirtualPet(name, description, hunger, thirst, boredom, tiredness);
                            d.array.add(pets);

                        }
                    }


                }catch(InputMismatchException e){
                        System.out.println("Please input an integer!");
                        input2.nextLine();

                    }
                }
            }
        }

