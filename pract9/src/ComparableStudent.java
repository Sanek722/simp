public class ComparableStudent implements Comparable<Student>
{
    Student b;
    ComparableStudent(Student b)
    {
        this.b=b;
    }
    @Override
    public int compareTo(Student o)
    {
        if (o.course>b.course)
            return 1;
        if (o.course<b.course)
            return -1;
        else
            return 0;
    }
}
