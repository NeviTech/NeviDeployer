package xxnvt.model.object;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;
import java.util.List;

public class VersionableObject 
{
    
    public VersionableObject() 
    {
        super();
    }
    
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

    public void setObjectId(Number objectId) {
        this.objectId = objectId;
    }

    public Number getObjectId() {
        return objectId;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public String getDirectory() {
        return directory;
    }

    public void setVersionNumber(Number versionNumber) {
        this.versionNumber = versionNumber;
    }

    public Number getVersionNumber() {
        return versionNumber;
    }

    public void setIsCheckedOut(Boolean isCheckedOut) {
        this.isCheckedOut = isCheckedOut;
    }

    public Boolean getIsCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckOutPerformer(String checkOutPerformer) {
        this.checkOutPerformer = checkOutPerformer;
    }

    public String getCheckOutPerformer() {
        return checkOutPerformer;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return comments;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreatedBy(Number createdBy) {
        this.createdBy = createdBy;
    }

    public Number getCreatedBy() {
        return createdBy;
    }

    public void setLastUpdateLogin(Number lastUpdateLogin) {
        this.lastUpdateLogin = lastUpdateLogin;
    }

    public Number getLastUpdateLogin() {
        return lastUpdateLogin;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdatedBy(Number lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public Number getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLabelList(List<Label> labelList) {
        this.labelList = labelList;
    }

    public List<Label> getLabelList() {
        return labelList;
    }
    
    public String checkOut(Number objectId) {
        return new String();
    }
    
    public String checkIn(Number objectId) {
        return new String();
    }

}
