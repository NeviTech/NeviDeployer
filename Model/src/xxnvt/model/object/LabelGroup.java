package xxnvt.model.object;

import oracle.jbo.domain.Date;

public class LabelGroup 
{
    public LabelGroup() 
    {
        super();
    }
    
    public LabelGroup(String pGroupName,
                      String pSubGroupName,
                      Date   pCreationDate,
                      String pCreatedBy,
                      String pLastUpdatedBy,
                      Date   pLastUpdateDate) 
    {
        this.name          = pGroupName;
        this.subGroupName  = pSubGroupName;
        this.creationDate  = pCreationDate;
        this.createdBy     = pCreatedBy;
        this.creationDate  = pLastUpdateDate;
        this.lastUpdatedBy = pLastUpdatedBy;
    }//dual
    
    String name;
    String subGroupName;
    Date   creationDate;
    String createdBy;
    Date   lastUpdateDate;
    String lastUpdatedBy;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    public void setLastUpdateDate(Date lastUpdateDate) {
        this.lastUpdateDate = lastUpdateDate;
    }

    public Date getLastUpdateDate() {
        return lastUpdateDate;
    }

    public void setLastUpdatedBy(String lastUpdatedBy) {
        this.lastUpdatedBy = lastUpdatedBy;
    }

    public String getLastUpdatedBy() {
        return lastUpdatedBy;
    }
}
