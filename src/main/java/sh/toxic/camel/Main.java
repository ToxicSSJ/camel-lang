package sh.toxic.camel;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Properties;

public class Main {

    public static void main(String[] args) throws Exception {

        if(args.length == 0)
            return;

        if(args[0].equalsIgnoreCase("generate")) {

            Properties configuration = getConfiguration();

            generateLexer(configuration);
            generateCup(configuration);
            return;

        } else if(args.length == 2 && args[0].equalsIgnoreCase("process")){

            File file = new File(args[1]);

            Lexer lexer = new Lexer(new FileReader(file));
            Parser parser = new Parser(lexer);
            parser.parse();  // compila

            if (lexer.errlex.length() == 0 && parser.errsin.length() == 0){
                System.out.println("Compilación correcta");
                System.out.println(lexer.ts.toString());
            } else{
                System.err.println("Compilacion incorrecta");
                System.err.println(lexer.errlex);
                System.err.println(parser.errsin);
            }

        }

    }

    private static void generateCup(Properties configuration) {
        try {

            java_cup.Main.main(getCupArguments(configuration));

            Files.move(Paths.get(configuration.getProperty("cup_from_move_folder") + "/" + configuration.getProperty("cup_output") + ".java"),
                    Paths.get(configuration.getProperty("cup_to_move_folder") + "/" + configuration.getProperty("cup_output") + ".java"),
                    StandardCopyOption.REPLACE_EXISTING);

            Files.move(Paths.get(configuration.getProperty("cup_from_move_folder") + "/" + "sym.java"),
                    Paths.get(configuration.getProperty("cup_to_move_folder") + "/" + "sym.java"),
                    StandardCopyOption.REPLACE_EXISTING);

        } catch(Exception e) {

            e.printStackTrace();
            System.out.println("Ocurrió un error durante la generación del JavaCup.");

        }
    }

    private static void generateLexer(Properties properties) {
        try {

            File lexerFile = new File(properties.getProperty("lexer"));
            jflex.Main.generate(lexerFile);

        } catch(Exception e) {

            e.printStackTrace();
            System.out.println("Ocurrió un error durante la generación del Lexer.");

        }
    }

    private static InputStream getResourceAsInputStream(String resource) {
        return Main.class.getClassLoader().getResourceAsStream(resource);
    }

    private static Properties getConfiguration() {
        Properties properties = new Properties();
        InputStream stream = getResourceAsInputStream("config.properties");
        if(stream != null) {
            try {
                properties.load(stream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;
    }

    private static String[] getCupArguments(Properties properties) {
        return new String[]{
            "-parser",
            properties.getProperty("cup_output"),
            properties.getProperty("cup_input")
        };
    }

}
