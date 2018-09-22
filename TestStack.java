
/**
 * Driver Class
 * This Class creates a couple different stacks
 * Then the for loop takes the Array from Albums and puts each album into its respective stack based on the Artist Name
 * Input from the user is also included to access a certain stack
 */


import java.util.Scanner;
public class TestStack {
    public static void main(String[] args) {
        Albums myAlbums = new Albums();
        RushStack rush = new RushStack(5);
        IronMaidenStack iron = new IronMaidenStack(5);
        PinkFloydStack pink = new PinkFloydStack(5);
        StackInterface stack = new StackInterface(20);


        Scanner in = new Scanner(System.in);
        int userChoice;
        int i = 0;
        boolean putInStack = false;
        int userNumber;


        do{
            System.out.println("1. Pick up a CD & Put into Stack");
            System.out.println("2. Look at top of a Stack");
            System.out.println("3. Remove CD from Stack");
            System.out.println("4. Display Contents of Stack");
            System.out.println("0. Quit");

            userChoice = in.nextInt();
            switch(userChoice){
                case 1:
                    System.out.println("CD in hand: \n");
                    System.out.println(myAlbums.albumArray[i].toString());
                    putInStack = true;
                    if(putInStack){
                        i++;
                        if(myAlbums.albumArray[i].getArtistName().equalsIgnoreCase("Rush")){
                            rush.push(myAlbums.albumArray[i]);
                        } else if(myAlbums.albumArray[i].getArtistName().equalsIgnoreCase("Pink Floyd")){
                            pink.push(myAlbums.albumArray[i]);
                        } else if(myAlbums.albumArray[i].getArtistName().equalsIgnoreCase("Iron Maiden")){
                            iron.push(myAlbums.albumArray[i]);
                        } else {
                            stack.push(myAlbums.albumArray[i]);
                        }
                    } else {
                       break;
                    }

                    break;


                case 2:
                    System.out.println("Which stack would you like to look at?");
                    System.out.println("1. Rush Stack");
                    System.out.println("2. Iron Maiden Stack");
                    System.out.println("3. Pink Floyd Stack");
                    System.out.println("4. Everything Else Stack");

                    userNumber = in.nextInt();

                    if(userNumber == 1){
                        System.out.println(rush.peek());
                    } else if(userNumber == 2){
                        System.out.println(iron.peek());
                    } else if(userNumber == 3){
                        System.out.println(pink.peek());
                    } else if(userNumber == 4)
                        System.out.println(stack.peek());
                    break;


                case 3:
                    System.out.println("Which Stack would you like to remove from?");
                    System.out.println("1. Rush Stack");
                    System.out.println("2. Iron Maiden Stack");
                    System.out.println("3. Pink Floyd Stack");
                    System.out.println("4. Everything Else Stack");

                    userNumber = in.nextInt();

                    if(userNumber == 1){
                        Object o = rush.pop();
                        System.out.println(o);
                        stack.push(o);
                    } else if(userNumber == 2){
                        Object o = iron.pop();
                        System.out.println(o);
                        stack.push(o);
                    } else if(userNumber == 3){
                        Object o = pink.pop();
                        System.out.println(o);
                        stack.push(o);
                    } else if(userNumber == 4) {
                        Object o = stack.pop();
                        System.out.println(o);
                    }
                    break;

                case 4:
                    System.out.println("Which Stack would you like to fully see?");
                    System.out.println("1. Rush Stack");
                    System.out.println("2. Iron Maiden Stack");
                    System.out.println("3. Pink Floyd Stack");
                    System.out.println("4. Everything Else Stack");

                    userNumber = in.nextInt();

                    if(userNumber == 1){
                        rush.printStack();
                    } else if(userNumber == 2){
                        iron.printStack();
                    } else if(userNumber == 3){
                        pink.printStack();
                    } else if(userNumber == 4)
                        stack.printStack();
                    break;


                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Not a valid option");
                    break;
            }

        }while(userChoice != 0);



    }
}
