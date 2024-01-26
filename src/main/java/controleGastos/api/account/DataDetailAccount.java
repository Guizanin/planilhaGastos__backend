package controleGastos.api.account;

public record DataDetailAccount(Long id, String name, Double value, Boolean active) {
    public  DataDetailAccount(AccountModel acc){
        this(acc.getId(), acc.getName(), acc.getValue(), acc.getActive());
    }
}
