import java.util.Comparator;
import java.util.Vector;

public class SortStudents  implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
        if (a.ball<b.ball)
            return -1;
        if (a.ball>b.ball)
            return 1;
        else
        {
            return 0;
        }
    }
    public void quickSort(Student iDNumber[], int start, int end)
    {
        if (iDNumber.length == 0)
            return;

        if (start >= end)
            return;

        int middle = start + (end - start) / 2;
        Student opora = iDNumber[middle];

        int i = start, j = end;
        while (i <= j) {
            while (compare(iDNumber[i], opora) == 1) {
                i++;
            }

            while (compare(iDNumber[j], opora) == -1) {
                j--;
            }

            if (i <= j) {//меняем местами
                Student temp = iDNumber[i];
                iDNumber[i] = iDNumber[j];
                iDNumber[j] = temp;
                i++;
                j--;
            }
        }
        if (start < j)
            quickSort(iDNumber, start, j);
        if (end > i)
            quickSort(iDNumber, i, end);
    }
    public Student[] back(Student iDNumber1[], Student iDNumber2[])
    {
        Student iDNumber_new[] = new Student[iDNumber1.length + iDNumber2.length];
        for (int i = 0; i< iDNumber1.length; i++)
        {
            iDNumber_new[i]=iDNumber1[i];
        }
        for (int d = iDNumber2.length; d < iDNumber2.length * 2; d++)
        {
            iDNumber_new[d]=iDNumber2[d - 6];
        }
        sliv(iDNumber_new,0, iDNumber_new.length);
        return iDNumber_new;
    }
    public void sliv(Student iDNumber[], int first, int last) //сортировка простым слиянием
    {

        if (last - first < 2)
        {
            return;
        }
        if (last - first == 2)
        {

            if (compare(iDNumber[first], iDNumber[first+1]) == 1)
            {

                Student temp = iDNumber[first];
                iDNumber[first] = iDNumber[first+1];
                iDNumber[first+1] = temp;
                return;
            }
        }
        sliv(iDNumber, first, first + (last - first) / 2);
        sliv(iDNumber, first + (last - first) / 2, last);
        Vector mas = new Vector(3);
        int b1 = first;
        int e1 = first + (last - first) / 2;
        int b2 = e1;
        while (mas.size() < (last - first))
        {

            if (b1 >= e1 || (        b2 < last && (   compare(iDNumber[b2],iDNumber[b1]) == -1  ||  compare(iDNumber[b2],iDNumber[b1]) ==0     )     )         )
            {
                mas.addElement(iDNumber[b2]);
                ++b2;

            }
		else
            {
                mas.addElement(iDNumber[b1]);
                ++b1;

            }
        }
        for (int i = first; i < last; i++)
        {
            iDNumber[i] = (Student) mas.get(i - first);

        }


    }
    void sliv2(int[] x, int first, int last) //сортировка простым слиянием
    {
        if (last - first < 2)
        {
            return;
        }
        if (last - first == 2)
        {
            if (x[first] > x[first + 1])
            {
                int temp = x[first];
                x[first] = x[first+1];
                x[first+1] = temp;
                return;
            }
        }
        sliv2(x, first, first + (last - first) / 2);
        sliv2(x, first + (last - first) / 2, last);
        Vector mas = new Vector();
        int b1 = first;
        int e1 = first + (last - first) / 2;
        int b2 = e1;
        while (mas.size() < last - first)
        {
            if (b1 >= e1 || (b2 < last && x[b2] <= x[b1]))
            {
                mas.addElement(x[b2]);
                ++b2;
            }
		else
            {
                mas.addElement(x[b1]);
                ++b1;
            }
        }
        for (int i = first; i < last; i++)
            x[i] = (int) mas.get(i - first);
    }
}
