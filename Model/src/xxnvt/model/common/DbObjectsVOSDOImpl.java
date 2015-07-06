package xxnvt.model.common;

import org.eclipse.persistence.sdo.SDODataObject;

public class DbObjectsVOSDOImpl extends SDODataObject implements DbObjectsVOSDO {

   public static final int START_PROPERTY_INDEX = 0;

   public static final int END_PROPERTY_INDEX = START_PROPERTY_INDEX + 15;

   public DbObjectsVOSDOImpl() {}

   public java.lang.String getOwner() {
      return getString(START_PROPERTY_INDEX + 0);
   }

   public void setOwner(java.lang.String value) {
      set(START_PROPERTY_INDEX + 0 , value);
   }

   public java.lang.String getObjectName() {
      return getString(START_PROPERTY_INDEX + 1);
   }

   public void setObjectName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 1 , value);
   }

   public java.lang.String getSubobjectName() {
      return getString(START_PROPERTY_INDEX + 2);
   }

   public void setSubobjectName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 2 , value);
   }

   public java.math.BigDecimal getObjectId() {
      return getBigDecimal(START_PROPERTY_INDEX + 3);
   }

   public void setObjectId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 3 , value);
   }

   public java.math.BigDecimal getDataObjectId() {
      return getBigDecimal(START_PROPERTY_INDEX + 4);
   }

   public void setDataObjectId(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 4 , value);
   }

   public java.lang.String getObjectType() {
      return getString(START_PROPERTY_INDEX + 5);
   }

   public void setObjectType(java.lang.String value) {
      set(START_PROPERTY_INDEX + 5 , value);
   }

   public java.sql.Timestamp getCreated() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 6);
   }

   public void setCreated(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 6 , value);
   }

   public java.sql.Timestamp getLastDdlTime() {
      return (java.sql.Timestamp)get(START_PROPERTY_INDEX + 7);
   }

   public void setLastDdlTime(java.sql.Timestamp value) {
      set(START_PROPERTY_INDEX + 7 , value);
   }

   public java.lang.String getTimestamp() {
      return getString(START_PROPERTY_INDEX + 8);
   }

   public void setTimestamp(java.lang.String value) {
      set(START_PROPERTY_INDEX + 8 , value);
   }

   public java.lang.String getStatus() {
      return getString(START_PROPERTY_INDEX + 9);
   }

   public void setStatus(java.lang.String value) {
      set(START_PROPERTY_INDEX + 9 , value);
   }

   public java.lang.String getTemporary() {
      return getString(START_PROPERTY_INDEX + 10);
   }

   public void setTemporary(java.lang.String value) {
      set(START_PROPERTY_INDEX + 10 , value);
   }

   public java.lang.String getGenerated() {
      return getString(START_PROPERTY_INDEX + 11);
   }

   public void setGenerated(java.lang.String value) {
      set(START_PROPERTY_INDEX + 11 , value);
   }

   public java.lang.String getSecondary() {
      return getString(START_PROPERTY_INDEX + 12);
   }

   public void setSecondary(java.lang.String value) {
      set(START_PROPERTY_INDEX + 12 , value);
   }

   public java.math.BigDecimal getNamespace() {
      return getBigDecimal(START_PROPERTY_INDEX + 13);
   }

   public void setNamespace(java.math.BigDecimal value) {
      set(START_PROPERTY_INDEX + 13 , value);
   }

   public java.lang.String getEditionName() {
      return getString(START_PROPERTY_INDEX + 14);
   }

   public void setEditionName(java.lang.String value) {
      set(START_PROPERTY_INDEX + 14 , value);
   }

   public java.lang.String getObjectSource() {
      return getString(START_PROPERTY_INDEX + 15);
   }

   public void setObjectSource(java.lang.String value) {
      set(START_PROPERTY_INDEX + 15 , value);
   }


}

