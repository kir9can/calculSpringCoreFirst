package org.example;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public String execute(double fNumber,double sNumber,String operation){
        String result ="";
        switch (operation){
            case"+":
                result=String.valueOf(fNumber+sNumber);
                break;
            case"-":
                result=String.valueOf(fNumber-sNumber);
                break;
            case"/":
                result=String.valueOf(fNumber/sNumber);
                break;
            case"*":
                result=String.valueOf(fNumber*sNumber);
                break;
        }
        return result;
    }

}
