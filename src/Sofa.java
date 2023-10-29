public class Sofa implements Furniture{
    @Override
    public void assemble() {
        System.out.println("Assembling a sofa.");
    }

    @Override
    public String getName() {
        return "Sofa";
    }
}
