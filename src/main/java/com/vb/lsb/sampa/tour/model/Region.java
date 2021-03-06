package com.vb.lsb.sampa.tour.model;

/**
 * Enumeration of the region of Sampa.
 *
 * @author @pedropbazzo
 */
public enum Region {
    Central_Coast("Central Coast"), Southern_Sampa("Southern Sampa"),
    Northern_Sampa("Northern Sampa"), Varies("Varies");
    private String label;

    Region(String label) {
        this.label = label;
    }

    public static Region findByLabel(String byLabel) {
        for (Region r : Region.values()) {
            if (r.label.equalsIgnoreCase(byLabel))
                return r;
        }
        return null;
    }

    public String getLabel() {
        return label;
    }
}
