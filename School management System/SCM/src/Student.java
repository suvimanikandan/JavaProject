public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }
    public void setGrade(int grade) {
      this.grade=grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }


    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }
    public  int getRemainingFees(){
        return feesTotal-feesPaid;
    }


    public Student(int id, String name, int grade, int feesPaid, int feesTotal) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = feesPaid;
        this.feesTotal = feesTotal;
        

        @override
                public String toString(){
            return "Student's name: "+name+ " Total fees paid so far $ " +feesPaid;
        }


    }
}
