/*
    1 - PRESENT
    0 - ABSENT
    2 - HALFDAY
 */
enum Status{
    PRESENT,
    ABSENT,
    HALFDAY   
}
/*
class Worker{
    private String name;
    private int status;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }    
}
    */
    class Worker{
        private String name;
        private Status status;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public Status getStatus() {
            return status;
        }
        public void setStatus(Status status) {
            this.status = status;
        }    
    }    
public class Enum1 {
    public static void main(String[] args) {
        Worker w1 = new Worker();
        w1.setName("Mukilan");
        w1.setStatus(Status.ABSENT);   
    }
}
