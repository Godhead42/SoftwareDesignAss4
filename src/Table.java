public class Table implements Furniture{
    @Override
    public void assemble() {
        System.out.println("Assembling a table.");
    }

    @Override
    public String getName() {
        return "Table";
    }
}
