package com.chat;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Core {
    private static int memberInput;
    private static Member[] Members;

    public static void init(int membersCount) {
        Members = new Member[membersCount];
        for (int i = 0; i < membersCount; i++) {
            Members[i] = new Member("member" + (i + 1));
        }
    }

    public static void beginDiscussion(Integer memberIndex) {
        System.out.println("Choose action:");
        System.out.println("1. Send Massage");
        System.out.println("2. Exit Massage");

        Scanner scanner = new Scanner(System.in);
        memberInput = scanner.nextInt();
        if (memberInput == 1) {
            enterMessage(memberIndex);
        } else if (memberInput == 2) {
            deleteMember(memberIndex);
            System.out.println("Member deleted \n");
        }
    }

    public static void enterMessage(Integer memberIndex){
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.print(getDate() + " " + memberIndex + ": ");

            String messageOfMember = scanner.nextLine();
            if(messageOfMember.equals("q") || messageOfMember.equals("")) {
                System.out.println("You have exited from chat mode \n");
                System.out.println();
                break;
            }
        }
    }

    public static String getDate(){
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        return format.format(date).toString();
    }
    public static Member[] getMembers() {
        return Members;
    }

    public static boolean checkMember(Integer memberIndex) {
        return Members.length > memberIndex;
    }

    public static void deleteMember(Integer memberIndex) {
//        ToDo: member must be removed, cant import ArrayUtils.removeElement(array, element)
//        Members[memberIndex];
    }
}

