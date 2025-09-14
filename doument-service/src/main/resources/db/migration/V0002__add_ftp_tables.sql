-- 1. DocumentTemplatePackage
CREATE TABLE doument_service.document_template_package (
                                                           id BIGINT PRIMARY KEY DEFAULT nextval('doument_service.dtp_id_seq'),
                                                           title VARCHAR(255) NOT NULL,
                                                           status VARCHAR(100),
                                                           description TEXT,
                                                           version VARCHAR(50),
                                                           based_on BIGINT,
                                                           CONSTRAINT fk_based_on FOREIGN KEY (based_on) REFERENCES doument_service.document_template_package (id)
);

-- 2. QuestionnaireSection
CREATE TABLE doument_service.questionnaire_section (
                                                       id BIGINT PRIMARY KEY DEFAULT nextval('doument_service.section_id_seq'),
                                                       title VARCHAR(255) NOT NULL,
                                                       order_num INT NOT NULL,
                                                       document_template_package_id BIGINT NOT NULL,
                                                       CONSTRAINT fk_qs_document_template_package FOREIGN KEY (document_template_package_id)
                                                           REFERENCES doument_service.document_template_package (id) ON DELETE CASCADE
);

-- 3. Questionnaire
CREATE TABLE doument_service.questionnaire (
                                               id BIGINT PRIMARY KEY DEFAULT nextval('doument_service.questionnaire_id_seq'),
                                               title VARCHAR(255) NOT NULL,
                                               is_available BOOLEAN DEFAULT TRUE,
                                               order_num INT NOT NULL,
                                               section_id BIGINT NOT NULL,
                                               CONSTRAINT fk_questionnaire_section FOREIGN KEY (section_id)
                                                   REFERENCES doument_service.questionnaire_section (id) ON DELETE CASCADE
);

-- 4. Property
CREATE TABLE doument_service.property (
                                          id BIGINT PRIMARY KEY DEFAULT nextval('doument_service.property_id_seq'),
                                          name VARCHAR(255) NOT NULL,
                                          value TEXT,
                                          questionnaire_id BIGINT NOT NULL,
                                          CONSTRAINT fk_property_questionnaire FOREIGN KEY (questionnaire_id)
                                              REFERENCES doument_service.questionnaire (id) ON DELETE CASCADE
);
