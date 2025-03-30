package com.example.bootsecuirtyapp1basicinmemorydb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BankOperationController {
    @GetMapping("/")
    public String showHome(){
return "home";
    }

    @GetMapping("/offers")
    public String showOffers(){
        return "offers";
    }
    @GetMapping("/balance")
    public String showBalance(){
        return "show_balance";
    }
    @GetMapping("/approveLoan")
    public String loans(){
        return "loan";
    }
    //for authorization failed
    @GetMapping("/denied")
    public String denied(){
        return "denied";
    }
}
