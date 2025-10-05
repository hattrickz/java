import java.util.Scanner;
public class Nokia3310 {
    public static void main (String [] args){
        String menu = """
        press:
        1-> Phonebook
        2-> Messages
        3-> Chat
        4-> Call register
        5-> Tones
        6-> Setting 
        7-> Call divert
        8-> Games
        9-> Calculate
        10-> Reminder 
        11-> Clock
        12-> Profiles
        13-> Sim services 	
        
        """;
        System.out.print(menu);
        Scanner input = new Scanner (System.in);
        int userInput = input.nextInt();

        switch (userInput) {
            case 1 -> {
                String phoneBook = """ 
                    press:
                    1-> Search
                    2-> Service Nos.
                    3-> Add name
                    4-> Erase
                    5-> Edit
                    6-> Assign tone
                    7-> Send b'card
                    8-> Options
                    9-> Speed dial
                    10-> Voice tags
                """;			
                System.out.print(phoneBook);

                String options = """ 
                    press:
                    1-> Type of view
                    2-> Memory status
                """;

                int userOption = input.nextInt();

                if(userOption == 8) {
                    System.out.print(options);
                }
            } 

            case 2 -> {
                String messagesMenu = """ 
                    press:
                    1-> Write messages 
                    2-> Inbox
                    3-> Outbox
                    4-> Picture messages
                    5-> Templates
                    6-> Smileys
                    7-> Message settings
		    8-> Info service
		    9-> Voice mailbox number
		    10-> Serive command editor

                 """;	
                System.out.print(messagesMenu);

                int messageChoice = input.nextInt();  

                String messageSettingsMenu = """ 
                    press:
                    1-> Set 1
                    2-> Common
                """;

                if(messageChoice == 7) {
                    System.out.print(messageSettingsMenu);
                    int messageSettingsChoice = input.nextInt();                      		    
		   String set1Options = """ 
                        press:
                        1-> Message centre number 
                        2-> Message sent as
                        3-> Message validity
                    """;

                    String commonOptions = """ 
                        press:
                        1-> Delivery reports 
                        2-> Reply via same centre
                        3-> Character support
                    """;

                    if(messageSettingsChoice == 1) {
                        System.out.print(set1Options);			
                    } else if(messageSettingsChoice == 2) {
                        System.out.print(commonOptions);
                    }
                }
            } 


	case 3-> {
		System.out.print("Chat");
	} 

	case 4->{
	 String callRegisterMenu = """ 
                    press:
                    1-> Missed calls
                    2-> Received calls
                    3-> Dialled number
                    4-> Erase recent call lists
                    5-> Show call duration
                    6-> Show call cost 
                    7-> Call cost setting 
		    8-> Prepaid credit   
                """;	
                System.out.print(callRegisterMenu);

                int callRegisterChoice = input.nextInt();
		
		String showCallDurationMenu = """ 
                    press:
                    1-> Last call duration
                    2-> All calls'duration
		    3-> Received calls'duration
                    4-> Dialled calls'duration
                    5-> Clear timer

                """;
		String showCallCostsMenu = """ 
                    press:
                    1-> Last call cost
                    2-> All calls'cost
                    3-> Clear counters

                """;
		String callCostSettingsMenu = """ 
                    press:
                    1-> Call cost limit
                    2-> Show costs in
                   
                """;

  

  
		if(callRegisterChoice == 5) {
                    System.out.print(showCallDurationMenu);
		}
		else if (callRegisterChoice == 6){
			System.out.print(showCallCostsMenu);
			}
		else if (callRegisterChoice == 7){
			System.out.print(callCostSettingsMenu);
			}

                    int ShowCallDurationChoice = input.nextInt();  

}
case 5-> {
		String tonesMenu = """ 
                    press:
                    1-> Ringing tone
                    2-> Ringing volume
                    3-> Incoming call alert 
                    4-> Composer
                    5-> Message alert tone
                    6-> Keypad tones
                    7-> Warning and games tones
		    8-> Vibrating alert
		    9-> Screen saver
		   
                 """;	
		System.out.print(tonesMenu);
		int tonesChoice = input.nextInt();


} 

case 6->{
String settingsMenu = """ 
                    press:
                    1-> Call settings
                    2-> Phone settings
                    3-> Security settings 
                    4-> Restore factory settings
                   		   
                 """;	
		System.out.print(settingsMenu);
		int settingsChoice = input.nextInt();
		
		String callSettingsMenu = """ 
                    press:
                    1-> Automatic redial
                    2-> Speed dialling
		    3-> Call waiting options
		    4-> Own number sending
                    5-> Phone line in use
                    6-> Automatic answer

                """;
		String phoneSettingsMenu = """ 
                    press:
                    1-> Language
                    2-> Cell info display
		    3-> Welcome note
		    4-> Network selection 
                    5-> Lights
                    6-> Confirm SIM service actions

                """;
		String securitySettingsMenu = """ 
                    press:
                    1-> PIN code request
                    2-> Call barring service
		    3-> Fixed dialling
		    4-> Closed user group 
                    5-> Phone security
                    6-> Change access codes

                """;


		
		if(settingsChoice == 1) {
                    System.out.print(callSettingsMenu);
		}
		else if (settingsChoice == 2){
			System.out.print(phoneSettingsMenu);
			}
		else if (settingsChoice == 3){
			System.out.print(securitySettingsMenu);
			}

                    int settingMenuChoice = input.nextInt();

} 

case 7->{
	System.out.print("Call divert");

}
 
case 8->{
	System.out.print("Games");
	
}

case 9->{
	System.out.print("Calculator");

} 

case 10->{
	System.out.print("Reminders");

} 

case 11-> {

	String clockMenu = """ 
                    press:
                    1-> Alarm clock
                    2-> Clock settings
		    3-> Date setting
		    4-> Stopwatch
                    5-> Countdown timer
                    6-> Auto update of date and time

                """;
		System.out.print(" clockMenu ");



}

case 12-> {
	System.out.print("Profiles");

}
case 13-> {
	System.out.print("Sim services");

} 
        }
    }
}