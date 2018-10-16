/*
 * @author Guillermo Montes Martos
 * @author xmonte03
 *
 */

package xmonte03.GUI;


/**
 * Enum for setting the execute mode of the application.
 *
 * @author Guillermo Montes Martos
 * @author xmonte03
 * @version 1.0
 */
public enum Mode {
    /** Disables free input typing, checks input correctness, disables complex operators. */
    NOOB,
    /** Disables free input typing, checks input correctness, enables complex operators. */
    GUIDED,
    /** Enable free input typing, doesn't check input correctness, enables complex operators. */
    FREE,
}
