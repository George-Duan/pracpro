package com.artbook.state;

public class NormalState extends AccountState{
    public NormalState(Account acc){
        this.acc = acc;
    }
    public NormalState(AccountState state){
        this.acc = state.acc;
    }
    @Override
    public void deposit(double amount) {
        acc.setBalance(acc.getBalance() + amount);
        stateCheck();
    }

    @Override
    public void withdraw(double amount) {
        acc.setBalance(acc.getBalance() - amount);
        stateCheck();
    }

    public void computeInterest(){
        System.out.println("正常状态，无须支付利息！");
    }

    @Override
    public void stateCheck() {
        if (acc.getBalance() > -2000 & acc.getBalance()<=0) {
            acc.setState(new OverdraftState(this));
        }
        else if(acc.getBalance() == -2000){
            acc.setState(new RestrictedState(this));
        }
        else if(acc.getBalance() < -2000){
            System.out.println("操作受限");
        }
    }
}
