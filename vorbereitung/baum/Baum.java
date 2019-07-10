package baum;

public class Baum<T extends Comparable<T>> {

    static class Element<T> {
        Element<T> left;
        Element<T> right;
        T value;

        public Element(T value) {
            this.value = value;
        }
    }

    private Element<T> root;

    public void add(T value) {
        if(root == null) {
            root = new Element<>(value);
            return;
        }

        boolean left = Math.random() > 0.5;

        Element<T> currentNode = root;
        while (true) {
            if(left) {
                if(currentNode.left == null) {
                    currentNode.left = new Element<>(value);
                    break;
                }
                currentNode = currentNode.left;
            } else {
                if(currentNode.right == null) {
                    currentNode.right = new Element<>(value);
                    break;
                }
                currentNode = currentNode.right;
            }

        }

    }

}
