package com.example.doument_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "questionnaire", schema = "doument_service")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Questionnaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Boolean isAvailable = true;
    private Integer orderNum;

    @ManyToOne
    @JoinColumn(name = "section_id")
    private QuestionnaireSection section;

    @OneToMany(mappedBy = "questionnaire", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Property> properties;
}
