package com.artbook.state;

public class OverdraftState extends AccountState{
    public OverdraftState(AccountState state){
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
        System.out.println("计算利息！");
    }

    @Override
    public void stateCheck() {
        if (acc.getBalance() > 0) {
            acc.setState(new NormalState(this));
        }
        else if(acc.getBalance() == -2000){
            acc.setState(new RestrictedState(this));
        }
        else if(acc.getBalance() < -2000){
            System.out.println("操作受限");
        }
    }
}
