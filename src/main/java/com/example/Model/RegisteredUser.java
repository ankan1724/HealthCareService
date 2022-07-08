package com.example.Model;

import lombok.*;
import org.springframework.context.annotation.Configuration;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="HEALTHCARE_REGISTERED_USER",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
@Configuration
public class RegisteredUser {
    @Id
    private Long userid;
    private String firstname;
    private String lastname;
    private long contact;
    private String email;
    private String encodedpassword;
    
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name="USER_PATIENT", joinColumns =@JoinColumn(name = "userid", referencedColumnName = "userid"),
    inverseJoinColumns = @JoinColumn(name="patientid",referencedColumnName = "patientid"))
    private List<Long> patientid;
}