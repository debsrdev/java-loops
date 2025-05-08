public class StrawberryFields {

    //Escribe un programa que permita imprimir la canción Strawberry Fields Forever con un bucle.
    // Solo puedes tener 2 funciones, una que imprima los versos y otra que imprima el coro.
    //Busca información sobre bucles anidados.
    //Al final está la letra completa
    
    public static void main(String[] args) {
        System.out.println("Strawberry Fields Forever");
        for (int verse= 1; verse <=4; verse++) {
            playChorus();
            if (verse <= 3) {
                playVersus(verse);
            }
        }
    }

    /**
     * Function name: playVersus
     * 
     * @param number (int)
     * 
     * Inside the function:
     * 1. print versus according the position number
     */
    public static void playVersus(int number) {
        switch (number) {
            case 1:
                System.out.println("Living is easy with eyes closed");
                System.out.println("Misunderstanding all you see");
                System.out.println("It's getting hard to be someone, but it all works out");
                System.out.println("It doesn't matter much to me");
                break;
            case 2:
                System.out.println("No one I think is in my tree");
                System.out.println("I mean, it must be high or low");
                System.out.println("That is, you can't, you know, tune in, but it's alright");
                System.out.println("That is, I think it's not too bad");
                break;
            case 3:
                System.out.println("Always, no sometimes, think it's me");
                System.out.println("But you know, I know when it's a dream");
                System.out.println("I think I know, I mean a yes");
                System.out.println("But it's all wrong");
                System.out.println("That is, I think I disagree");
        }
    }

    /**
     * Function name: playChorus
     * 
     * Inside the function:
     * 1. print chorus 
     */
    public static void playChorus() {
        System.out.println();
        System.out.println("Let me take you down");
        System.out.println("'Cause I'm going to strawberry fields");
        System.out.println("Nothing is real");
        System.out.println("And nothing to get hung about");
        System.out.println("Strawberry fields forever");
        System.out.println();
    }

}


/* 
Strawberry Fields Forever

Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever

Living is easy with eyes closed
Misunderstanding all you see
It's getting hard to be someone, but it all works out
It doesn't matter much to me

Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever

No one I think is in my tree
I mean, it must be high or low
That is, you can't, you know, tune in, but it's alright
That is, I think it's not too bad

Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever

Always, no sometimes, think it's me
But you know, I know when it's a dream
I think I know, I mean a yes
But it's all wrong
That is, I think I disagree

Let me take you down
'Cause I'm going to strawberry fields
Nothing is real
And nothing to get hung about
Strawberry fields forever
*/