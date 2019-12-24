package com.chat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter members count: ");
        Core.init(scanner.nextInt());

        while (true) {
            Member[] members = Core.getMembers();
            for (int i = 0; i < members.length; i++ ) {
                System.out.println(i + ") " + members[i].getName() + "\n");
            }
            System.out.println("Choose a member:");

            Integer memberIndex = scanner.nextInt();
            if (Core.checkMember(memberIndex)) {
                Core.beginDiscussion(memberIndex);
            } else {
                System.out.println("Enter valid member index");
                break;
            }
        }
    }
}
