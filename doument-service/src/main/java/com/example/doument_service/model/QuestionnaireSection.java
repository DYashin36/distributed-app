package com.example.doument_service.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "questionnaire_section", schema = "doument_service")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QuestionnaireSection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private Integer orderNum;

    @ManyToOne
    @JoinColumn(name = "document_template_package_id")
    private DocumentTemplatePackage documentTemplatePackage;

    @OneToMany(mappedBy = "section", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Questionnaire> questionnaires;
}
