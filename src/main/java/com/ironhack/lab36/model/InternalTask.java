package com.ironhack.lab36.model;
import javax.persistence.Entity;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@PrimaryKeyJoinColumn(name = "id")
public class InternalTask extends Tasks {

    public InternalTask() {
    }

    public InternalTask(String title, Date dueDate, boolean status) {
        super(title, dueDate, status);
    }

}
