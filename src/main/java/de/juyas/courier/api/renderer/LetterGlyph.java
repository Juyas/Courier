package de.juyas.courier.api.renderer;

/**
 * Interface LetterGlyph represents a glyph used in a letter.
 */
public interface LetterGlyph {

    /**
     * Returns the width of the glyph in pixels.
     *
     * @return the width of the glyph
     */
    int getWidth();

    /**
     * Returns the height of the glyph in pixels.
     *
     * @return the height of the glyph
     */
    int getHeight();

    /**
     * Draws the glyph on the given drawer at [0,0].
     *
     * @param drawer the drawer to draw on
     */
    void draw(MapDrawer drawer);

}
