package com.black.tipHandler;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;


public class WorkerTest {

    @Test
    public void shouldSetNameAndRole(){

         Worker worker = new Worker();
         worker.setName("Jessie James");
         worker.setRole(Role.SAMURAI);

        assertThat(worker.getName()).isEqualTo("Jessie James");
        assertThat(worker.getRole()).isEqualTo(Role.SAMURAI);
    }


}