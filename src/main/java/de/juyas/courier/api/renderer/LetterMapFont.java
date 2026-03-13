package de.juyas.courier.api.renderer;

import java.util.Set;

/**
 * Interface LetterMapFont represents a font used in a letter containing all glyphs.
 */
public interface LetterMapFont {

    /**
     * Returns all glyphs contained in this font.
     *
     * @return the glyphs of this font
     */
    Set<LetterGlyph> getGlyphs();

    /**
     * Returns the glyph for the given character.
     *
     * @param character the character to get the glyph for
     * @return the glyph for the given character
     */
    LetterGlyph getGlyph(char character);

    /**
     * Returns the glyph for the given Unicode code point.
     *
     * @param codePoint the code point
     * @return the glyph for the given code point
     */
    LetterGlyph getGlyph(int codePoint);

}
