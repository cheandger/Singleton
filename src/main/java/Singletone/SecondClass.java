package Singletone;

public class SecondClass {
    Integer classNumber;
    String name;
    String followingInfo;

    public SecondClass(Integer classNumber, String className, String followingInfo) {
        this.classNumber = classNumber;
        this.name = className;
        this.followingInfo = followingInfo;
    }

    public Integer getClassNumber() {
        return classNumber;
    }


    public String getClassName() {
        return name;
    }

    public void setClassNumber(Integer classNumber) {
        this.classNumber = classNumber;
    }

    public void setClassName(String className) {
        this.name = className;
    }

    public void setFollowingInfo(String followingInfo) {
        this.followingInfo = followingInfo;
    }

    @Override
    public String toString() {
        return "Singletone.SecondClass{" +
                "classNumber=" + classNumber +
                ", Name='" + name + '\'' +
                ", followingInfo='" + followingInfo + '\'' +
                '}';
    }
}
