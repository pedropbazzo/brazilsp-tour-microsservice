package com.vb.lsb.sampa.tour.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 * Hibernate Converter for the Region Enum to DB Column.
 * <p>
 *
 * @author pedropbazzo
 */
@Converter(autoApply = true)
public class RegionConverter implements AttributeConverter<Region, String> {
    @Override
    public String convertToDatabaseColumn(Region region) {
        return region.getLabel();
    }

    @Override
    public Region convertToEntityAttribute(String s) {
        return Region.findByLabel(s);
    }
}
