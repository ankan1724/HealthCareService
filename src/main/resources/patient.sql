create table PATIENT_DETAILS
(
userid number(19,0) NOT NULL,
patientid varchar(2000) NOT NULL,
firstname  varchar(2000) NOT NULL,
lastname varchar(2000) NOT NULL,
admissiondate timestamp NOT NULL,
ailment varchar(2000) NOT NULL,
contact varchar(2000) NOT NULL,
primary key(patientid),
CONSTRAINT HEALTHCARE_REGISTERED_USER_fk FOREIGN KEY(userid) REFERENCES HEALTHCARE_REGISTERED_USER(userid)

);