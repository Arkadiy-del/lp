class Mobile {
    private String brand;
    private String model;

    public Mobile(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
    public void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }

    public static class MobileInfo {
        private int year;
        private int price;

        public MobileInfo(int year, int price) {
            this.year = year;
            this.price = price;
        }
        public void displayMobileInfo() {
            System.out.println("Year of release: " + year);
            System.out.println("Price: " + price);

        }
    }

    public static void main(String[] args) {
        Mobile samsung = new Mobile("Samsung", "Galaxy S22 ultra");
        MobileInfo samsungInfo = new MobileInfo(2023, 57999);
        samsung.displayInfo();
        samsungInfo.displayMobileInfo();

        Mobile apple = new Mobile("Apple", "iPhone 16");
        MobileInfo appleInfo = new MobileInfo(2024, 147999);
        apple.displayInfo();
        appleInfo.displayMobileInfo();
    }
}