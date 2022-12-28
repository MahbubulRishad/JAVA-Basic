package java_2_1;

public class Student1 {
    int id;
    private int income = 1000;
    String name;
    protected String contactNumber = "0123456789";
    String subject;

    public void attendXM()
    {
        System.out.println("Student have to attend XM");
    }
    public void getIncome()
    {
        System.out.println(income);
    }

    public void submitAssignment()
    {
        System.out.println("Assignment Submission complete");
    }

    public void courseEnrollment()
    {
        System.out.println("Take course enrollment");
    }

    protected String creditFee()
    {
        System.out.println("Have to pay money for talking credit");
        return null;
    }
}
