package kr.hs.dgsw.calc1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Abcd {

    @GetMapping
    public String Abcd(){
        return "Abcd";
    }
}
