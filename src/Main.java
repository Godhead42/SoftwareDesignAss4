public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new FurnitureFactory();

        Furniture chair = factory.createFurniture("Chair");
        Furniture table = factory.createFurniture("Table");
        Furniture sofa = factory.createFurniture("Sofa");

        chair.assemble();
        table.assemble();
        sofa.assemble();

        System.out.println("Assembled a " + chair.getName());
        System.out.println("Assembled a " + table.getName());
        System.out.println("Assembled a " + sofa.getName());

    }
}