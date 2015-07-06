package xxnvt.model.object;

public class TypeCategories {
    public TypeCategories() {
        super();
    }
    
    String objectType;
    String labelName;
    String groupName;
    String subGroupName;

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setLabelName(String labelName) {
        this.labelName = labelName;
    }

    public String getLabelName() {
        return labelName;
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
}
