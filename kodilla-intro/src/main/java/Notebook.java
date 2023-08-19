public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
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
            }
        }
        if (this.price > 1000) {
            System.out.println("This notebook is expensive.");
        }
    }

    public void checkWeight() {
        if (this.weight < 700) {
            System.out.println("This device is too light.");
        }

        if (this.weight == 1600) {
            System.out.println("This device is not too heavy.");
        }
        if (this.weight > 1600) {
            System.out.println("This device is too heavy.");
        }
    }
    public void checkYear() {
        if (this.year < 2020) {
            System.out.println("This device its not too old.");
        }
        if (this.year > 2000) {
            if (this.year < 2023) {
                System.out.println("This device year production is perfect.");
            }
        }
        if (this.year > 2020) {
            if (this.year <= 2023) {
                System.out.println("This device year production is almost newest.");
            } else {
                    System.out.println("This device is really good.");
            }
        }
    }
}
