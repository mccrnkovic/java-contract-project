package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@Entity
public class Contract {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;
    private String customer;
    private String number;
    private Date paymentDate;
    private Date deliveryDueDate;
    private String status;
}
