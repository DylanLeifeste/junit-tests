import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testOne(){
    Student student = new Student(1L, "Rick");
    assertEquals(1L, student.getId());
    assertEquals("Rick", student.getName());
    assertTrue(student.getGrades().isEmpty());
    }

    @Test
    public void testAddGrade(){
        Student student = new Student(1L, "rick");
        assertEquals(0, student.getGrades().size());
        student.addGrade(100);
        assertEquals(1, student.getGrades().size());
        assertEquals(100, student.getGrades().get(0), 0);
    }

    @Test
    public void testGetGradeAvg(){
        Student student = new Student(1L, "Rick");
        student.addGrade(100);
        assertEquals(100, student.getGradeAverage(), 0);

        student.addGrade(0);
        assertEquals(50, student.getGradeAverage(), 0);
    }
}
