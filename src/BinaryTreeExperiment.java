import java.io.PrintWriter;

/**
 * A place to experiment with binary trees.
 */
public class BinaryTreeExperiment {
  // +------+--------------------------------------------------------
  // | Main |
  // +------+

  public static void main(String[] args) {
    PrintWriter pen = new PrintWriter(System.out, true);

    String[] strings = {"aardvark", "billygoat", "chinchilla", "dingo", "emu",
        "frog", "gnu", "hippo", "iguana", "jackalope", "koala", "llama", /*"moose", "nymph"*/};
    BinaryTree<String> tree = new BinaryTree<String>(strings);

    tree.print(pen);
  } // main
} // class BinaryTreeExperiment
