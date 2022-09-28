package org.example;


import org.example.interfaces.Reader;
import org.example.interfaces.Writer;
import org.springframework.stereotype.Component;

@Component
public class Application {
    private CalcService calculator;
    private Reader reader;
    private Writer writer;

    private final static String NUM_1="первое число";
    private final static String NUM_2="второе число";
    private final static String OPERATION="операция";
    private final static String MISTAKE="неверный формат, попробуйте еще раз";
    private final static String RESULT="результат";
    private final static String AGAIN="продолжить?";


    public Application(CalcService calculator, Reader reader, Writer writer) {
        this.calculator = calculator;
        this.reader = reader;
        this.writer = writer;
    }
    public void start(){
        writer.write((NUM_1));
        double fNumber=enNumber();

        writer.write((NUM_2));
        double sNumber=enNumber();

        writer.write((OPERATION));
        String operation=enOperation();

        writer.write(RESULT+ " " + calculator.execute(fNumber,sNumber,operation));

        if (again()){
            start();
        }

    }
    public double enNumber(){
        double number=0;
        while (true){
            try{
                number=Double.parseDouble(reader.read());
                break;
            } catch (NumberFormatException e){
                writer.write(MISTAKE);
            }
        }
        return number;
    }
    public String enOperation(){
        String operation="";
        while(true){
            operation= reader.read();
            if (operation.equals("+")||operation.equals("-")||operation.equals("/")||operation.equals("*")){
                return operation;
            } else {
                writer.write(MISTAKE);
            }
        }
    }
    public boolean again(){
        while(true){
            writer.write(AGAIN);
            String answer=reader.read();
            if("yes".equalsIgnoreCase(answer)){
                return true;
            }if("no".equalsIgnoreCase(answer)) {
                return false;
            }
        }
    }



}
