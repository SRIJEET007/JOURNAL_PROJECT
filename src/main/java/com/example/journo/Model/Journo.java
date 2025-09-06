package com.example.journo.Model;
import ch.qos.logback.classic.pattern.ClassOfCallerConverter;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "journals")
public class Journo
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ID;

    private String title;
    private String content;
    private LocalDateTime CreatedAt;
    private LocalDateTime UpdatedAt;

    @PrePersist
    protected void onCreate()
    {
        this.CreatedAt= LocalDateTime.now();
    }

    @PreUpdate
    protected void onUpdate()
    {
        this.UpdatedAt=LocalDateTime.now();
    }

}
