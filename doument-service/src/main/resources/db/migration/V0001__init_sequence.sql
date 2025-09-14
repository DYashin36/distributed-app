-- DTP
CREATE SEQUENCE IF NOT EXISTS doument_service.dtp_id_seq START 1 CACHE 20;
ALTER SEQUENCE doument_service.dtp_id_seq OWNER TO CURRENT_USER;

-- SECTION
CREATE SEQUENCE IF NOT EXISTS doument_service.section_id_seq START 1 CACHE 20;
ALTER SEQUENCE doument_service.section_id_seq OWNER TO CURRENT_USER;

-- QUESTIONNAIRE
CREATE SEQUENCE IF NOT EXISTS doument_service.questionnaire_id_seq START 1 CACHE 20;
ALTER SEQUENCE doument_service.questionnaire_id_seq OWNER TO CURRENT_USER;

-- PROPERTY
CREATE SEQUENCE IF NOT EXISTS doument_service.property_id_seq START 1 CACHE 20;
ALTER SEQUENCE doument_service.property_id_seq OWNER TO CURRENT_USER;

-- Если таблицы уже существуют – меняем default для PK
ALTER TABLE doument_service.document_template_package
    ALTER COLUMN id SET DEFAULT nextval('doument_service.dtp_id_seq');

ALTER TABLE doument_service.questionnaire_section
    ALTER COLUMN id SET DEFAULT nextval('doument_service.section_id_seq');

ALTER TABLE doument_service.questionnaire
    ALTER COLUMN id SET DEFAULT nextval('doument_service.questionnaire_id_seq');

ALTER TABLE doument_service.property
    ALTER COLUMN id SET DEFAULT nextval('doument_service.property_id_seq');