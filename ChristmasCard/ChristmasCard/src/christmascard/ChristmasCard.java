package christmascard;

/**
 *
 * @author David Bálik
 */

import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ChristmasCard {

    //public static Scanner sc = new Scanner(System.in, "Cp1250");
    public static Scanner sc = new Scanner(System.in);
    //public static Locale loc = new Locale("cs-CZ");
    
    public static void main(String[] args) throws InterruptedException {
        String name;
        boolean isMan = true;
        System.out.println("Dobrý den, jaké je Vaše křestní jméno? Prosím, zadejte i s diakritikou.");
        name = sc.nextLine();
        
        String osloveni;
        if(name.equalsIgnoreCase("Lukáš")){
            osloveni = "Lukáši";
        }
        else if(name.equalsIgnoreCase("Tomáš")){
            osloveni = "Tomáši";
        }
        else if(name.equalsIgnoreCase("Jan")){
            osloveni = "Honzo";
        }
        else if(name.equalsIgnoreCase("Honza")){
            osloveni = "Honzo";
        }
        else if(name.equalsIgnoreCase("Adam")){
            osloveni = "Adame";
        }
        else if(name.equalsIgnoreCase("Josef")){
            osloveni = "Pepo";
        }
        else if(name.equalsIgnoreCase("Albert")){
            osloveni = "Alberte";
        }
        else if(name.equalsIgnoreCase("Karel")){
            osloveni = "Karle";
        }
        else if(name.equalsIgnoreCase("Martin")){
            osloveni = "Martine";
        }
        else if(name.equalsIgnoreCase("Petr")){
            osloveni = "Petře";
        }
        else if(name.equalsIgnoreCase("Jiří")){
            osloveni = "Jirko";
        }
        else if(name.equalsIgnoreCase("Jirka")){
            osloveni = "Jirko";
        }
        else if(name.equalsIgnoreCase("Michal")){
            osloveni = "Michale";
        }
        else if(name.equalsIgnoreCase("Filip")){
            osloveni = "Filipe";
        }
        else if(name.equalsIgnoreCase("Kilián")){
            osloveni = "Kiliáne";
        }
        else if(name.equalsIgnoreCase("Václav")){
            osloveni = "Václave";
        }
        else if(name.equalsIgnoreCase("Venca")){
            osloveni = "Venco";
        }
        else if(name.equalsIgnoreCase("Vít")){
            osloveni = "Víťo";
        }
        else if(name.equalsIgnoreCase("Víťa")){
            osloveni = "Víťo";
        }
        else if(name.equalsIgnoreCase("Ondřej")){
            osloveni = "Ondřeji";
        }
        else if(name.equalsIgnoreCase("Ondra")){
            osloveni = "Ondro";
        }
        else if(name.equalsIgnoreCase("Matěj")){
            osloveni = "Matěji";
        }
        else if(name.equalsIgnoreCase("Kryštof")){
            osloveni = "Kryštofe";
        }
        else if(name.equalsIgnoreCase("Radek")){
            osloveni = "Radku";
        }
        else if(name.equalsIgnoreCase("Jakub")){
            osloveni = "Jakube";
        }
        else if(name.equalsIgnoreCase("Kuba")){
            osloveni = "Kubo";
        }
        else if(name.equalsIgnoreCase("Daniel")){
            osloveni = "Danieli";
        }
        else if(name.equalsIgnoreCase("Dan")){
            osloveni = "Dane";
        }
        else if(name.equalsIgnoreCase("Mikuláš")){
            osloveni = "Mikuláši";
        }
        else if(name.equalsIgnoreCase("Miloš")){
            osloveni = "Miloši";
        }
        else if(name.equalsIgnoreCase("Stanislav")){
            osloveni = "Stanislave";
        }
        else if(name.equalsIgnoreCase("Jaroslav")){
            osloveni = "Jaroslave";
        }
        else if(name.equalsIgnoreCase("Pavel")){
            osloveni = "Pavle";
        }
        else if(name.equalsIgnoreCase("Miroslav")){
            osloveni = "Miroslave";
        }
        else if(name.equalsIgnoreCase("Šimon")){
            osloveni = "Šimone";
        }
        else if(name.equalsIgnoreCase("Jana")){
            osloveni = "Jano";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Barbora")){
            osloveni = "Barboro";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Bára")){
            osloveni = "Báro";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Tereza")){
            osloveni = "Terezo";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Terka")){
            osloveni = "Terko";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Zuzana")){
            osloveni = "Zuzano";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Zuzka")){
            osloveni = "Zuzko";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Michaela")){
            osloveni = "Michaelo";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Míša")){
            osloveni = "Míšo";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Natálie")){
            osloveni = "Natálie";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Daniela")){
            osloveni = "Danielo";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Pavla")){
            osloveni = "Pavlo";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Pavlína")){
            osloveni = "Pavlíno";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Karolína")){
            osloveni = "Karolíno";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Kája")){
            osloveni = "Kájo";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Maruška")){
            osloveni = "Maruško";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Monika")){
            osloveni = "Moniko";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Monča")){
            osloveni = "Mončo";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Petra")){
            osloveni = "Petro";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Péťa")){
            osloveni = "Péťo";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Dana")){
            osloveni = "Dano";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Dominika")){
            osloveni = "Dominiko";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Dominik")){
            osloveni = "Dominiku";
        }
        else if(name.equalsIgnoreCase("Klára")){
            osloveni = "Kláro";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Robert")){
            osloveni = "Roberte";
        }
        else if(name.equalsIgnoreCase("Roman")){
            osloveni = "Romane";
        }
        else if(name.equalsIgnoreCase("Lenka")){
            osloveni = "Lenko";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Veronika")){
            osloveni = "Veroniko";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Verča")){
            osloveni = "Verčo";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Helena")){
            osloveni = "Heleno";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Helča")){
            osloveni = "Helčo";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("David")){
            osloveni = "Davide";
        }
        else if(name.equalsIgnoreCase("Viktor")){
            osloveni = "Viktore";
        }
        else if(name.equalsIgnoreCase("Lucie")){
            osloveni = "Lucko";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Lucka")){
            osloveni = "Lucko";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Michala")){
            osloveni = "Michalo";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Anna")){
            osloveni = "Anno";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Anička")){
            osloveni = "Aničko";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Vendula")){
            osloveni = "Vendulo";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Jiřina")){
            osloveni = "Jiřino";
            isMan = false;
        }
        else if(name.equalsIgnoreCase("Mára")){
            osloveni = "Máro";
        }
        else if(name.equalsIgnoreCase("Marek")){
            osloveni = "Marku";
        }
        else if(name.equalsIgnoreCase("Jiřina")){ //proc to doprdele nejde?!
            osloveni = "Jiřino";
            isMan= false;
        }
        else if(name.equalsIgnoreCase("Jířa")){
            osloveni="Jířo";
            isMan= false;
        }
        else{
            osloveni = name;
        }
        //vytisknout osloveni
        System.out.println(osloveni + ", máte " + ((isMan)? "rád" : "ráda") + " Vánoce?");
        String answer = sc.nextLine();
        
        if(answer.equalsIgnoreCase("Ano")){
            for (int step = 1; step <= 4; step++){
                Clear(); Move(step, osloveni); TimeUnit.MILLISECONDS.sleep(200);
                if (step == 4) step = 0;
            }   
        }else{
            doesntLike(isMan);
        }
    }
    
    public static void doesntLike(boolean isMan){
        System.out.println("Nemáte "+  ((isMan)? "rád" : "ráda") + " Vánoce?");
        System.out.println("To je mi líto.");
        System.out.println("                                                               ");
        System.out.println("                       *****************                       ");
        System.out.println("                  ******               ******                  ");
        System.out.println("              ****                           ****              ");
        System.out.println("           ****                                 ***            ");
        System.out.println("         ***                                       ***         ");
        System.out.println("        **           ***               ***           **        ");
        System.out.println("      **           *******           *******          ***      ");
        System.out.println("     **            *******           *******            **     ");
        System.out.println("    **             *******           *******             **    ");
        System.out.println("   **                ***               ***                **   ");
        System.out.println("   **                                                     **   ");
        System.out.println("   **                                                     **   ");
        System.out.println("   **                                                     **   ");
        System.out.println("    **                                                   **    ");
        System.out.println("    **                  ***************                  **    ");
        System.out.println("     **            ******             ******            **     ");
        System.out.println("      ***       ****                       ****       ***      ");
        System.out.println("        **     **                             **     **        ");
        System.out.println("         ***                                       ***         ");
        System.out.println("           ****                                 ****           ");
        System.out.println("              ****                           ****              ");
        System.out.println("                  ******               ******                  ");
        System.out.println("                       *****************                       ");
    }
    
    public static void Move(int step, String osloveni){
        switch (step){
            case 1: {
                System.out.println("                                                                                                              ");
                System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *                                              ");
                System.out.println("      |,\\/,| |[_' |[_]) |[_]) \\\\//                                                                *           ");
                System.out.println(" *    ||\\/|| |[_, ||'\\, ||'\\,  ||                              *               *                              ");
                System.out.println("              ___ __ __ ____  __  __  ____  _  _    __    __                                                 ");
                System.out.println(" *           // ' |[_]| |[_]) || ((_' '||' |,\\/,|  //\\\\  ((_'  *                                              ");
                System.out.println("             \\\\_, |[']| ||'\\, || ,_))  ||  ||\\/|| //``\\\\ ,_))                                                 ");
                System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *           *                                  ");
                System.out.println("       *                                                  *                                       *           ");
                System.out.println(" _---_.*~<('===          ,~~,         ,~~,         ,~~,           ,_)                                         ");
                System.out.println(" (,    \\ (__)=3--__._----_()'4__._----_()'4__._----_()'4__._,____.()'b                                        ");
                System.out.println("   \\--------/-\\  ~~(        ) ~~(        ) ~~(        )  ~~:       :'                                         ");
                System.out.println("    \\_______|       (,_,,,_)     (,_,,,_)     (,_,,,_)     ;,,,,,,:                 *                         ");
                System.out.println(" ___I___I___I./     / /  \\ \\     / /  \\ \\     / /  \\ \\     / /  \\ \\                                           ");
                System.out.println("   *                                                                                                          ");
                System.out.println("                              /\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\                                      ");
                System.out.println("                                 \tVeselé Vánoce " + osloveni + "!\t\t" + "                               *             ");
                System.out.println("                              ˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘             \\ /                     ");
                System.out.println("                      *                                                            -->*<--                   ");
                System.out.println("         *                                    *     ___                     *        /_\\                     ");
                System.out.println("                                                   |   |       *                    /_\\_\\             *      ");
                System.out.println("                                                ___|   |_____________              /_/_/_\\                   ");
                System.out.println("   *          **          **         **        /                      \\           /_/_/_/_\\                  ");
                System.out.println("             /.\\         /.\\         /.\\      /                        \\          /_/_/_/_\\                  ");
                System.out.println("            /..'\\       /..'\\       /..'\\    /_________________________ \\     *   /_\\_\\_\\_\\                  ");
                System.out.println("     *      /'.'\\       /'.'\\       /'.'\\   / |                        | \\       /_/_/_/_/_\\          *      ");
                System.out.println("           /.''.'\\     /.''.'\\     /.''.'\\    |    ___          ____   |        /_/_/_/_/_/_\\                ");
                System.out.println("           /.'.'.\\     /.'.'.\\     /.'.'.\\    |   |_|_|        |    |  |        /_\\_\\_\\_\\_\\_\\                 ");
                System.out.println("     ˛˛˛˛˛/'.''.'.\\˛˛˛/'.''.'.\\˛˛˛/'.''.'.\\˛˛˛|   |_|_|        |    |  |˛˛˛˛˛˛˛/_/_/_/_/_/_/_\\˛˛˛˛˛˛˛˛˛˛˛˛˛˛  ");
                System.out.println("          ^^^[_]^^^   ^^^[_]^^^   ^^^[_]^^^   |________________|    |__|            [___]                     ");
                break;
            }
            case 2: {
                System.out.println("                                                                                                              ");
                System.out.println("  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *                                               ");
                System.out.println(" *    |,\\/,| |[_' |[_]) |[_]) \\\\//                             *                                              ");
                System.out.println("      ||\\/|| |[_, ||'\\, ||'\\,  ||                                                                             ");
                System.out.println(" *            ___ __ __ ____  __  __  ____  _  _    __    __   *                                  *          ");
                System.out.println("             // ' |[_]| |[_]) || ((_' '||' |,\\/,|  //\\\\  ((_'                    *                            ");
                System.out.println(" *           \\\\_, |[']| ||'\\, || ,_))  ||  ||\\/|| //``\\\\ ,_))  *                                              ");
                System.out.println("  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *                                               ");
                System.out.println("                                                                           *                                  ");
                System.out.println("         _---_.*~<('===          ,~~,         ,~~,         ,~~,           ,_)                                         ");
                System.out.println("       * (,    \\ (__)=3--__._----_()'4__._----_()'4__._----_()'4__._,____.()'b                   *                    ");
                System.out.println("           \\--------/-\\  ~~(        ) ~~(        ) ~~(        )  ~~:       :'                                         ");
                System.out.println("            \\_______|       (,_,,,_)     (,_,,,_)     (,_,,,_)     ;,,,,,,:                                   ");
                System.out.println("         ___I___I___I./     / /  \\ \\     / /  \\ \\     / /  \\ \\     / /  \\ \\                                           ");
                System.out.println("                                                                                     *                        ");
                System.out.println("                              /\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\                                      ");
                System.out.println("   *                             \tVeselé Vánoce " + osloveni + "!\t" + "                                             ");
                System.out.println("                              ˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘             \\ /                     ");
                System.out.println("                                                                                   -->*<--                   ");
                System.out.println("                                                    ___                              /_\\       *             ");
                System.out.println("                      *                            |   |                            /_\\_\\                    ");
                System.out.println("         *                                    * ___|   |_____________       *      /_/_/_\\                   ");
                System.out.println("              **          **         **        /                      \\           /_/_/_/_\\           *      ");
                System.out.println("             /.\\         /.\\         /.\\      /                        \\          /_/_/_/_\\                  ");
                System.out.println("   *        /..'\\       /..'\\       /..'\\    /_________________________ \\         /_\\_\\_\\_\\                  ");
                System.out.println("            /'.'\\       /'.'\\       /'.'\\   / |                        | \\       /_/_/_/_/_\\                 ");
                System.out.println("           /.''.'\\     /.''.'\\     /.''.'\\    |    ___          ____   |       */_/_/_/_/_/_\\                ");
                System.out.println("     *     /.'.'.\\     /.'.'.\\     /.'.'.\\    |   |_|_|        |    |  |        /_\\_\\_\\_\\_\\_\\     *           ");
                System.out.println("     ˛˛˛˛˛/'.''.'.\\˛˛˛/'.''.'.\\˛˛˛/'.''.'.\\˛˛˛|   |_|_|        |    |  |˛˛˛˛˛˛˛/_/_/_/_/_/_/_\\˛˛˛˛˛˛˛˛˛˛˛˛˛˛  ");
                System.out.println("          ^^^[_]^^^   ^^^[_]^^^   ^^^[_]^^^   |________________|    |__|            [___]                     ");
                break;
            }
            case 3: {
                System.out.println("                                                                                                              ");
                System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *                                              ");
                System.out.println("      |,\\/,| |[_' |[_]) |[_]) \\\\//                                           *                                ");
                System.out.println(" *    ||\\/|| |[_, ||'\\, ||'\\,  ||                              *                                              ");
                System.out.println("              ___ __ __ ____  __  __  ____  _  _    __    __                              *                  ");
                System.out.println(" *           // ' |[_]| |[_]) || ((_' '||' |,\\/,|  //\\\\  ((_'  *                                              ");
                System.out.println("             \\\\_, |[']| ||'\\, || ,_))  ||  ||\\/|| //``\\\\ ,_))                                     *           ");
                System.out.println(" * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *                    *                         ");
                System.out.println("               *                                                                                              ");
                System.out.println("                 _---_.*~<('===          ,~~,         ,~~,         ,~~,           ,_)                                         ");
                System.out.println("                 (,    \\ (__)=3--__._----_()'4__._----_()'4__._----_()'4__._,____.()'b                                        ");
                System.out.println("                   \\--------/-\\  ~~(        ) ~~(        ) ~~(        )  ~~:       :'                                         ");
                System.out.println("       *            \\_______|       (,_,,,_)     (,_,,,_)     (,_,,,_)     ;,,,,,,:              *                    ");
                System.out.println("                 ___I___I___I./     / /  \\ \\     / /  \\ \\     / /  \\ \\     / /  \\ \\                                           ");
                System.out.println("                                                                                                              ");
                System.out.println("                 *            /\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\                                      ");
                System.out.println("                                 \tVeselé Vánoce " + osloveni + "!\t" + "                    *                        ");
                System.out.println("                              ˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘             \\ /                     ");
                System.out.println("                                                                                   -->*<--                   ");
                System.out.println("   *                                                ___                    *         /_\\                     ");
                System.out.println("                                                   |   |                            /_\\_\\                    ");
                System.out.println("                                                ___|   |_____________              /_/_/_\\     *             ");
                System.out.println("              **      *   **         **        /                      \\           /_/_/_/_\\                  ");
                System.out.println("         *   /.\\         /.\\         /.\\   *  /                        \\*         /_/_/_/_\\                  ");
                System.out.println("            /..'\\       /..'\\       /..'\\    /_________________________ \\         /_\\_\\_\\_\\     *            ");
                System.out.println("            /'.'\\       /'.'\\       /'.'\\   / |                        | \\       /_/_/_/_/_\\                 ");
                System.out.println("   *       /.''.'\\     /.''.'\\     /.''.'\\    |    ___          ____   |        /_/_/_/_/_/_\\                ");
                System.out.println("           /.'.'.\\     /.'.'.\\     /.'.'.\\    |   |_|_|        |    |  |       */_\\_\\_\\_\\_\\_\\                 ");
                System.out.println("     ˛˛˛˛˛/'.''.'.\\˛˛˛/'.''.'.\\˛˛˛/'.''.'.\\˛˛˛|   |_|_|        |    |  |˛˛˛˛˛˛˛/_/_/_/_/_/_/_\\˛˛˛˛˛˛˛˛˛˛˛˛˛˛  ");
                System.out.println("     *    ^^^[_]^^^   ^^^[_]^^^   ^^^[_]^^^   |________________|    |__|            [___]                     ");
                break;
            }
            case 4: {
                System.out.println("                                                                                                              ");
                System.out.println("  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *                                               ");
                System.out.println(" *    |,\\/,| |[_' |[_]) |[_]) \\\\//                             *                                              ");
                System.out.println("      ||\\/|| |[_, ||'\\, ||'\\,  ||                                                                             ");
                System.out.println(" *            ___ __ __ ____  __  __  ____  _  _    __    __   *                *                            ");
                System.out.println("             // ' |[_]| |[_]) || ((_' '||' |,\\/,|  //\\\\  ((_'                                                 ");
                System.out.println(" *           \\\\_, |[']| ||'\\, || ,_))  ||  ||\\/|| //``\\\\ ,_))  *                    *                         ");
                System.out.println("  * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *                                               ");
                System.out.println("                                                                                                  *           ");
                System.out.println("                         _---_.*~<('===          ,~~,         ,~~,         ,~~,           ,_)                                         ");
                System.out.println("               *         (,    \\ (__)=3--__._----_()'4__._----_()'4__._----_()'4__._,____.()'b                                        ");
                System.out.println("                           \\--------/-\\  ~~(        ) ~~(        ) ~~(        )  ~~:       :'                                         ");
                System.out.println("                            \\_______|       (,_,,,_)     (,_,,,_)     (,_,,,_)     ;,,,,,,:                                   ");
                System.out.println("                         ___I___I___I./     / /  \\ \\     / /  \\ \\     / /  \\ \\     / /  \\ \\                                           ");
                System.out.println("       *                                                                                                  *   ");
                System.out.println("                              /\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\                                      ");
                System.out.println("                                 \tVeselé Vánoce " + osloveni + "!\t" + "                                             ");
                System.out.println("                              ˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘˘             \\ /                     ");
                System.out.println("                 *                                                                 -->*<--                   ");
                System.out.println("                                                    ___                              /_\\                     ");
                System.out.println("                                                   |   |                            /_\\_\\                    ");
                System.out.println("   *                                            ___|   |_____________      *       /_/_/_\\                   ");
                System.out.println("              **          **         **        /                      \\           /_/_/_/_\\                  ");
                System.out.println("             /.\\         /.\\         /.\\      /                        \\*         /_/_/_/_\\ *                ");
                System.out.println("            /..'\\    *  /..'\\       /..'\\    /_________________________ \\         /_\\_\\_\\_\\                  ");
                System.out.println("         *  /'.'\\       /'.'\\       /'.'\\  */ |                        | \\       /_/_/_/_/_\\                 ");
                System.out.println("           /.''.'\\     /.''.'\\     /.''.'\\    |    ___          ____   |        /_/_/_/_/_/_\\       *        ");
                System.out.println("           /.'.'.\\     /.'.'.\\     /.'.'.\\    |   |_|_|        |    |  |        /_\\_\\_\\_\\_\\_\\                 ");
                System.out.println("   * ˛˛˛˛˛/'.''.'.\\˛˛˛/'.''.'.\\˛˛˛/'.''.'.\\˛˛˛|   |_|_|        |    |  |˛˛˛˛˛˛˛/_/_/_/_/_/_/_\\˛˛˛˛˛˛˛˛˛˛˛˛˛˛  ");
                System.out.println("          ^^^[_]^^^   ^^^[_]^^^   ^^^[_]^^^   |________________|    |__|            [___]                     ");
                break;
            }
        }
    }
    
    public static void Clear(){
        for (int i=0; i<100; i++){
            System.out.println();
        }
    }
    
    public static void osloveni(String name){
        String osloveni;
        if(name == "David"){
            osloveni = "Davide";
        }
        else{
            osloveni = name;
        }
        
    }
} 