package de.juyas.courier.api.letter;

import net.kyori.adventure.text.Component;
import org.bukkit.World;

import java.time.LocalDateTime;
import java.util.Optional;

/**
 * Interface Letter represents a letter instance as raw data.
 */
public interface Letter {

    /**
     * Returns the letter underlying this letter.
     * <br>
     * This may return an empty optional if this instance is already the original letter.
     * <br>
     * In each step, the letter instance will get decorated with new modifications, this method will retrieve the
     * letter instance before the latest modifications.
     *
     * @return the original letter
     */
    Optional<Letter> getOriginal();

    /**
     * Returns the raw unformatted text of this letter.
     *
     * @return the raw unformatted text
     */
    String getRawText();

    /**
     * Returns the style of this letter.
     *
     * @return the style
     */
    LetterStyle getStyle();

    /**
     * Returns the accessor of this letter for the given type.
     *
     * @param type the type of the accessor in regard to the letter
     * @return the accessor
     */
    Optional<LetterAccessor> getAccessor(LetterAccessorType type);

    /**
     * Returns the name of the accessor for the given type.
     *
     * @param type the type of the accessor in regard to the letter
     * @return the name of the accessor
     */
    Optional<Component> getAccessorName(LetterAccessorType type);

    /**
     * Returns the delivery date of this letter.
     *
     * @return the delivery date
     */
    Optional<LocalDateTime> getDeliveryDate();

    /**
     * Returns the world this letter was sent from.
     *
     * @return the source world
     */
    World getSourceWorld();

    /**
     * Returns the view of this letter.
     *
     * @param accessor the accessor for the view
     * @return the view
     */
    LetterView getView(LetterAccessor accessor);

}
