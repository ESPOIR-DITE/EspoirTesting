package company.com;

import org.junit.*;
import org.junit.rules.Timeout;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.Assert.*;

public class StudentTest {
    Student student, student1;
    Lecture lecture;
    //student1 =new Student();


    @Before
    public void setUp() throws Exception
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        student=(Student)ctx.getBean("student");

        ApplicationContext ctx1 = new AnnotationConfigApplicationContext(AppConfig.class);
        lecture=(Lecture)ctx.getBean("lecture");
    }

    @After
    public void tearDown() throws Exception
    {
    }
    @BeforeClass
    public static void setUpClass() throws Exception
    {
    }
    @AfterClass
    public static void tearDownClass() throws Exception
    {
    }

    @Test
    public void studentObjectTest()
    {
        //Object object= student();
        student1 =new Student();
        assertEquals(student1,student1);
    }
    @Test
    public void studentObjectTest2()
    {

        student1 =new Student();
        assertEquals(student,student1);
    }

    @Test
    public void studentObjectTest3()
    {

        fail( "This test must fail" );
        //assertEquals(student,student1);
    }
    @Test(timeout=100)
    public void studentObjectTest4()
    {

        student1 =new Student();
        assertEquals(student1,student1);
    }
    @Ignore
    @Test(timeout=100)
    public void studentObjectTest5()
    {

        student1 =new Student();
        assertEquals(student1,student1);
    }
}