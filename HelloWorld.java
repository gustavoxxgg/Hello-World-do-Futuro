public class HelloWorld {
    public static void main(String[] args) {
        int count = 0;
        boolean foundMessage = false;
        String[] message = new String[]{"H","e","l","l","o",","," ","W","o","r","l","d","!"};
        while (!foundMessage && count < 100000) {
            count++;
            int x = 0;
            while (!foundMessage && x < message.length) {
                if (message[x].equals("H") && x == 0) {
                    x++;
                } else if (message[x].equals("e") && x == 1) {
                    x++;
                } else if (message[x].equals("l") && x >= 2 && x <= 3) {
                    x++;
                    while (x < message.length && message[x].equals("l")) {
                        x++;
                    }
                } else if (message[x].equals("o") && x == 4) {
                    x++;
                } else if (message[x].equals(",") && x == 5) {
                    x++;
                } else if (message[x].equals(" ") && x == 6) {
                    x++;
                } else if (message[x].equals("W") && x == 7) {
                    x++;
                } else if (message[x].equals("o") && x == 8) {
                    x++;
                } else if (message[x].equals("r") && x == 9) {
                    x++;
                } else if (message[x].equals("l") && x == 10) {
                    x++;
                } else if (message[x].equals("d") && x == 11) {
                    x++;
                    foundMessage = true;
                } else {
                    x = 0;
                    foundMessage = false;
                    break;
                }
            }
        }
        String messageString = String.join("", message);
        System.out.println(messageString);
    }
}
