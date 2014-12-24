package com.black.tipHandler;

import lombok.Data;

    @Data
    public class Worker {

        private String name;

        private enum Role {
            COOK(.50),
            SERVER(.35),
            BAR(.0225),
            BUSSER_KITCHEN_GROUP(.1),
            SAMURAI(2.75);

            double tipPercentage;

            private Role (double tipPercentage){
                this.tipPercentage = tipPercentage;
            }

            public double getTipPercentage(){return tipPercentage;}
        };

    }
