package com.black.tipHandler;

import lombok.Data;

import java.time.LocalDate;

@Data
public class TipRecord {

    private Worker worker;
    private LocalDate date;
    private Boolean isTipSignedOff;

}
