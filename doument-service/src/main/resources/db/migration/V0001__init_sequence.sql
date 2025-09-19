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
