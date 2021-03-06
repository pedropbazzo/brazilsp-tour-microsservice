package com.vb.lsb.sampa.tour.model;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import com.vb.lsb.sampa.tour.model.Region;
import com.vb.lsb.sampa.tour.model.RegionConverter;

/**
 * @author pedropbazzo
 */
public class RegionConverterTest {
    private RegionConverter converter = new RegionConverter();

    @Test
    public void convertToDatabaseColumn() throws Exception {
        assertThat(converter.convertToDatabaseColumn(Region.Central_Coast), is(Region.Central_Coast.getLabel()));
    }

    @Test
    public void convertToEntityAttribute() throws Exception {
        assertThat(converter.convertToEntityAttribute(Region.Central_Coast.getLabel()), is(Region.Central_Coast));
    }

}