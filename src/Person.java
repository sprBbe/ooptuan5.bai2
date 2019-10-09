public class Person {
    private String name;
    private String address;

    public Person(String name, String address){
        this.address=address;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString(){
        String s = "Person[name=";
        s+=getName();
        s+=",address=";
        s+=getAddress();
        s+="]";
        return s;
    }
}
