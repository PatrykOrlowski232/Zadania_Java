package devices;

import creatures.Human;

public class Phone extends Devices implements sellable {


    @Override
   public  void turnOn() {
        this.oforon = true;
    }
    @Override
    public void sell(Human seller , Human buyer, double price)
    {
        if(seller.getphone() == this && buyer.cash >= price) {
            System.out.println("Tranzakcja przebiegła pomyślnie");
            buyer.setPhone(this);
            seller.setPhone(null);
            seller.cash += price;
            buyer.cash -= price;
        }
        else
            System.out.println("Nie można przeprowadzić tranzakcji");
    }



}
