package com.example.doument_service.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "document_template_package", schema = "doument_service")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentTemplatePackage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String status;
    private String description;
    private String version;

    @ManyToOne
    @JoinColumn(name = "based_on")
    private DocumentTemplatePackage basedOn;

    @OneToMany(mappedBy = "documentTemplatePackage", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<QuestionnaireSection> sections;
}
