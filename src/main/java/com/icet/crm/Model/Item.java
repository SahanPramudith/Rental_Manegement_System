package com.icet.crm.Model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Item {
    private Integer id;
    private String name;
    private String avalability;
    private LocalDateTime fineperday;
    private LocalDateTime pentalperday;
}
