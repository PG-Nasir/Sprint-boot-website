package pgspring.ludwigv1;

import java.util.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @GetMapping("/binary_to_decimal")
    public String binary_to_decimal(Model model) {
        Conversion conversion = new Conversion();
        model.addAttribute("conversion", conversion);

        return "binary_to_decimal";
    }

    @PostMapping("/calculation")
    public String submitForm(@ModelAttribute("conversion") Conversion conversion,Model model) {

        String binary=conversion.getBinary().isEmpty()?"0":conversion.getBinary();
        System.out.println("binary "+binary);

        if(binary.length()==4){
            if(isBinaryNumber(Integer.parseInt(binary))){
                int decimalNumber=getDecimal(Integer.parseInt(binary));
                conversion.setDecimal(Integer.toString(decimalNumber));
                conversion.setTextStatus("");
                System.out.println("decimalNumber "+decimalNumber);
                model.addAttribute("decimal",decimalNumber);

            }
            else{
                int decimalNumber=0;
                conversion.setDecimal("");
                conversion.setTextStatus("Invalid Entry");
                model.addAttribute("decimal","");

            }
        }
        else{
            int decimalNumber=0;
            conversion.setDecimal("");
            conversion.setTextStatus("Invalid Entry");
            model.addAttribute("decimal","");
        }



        return "binary_to_decimal";
    }

    public int getDecimal(int number){
        int decimal = 0;
        int binary = number;
        int power = 0;
        while (binary != 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            power++; binary = binary / 10;
        }
        return decimal;
    }

    public int power(int base, int power)
    {
        int result = base;
        for (int i = 1; i < power; i++) {
            result = result * base;
        }
        return result;
    }


    public boolean isBinaryNumber(int num)
    {
        System.out.println("num "+num);
        if (num == 0 || num == 1) {
            return true;
        }
        else if(num < 0){
            return false;
        }
        while (num != 0) {
            if (num % 10 > 1) {
                return false;
            }
            num = num / 10;
        }
        return true;
    }


    @GetMapping("/index")
    public String index() {

        return "index";
    }

    @GetMapping("/event_plan")
    public String event_plan(Model model) {
        EventPlanner ep=new EventPlanner();
        List<Event> list=ep.getRankData();

        model.addAttribute("list",list);
        return "event_plan";
    }

}