package us.spectr.cardboard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * User: jonathan
 * Date: 12/27/11
 * Time: 9:01 PM
 */
public class PiecePile implements Pile<Piece> {

	/**
	 * Contains all pieces in the pile.
	 */
	protected List<Piece> mPieces;

    public PiecePile(List<Piece> mPieces) {
        this.mPieces = mPieces;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isEmpty() {
        return mPieces.isEmpty();
    }

    /**
     * {@inheritDoc}
     */
    public Piece remove(int index) {
        return mPieces.remove(index);
    }

    /**
     * {@inheritDoc}
     */
    public Piece removeFirst() {
        return remove(0);
    }

    /**
     * {@inheritDoc}
     */
    public List<Piece> removeAll() {
        List<Piece> removedPieces = mPieces;
        mPieces = new ArrayList<Piece>();
        return removedPieces;
    }

    /**
     * {@inheritDoc}
     */
    public void transfer(Pile pile) {
		if (pile == null) {
			throw new NullPointerException("Cannot transfer pieces from an empty pile.");
		}

		mPieces.addAll(pile.removeAll());
    }

    /**
     * {@inheritDoc}
     */
    public void add(Piece piece) {
		if (piece == null) {
			throw new NullPointerException("Cannot add null pieces to a pile.");
		}

		mPieces.add(piece);
    }

    /**
     * {@inheritDoc}
     */
    public void addAll(List<Piece> pieces) {
        if (pieces == null) {
            throw new NullPointerException("Cannot add null pieces to pile.");
        }

        mPieces.addAll(pieces);
    }

    /**
     * {@inheritDoc}
     */
    public void shuffle() {
        Collections.shuffle(mPieces);
    }

    /**
     * {@inheritDoc}
     */
    public Iterator<Piece> iterator() {
        return mPieces.iterator();
    }

}
