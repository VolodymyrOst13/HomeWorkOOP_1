package Task5;

public class Main {
    public static void main(String[] args) {
        Address myAddress = new Address(1200, "Austria", "Vienna", "Stephansplatz", 7, 3);

        int myIndex = myAddress.getIndex();
        String myCountry = myAddress.getCountry();
        String myCity = myAddress.getCity();
        String myStreet = myAddress.getStreet();
        int myHouse = myAddress.getHouse();
        int myApartment = myAddress.getApartment();

        System.out.println("Volodymyr's address: \n" + "Index - " + myIndex + "\n" + "Country - " + myCountry + "\n" + "City - " + myCity
                + "\n" + "Street - " + myStreet + "\n" + "House - " + myHouse + "\n" + "Apartment - " + myApartment);

        Address oldAdress = new Address();
        int oldIndex = oldAdress.setIndex(79000);
        String oldCountry = oldAdress.setCountry("Ukraine");
        String oldCity = oldAdress.setCity("Lviv");
        String oldStreet = oldAdress.setStreet("Rynok square");
        int oldHouse = oldAdress.setHouse(30);

        System.out.println();
        System.out.println("Volodymyr's old address: \n" + "Index - " + oldIndex + "\n" + "Country - " + oldCountry + "\n" + "City - " + oldCity
                + "\n" + "Street - " + oldStreet + "\n" + "House - " + oldHouse + "\n");

    }
}
