package org.exemple;

import java.util.Map;

public class Basket {
    protected Purchase[] purchases;

    public Basket(Map<String, Integer> prices) {
        this.purchases = new Purchase[prices.size()]; // размер массива покупок опредлеляем не непосредственно, как было раньше, а через размер мапы в параметре конструктора корзины
    }

    public void addPurchase(String title, int count) {
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) {
                purchases[i] = new Purchase(title, count);
                return;
            }
            if (purchases[i].title.equals(title)) {
                purchases[i].count += count;
                return;
            }
        }
    }

    public long sum(Map<String, Integer> prices) {
        long sum = 0;
        System.out.println("КОРЗИНА:");
        for (int i = 0; i < purchases.length; i++) {
            if (purchases[i] == null) continue;
            System.out.println("\t" + purchases[i].title + " " + purchases[i].count + " шт. в сумме " +
                    (prices.get(purchases[i].title) * purchases[i].count) + " руб.");
            sum += (long) prices.get(purchases[i].title) * purchases[i].count;
        }
        return sum;
    }
}
