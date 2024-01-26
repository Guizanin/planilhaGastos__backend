package controleGastos.api.account;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DataCreateAccount(
        @NotBlank
        String name,

        @NotNull
        Double value,

        @NotNull
        Boolean active
) {}
