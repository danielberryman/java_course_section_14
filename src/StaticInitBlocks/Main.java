package StaticInitBlocks;

public class Main {
    Block1 b1 = new Block1();
    Block2 b2 = new Block2();

    public static void main(String[] args) {
        System.out.println(Block1.i);
        System.out.println("main()");
    }
}
