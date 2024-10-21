public class MemberRepository {
    public MemberRecord findMemberByName(String name) {
        return new MemberRecord(name); // In real-world, you'd fetch from DB
    }

    public void updateMemberFines(MemberRecord member, int amount) {
        // Simulate DB update
        member.addFine(amount);
        System.out.println("Added fine of: " + amount + " to " + member.getMemberName());
    }
}