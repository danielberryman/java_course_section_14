package StaticInitBlocks;

public class Block1 {
    static int i;

    static {
        i = 10;
        System.out.println("Block 1");
    }
}
