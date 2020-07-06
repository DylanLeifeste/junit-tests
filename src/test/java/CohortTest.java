import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class CohortTest {

    private Cohort cohort1;
    private Cohort cohort2;

    private List<Student> students;

    @Before
    public void setUp() throws Exception {
        cohort1 = new Cohort();
        cohort2 = new Cohort();

        students = new ArrayList<>();

        Student s1 = new Student(1, "Fred");
        s1.addGrade(0);

        Student s2 = new Student(2, "Cathy");
        s2.addGrade(0);
        s2.addGrade(100);

        Student s3 = new Student(3, "Charles");
        s3.addGrade(50);
        s3.addGrade(100);
        s3.addGrade(75);

        students.add(s1);
        students.add(s2);
        students.add(s3);
    }

    @Test
    public void addStudent() {
        assertTrue(cohort1.getStudents().isEmpty());

        cohort1.addStudent(students.get(0));
        assertFalse(cohort1.getStudents().isEmpty());
        assertEquals(1, cohort1.getStudents().size());

        cohort1.addStudent(students.get(1));
        assertEquals(2, cohort1.getStudents().size());
        assertSame(students.get(0), cohort1.getStudents().get(0));
    }


    @Test
    public void getStudents() {
        assertNotNull(cohort1.getStudents());

        cohort1.addStudent(students.get(0));
        assertEquals(1, cohort1.getStudents().size());

        cohort1.addStudent(students.get(1));
        assertEquals(2, cohort1.getStudents().size());
    }

    @Test
    public void getCohortAverage() {
        cohort1.addStudent(students.get(0));
        assertEquals(0, cohort1.getCohortAverage(), 0);

        cohort1.addStudent(students.get(1));
        assertEquals(25, cohort1.getCohortAverage(), 0);

        cohort2.addStudent(students.get(1));
        assertEquals(50, cohort2.getCohortAverage(), 0);
    }

    @Test
    public void testAddStudent(){
        Student test = new Student(1, "Rick");
        assertEquals("Rick", test.getName());
        assertEquals(1, test.getId());

    }


}
