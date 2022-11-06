package org.exemple;
// Из этого класса выделяем хранение массива покупок, методы добавления покупки, распечатки корзины и вывод итоговой суммы покупок в класс Basket
public class Purchase {
    protected String title;
    protected int count;

    public Purchase(String title, int count) {
        this.title = title;
        this.count = count;
    }
}
