import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Define Arrays

        Membership[] memberships = new Membership[10];
        skill[] skills = new skill[10];
        staff[] staff = new staff[10];
        volunteer[] volunteers = new volunteer[10];
        localCommunity[] localCommunities = new localCommunity[10];
        chat[] chat = new chat[100];

        // Assign Some Values

        User user1 = new User(1, "Yousuf", "email1", "pass1", "923077777777");
        User user2 = new User(2, "Rasheed", "email2@example.com", "109007860", "92123456789");
        
        memberships[0] = new Membership(user1);
        memberships[1] = new Membership(user2);

        staff[0] = new staff(1, "Staff", "staff@example.com", "123123213", "66778765");
        staff[1] = new staff(2, "Staff2", "staff2@example.com", "0900", "123456789");

        skills[0] = new skill("Java", "Java is a programming language", "2021-01-01", "12:00");
        skills[1] = new skill("Python", "Python is a programming language", "2021-01-01", "12:00");

        volunteers[0] = new volunteer(1, "Volunteer1", "email", "passowrd", "0900", skills, "Volunteer");
        volunteers[1] = new volunteer(2, "Volunteer2", "email", "passowrd", "0900", skills, "Volunteer");

        localCommunities[0] = new localCommunity("Local Community", "This is a local community", "2021-01-01", "12:00", "Lahore");
        localCommunities[1] = new localCommunity("Local Community 2", "This is a local community 2", "2021-01-01", "12:00", "Lahore");

        int decision = 1;
        int arr_counter = 3;

        // Main Menu Loop
        do {

            System.out.println("1. Login");
            System.out.println("2. Register a User");
            System.out.println("3. Search User by ID");
            System.out.println("4. Create a local community");
            System.out.println("5. Register as Volunteer");
            System.out.println("6. List Volunteers");
            System.out.println("7. Start a Chat");
            System.out.println("8. List all Chats");
            System.out.println("9. Exit");

            java.util.Scanner menuScanner = new java.util.Scanner(System.in);
            int menu_selection = menuScanner.nextInt();

            if ( menu_selection == 1 ) {
                System.out.println("---------------");
                System.out.println("USER LOGIN");
                System.out.println("---------------");

                java.util.Scanner userInput = new java.util.Scanner(System.in);

                System.out.printf("Enter Email Address: ");
                String email = userInput.nextLine();

                System.out.printf("Enter Password: ");
                String pass = userInput.nextLine();

                // loop through all users, match email and password
                for (int i = 0; i < memberships.length; i++) {
                    if (memberships[i] != null) {
                        if (memberships[i].user.email.equals(email) && memberships[i].user.password.equals(pass)) {
                            System.out.println("\nLogin Successful!!!!");
                            System.out.println("---------------");
                            System.out.println("Welcome " + memberships[i].user.name);
                        }
                    }
                }
            }
            else if( menu_selection == 2 ) {
                System.out.println("--------------------");
                System.out.println("USER REGISTRATION");
                System.out.println("--------------------");

                java.util.Scanner userInput = new java.util.Scanner(System.in);
                System.out.printf("Enter User Name: ");
                String name = userInput.nextLine();

                System.out.printf("Enter User Email: ");
                String email = userInput.nextLine();

                System.out.printf("Enter User Phone: ");
                String mobile = userInput.nextLine();
                
                System.out.printf("Enter User Password: ");
                String password = userInput.nextLine();
                
                User tempUser = new User(arr_counter, name, email, password, mobile);
                memberships[arr_counter] = new Membership(tempUser);
                
                memberships[arr_counter].user.register();

                arr_counter++;
            }
            else if ( menu_selection == 3 ) {
                System.out.println("--------------------");
                System.out.println("SEARCH USERS BY ID");
                System.out.println("--------------------");

                System.out.println("Enter User ID");
                java.util.Scanner userInput = new java.util.Scanner(System.in);
                int user_id_search = userInput.nextInt();

                for (int i = 0; i < memberships.length; i++) {
                    if (memberships[i] != null) {
                        if (user_id_search == memberships[i].user.id) {
                            System.out.println("User Name: " + memberships[i].user.name);
                            System.out.println("User Email: " + memberships[i].user.email);
                            System.out.println("User Phone: " + memberships[i].user.mobile);
                            System.out.println("User Phone: " + memberships[i].user.password);
                        }
                    }
                }

            }
            else if ( menu_selection == 4 ) {
                System.out.println("--------------------");
                System.out.println("CREATE A LOCAL COMMUNITY");
                System.out.println("--------------------");

                java.util.Scanner userInput = new java.util.Scanner(System.in);
                
                System.out.printf("Enter Name: ");
                String name = userInput.nextLine();

                System.out.printf("Enter Description");
                String desc = userInput.nextLine();

                System.out.printf("Enter Date");
                String date = userInput.nextLine();

                System.out.printf("Enter Time");
                String time = userInput.nextLine();

                System.out.printf("Enter Location");
                String location = userInput.nextLine();

                localCommunities[arr_counter] = new localCommunity(name, desc, date, time, location);

                System.out.println("Local Community Registered Successfully");
            }
            else if ( menu_selection == 5 ) {
                System.out.println("--------------------");
                System.out.println("VOLUNTEER REGISTRATION");
                System.out.println("--------------------");

                java.util.Scanner userInput = new java.util.Scanner(System.in);
                java.util.Scanner skillLoop = new java.util.Scanner(System.in);
                int loop_decision = 1;
                int skillCounter = 0;
                skill[] volSkills = new skill[10];

                System.out.printf("Enter Volunteer Name: ");
                String volName = userInput.nextLine();

                System.out.printf("Enter Volunteer Email: ");
                String volEmail = userInput.nextLine();

                System.out.printf("Enter Volunteer Mobile: ");
                String volMobile = userInput.nextLine();

                System.out.printf("Enter Volunteer Passsword: ");
                String volPassword = userInput.nextLine();

                System.out.printf("Enter Volunteer Skills: \n");

                do {
                    System.out.printf("Enter Skill Name: ");
                    String skillName = userInput.nextLine();

                    System.out.printf("Enter Skill Note: ");
                    String skillNote = userInput.nextLine();

                    System.out.printf("Enter Skill Date: ");
                    String skillDate = userInput.nextLine();

                    System.out.printf("Enter Skill Time: ");
                    String skillTime = userInput.nextLine();

                    System.out.println("Press 1 to enter more || Press 0 to exit");
                    loop_decision = skillLoop.nextInt();

                    volSkills[skillCounter] = new skill(skillName, skillNote, skillDate, skillTime);
                    skillCounter++;
                } while( loop_decision != 0 && skillCounter < 10 );

                volunteers[arr_counter] = new volunteer(skillCounter, volName, volEmail, volPassword, volMobile, volSkills, volEmail);
            }
            else if ( menu_selection == 6 ) {
                System.out.println("----------");
                System.out.println("VOLUNTEER LIST");
                System.out.println("----------");

                for (int i = 0; i < volunteers.length; i++) {
                    if (volunteers[i] != null) {
                        System.out.println("--------------------");
                        System.out.println("Volunteer Details: ");
                        System.out.println("--------------------");

                        System.out.println("Volunteer Name: " + volunteers[i].name);
                        System.out.println("Volunteer Email: " + volunteers[i].email);
                        System.out.println("Volunteer Phone: " + volunteers[i].mobile);
                        System.out.println("Volunteer Password: " + volunteers[i].password);
                        
                        System.out.println("--------------------");
                        System.out.println("Volunteer Skills: ");
                        System.out.println("--------------------");
                        for (int j = 0; j < volunteers[i].skills.length; j++) {
                            if (volunteers[i].skills[j] != null) {
                                System.out.println("----- Skill " + (j+1) + " -----");
                                System.out.println("Skill Name: " + volunteers[i].skills[j].name);
                                System.out.println("Skill Note: " + volunteers[i].skills[j].note);
                                System.out.println("Skill Date: " + volunteers[i].skills[j].date);
                                System.out.println("Skill Time: " + volunteers[i].skills[j].time);
                            }
                        }
                    }
                }
            }
            else if ( menu_selection == 7 ) {
                System.out.println("----------");
                System.out.println("CHAT STARTED");
                System.out.println("----------");

                int staff_index = 0;
                int vol_index = 0;
                int chat_index = 0;
                int loop_decision = 1;

                System.out.printf("Enter Staff ID to Chat With: ");
                java.util.Scanner userInput = new java.util.Scanner(System.in);
                int staff_id_search = userInput.nextInt();

                // Search for staff
                for (int i = 0; i < staff.length; i++) {
                    if (staff[i] != null) {
                        if (staff_id_search == staff[i].id) {
                            System.out.println("Staff Name: " + staff[i].name);
                            staff_index = i;
                        }
                    }
                }

                System.out.printf("Enter Your Volunteer ID: ");
                int vol_id_search = userInput.nextInt();

                // Search for volunteer
                for (int i = 0; i < volunteers.length; i++) {
                    if (volunteers[i] != null) {
                        if (vol_id_search == volunteers[i].id) {
                            System.out.println("Volunteer Name: " + volunteers[i].name);
                            vol_index = i;
                        }
                    }
                }

                System.out.println("Start Entering Messages");
                do {
                    System.out.printf("Enter Message: ");
                    java.util.Scanner msgScanner = new java.util.Scanner(System.in);
                    String message = msgScanner.nextLine();

                    chat[chat_index] = new chat(message, volunteers[vol_index], staff[staff_index]);
              
                    chat_index++;

                    System.out.printf("Press 1 to send more || Press 0 to exit: ");
                    loop_decision = userInput.nextInt();

                } while (loop_decision != 0);
            }
            else if ( menu_selection == 8 ) {
                System.out.println("----------");
                System.out.println("CHAT LIST");
                System.out.println("----------");
                if ( chat[0] == null ) {
                    System.out.println("No Chat Found!");
                }
                else {
                    for ( int i = 0; i < chat.length; i++ ) {
                        if ( chat[i] != null ) {
                            System.out.printf("-----\nMessage: %s Volunteer: %s Staff: %s\n-----\n", chat[i].message, chat[i].volunteer.name, chat[i].staff.name);
                        }
                    }
                }
            }
            else if ( menu_selection == 9 ) {
                System.out.println("Exiting...");
                System.exit(0);
            }
            
            // Ask user again for decision
            System.out.print("---------------\n1 TO GO BACK TO MENU, 0 TO EXIT: ");
            decision = menuScanner.nextInt();
            System.out.print("---------------\n");

        } while (decision == 1);

    }
}