package com.artbook.chain;

public class VicePresident extends Approver{
    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() < 100000) {
            System.out.println("副董事长" +this.name + "采购审批单：" + request.getNumber() + ", 金额："
                    + request.getAmount() + "元，采购目的：" + request.getPurpose());
        }else {
            this.successor.processRequest(request);
        }
    }
}
