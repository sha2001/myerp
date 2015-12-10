
CREATE SCHEMA common;

CREATE TABLE coomon.dictionary
(
  id uuid NOT NULL,
  CONSTRAINT dictionary_pkey PRIMARY KEY (id)

)
WITH (
  OIDS=FALSE
);
ALTER TABLE common.dictionary
  OWNER TO myerp;
