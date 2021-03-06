package com.vb.lsb.sampa.tour.model;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

import com.vb.lsb.sampa.tour.model.Region;

/**
 * @author pedropbazzo
 */
public class RegionTest {
    @Test
    public void findByLabel() throws Exception {
        assertThat(Region.Central_Coast, is(Region.findByLabel("Central Coast")));
        assertThat(Region.Northern_Sampa, is(Region.findByLabel("Northern Sampa")));
        assertThat(Region.Southern_Sampa, is(Region.findByLabel("Southern Sampa")));
        assertThat(Region.Varies, is(Region.findByLabel("Varies")));
    }

    @Test
    public void getLabel() throws Exception {
        assertThat(Region.Central_Coast.getLabel(), is("Central Coast"));
        assertThat(Region.Northern_Sampa.getLabel(), is("Northern Sampa"));
        assertThat(Region.Southern_Sampa.getLabel(), is("Southern Sampa"));
        assertThat(Region.Varies.getLabel(), is("Varies"));
    }

}