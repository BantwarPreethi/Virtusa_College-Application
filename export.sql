--------------------------------------------------------
--  File created - Wednesday-October-02-2019   
--------------------------------------------------------
DROP TABLE "VIDHYA"."ALUMNI" cascade constraints;
DROP TABLE "VIDHYA"."CLASS_ROOM" cascade constraints;
DROP TABLE "VIDHYA"."COURSE" cascade constraints;
DROP TABLE "VIDHYA"."DEPARTMENT" cascade constraints;
DROP TABLE "VIDHYA"."EXAM_SCHEDULE" cascade constraints;
DROP TABLE "VIDHYA"."FACULTY" cascade constraints;
DROP TABLE "VIDHYA"."PLACEMENT_CALENDER" cascade constraints;
DROP TABLE "VIDHYA"."RESULTS" cascade constraints;
DROP TABLE "VIDHYA"."STUDENT" cascade constraints;
DROP TABLE "VIDHYA"."TIME_TABLE_CSE" cascade constraints;
DROP TABLE "VIDHYA"."TIME_TABLE_ECE" cascade constraints;
DROP TABLE "VIDHYA"."TIME_TABLE_EEE" cascade constraints;
DROP TABLE "VIDHYA"."TIME_TABLE_IT" cascade constraints;
DROP SEQUENCE "VIDHYA"."APPLICATIONSEQ";
--------------------------------------------------------
--  DDL for Table ALUMNI
--------------------------------------------------------

  CREATE TABLE "VIDHYA"."ALUMNI" 
   (	"ALUMNI_ID" NUMBER(6,0), 
	"FIRST_NAME" VARCHAR2(20 BYTE), 
	"LAST_NAME" VARCHAR2(20 BYTE), 
	"PHONE_NUMBER" NUMBER(20,0), 
	"EMAIL_ID" VARCHAR2(30 BYTE), 
	"DATE_OF_BIRTH" DATE, 
	"COURSE_ID" NUMBER(10,0), 
	"GENDER" VARCHAR2(8 BYTE), 
	"YEAR_OF_COMPLETION" DATE, 
	"PRESENT_STATUS" VARCHAR2(30 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table CLASS_ROOM
--------------------------------------------------------

  CREATE TABLE "VIDHYA"."CLASS_ROOM" 
   (	"CLASS_ROOM_NO" VARCHAR2(12 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table COURSE
--------------------------------------------------------

  CREATE TABLE "VIDHYA"."COURSE" 
   (	"COURSE_ID" NUMBER(6,0), 
	"COURSE_NAME" VARCHAR2(10 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table DEPARTMENT
--------------------------------------------------------

  CREATE TABLE "VIDHYA"."DEPARTMENT" 
   (	"DEPARTMENT_ID" NUMBER(8,0), 
	"DEPARTMENT_NAME" VARCHAR2(15 BYTE), 
	"DEPARTMENT_ROOMNUMBER" VARCHAR2(5 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table EXAM_SCHEDULE
--------------------------------------------------------

  CREATE TABLE "VIDHYA"."EXAM_SCHEDULE" 
   (	"EXAM_ID" NUMBER(7,0), 
	"EXAM_TYPE" VARCHAR2(15 BYTE), 
	"EXAM_DATE" DATE, 
	"SUBJECT_NAME" VARCHAR2(18 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table FACULTY
--------------------------------------------------------

  CREATE TABLE "VIDHYA"."FACULTY" 
   (	"FACULTY_ID" NUMBER(6,0), 
	"FACULTY_NAME" VARCHAR2(25 BYTE), 
	"FACULTY_DEPARTMENT" VARCHAR2(6 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table PLACEMENT_CALENDER
--------------------------------------------------------

  CREATE TABLE "VIDHYA"."PLACEMENT_CALENDER" 
   (	"COMPANY_ID" NUMBER(15,0), 
	"COMPANY_NAME" VARCHAR2(30 BYTE), 
	"DRIVE_DATE" DATE
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table RESULTS
--------------------------------------------------------

  CREATE TABLE "VIDHYA"."RESULTS" 
   (	"STUDENT_ID" NUMBER(8,0), 
	"SUBJECT_NAME" VARCHAR2(20 BYTE), 
	"MARKS" NUMBER(20,0), 
	"PERCENTAGE" NUMBER(20,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table STUDENT
--------------------------------------------------------

  CREATE TABLE "VIDHYA"."STUDENT" 
   (	"STUDENT_ID" NUMBER(10,0), 
	"FIRST_NAME" VARCHAR2(15 BYTE), 
	"LAST_NAME" VARCHAR2(15 BYTE), 
	"PHONE_NUMBER" NUMBER(15,0), 
	"CLASS_ROOM_NO" VARCHAR2(12 BYTE), 
	"EMAIL_ID" VARCHAR2(20 BYTE), 
	"DATE_OF_BIRTH" DATE, 
	"COURSE_ID" NUMBER(8,0), 
	"DEPARTMENT_ID" NUMBER(3,0)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table TIME_TABLE_CSE
--------------------------------------------------------

  CREATE TABLE "VIDHYA"."TIME_TABLE_CSE" 
   (	"DAY_OF_WEEK_CSE" VARCHAR2(20 BYTE), 
	"FIRST_HOUR" VARCHAR2(20 BYTE), 
	"SECOND_HOUR" VARCHAR2(20 BYTE), 
	"THIRD_HOUR" VARCHAR2(20 BYTE), 
	"LUNCH_BREAK" VARCHAR2(20 BYTE), 
	"FOURTH_HOUR" VARCHAR2(20 BYTE), 
	"FIFTH_HOUR" VARCHAR2(20 BYTE), 
	"SIXTH_HOUR" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table TIME_TABLE_ECE
--------------------------------------------------------

  CREATE TABLE "VIDHYA"."TIME_TABLE_ECE" 
   (	"DAY_OF_WEEK" VARCHAR2(20 BYTE), 
	"FIRST_HOUR" VARCHAR2(20 BYTE), 
	"SECOND_HOUR" VARCHAR2(20 BYTE), 
	"THIRD_HOUR" VARCHAR2(20 BYTE), 
	"LUNCH_BREAK" VARCHAR2(20 BYTE), 
	"FOURTH_HOUR" VARCHAR2(20 BYTE), 
	"FIFTH_HOUR" VARCHAR2(20 BYTE), 
	"SIXTH_HOUR" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table TIME_TABLE_EEE
--------------------------------------------------------

  CREATE TABLE "VIDHYA"."TIME_TABLE_EEE" 
   (	"DAY_OF_WEEK_EEE" VARCHAR2(20 BYTE), 
	"FIRST_HOUR" VARCHAR2(20 BYTE), 
	"SECOND_HOUR" VARCHAR2(20 BYTE), 
	"THIRD_HOUR" VARCHAR2(20 BYTE), 
	"LUNCH_BREAK" VARCHAR2(20 BYTE), 
	"FOURTH_HOUR" VARCHAR2(20 BYTE), 
	"FIFTH_HOUR" VARCHAR2(20 BYTE), 
	"SIXTH_HOUR" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Table TIME_TABLE_IT
--------------------------------------------------------

  CREATE TABLE "VIDHYA"."TIME_TABLE_IT" 
   (	"DAY_OF_WEEK_IT" VARCHAR2(20 BYTE), 
	"FIRST_HOUR" VARCHAR2(20 BYTE), 
	"SECOND_HOUR" VARCHAR2(20 BYTE), 
	"THIRD_HOUR" VARCHAR2(20 BYTE), 
	"LUNCH_BREAK" VARCHAR2(20 BYTE), 
	"FOURTH_HOUR" VARCHAR2(20 BYTE), 
	"FIFTH_HOUR" VARCHAR2(20 BYTE), 
	"SIXTH_HOUR" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Sequence APPLICATIONSEQ
--------------------------------------------------------

   CREATE SEQUENCE  "VIDHYA"."APPLICATIONSEQ"  MINVALUE 10000 MAXVALUE 100000 INCREMENT BY 1 START WITH 10000 CACHE 20 NOORDER  NOCYCLE ;
REM INSERTING into VIDHYA.ALUMNI
SET DEFINE OFF;
REM INSERTING into VIDHYA.CLASS_ROOM
SET DEFINE OFF;
REM INSERTING into VIDHYA.COURSE
SET DEFINE OFF;
REM INSERTING into VIDHYA.DEPARTMENT
SET DEFINE OFF;
REM INSERTING into VIDHYA.EXAM_SCHEDULE
SET DEFINE OFF;
REM INSERTING into VIDHYA.FACULTY
SET DEFINE OFF;
REM INSERTING into VIDHYA.PLACEMENT_CALENDER
SET DEFINE OFF;
REM INSERTING into VIDHYA.RESULTS
SET DEFINE OFF;
REM INSERTING into VIDHYA.STUDENT
SET DEFINE OFF;
REM INSERTING into VIDHYA.TIME_TABLE_CSE
SET DEFINE OFF;
REM INSERTING into VIDHYA.TIME_TABLE_ECE
SET DEFINE OFF;
REM INSERTING into VIDHYA.TIME_TABLE_EEE
SET DEFINE OFF;
REM INSERTING into VIDHYA.TIME_TABLE_IT
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index PK_COURSE
--------------------------------------------------------

  CREATE UNIQUE INDEX "VIDHYA"."PK_COURSE" ON "VIDHYA"."COURSE" ("COURSE_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_APPLICATION
--------------------------------------------------------

  CREATE UNIQUE INDEX "VIDHYA"."PK_APPLICATION" ON "VIDHYA"."DEPARTMENT" ("DEPARTMENT_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_CLASS
--------------------------------------------------------

  CREATE UNIQUE INDEX "VIDHYA"."PK_CLASS" ON "VIDHYA"."CLASS_ROOM" ("CLASS_ROOM_NO") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_RESULTS
--------------------------------------------------------

  CREATE UNIQUE INDEX "VIDHYA"."PK_RESULTS" ON "VIDHYA"."RESULTS" ("STUDENT_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_TIMETABLE_CSE
--------------------------------------------------------

  CREATE UNIQUE INDEX "VIDHYA"."PK_TIMETABLE_CSE" ON "VIDHYA"."TIME_TABLE_CSE" ("DAY_OF_WEEK_CSE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_TIMETABLE_IT
--------------------------------------------------------

  CREATE UNIQUE INDEX "VIDHYA"."PK_TIMETABLE_IT" ON "VIDHYA"."TIME_TABLE_IT" ("DAY_OF_WEEK_IT") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_TIMETABLE
--------------------------------------------------------

  CREATE UNIQUE INDEX "VIDHYA"."PK_TIMETABLE" ON "VIDHYA"."TIME_TABLE_ECE" ("DAY_OF_WEEK") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_TIMETABLE_EEE
--------------------------------------------------------

  CREATE UNIQUE INDEX "VIDHYA"."PK_TIMETABLE_EEE" ON "VIDHYA"."TIME_TABLE_EEE" ("DAY_OF_WEEK_EEE") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_PLACEMENT
--------------------------------------------------------

  CREATE UNIQUE INDEX "VIDHYA"."PK_PLACEMENT" ON "VIDHYA"."PLACEMENT_CALENDER" ("COMPANY_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_STUDENT
--------------------------------------------------------

  CREATE UNIQUE INDEX "VIDHYA"."PK_STUDENT" ON "VIDHYA"."STUDENT" ("STUDENT_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_EXAM
--------------------------------------------------------

  CREATE UNIQUE INDEX "VIDHYA"."PK_EXAM" ON "VIDHYA"."EXAM_SCHEDULE" ("EXAM_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_ALUMNI
--------------------------------------------------------

  CREATE UNIQUE INDEX "VIDHYA"."PK_ALUMNI" ON "VIDHYA"."ALUMNI" ("ALUMNI_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Index PK_FACULTY
--------------------------------------------------------

  CREATE UNIQUE INDEX "VIDHYA"."PK_FACULTY" ON "VIDHYA"."FACULTY" ("FACULTY_ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table FACULTY
--------------------------------------------------------

  ALTER TABLE "VIDHYA"."FACULTY" ADD CONSTRAINT "PK_FACULTY" PRIMARY KEY ("FACULTY_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table TIME_TABLE_ECE
--------------------------------------------------------

  ALTER TABLE "VIDHYA"."TIME_TABLE_ECE" ADD CONSTRAINT "PK_TIMETABLE" PRIMARY KEY ("DAY_OF_WEEK")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table EXAM_SCHEDULE
--------------------------------------------------------

  ALTER TABLE "VIDHYA"."EXAM_SCHEDULE" ADD CONSTRAINT "PK_EXAM" PRIMARY KEY ("EXAM_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table TIME_TABLE_CSE
--------------------------------------------------------

  ALTER TABLE "VIDHYA"."TIME_TABLE_CSE" ADD CONSTRAINT "PK_TIMETABLE_CSE" PRIMARY KEY ("DAY_OF_WEEK_CSE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table COURSE
--------------------------------------------------------

  ALTER TABLE "VIDHYA"."COURSE" ADD CONSTRAINT "PK_COURSE" PRIMARY KEY ("COURSE_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table ALUMNI
--------------------------------------------------------

  ALTER TABLE "VIDHYA"."ALUMNI" ADD CONSTRAINT "PK_ALUMNI" PRIMARY KEY ("ALUMNI_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table STUDENT
--------------------------------------------------------

  ALTER TABLE "VIDHYA"."STUDENT" ADD CONSTRAINT "PK_STUDENT" PRIMARY KEY ("STUDENT_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table PLACEMENT_CALENDER
--------------------------------------------------------

  ALTER TABLE "VIDHYA"."PLACEMENT_CALENDER" ADD CONSTRAINT "PK_PLACEMENT" PRIMARY KEY ("COMPANY_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table TIME_TABLE_IT
--------------------------------------------------------

  ALTER TABLE "VIDHYA"."TIME_TABLE_IT" ADD CONSTRAINT "PK_TIMETABLE_IT" PRIMARY KEY ("DAY_OF_WEEK_IT")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table DEPARTMENT
--------------------------------------------------------

  ALTER TABLE "VIDHYA"."DEPARTMENT" ADD CONSTRAINT "PK_APPLICATION" PRIMARY KEY ("DEPARTMENT_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table RESULTS
--------------------------------------------------------

  ALTER TABLE "VIDHYA"."RESULTS" ADD CONSTRAINT "PK_RESULTS" PRIMARY KEY ("STUDENT_ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table TIME_TABLE_EEE
--------------------------------------------------------

  ALTER TABLE "VIDHYA"."TIME_TABLE_EEE" ADD CONSTRAINT "PK_TIMETABLE_EEE" PRIMARY KEY ("DAY_OF_WEEK_EEE")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Constraints for Table CLASS_ROOM
--------------------------------------------------------

  ALTER TABLE "VIDHYA"."CLASS_ROOM" ADD CONSTRAINT "PK_CLASS" PRIMARY KEY ("CLASS_ROOM_NO")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 NOCOMPRESS LOGGING
  TABLESPACE "USERS"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table DEPARTMENT
--------------------------------------------------------

  ALTER TABLE "VIDHYA"."DEPARTMENT" ADD CONSTRAINT "FK_ADMISSIONFORM_DEPARTMENT" FOREIGN KEY ("DEPARTMENT_ID")
	  REFERENCES "VIDHYA"."DEPARTMENT" ("DEPARTMENT_ID") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table STUDENT
--------------------------------------------------------

  ALTER TABLE "VIDHYA"."STUDENT" ADD CONSTRAINT "FK_STUDENT_CLASS_ROOM" FOREIGN KEY ("CLASS_ROOM_NO")
	  REFERENCES "VIDHYA"."CLASS_ROOM" ("CLASS_ROOM_NO") ENABLE;
