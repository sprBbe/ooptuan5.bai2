public class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay){
        super(name, address);
        this.pay=pay;
        this.school=school;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        String s="Staff[";
        s += super.toString();
        s = s+ ",school=" + school + ",pay=" + pay+"]";
        return s;
    }

    public static void main(String[] args){
        Person n = new Staff("dung","122","VNu",99);
        System.out.print(n.toString());
    }
}
