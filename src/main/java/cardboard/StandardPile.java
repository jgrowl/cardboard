package cardboard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * User: jonathan
 * Date: 12/27/11
 * Time: 9:01 PM
 */
public class StandardPile implements Pile {

	/**
	 * Contains all pieces in the pile.
	 */
	protected List<Piece> pieces;

    /**
     * {@inheritDoc}
     */
    public boolean isEmpty() {
        return this.pieces.isEmpty();
    }

    /**
     * {@inheritDoc}
     */
    public Piece remove(int index) {
        return this.pieces.remove(index);
    }

    /**
     * {@inheritDoc}
     */
    public Piece removeFirst() {
        return this.remove(0);
    }

    /**
     * {@inheritDoc}
     */
    public List<Piece> removeAll() {
        List<Piece> removedPieces = new ArrayList<Piece>();
        while (!this.isEmpty()) {
            removedPieces.add(this.removeFirst());
        }

        return removedPieces;
    }

    /**
     * {@inheritDoc}
     */
    public void transfer(Pile pile) {
		if (pile == null) {
			throw new NullPointerException("Cannot transfer pieces from an empty pile.");
		}

		this.pieces.addAll(pile.removeAll());
    }

    /**
     * {@inheritDoc}
     */
    public void add(Piece piece) {
		if (piece == null) {
			throw new NullPointerException("Cannot add null pieces to a pile.");
		}

		this.pieces.add(piece);
    }

    /**
     * {@inheritDoc}
     */
    public void addAll(List<Piece> pieces) {
        if (pieces == null) {
            throw new NullPointerException("Cannot add null pieces to pile.");
        }

        this.pieces.addAll(pieces);
    }

    /**
     * {@inheritDoc}
     */
    public void shuffle() {
        Collections.shuffle(pieces);
    }

    /**
     * {@inheritDoc}
     */
    public Iterator<Piece> iterator() {
        return pieces.iterator();
    }

}
