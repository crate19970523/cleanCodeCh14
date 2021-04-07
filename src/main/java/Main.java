public class Main {
    public static void main(String[] args) {
        try {
            String[] aa = new String[4];
            aa[0] = "-c";
            aa[1] = null;
            aa[2] = "-p";
            aa[3] = "4";
            var arg = new Args("l, p#, c*", aa);
            var logging = arg.getBoolean('l');
            var port = arg.getInt('p');
            String directory = arg.getString('c');
            System.out.println("logging: " + logging);
            System.out.println("port: " + port);
            System.out.println("directory: " + directory);
//            executeApplication(logging, port, directory);
        } catch (ArgsException e) {
            e.printStackTrace();
            System.out.printf("Argumenterror:% s\n", e.errorMessage());
        }
    }
}
