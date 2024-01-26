package controleGastos.api.controller;

import controleGastos.api.account.AccountModel;
import controleGastos.api.account.AccountRepository;
import controleGastos.api.account.DataCreateAccount;
import controleGastos.api.account.DataDetailAccount;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    AccountRepository repository;


    @PostMapping
    @Transactional
    public ResponseEntity createAccount(@RequestBody @Valid DataCreateAccount account, UriComponentsBuilder uriBuilder){
        var acc = new AccountModel(account);

        repository.save(acc);

        var uri = uriBuilder.path("/account/{id}").buildAndExpand(acc.getId()).toUri();
        return ResponseEntity.created(uri).body(new DataDetailAccount(acc));

    }
}
