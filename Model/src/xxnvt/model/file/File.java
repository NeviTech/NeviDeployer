package xxnvt.model.file;

import java.util.List;

import oracle.jbo.domain.Date;
import oracle.jbo.domain.Number;

import xxnvt.model.object.Label;
import xxnvt.model.object.VersionableObject;

public class File extends VersionableObject
{
    
    public File() 
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
    String      fileExtension;


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

    public void setFileExtension(String fileExtension) {
        this.fileExtension = fileExtension;
    }

    public String getFileExtension() {
        return fileExtension;
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
