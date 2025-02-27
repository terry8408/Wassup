package com.example.demo.model;

import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import org.hibernate.annotations.GenericGenerator;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name = "Schedule")
public class ScheduleEntity {
    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy="uuid")
    private String orginKey;
    private String name;
    private String start;
    private String end;
    private String creatorId;
    private String memo;
    private Boolean notification;
    private Boolean allDayToggle ;
    private String lastModifiedAt;
    private String createdAt;
}
