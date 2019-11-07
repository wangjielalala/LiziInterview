package wangjie.sortoperation_v1;

public enum SortType {
    REVERSE("reverse"),
    DRAG("drag"),
    MOVE("move");

    String value;
    SortType(String value) {
        this.value=value;
    }


    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
