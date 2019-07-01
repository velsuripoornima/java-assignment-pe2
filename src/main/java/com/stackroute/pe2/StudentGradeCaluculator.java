package com.stackroute.pe2;
import java.util.Arrays;
import java.sql.Array;

public class StudentGradeCaluculator {
    public class Result {
        float average;
        int minimun;
        int maximum;
    }

    public StudentGradeCaluculator()
    {

    }

    public Result calculateGrades(int number, int[] grades)
    {
        Result result = new Result();

        if(number != grades.length)
        {
            return null;
        }
        for (int grade : grades) {
            if (grade < 0 || grade > 100) {
                return null;
            }
        }

        result.average = Arrays.stream(grades).sum();
        Arrays.sort(grades);
        result.minimun = grades[0];
        result.maximum = grades[grades.length -1];

        return result;
    }
}
