public class MemberRecord {
    private String memberName;
    private int fines;

    public MemberRecord(String memberName) {
        this.memberName = memberName;
        this.fines = 0;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getFines() {
        return fines;
    }

    public void addFine(int amount) {
        this.fines += amount;
    }
}
