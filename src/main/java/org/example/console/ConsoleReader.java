package org.example.console;


import org.example.interfaces.Reader;
import org.springframework.stereotype.Component;


import java.util.Scanner;

@Component
public class ConsoleReader implements Reader {
    private final Scanner scanner;
    public ConsoleReader(Scanner scanner){
        this.scanner=scanner;
    }
    public String read(){
        return scanner.nextLine().trim();
    }
}
