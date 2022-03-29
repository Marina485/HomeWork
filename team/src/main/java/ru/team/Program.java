package ru.team;

public class Program {
    public static void main(String[]args) {
        Member oleg = new Member("Oleg", 100, 20, 500);
        Member marina = new Member("Marina", 50, 15, 300);
        Member vika = new Member("Vika", 70, 25, 350);
        Member eugene = new Member("Eugene", 150, 30, 700);

        Team beavers= new Team("Beavers", oleg, marina, vika, eugene);

        Course toHome = new Course("To home", 80, 19, 370);

        toHome.doCourse(beavers);

        System.out.println("Команда:");
        beavers.showMembers();
        System.out.println("----------------------");
        System.out.println("Прошли дистанцию:");
        beavers.showResults();
    }
}
