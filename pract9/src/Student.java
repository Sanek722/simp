public class Student
{
    String first_name, second_name, three_name, profile, group;
    int ball,course;
    Student(String first_name,String second_name ,String three_name ,String profile ,int course ,String group, int ball)
    {
        this.ball=ball;
        this.first_name=first_name;
        this.second_name=second_name;
        this.three_name=three_name;
        this.profile=profile;
        this.course=course;
        this.group=group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "first_name='" + first_name + '\'' +
                ", second_name='" + second_name + '\'' +
                ", three_name='" + three_name + '\'' +
                ", profile='" + profile + '\'' +
                ", course='" + course + '\'' +
                ", group='" + group + '\'' +
                ", ball=" + ball +
                '}';
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public String getThree_name() {
        return three_name;
    }

    public void setThree_name(String three_name) {
        this.three_name = three_name;
    }
}
