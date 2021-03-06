package com.vb.lsb.sampa.tour.web;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import com.vb.lsb.sampa.tour.web.LoginDto;

public class LoginDtoTest {

    @Test
    public void testAll() {
        LoginDto dto = new LoginDto("user", "pwd");
        assertThat(dto.getUsername(), is("user"));
        assertThat(dto.getPassword(), is("pwd"));
    }
}