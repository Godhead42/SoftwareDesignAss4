public class Chair implements Furniture {
    @Override
    public void assemble() {
        System.out.println("Assembling a chair.");
    }

    @Override
    public String getName() {
        return "Chair";
    }
}
