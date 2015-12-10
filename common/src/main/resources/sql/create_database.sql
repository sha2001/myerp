
CREATE SCHEMA common;

CREATE TABLE common.dictionary
(
  id uuid NOT NULL,
  createddate timestamp with time zone,
  modifieddate timestamp with time zone,
  deleteddate timestamp with time zone,
  code varchar(16) not null,
  category varchar(32) not null,
  value varchar(256)
  CONSTRAINT dictionary_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE common.dictionary
  OWNER TO myerp;
