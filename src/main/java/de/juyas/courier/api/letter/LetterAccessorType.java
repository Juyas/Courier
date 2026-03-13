package de.juyas.courier.api.letter;

/**
 * Enum LetterAccessorType
 */
public enum LetterAccessorType {

    /**
     * The sender of a letter is the creator of the letter who initiated the delivery.
     */
    SENDER,
    /**
     * The recipient of a letter is receiving the letter by delivery.
     */
    RECIPIENT,
    /**
     * The sealer of a letter has sealed the letter without sending it.
     */
    SEALER,
    /**
     * The unsealer of a letter has removed the seal from the letter.
     */
    UNSEALER

}
