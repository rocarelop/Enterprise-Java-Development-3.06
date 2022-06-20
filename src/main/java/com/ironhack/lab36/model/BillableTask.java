package com.ironhack.lab36.model;

import javax.persistence.Entity;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class BillableTask extends Tasks {
    private BigDecimal hourlyRate;

    public BillableTask() {
    }

    public BillableTask(String title, Date dueDate, boolean status, BigDecimal hourlyRate) {
        super(title, dueDate, status);
        this.hourlyRate = hourlyRate;
    }

    public BigDecimal getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(BigDecimal hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
}
