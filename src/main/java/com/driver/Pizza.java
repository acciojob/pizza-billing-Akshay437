package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int cheesePrice;
    private int tp;
    private int ta;
    Boolean takeAwayAdded;
    Boolean takeToppingAdded;
    Boolean isCheeseAdded;
    Boolean isBillGenerated;



    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        this.cheesePrice=80;
        this.ta=20;

        // your code goes here

        if(isVeg==true)
        {
            this.price=300;
            this.tp=70;
        }
        else {
            this.price=400;
            this.tp=120;
        }
        this.takeAwayAdded=false;
        this.isCheeseAdded=false;
        this.takeToppingAdded=false;
        this.bill="Base Price Of The Pizza: "+ this.price+ "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(isCheeseAdded==false)
        {
            this.price=this.price+this.cheesePrice;
            isCheeseAdded=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(takeToppingAdded==false)
        {
            this.price=this.price+this.tp;
            takeToppingAdded=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(takeAwayAdded==false)
        {
            this.price=this.price+ta;
            takeAwayAdded=true;
        }
    }

    public String getBill(){
        // your code goes here
        if(isBillGenerated==false)
        {
            if(isCheeseAdded==true)
            {
                this.bill=this.bill+ "Extra Cheese Added: "+this.cheesePrice+"\n";
            }
            if(takeToppingAdded==true)
            {
                this.bill=this.bill + "Extra Toppings Added: "+this.tp+"\n" ;

            }
            if(takeAwayAdded==true)
            {
                this.bill=this.bill+"Paperbag Added: "+this.ta+"\n" ;

            }
            this.bill=this.bill+"Total Price: "+this.price+"\n";
            isBillGenerated=true;
        }

        return this.bill;
    }
}
