public class FurnitureFactory {
    public Furniture createFurniture(String furnitureType) {
        if (furnitureType.equalsIgnoreCase("Chair")) {
            return new Chair();
        }
    else if (furnitureType.equalsIgnoreCase("Table")) {
            return new Table();
        }
    else if (furnitureType.equalsIgnoreCase("Sofa")) {
            return new Sofa();
        }
        return null;
    }
}
