package LiveExceptionJava; 

public class ContaBancaria {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withDrawLimit;
    
    
    public ContaBancaria(Integer number, String holder, Double balance, Double withDrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withDrawLimit = withDrawLimit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithDrawLimit() {
        return withDrawLimit;
    }

    public void setWithDrawLimit(Double withDrawLimit) {
        this.withDrawLimit = withDrawLimit;
    }   

    public void deposit(Double amount) {
        balance += amount;
    }

    public void withDraw(double amount) {
        validateWithDraw(amount);
        balance -= amount;
    }

    private void validateWithDraw(double amount) {
        if (amount > getWithDrawLimit()) {
            throw new RuntimeException("Erro no saque. A quantia excede o limite de saque");
        }
        if(amount > getBalance()){
            throw new RuntimeException ("Erro de saque. Saldo insuficiente");
        }
    }    
}