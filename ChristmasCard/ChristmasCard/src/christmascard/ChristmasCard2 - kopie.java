package christmascard;

/**
 *
 * @author David Bálik
 */
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ChristmasCard2 {

    //public static Scanner sc = new Scanner(System.in, "Cp1250");
    public static Scanner sc = new Scanner(System.in);
    //public static Locale loc = new Locale("cs-CZ");

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Máte rád/a Vánoce?");
        String answer = sc.nextLine();

        boolean no = true;
        if (answer.equalsIgnoreCase("Ano")) {
            for (int step = 1; step <= 4; step++) {
                Clear();
                Move(step);
                TimeUnit.MILLISECONDS.sleep(220);
                if (step == 4) {
                    step = 0;
                }
            }
        } else {
            doesntLike(no);
        }
    }

    public static void doesntLike(boolean no) {
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

    public static void Move(int step) {
        switch (step) {
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
                System.out.println("                                 \tVeselé Vánoce!                              *             ");
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
                System.out.println("   *                             \tVeselé Vánoce!                                             ");
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
                System.out.println("                                 \tVeselé Vánoce!                  *                        ");
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
                System.out.println("                                 \tVeselé Vánoce!                                             ");
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
    


}
