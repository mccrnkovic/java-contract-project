package model;

import lombok.Data;

import java.util.Date;

@Data
public class Contract {
    String id;
    String customer;
    String number;
    Date paymentDate;
    Date deliveryDueDate;
    String status;
}
