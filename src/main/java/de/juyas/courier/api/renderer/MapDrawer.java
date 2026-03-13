package de.juyas.courier.api.renderer;

import java.awt.*;

/**
 * Interface MapDrawer represents a drawer for a letter.
 */
public interface MapDrawer {

    /**
     * Returns a new drawer view with the given offset drawing to the identical backend.
     *
     * @param xPos   the x offset
     * @param yPos   the y offset
     * @param width  the width of the new drawer view
     * @param height the height of the new drawer view
     * @return the new drawer view
     */
    MapDrawer getOffsetView(int xPos, int yPos, int width, int height);

    /**
     * Draws a pixel at the given position with the given color.
     *
     * @param xPos  the x position
     * @param yPos  the y position
     * @param color the color to draw
     */
    void drawPixel(int xPos, int yPos, Color color);

    /**
     * Returns the width equivalent to the exclusive maximum x value of the letter.
     *
     * @return the width
     */
    int getWidth();

    /**
     * Returns the height equivalent to the exclusive maximum y value of the letter.
     *
     * @return the height
     */
    int getHeight();

}
