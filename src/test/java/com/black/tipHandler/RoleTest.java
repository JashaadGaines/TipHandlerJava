package com.black.tipHandler;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RoleTest {

    @Test
    public void shouldGetTipPercentageForRole(){

        Role bar = Role.BAR;
        Role busser = Role.BUSSER_KITCHEN_GROUP;
        Role cook = Role.COOK;
        Role server = Role.SERVER;
        Role samurai = Role.SAMURAI;

        assertThat(bar.getTipPercentage()).isEqualTo(.0225);
        assertThat(busser.getTipPercentage()).isEqualTo(.1);
        assertThat(cook.getTipPercentage()).isEqualTo(.5);
        assertThat(server.getTipPercentage()).isEqualTo(.35);
        assertThat(samurai.getTipPercentage()).isEqualTo(.0275);
    }

    @Test
    public void tipPercentagesShouldSumToEqualOne() {

        double rolePercentageTotal = 0 ;
        for(Role role: Role.values()){
            rolePercentageTotal+=role.getTipPercentage();
        }
        assertThat(rolePercentageTotal).isEqualTo(1.0);
    }
}