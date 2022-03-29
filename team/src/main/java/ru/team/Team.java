package ru.team;

public class Team {
    private String name;
    Member[] members = new Member[4];

    public Team (String name, Member member_1,  Member member_2, Member member_3, Member member_4) {
        this.name = name;
        this.members[0]  =  member_1;
        this.members[1]  =  member_2;
        this.members[2]  =  member_3;
        this.members[3]  =  member_4;
    }

   public void showResults () {
        for (Member m : members) {
            if (m.isResult() == true) {
                System.out.println(m.getName());
            }
        }
   }

   public void showMembers() {
       for (Member m : members) {
               System.out.println(m.toString());
       }
   }
}
