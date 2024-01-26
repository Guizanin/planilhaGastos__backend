package controleGastos.api.account;

public record DataCreateAccount(
        String nome,
        Double valor,
        Boolean ativo
) {
}
