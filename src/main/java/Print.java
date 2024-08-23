public class Print {
    // 40 characters long
    private static final String horizontalLine =
            "________________________________________";

    private static final String name = "Jeremy";

    public static void ascii() {
        String amongus = "                                        \n"
                + "                .-++++++-.              \n"
                + "              -##+------+##+.           \n"
                + "             +#+      ....+##+          \n"
                + "            .##.  -####+++++###.        \n"
                + "          ..+#+   ##+..      .+#-       \n"
                + "        +#####-  .##--.........##       \n"
                + "       +#+  ##-.  +##+++-+++++##+       \n"
                + "       +#-.-##-.   -########+##+        \n"
                + "       +#-.-##-.     ......  .##        \n"
                + "       ##-.-##--.            -##        \n"
                + "       ##---##---.          .-##        \n"
                + "       +#-..##----...........-#+        \n"
                + "       .##+-##--------------.+#-        \n"
                + "        .+++##----.+#####+---##         \n"
                + "            +#-.--.+#+.#+...-#+         \n"
                + "            -#+----##+-##+++##-         \n"
                + "          ++####################-       \n"
                + "            ....------------...         \n"
                + "                                        \n";

        System.out.print(amongus);
        System.out.println(horizontalLine);
    }

    public static void greeting() {
        System.out.println(horizontalLine);
        System.out.println("Hello! I'm " + name + ".");
        System.out.println("What can I do for you?");
        System.out.println(horizontalLine);
    }

    public static void bye() {
        System.out.println(horizontalLine);
        System.out.println("Bye. Hope to see you again soon!");
        System.out.println(horizontalLine);
    }
}
