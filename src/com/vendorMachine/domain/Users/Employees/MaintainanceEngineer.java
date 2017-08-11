package com.vendorMachine.domain.Users.Employees;

public class MaintainanceEngineer extends Employee {
    public MaintainanceEngineer(int id, String name, String department, boolean working) {
        super(id, name, department, working);
    }

    private void inventoryManagement(){
        System.out.println("Inventory check");
    }
    private void supplierService(){
        System.out.println("Supplier coordination");
    }

    @Override
    public void performDuties() {
        supplierService();
        inventoryManagement();
    }

    @Override
    public String toString() {
        return getId() + getName();
    }
}
