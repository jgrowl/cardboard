package cardboard;

import java.util.List;

/**
 * Represents a Pile of pieces
 * <p/>
 * User: jonathan
 * Date: 12/27/11
 * Time: 8:46 PM
 */
public interface Pile extends Iterable<Piece> {

    /**
     * Determines if a pile still has pieces remaining in it.
     *
     * @return true if the pile still has pieces in it, false otherwise.
     */
    public boolean isEmpty();

    /**
     * Pops a piece from a specified index in the pile.
     * <p/>
     * Pre-condition: There must be a piece that exists at the specified index.
     *
     * @param index The index of the piece to be drawn.
     * @return A piece.
     */
    public Piece remove(int index);

    /**
     * Pops a piece from the top of the pile.
     * <p/>
     * Pre-conditions: The pile must not be empty.
     *
     * @return A piece.
     */
    public Piece removeFirst();

    /**
     * Pops all pieces from the pile.
     * <p/>
     * Post-conditions: The pile will be empty.
     *
     * @return All of the pieces in the pile.
     */
    public List<Piece> removeAll();

    /**
     * Moves pieces from a specified pile to this pile.
     * <p/>
     * Post-conditions: Pieces will be added to this CardPile, but will not remain
     * in passed CardPile.
     *
     * @param pile The pile we are transferring.
     */
    public void transfer(Pile pile);

    /**
     * Adds a single piece to the pile.
     *
     * @param piece The piece to be added.
     */
    public void add(Piece piece);

    /**
     * Adds all specified pieces to the pile.
     *
     * @param pieces The pieces to add.
     */
    public void addAll(List<Piece> pieces);

    /**
     * Shuffles the pile.
     */
    public void shuffle();


}