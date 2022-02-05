package practice.java.advance;

import java.util.ArrayList;

enum Color {
	RED, GREEN
}

class FancyVisitor extends TreeVis {
	@Override
	public int getResult() {
		// implement this
		return 0;
	}

	@Override
	public void visitLeaf(TreeLeaf leaf) {
		// implement this
	}

	@Override
	public void visitNode(TreeNode node) {
		// implement this
	}
}

public class JavaVisitorPattern {

	public static void main(String[] args) {
		Tree root = solve();
		SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
		ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
		FancyVisitor vis3 = new FancyVisitor();

		root.accept(vis1);
		root.accept(vis2);
		root.accept(vis3);

		int res1 = vis1.getResult();
		int res2 = vis2.getResult();
		int res3 = vis3.getResult();

		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
	}

	public static Tree solve() {
		return null;
		// read the tree from STDIN and return its root as a return value of this
		// function
	}
}

class ProductOfRedNodesVisitor extends TreeVis {
	@Override
	public int getResult() {
		// implement this
		return 1;
	}

	@Override
	public void visitLeaf(TreeLeaf leaf) {
		// implement this
	}

	@Override
	public void visitNode(TreeNode node) {
		// implement this
	}
}

class SumInLeavesVisitor extends TreeVis {
	@Override
	public int getResult() {
		// implement this
		return 0;
	}

	@Override
	public void visitLeaf(TreeLeaf leaf) {
		// implement this
	}

	@Override
	public void visitNode(TreeNode node) {
		// implement this
	}
}

abstract class Tree {

	private int value;
	private Color color;
	private int depth;

	public Tree(int value, Color color, int depth) {
		this.value = value;
		this.color = color;
		this.depth = depth;
	}

	public abstract void accept(TreeVis visitor);

	public Color getColor() {
		return color;
	}

	public int getDepth() {
		return depth;
	}

	public int getValue() {
		return value;
	}
}

class TreeLeaf extends Tree {

	public TreeLeaf(int value, Color color, int depth) {
		super(value, color, depth);
	}

	@Override
	public void accept(TreeVis visitor) {
		visitor.visitLeaf(this);
	}
}

class TreeNode extends Tree {

	private ArrayList<Tree> children = new ArrayList<>();

	public TreeNode(int value, Color color, int depth) {
		super(value, color, depth);
	}

	@Override
	public void accept(TreeVis visitor) {
		visitor.visitNode(this);

		for (Tree child : children) {
			child.accept(visitor);
		}
	}

	public void addChild(Tree child) {
		children.add(child);
	}
}

abstract class TreeVis {
	public abstract int getResult();

	public abstract void visitLeaf(TreeLeaf leaf);

	public abstract void visitNode(TreeNode node);

}