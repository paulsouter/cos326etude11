package etude11;

import java.util.ArrayList;

/**
 * The class for bargain finders.
 *
 * @author MichaelAlbert
 */
public class BargainFinder {

    private SiteInfo site;
    private CustomerInfo customer;
    private int budget;
    private ArrayList<String> list = new ArrayList<>();
    private ArrayList<String> bestList = new ArrayList<>();
    private int value = 0;
    private int bestValue = 0;
    private int cost = 0;

    public BargainFinder(SiteInfo site, CustomerInfo customer, int budget) {
        this.site = site;
        this.customer = customer;
        this.budget = budget;
    }

    public ArrayList<String> shoppingList() {
        list = customer.getItems();
        ArrayList<String> cart = new ArrayList<String>();
        getList(cart, list);
        System.out.println(bestList);
        return bestList;
    }

    public void getList(ArrayList<String> cart, ArrayList<String> list) {
//        System.out.println("cost :" + site.getCost(cart) + " budget :" + budget);
        if (!cart.isEmpty() && site.getCost(cart) > budget) {
            return;
        }
//        System.out.println("value " + value + " best value " + bestCost);
        if (value > bestValue) {
            bestValue = value;
            bestList = new ArrayList<>(cart);
        }
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                cart.add(list.get(i));
                String temp = list.get(i);
                value += customer.getValue(temp);
                list.remove(i);
                getList(cart, list);
                cart.remove(temp);
                value -= customer.getValue(temp);
                list.add(temp);
            }
        }

        
    }
    
    public int getTotalValue(ArrayList<String> items){
        int sum = 0;
        for(String s : items){
            sum += this.customer.getValue(s);
        }
        return sum;
    }
}
