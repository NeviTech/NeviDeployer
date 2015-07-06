package xxnvt.model.dbobjects;

import java.math.BigDecimal;

import java.sql.SQLData;
import java.sql.SQLException;
import java.sql.SQLInput;
import java.sql.SQLOutput;

import java.util.List;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;

import xxnvt.model.object.Label;
import xxnvt.model.object.VersionableObject;

public class DbObject extends VersionableObject implements SQLData{
    
    public DbObject()
    {
        super();
    }
    
    /////////inherited fields///////////
    Number      objectId;
    String      objectName;
    String      type;
    String      directory;
    Number      versionNumber;
    Boolean     isCheckedOut;
    String      checkOutPerformer;
    Date        checkOutDate;
    String      comments;
    Date        creationDate;
    Number      createdBy;
    Number      lastUpdateLogin;
    Date        lastUpdateDate;
    Number      lastUpdatedBy;
    List<Label> labelList;
    /////////inherited fields end///////////
    String      owner;
    String      dbObjectName;
    String      subObjectName;
    Number      dbObjectId;
    Number      dataObjectId;
    String      objectType;
    Date        created;
    Date        lastDDLTime;
    String      Timestamp;
    String      status;
    String      temporary;
    String      generated;
    String      secondary;
    Number      namespace;
    String      editionName;
    String      objectSource;
    private     String sqlUdt;
    
    public void writeSQL(SQLOutput stream) throws SQLException 
    {

    }
    
    public String getSQLTypeName() throws SQLException 
    {
        return sqlUdt;
    }
    
    public void readSQL(SQLInput stream, String typeName) throws SQLException 
    {
        sqlUdt             = typeName;
        this.owner         = stream.readString();
        this.dbObjectName  = stream.readString();
        this.subObjectName = stream.readString();
        BigDecimal lObjectId = stream.readBigDecimal();
        if(lObjectId != null)
        {
            this.dbObjectId      = new Number(lObjectId);
        }
        BigDecimal lDataObjectId = stream.readBigDecimal();
        if(lDataObjectId != null)
        {
        
            this.dataObjectId    = new Number(lDataObjectId);
            
        }
        this.objectType    = stream.readString();
        this.created       = new Date(stream.readTimestamp());
        this.lastDDLTime   = new Date(stream.readTimestamp());
        this.Timestamp     = stream.readString();
        this.status        = stream.readString();
        this.temporary     = stream.readString();
        this.generated     = stream.readString();
        this.secondary     = stream.readString();
        this.namespace     = new Number(stream.readBigDecimal());
        this.editionName   = stream.readString();
        this.objectSource  = stream.readString();        
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public void setDbObjectName(String dbObjectName) {
        this.dbObjectName = dbObjectName;
    }

    public String getDbObjectName() {
        return dbObjectName;
    }

    public void setSubObjectName(String subObjectName) {
        this.subObjectName = subObjectName;
    }

    public String getSubObjectName() {
        return subObjectName;
    }

    public void setDbObjectId(Number dbObjectId) {
        this.dbObjectId = dbObjectId;
    }

    public Number getDbObjectId() {
        return dbObjectId;
    }

    public void setDataObjectId(Number dataObjectId) {
        this.dataObjectId = dataObjectId;
    }

    public Number getDataObjectId() {
        return dataObjectId;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getCreated() {
        return created;
    }

    public void setLastDDLTime(Date lastDDLTime) {
        this.lastDDLTime = lastDDLTime;
    }

    public Date getLastDDLTime() {
        return lastDDLTime;
    }

    public void setTimestamp(String Timestamp) {
        this.Timestamp = Timestamp;
    }

    public String getTimestamp() {
        return Timestamp;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setTemporary(String temporary) {
        this.temporary = temporary;
    }

    public String getTemporary() {
        return temporary;
    }

    public void setGenerated(String generated) {
        this.generated = generated;
    }

    public String getGenerated() {
        return generated;
    }

    public void setSecondary(String secondary) {
        this.secondary = secondary;
    }

    public String getSecondary() {
        return secondary;
    }

    public void setNamespace(Number namespace) {
        this.namespace = namespace;
    }

    public Number getNamespace() {
        return namespace;
    }

    public void setEditionName(String editionName) {
        this.editionName = editionName;
    }

    public String getEditionName() {
        return editionName;
    }

    public void setObjectSource(String objectSource) {
        this.objectSource = objectSource;
    }

    public String getObjectSource() {
        return objectSource;
    }

    public void setSqlUdt(String sqlUdt) {
        this.sqlUdt = sqlUdt;
    }
    
    public void setObjectId(Number objectId) {
        super.setObjectId(objectId);
    }

    public Number getObjectId() {
        return super.getObjectId();
    }

    public void setObjectName(String objectName) {
        super.setObjectName(objectName);
    }

    public String getObjectName() {
        return super.getObjectName();
    }

    public void setType(String type) {
        super.setType(type);
    }

    public String getType() {
        return super.getType();
    }

    public void setDirectory(String directory) {
        super.setDirectory(directory);
    }

    public String getDirectory() {
        return super.getDirectory();
    }

    public void setVersionNumber(Number versionNumber) {
        super.setVersionNumber(versionNumber);
    }

    public Number getVersionNumber() {
        return super.getVersionNumber();
    }

    public void setIsCheckedOut(Boolean isCheckedOut) {
        super.setIsCheckedOut(isCheckedOut);
    }

    public Boolean getIsCheckedOut() {
        return super.getIsCheckedOut();
    }

    public void setCheckOutPerformer(String checkOutPerformer) {
        super.setCheckOutPerformer(checkOutPerformer);
    }

    public String getCheckOutPerformer() {
        return super.getCheckOutPerformer();
    }

    public void setCheckOutDate(Date checkOutDate) {
        super.setCheckOutDate(checkOutDate);
    }

    public Date getCheckOutDate() {
        return super.getCheckOutDate();
    }

    public void setComments(String comments) {
        super.setComments(comments);;
    }

    public String getComments() {
        return super.getComments();
    }

    public void setCreationDate(Date creationDate) {
        super.setCreationDate(creationDate);;
    }

    public Date getCreationDate() {
        return super.getCreationDate();
    }

    public void setCreatedBy(Number createdBy) {
        super.setCreatedBy(createdBy);
    }

    public Number getCreatedBy() {
        return super.getCreatedBy();
    }

    public void setLastUpdateLogin(Number lastUpdateLogin) {
        super.setLastUpdateLogin(lastUpdateLogin);
    }

    public Number getLastUpdateLogin() {
        return super.getLastUpdateLogin();
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        super.setLastUpdateDate(lastUpdateDate);
    }

    public Date getLastUpdateDate() {
        return super.getLastUpdateDate();
    }

    public void setLastUpdatedBy(Number lastUpdatedBy) {
        super.setLastUpdatedBy(lastUpdatedBy);
    }

    public Number getLastUpdatedBy() {
       return  super.getLastUpdatedBy();
    }

    public void setLabelList(List<Label> labelList) {
        super.setLabelList(labelList);
    }

    public List<Label> getLabelList() {
        return super.getLabelList();
    }
    
    public String checkOut(Number objectId) {
        return super.checkOut(objectId);
    }
    
    public String checkIn(Number objectId) {
        return super.checkIn(objectId);
    }
}
