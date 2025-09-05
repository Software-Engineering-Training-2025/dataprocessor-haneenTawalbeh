package org.example.dataprocessor.enums;

import java.util.List;

public enum CleaningType {
    /** Drop all values < 0 */
    REMOVE_NEGATIVES,

    /** Replace all values < 0 with 0 */
    REPLACE_NEGATIVES_WITH_ZERO;


}