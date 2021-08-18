package com.company;

public class MainBank {
    public static void main(String[] args){
        Bank ing =  new Bank();

        ing.addNewBranch("Cemal",150.0,"Leuven");
        ing.addTransaction("Cemal",250.76,"Leuven");
        ing.addTransaction("Cemal",250.76,"Leuven");

        ing.addNewBranch("Selami",450.0,"Istanbul");
        ing.addNewCustomer("Ramazan","Istanbul",234.67);

        ing.addNewCustomer("Kemal","Leuven",230.45);
        ing.addTransaction("Kemal",350.89,"Leuven");

        ing.addNewBranch("Cemal",150.0,"Leuven");
        ing.addNewBranch("Ramazan",2556.56,"Warsaw");
        ing.addTransaction("Ramazan",300.76,"Istanbul");


        ing.printAll();



    }
}
