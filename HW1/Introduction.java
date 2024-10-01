public class Introduction {
    public static void main(String[] args) {
        String name = "Vy Anh Dũng";
        String msv = "22021179";
        String className = "K67IT2";
        String githubUsername = "VADung206";
        String email = "22021179@gmail.com";

        System.out.println(name + "\t" + msv + "\t" + className + "\t" + githubUsername + "\t" + email);

        for (int i = 9; i > 0; i--) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer.");
            System.out.println("Take one down, pass it around,");
            if (i - 1 == 1) {
                System.out.println((i - 1) + " bottle of beer on the wall, " + (i - 1) + " bottle of beer.");
            } else {
                System.out.println((i - 1) + " bottles of beer on the wall, " + (i - 1) + " bottles of beer.");
            }
            System.out.println("Take one down, pass it around,");
        }
        System.out.println("No more bottles of beer on the wall.");
    }
}