package xxnvt.model.object;

import oracle.jbo.domain.Date;

public class Label 
{
    public Label() {
        super();
    }
    
    public Label(String pName,
                 String pGroupName,
                 String pSubGroupName,
                 Date   pCreationDate,
                 String pCreatedBy,
                 String pLastUpdatedBy,
                 Date   pLastUpdateDate) 
    {
        this.name           = pName;
        this.groupName      = pGroupName;
        this.subGroupName   = pSubGroupName;
        this.creationDate   = pCreationDate;
        this.createdBy      = pCreatedBy;
        this.lastUpdatedBy  = pLastUpdatedBy;
        this.lastUpdateDate = pLastUpdateDate;
    }
    
    String name;
    String groupName;
    String subGroupName;
    Date   creationDate;
    String createdBy;
    String lastUpdatedBy;
    Date   lastUpdateDate;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setSubGroupName(String subGroupName) {
        this.subGroupName = subGroupName;
    }

    public String getSubGroupName() {
        return subGroupName;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }
}
