package Singletone;

import java.util.Objects;

public class FirstClass {
    Integer classNumber;
    String name;
    String followingInfo;

    public FirstClass(Integer classNumber, String className, String followingInfo) {
        this.classNumber = classNumber;
        this.name = className;
        this.followingInfo = followingInfo;
    }

    public Integer getClassNumber() {
        return classNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FirstClass)) return false;
        FirstClass that = (FirstClass) o;
        return classNumber.equals(that.classNumber) && name.equals(that.name) && followingInfo.equals(that.followingInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(classNumber, name, followingInfo);
    }

}
