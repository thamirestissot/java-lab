package com.github.thamirestissot;

import com.github.thamirestissot.shapes.Shape;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Hello world!");
        System.out.println(getWelcomeMessage());
        scanner.nextLine();
        System.out.println(getMenu().toString());
        System.out.println(getMenuEnding().toString());
        input = scanner.nextLine();
        Shape circleShape = new ShapeFactory().getShape(

                "circle");
        circleShape.draw();

    }

    private static String getMenuEnding() {
        StringBuffer menuMessage = new StringBuffer(
                "╰━━━━━━━━━━━╯\n\n");
        return menuMessage.toString();
    }

    private static String getMenu() {
        StringBuffer menuMessage = new StringBuffer(
                "╭━━━━━━━━━━━━━━━━━━━━━━╮\n" +
                "┃                      ┃\n" +
                "┃     input shape:     ┃\n" +
                "┃                      ┃\n" +
                "┃     0 -> circle      ┃\n" +
                "┃                      ┃\n" +
                "┃     1 -> circle      ┃\n" +
                "┃                      ┃\n" +
                "┃     2 -> circle      ┃\n" +
                "┃                      ┃\n" +
                "╰━━━━━━━━━━━━━━━━━━━━━━╯\n\n" +
                "╭━━━━━━━━━━━╮\n" +
                "┃     ");
        return menuMessage.toString();
    }
    private static String getSecondMenu() {
        StringBuffer menuMessage = new StringBuffer(
                "╭━━━━━━━━━━━━━━━━━━━━━━╮\n" +
                "┃                      ┃\n" +
                "┃    type E to exit    ┃\n" +
                "┃                      ┃\n" +
                "╰━━━━━━━━━━━━━━━━━━━━━━╯\n\n" +

                "╭━━━━━━━━━━━━━━━━━━━━━━╮\n" +
                "┃                      ┃\n" +
                "┃     input shape:     ┃\n" +
                "┃                      ┃\n" +
                "┃     0 -> circle      ┃\n" +
                "┃                      ┃\n" +
                "┃     1 -> circle      ┃\n" +
                "┃                      ┃\n" +
                "┃     2 -> circle      ┃\n" +
                "┃                      ┃\n" +
                "╰━━━━━━━━━━━━━━━━━━━━━━╯\n\n" +
                "╭━━━━━━━━━━━╮\n" +
                "┃     ");
        return menuMessage.toString();
    }

    private static String getWelcomeMessage() {
        StringBuffer welcomeMessage = new StringBuffer("\n" +
                "           ____,'`-, \n" +
                "      _,--'   ,/::.; \n" +
                "   ,-'       ,/::,' `---.___        ___,_ \n" +
                "   |       ,:';:/        ;'\"`;\"`--./ ,-^.;--. \n" +
                "   |:     ,:';,'         '         `.   ;`   `-. \n" +
                "    \\:.,:::/;/ -:.                   `  | `     `-. \n" +
                "     \\:::,'//__.;  ,;  ,  ,  :.`-.   :. |  ;       :. \n" +
                "      \\,',';/O)^. :'  ;  :   '__` `  :::`.       .:' ) \n" +
                "      |,'  |\\__,: ;      ;  '/O)`.   :::`;       ' ,'              ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▒▒▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "           |`--''            \\__,' , ::::(       ,'                 ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "           `    ,            `--' ,: :::,'\\   ,-'                   ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "            | ,;         ,    ,::'  ,:::   |,'                        ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓                      ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "            |,:        .(          ,:::|   `                          ▓▓▓▓▓▓▓▓▓▓▓▓▓▓        ██████████    ░░  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "            ::'_   _   ::         ,::/:|                               ▓▓▓▓▓▓▓▓▓▓▓▓  ░░░░░░██████████████░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "           ,',' `-' \\   `.      ,:::/,:|                              ▓▓▓▓▓▓▓▓▒▒            ██████████████        ▓▓▓▓▓▓▓▓▓▓\n" +
                "          | : _  _   |   '     ,::,' :::                              ▓▓▓▓▓▓▓▓▒▒            ██████████████        ▓▓▓▓▓▓▓▓▓▓\n" +
                "          | \\ O`'O  ,',   ,    :,'   ;::                             ▓▓▓▓▓▓▓▓  ░░      ██    ████████████          ▓▓▓▓▓▓▓▓\n" +
                "           \\ `-'`--',:' ,' , ,,'      ::                            ▓▓▓▓▓▓    ░░░░    ████        ██████░░          ▓▓▓▓▓▓\n" +
                "            ``:.:.__   ',-','        ::'                             ▓▓▓▓▓▓░░░░░░░░░░░░████████        ██░░░░░░░░░░░░▓▓▓▓▓▓\n" +
                "    -hrr-      `--.__, ,::.         ::'                             ▓▓▓▓▓▓▓▓          ██████████████              ▓▓▓▓▓▓▓▓\n" +
                "                   |:  ::::.       ::'                              ▓▓▓▓▓▓▓▓▓▓          ██████████████          ▓▓▓▓▓▓▓▓▓▓\n" +
                "                   |:  ::::::    ,::'                              ▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░    ██████████░░░░░░░░  ▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "                                                                   ▓▓▓▓▓▓▓▓▓▓▓▓▓▓░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "                                                                  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓                  ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "╭━━╮╱╱╱╱╱╱╱╱╱╱╭╮╱╱╱╱╱╱╱╱╱╱╱╭╮╱╱╱╱╱╭╮                              ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓      ░░░░▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "┃╭╮┃╱╱╱╱╱╱╱╱╱╱┃┃╱╱╱╱╱╱╱╱╱╱╱┃┃╱╱╱╱╭╯╰╮                            ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓      ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "┃╰╯╰┳━┳━━┳━━━┳┫┃╱╭━━┳━┳━━┳━╯┣╮╭┳━┻╮╭╋┳━━┳━╮                      ▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓▓\n" +
                "┃╭━╮┃╭┫╭╮┣━━┃┣┫┃╱┃╭╮┃╭┫╭╮┃╭╮┃┃┃┃╭━┫┃┣┫╭╮┃╭╮╮\n" +
                "┃╰━╯┃┃┃╭╮┃┃━━┫┃╰╮┃╰╯┃┃┃╰╯┃╰╯┃╰╯┃╰━┫╰┫┃╰╯┃┃┃┃\n" +
                "╰━━━┻╯╰╯╰┻━━━┻┻━╯┃╭━┻╯╰━━┻━━┻━━┻━━┻━┻┻━━┻╯╰╯\n" +
                "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱┃┃\n" +
                "╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╱╰╯\n");
        // fonte: https://fsymbols.com/generators/carty/
        // cusco: https://ascii.co.uk/art/dog
        // bandeira : https://textart.sh/topic/brazil
        return welcomeMessage.toString();
    }
}