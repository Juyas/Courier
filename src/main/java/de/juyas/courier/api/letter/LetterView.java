package de.juyas.courier.api.letter;

/**
 * Interface LetterView represents a view of a letter.
 */
public interface LetterView {

    /**
     * Returns the letter instance of this view.
     *
     * @return the letter
     */
    Letter getLetter();

    /**
     * Returns the page count of this view.
     *
     * @return the page count
     */
    int getPageCount();

    /**
     * Returns the page view for the given page.
     *
     * @param page the page
     * @return the page view of the given page
     */
    LetterPageView getPage(int page);

}
