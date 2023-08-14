package ra;

import java.util.Scanner;
import ra.impl.Student;
public interface IStudent {
    float MARK_PASS=5;
    void inputData(Scanner scanner,Student[] arrStudent, int numberStudent);
    void displayData();
    void calAvgMark();

}
