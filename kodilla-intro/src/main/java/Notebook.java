public class Notebook {
    int weight;
    int price;

    public Notebook(int weight, int price) {
        this.weight = weight;
        this.price = price;
    }
    public void checkPrice() {
        if (this.price < 900) {
            System.out.println("This notebook is cheap.");
        } else {
            System.out.println("This notebook is quite expensive.");
        }
        if (this.price < 600) {
            System.out.println("This notebook is very cheap.");
        }
        if (this.price >= 600) {
            if (this.price <= 1000) {
                System.out.println("This price is good.");
            } }
            if (this.price > 1000) {
                System.out.println("This notebook is expensive.");
            }
        }
    }