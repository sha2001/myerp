

CREATE SCHEMA common;
ALTER SCHEMA OWNER TO myerp;

DROP IF EXISTS TABLE  common.dictionary;

CREATE TABLE common.dictionary
(
  id uuid NOT NULL,
  createddate timestamp without time zone,
  deleteddate timestamp without time zone,
  modifieddate timestamp without time zone,
  category character varying(255) NOT NULL,
  code character varying(255) NOT NULL,
  value character varying(255),
  CONSTRAINT dictionary_pkey PRIMARY KEY (id),
  CONSTRAINT uk_swatvmbudh8q8ms3ngqop1y68 UNIQUE (code)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE common.dictionary
  OWNER TO myerp;

  
  
  -- DROP TABLE common.userinfo;

CREATE TABLE common.userinfo
(
  id uuid NOT NULL,
  createddate timestamp without time zone,
  deleteddate timestamp without time zone,
  modifieddate timestamp without time zone,
  active boolean,
  active_from timestamp without time zone,
  active_to timestamp without time zone,
  last_login timestamp without time zone,
  password character varying(255),
  username character varying(255),
  CONSTRAINT userinfo_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE common.userinfo
  OWNER TO myerp;

  
  CREATE TABLE common.role
(
  id uuid NOT NULL,
  createddate timestamp without time zone,
  deleteddate timestamp without time zone,
  modifieddate timestamp without time zone,
  role character varying(255),
  CONSTRAINT role_pkey PRIMARY KEY (id)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE common.role
  OWNER TO myerp;
	
  
  
  
  CREATE TABLE common.userrole
(
  userid uuid NOT NULL,
  roleid uuid NOT NULL,
  CONSTRAINT fk_1wkm7n1qkph4j0iaihjd6q7yd FOREIGN KEY (userid)
      REFERENCES common.userinfo (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT fk_awblcr5ttql9pe8sp9ff2wvcp FOREIGN KEY (roleid)
      REFERENCES common.role (id) MATCH SIMPLE
      ON UPDATE NO ACTION ON DELETE NO ACTION,
  CONSTRAINT uk_awblcr5ttql9pe8sp9ff2wvcp UNIQUE (roleid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE common.userrole
  OWNER TO myerp;
