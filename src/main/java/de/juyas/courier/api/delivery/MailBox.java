package de.juyas.courier.api.delivery;

import de.juyas.courier.api.letter.Letter;
import org.bukkit.inventory.ItemStack;

/**
 * Interface MailBox represents a mailbox of a player.
 */
public interface MailBox {

    /**
     * Delivers the given letter to the mailbox.
     *
     * @param letter the letter to deliver
     * @return true if the letter was successfully delivered, false otherwise
     */
    boolean deliver(Letter letter);

    /**
     * Delivers the given item stack to the mailbox.
     *
     * @param itemStack the item stack to deliver
     * @return true if the item stack was successfully delivered, false otherwise
     */
    boolean deliver(ItemStack itemStack);

    /**
     * Delivers the given delivery to the mailbox.
     *
     * @param delivery the delivery
     * @return true if the delivery was successful, false otherwise
     */
    boolean deliver(Delivery delivery);

    /**
     * Returns true if the mailbox is full.
     *
     * @return true if the mailbox is full, false otherwise
     */
    boolean isFull();

}
