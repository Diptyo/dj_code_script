public class practice_set3 {
    public static void main(String[] args) {
        //question 1: write a java program to convert a string to lower case.
        String name = "DIPTYO";
        System.out.println(name.toLowerCase());

        //question 2: write a java program to replace spaces with underscores.
        String name1 = "dip   tyo";
        System.out.println(name1.replace(" ","_"));

        //question 3: write a java program to fill in a letter template which looks like bellow:
        //letter = "dear<|name|>, thanks a lot". replace name with string(some name).
        String name2 = "dear diptyo, thanks a lot";
        System.out.println(name2.replace("diptyo","harry"));

        //question 4: write a java program to detect double or tripple spaces in a string.
        String l = "diptyo is a  nice   person";
        System.out.println(l.indexOf("  "));
        System.out.println(l.indexOf("   "));

        //question 5: write a program to format the following letter using escape sequence character.
        String l1 = "Dear Diptyo,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(l1);
    }
}


