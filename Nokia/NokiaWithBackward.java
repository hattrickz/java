import java.util.Scanner;

public class NokiaWithBackward {
public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("""
press:
1 -> Phonebook
2 -> Messages
3 -> Chat
4 -> Call register
5 -> Tones
6 -> Setting
7 -> Call divert
8 -> Games
9 -> Calculate
10 -> Reminder
11 -> Clock
12 -> Profiles
13 -> Sim services
0 -> Exit
""");

            System.out.print("Enter your choice: ");
            String userInput = input.nextLine();

            if (userInput.equals("0")) {
                System.out.println("Goodbye!");
                break;
            }

              else if (userInput.equals("1")) {
                while (true) {
                    System.out.println("""
press:
1 -> Search
2 -> Service Nos.
3 -> Add name
4 -> Erase
5 -> Edit
6 -> Assign tone
7 -> Send b'card
8 -> Options
9 -> Speed dial
10 -> Voice tags
0 -> Back
""");

                    System.out.print("Enter your choice: ");
                    String phonebookOption = input.nextLine();

                    if (phonebookOption.equals("0")) break;

                    else if (phonebookOption.equals("8")) {
                        while (true) {
                            System.out.println("""
press:
1 -> Type of view
2 -> Memory status
0 -> Back
""");
                            System.out.print("Enter your choice: ");
                            String optionChoice = input.nextLine();
                            if (optionChoice.equals("0")) break;
                    }
                    }
               }
            }

            else if (userInput.equals("2")) {
                while (true) {
                    System.out.println("""
press:
1 -> Write messages
2 -> Inbox
3 -> Outbox
4 -> Picture messages
5 -> Templates
6 -> Smileys
7 -> Message settings
8 -> Info service
9 -> Voice mailbox number
10 -> Service command editor
0 -> Back
""");
                    System.out.print("Enter your choice: ");
                    String messageChoice = input.nextLine();

                    if (messageChoice.equals("0")) break;

                    else if (messageChoice.equals("7")) {
                        while (true) {
                            System.out.println("""
press:
1 -> Set 1
2 -> Common
0 -> Back
""");
                            System.out.print("Enter your choice: ");
                            String msgSettingChoice = input.nextLine();
                            if (msgSettingChoice.equals("0")) break;

                            else if (msgSettingChoice.equals("1")) {
                                while (true) {
                                    System.out.println("""
press:
1 -> Message centre number
2 -> Message sent as
3 -> Message validity
0 -> Back
""");
                                    System.out.print("Enter your choice: ");
                                    String innerChoice = input.nextLine();
                                    if (innerChoice.equals("0")) break;
                                }
                            }

                            else if (msgSettingChoice.equals("2")) {
                                while (true) {
                                    System.out.println("""
press:
1 -> Delivery reports
2 -> Reply via same centre
3 -> Character support
0 -> Back
""");
                                    System.out.print("Enter your choice: ");
                                    String innerChoice = input.nextLine();
                                    if (innerChoice.equals("0")) break;
                         }
                       }
                        }
                  }
                }
            }

              else if (userInput.equals("3")) {
                System.out.println("Chat");
            }

            else if (userInput.equals("4")) {
                while (true) {
                    System.out.println("""
press:
1 -> Missed calls
2 -> Received calls
3 -> Dialled numbers
4 -> Erase recent call lists
5 -> Show call duration
6 -> Show call cost
7 -> Call cost settings
8 -> Prepaid credit
0 -> Back
""");
                    System.out.print("Enter your choice: ");
                    String callChoice = input.nextLine();

                    if (callChoice.equals("0")) break;

                    else if (callChoice.equals("5")) {
                        while (true) {
                            System.out.println("""
press:
1 -> Last call duration
2 -> All calls' duration
3 -> Received calls' duration
4 -> Dialled calls' duration
5 -> Clear timer
0 -> Back
""");
                            if (input.nextLine().equals("0")) break;
                        }
                    }

                    else if (callChoice.equals("6")) {
                        while (true) {
                            System.out.println("""
press:
1 -> Last call cost
2 -> All calls' cost
3 -> Clear counters
0 -> Back
""");
                            if (input.nextLine().equals("0")) break;
                        }
                    }

                    else if (callChoice.equals("7")) {
                        while (true) {
                            System.out.println("""
press:
1 -> Call cost limit
2 -> Show costs in
0 -> Back
""");
                            if (input.nextLine().equals("0")) break;
                      }
                  }
                }
            }

         
            else if (userInput.equals("5")) {
                while (true) {
                    System.out.println("""
press:
1 -> Ringing tone
2 -> Ringing volume
3 -> Incoming call alert
4 -> Composer
5 -> Message alert tone
6 -> Keypad tones
7 -> Warning and games tones
8 -> Vibrating alert
9 -> Screen saver
0 -> Back
""");
                    if (input.nextLine().equals("0")) break;
                }
            }

           
            else if (userInput.equals("6")) {
                while (true) {
                    System.out.println("""
press:
1 -> Call settings
2 -> Phone settings
3 -> Security settings
4 -> Restore factory settings
0 -> Back
""");
                    String settingChoice = input.nextLine();

                    if (settingChoice.equals("0")) break;

                    else if (settingChoice.equals("1")) {
                        while (true) {
                            System.out.println("""
press:
1 -> Automatic redial
2 -> Speed dialling
3 -> Call waiting options
4 -> Own number sending
5 -> Phone line in use
6 -> Automatic answer
0 -> Back
""");
                            if (input.nextLine().equals("0")) break;
                        }
                    }

                    else if (settingChoice.equals("2")) {
                        while (true) {
                            System.out.println("""
press:
1 -> Language
2 -> Cell info display
3 -> Welcome note
4 -> Network selection
5 -> Lights
6 -> Confirm SIM service actions
0 -> Back
""");
                            if (input.nextLine().equals("0")) break;
                        }
                    }

                    else if (settingChoice.equals("3")) {
                        while (true) {
                            System.out.println("""
press:
1 -> PIN code request
2 -> Call barring service
3 -> Fixed dialling
4 -> Closed user group
5 -> Phone security
6 -> Change access codes
0 -> Back
""");
                            if (input.nextLine().equals("0")) break;
                     }
                    }
                }
            }

       
            else if (userInput.equals("7")) System.out.println("Call divert");
            else if (userInput.equals("8")) System.out.println("Games");
            else if (userInput.equals("9")) System.out.println("Calculator");
            else if (userInput.equals("10")) System.out.println("Reminders");

            else if (userInput.equals("11")) {
                while (true) {
                    System.out.println("""
press:
1 -> Alarm clock
2 -> Clock settings
3 -> Date setting
4 -> Stopwatch
5 -> Countdown timer
6 -> Auto update of date and time
0 -> Back
""");
                    if (input.nextLine().equals("0")) break;
                }
            }

            else if (userInput.equals("12")) System.out.println("Profiles");
            else if (userInput.equals("13")) System.out.println("Sim services");
            else System.out.println("Invalid input! Please try again.");
        }


}
}