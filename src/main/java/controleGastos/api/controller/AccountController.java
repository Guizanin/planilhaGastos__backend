package controleGastos.api.controller;

import controleGastos.api.account.DataCreateAccount;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @PostMapping
    @Transactional
    public void createAccount(@RequestBody DataCreateAccount account){
        System.out.println(account);
    }
}
