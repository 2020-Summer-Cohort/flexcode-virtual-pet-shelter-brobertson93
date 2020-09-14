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


                if (d.array.size() == 0) {
                    System.out.println("The Shelter is empty!");

                    System.out.println("Please enter a new pet name");
                    String name = input2.nextLine();
                    name  = input2.nextLine();

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



                System.out.println("");

                while (true) {
                    if (d.array.size() == 0) {
                        Scanner input = new Scanner(System.in);

                        System.out.println("The Shelter is empty!");
                        System.out.println("Please enter a new pet name");
                        String name = input.nextLine();
                        System.out.println("Please enter your pets description");
                        String description = input.next();

                        input.nextLine();
                        System.out.println("Please enter your pets hunger");
                        int hunger = input.nextInt();
                        System.out.println("Please enter your pets thirst");
                        int thirst = input.nextInt();
                        System.out.println("Please enter your pets boredom");
                        int boredom = input.nextInt();
                        System.out.println("Please enter your pets tiredness");
                        int tiredness = input.nextInt();

                        VirtualPet pets = new VirtualPet(name, description, hunger, thirst, boredom, tiredness);
                        d.array.add(pets);


                    }

                    System.out.println("Please make a selection:");


                    d.array.get(0).printAttributes();


                    int answer = input2.nextInt();

                    if (answer == 1) { // compares user input to selectable options
                        if (d.array.size() == 0) {

                            break;
                        }

                        for (int i = 0; i < d.array.size(); i++) {
                            d.array.get(i).feed();
                        }


                    } else if (answer == 2) {

                        if (d.array.size() == 0) {
                            Scanner input = new Scanner(System.in);

                            System.out.println("The Shelter is empty!");
                            System.out.println("Please enter a new pet name");
                            String name = input.nextLine();
                            System.out.println("Please enter your pets description");
                            String description = input.next();

                            input.nextLine();
                            System.out.println("Please enter your pets hunger");
                            int hunger = input.nextInt();
                            System.out.println("Please enter your pets thirst");
                            int thirst = input.nextInt();
                            System.out.println("Please enter your pets boredom");
                            int boredom = input.nextInt();
                            System.out.println("Please enter your pets tiredness");
                            int tiredness = input.nextInt();

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
                            System.out.println("Please enter the corresponding name for the pet you want to adopt:");
                            for (int i = 0; i < d.array.size(); i++) {

                                System.out.println((i + 1) + ": " + d.array.get(i).name + " - " + d.array.get(i).description);

                            }
                            input2.nextLine();
                            String petDelete = input2.nextLine();
                            if (d.array.size() == 1 && d.array.get(0).name == petDelete) {

                                d.array.remove(0);


                            }
                       else {
                                for (int i = 0; i < d.array.size(); i++) {

                                    if (petDelete.equals(d.array.get(i).name)) {
                                        d.array.remove(i);

                                        break;
                                    }
                                }
                            }
                        } else if (answer == 8) {


                            System.out.println("Please enter a new pet name");
                            String name;
                        name = input2.nextLine();
                        name = input2.nextLine();
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

