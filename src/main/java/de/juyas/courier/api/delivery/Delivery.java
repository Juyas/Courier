package de.juyas.courier.api.delivery;

import de.juyas.courier.api.letter.Letter;
import org.bukkit.inventory.ItemStack;

import java.util.Set;

/**
 * Interface Delivery represents an entire delivery.
 */
public interface Delivery {

    /**
     * Returns all letters contained in this delivery.
     *
     * @return the letters
     */
    Set<Letter> getLetters();

    /**
     * Returns all attachments contained in this delivery.
     *
     * @return the attachments
     */
    Set<ItemStack> getAttachments();

}
