public class Turners {
    public static void main(String[] args) {
        Page page = new Page();
        Leaf leaf = new Leaf();
        Pancake pancake = new Pancake();
        man Man = new man();
        door Door = new door();
        System.out.println("The turn() methods for page,leaf,pancake,Man,Door are:");
        page.turn();
        leaf.turn();
        pancake.turn();
        Man.turn();
        Door.turn();
        System.out.println("respectively.");
    }
}
