package org.example.console;


import org.example.interfaces.Writer;
import org.springframework.stereotype.Component;

@Component
public class ConsoleWriter implements Writer {


    @Override
    public void write(String string) {
        System.out.println(string);
    }
}
