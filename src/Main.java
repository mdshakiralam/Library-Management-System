import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> ids = new ArrayList<>();
        ArrayList<String> booknames = new ArrayList<>();
        ArrayList<String> authornames = new ArrayList<>();

        ArrayList<Integer> memberids = new ArrayList<>();
        ArrayList<String> membernames = new ArrayList<>();
        ArrayList<String> memberphones = new ArrayList<>();

        ArrayList<Integer> issuedbookids = new ArrayList<>();
        ids.add(101);
        booknames.add("Java Programming");
        authornames.add("James Gosling");

        ids.add(102);
        booknames.add("Python Programming");
        authornames.add("Guido van Rossum");

        ids.add(103);
        booknames.add("C Programming");
        authornames.add("Dennis Ritchie");

        ids.add(104);
        booknames.add("Data Structures");
        authornames.add("Narasimha Karumanchi");

        ids.add(105);
        booknames.add("Operating System");
        authornames.add("Galvin");

        ArrayList<Integer> issuedmemberids = new ArrayList<>();
        memberids.add(201);
        membernames.add("Rahul");
        memberphones.add("9876543210");

        memberids.add(202);
        membernames.add("Aman");
        memberphones.add("9876543211");

        memberids.add(203);
        membernames.add("Priya");
        memberphones.add("9876543212");

        memberids.add(204);
        membernames.add("Rohit");
        memberphones.add("9876543213");

        memberids.add(205);
        membernames.add("Neha");
        memberphones.add("9876543214");

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println();
            System.out.println("=====================================================");
            System.out.println("      WELCOME TO LIBRARY MANAGEMENT SYSTEM.          ");
            System.out.println("=====================================================");

            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. Delete Book");
            System.out.println("6. Add Member");
            System.out.println("7. View Members");
            System.out.println("8.Search Member");
            System.out.println("9.Update Member");
            System.out.println("10.Delete Member");
            System.out.println("11. Issue Book");
            System.out.println("12. Return Book");
            System.out.println("13. Borrowing Records");
            System.out.println("14. Exit");
            System.out.println();

            System.out.print("Enter Your Choice:");
            choice = sc.nextInt();

            System.out.println("You Selected Option:" + choice);
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.print("Enter Book ID:");
                    int id = sc.nextInt();

                    while (id <= 0) {
                        System.out.println("Book ID Must Be Positive!");
                        System.out.print("Enter Valid Book ID:");
                        id = sc.nextInt();
                    }

                    boolean found4 = false;
                    for (int i = 0; i < ids.size(); i++) {
                        if (ids.get(i) == id) {
                            found4 = true;
                            break;
                        }
                    }
                    while (found4) {
                        System.out.println("\nBook Id Already Exist!");
                        System.out.print("Please Enter Different Book Id:");
                        id = sc.nextInt();

                        while (id <= 0) {
                            System.out.println("Book ID Must Be Positive!");
                            System.out.print("Enter Valid Book ID:");
                            id = sc.nextInt();
                        }

                        found4 = false;

                        for (int i = 0; i < ids.size(); i++) {
                            if (ids.get(i) == id) {
                                found4 = true;
                                break;
                            }
                        }
                    }
                    sc.nextLine();
                    System.out.print("Enter Book Name:");
                    String bookname = sc.nextLine();

                    System.out.print("Enter Book Author Name:");
                    String authorname = sc.nextLine();

                    ids.add(id);
                    booknames.add(bookname);
                    authornames.add(authorname);
                    System.out.println();
                    System.out.println("Book Added Successfully.");
                    break;

                case 2:
                    System.out.println("============= ALL BOOKS ===============");
                    if (ids.size() == 0) {
                        System.out.println("No Books Availabe.");
                    } else {
                        for (int i = 0; i < ids.size(); i++) {
                            System.out.println("Book Id: " + ids.get(i));
                            System.out.println("Book Name: " + booknames.get(i));
                            System.out.println("Author Name: " + authornames.get(i));

                            System.out.println("-----------------------------------");
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Book Id To Search:");
                    int search = sc.nextInt();

                    while (search <= 0) {
                        System.out.println("Book ID Must Be Positive!");
                        System.out.print("Enter Valid Book ID:");
                        search = sc.nextInt();
                    }

                    boolean found = false;
                    for (int i = 0; i < ids.size(); i++) {
                        if (ids.get(i) == search) {
                            System.out.println();
                            System.out.println("BOOK FOUND");
                            System.out.println("Book Id: " + ids.get(i));
                            System.out.println("Book Name: " + booknames.get(i));
                            System.out.println("Author Name: " + authornames.get(i));

                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println();
                        System.out.println("Book Not Found!");
                    }
                    break;

                case 4:
                    System.out.print("Enter Book Id To Update:");
                    int update = sc.nextInt();

                    while (update <= 0) {
                        System.out.println("Book ID Must Be Positive!");
                        System.out.print("Enter Valid Book ID:");
                        update = sc.nextInt();
                    }

                    boolean found1 = false;
                    for (int i = 0; i < ids.size(); i++) {
                        if (ids.get(i) == update) {
                            System.out.print("Enter New Book Name:");
                            sc.nextLine();
                            String update1 = sc.nextLine();

                            System.out.print("Enter New Author Name:");
                            String update2 = sc.nextLine();

                            booknames.set(i, update1);
                            authornames.set(i, update2);
                            System.out.println();
                            System.out.println("Book Updated Successfully!");
                            found1 = true;
                            break;
                        }
                    }
                    if (found1 != true) {
                        System.out.println();
                        System.out.println("Book Not Found!");
                    }
                    break;

                case 5:
                    System.out.print("Enter Book Id To Delete:");
                    int delete = sc.nextInt();

                    while (delete <= 0) {
                        System.out.println("Book ID Must Be Positive!");
                        System.out.print("Enter Valid Book ID:");
                        delete = sc.nextInt();
                    }

                    boolean found2 = false;
                    for (int i = 0; i < ids.size(); i++) {
                        if (ids.get(i) == delete) {
                            found2 = true;
                            if (issuedbookids.contains(delete)) {
                                System.out.println();
                                System.out.println("Book Is Currently Issued!");
                                System.out.println("Return The Book Before Deleting.");
                            } else {
                                ids.remove(i);
                                booknames.remove(i);
                                authornames.remove(i);

                                System.out.println();
                                System.out.println("Book Deleted Successfully!");
                            }
                            break;
                        }
                    }

                    if (!found2) {
                        System.out.println();
                        System.out.println("Book Not Found!");
                    }
                    break;

                case 6:
                    System.out.print("Enter Member Id:");
                    int member = sc.nextInt();
                    sc.nextLine();

                    while (member <= 0) {
                        System.out.println("Member ID Must Be Positive!");
                        System.out.print("Enter Valid Member ID:");
                        member = sc.nextInt();
                    }

                    boolean found3 = false;
                    for (int i = 0; i < memberids.size(); i++) {
                        if (memberids.get(i) == member) {
                            found3 = true;
                            break;
                        }
                    }

                    while (found3) {
                        System.out.println("Member Id Already Exist!");
                        System.out.print("Please Enter Different Member Id:");
                        member = sc.nextInt();

                        while (member <= 0) {
                            System.out.println("Member ID Must Be Positive!");
                            System.out.print("Enter Valid Member ID:");
                            member = sc.nextInt();
                        }

                        found3 = false;
                        for (int i = 0; i < memberids.size(); i++) {
                            if (memberids.get(i) == member) {
                                found3 = true;
                                break;
                            }
                        }
                    }
                    sc.nextLine();

                    System.out.print("Enter Member Name:");
                    String name = sc.nextLine();

                    System.out.print("Enter Member Phone Number:");
                    String phone = sc.nextLine();
                    while (phone.length() != 10 || !phone.matches("[0-9]{10}")) {
                        System.out.println("\nInvalid Mobile Number!");
                        System.out.print("Please Enter 10 Digit Mobile Number:");
                        phone = sc.nextLine();
                    }
                    boolean found5 = false;
                    for (int i = 0; i < memberphones.size(); i++) {
                        if (memberphones.get(i).equals(phone)) {
                            found5 = true;
                        }
                    }
                    while (found5) {
                        System.out.println("\nThis Phone Number Already Exist!");
                        System.out.print("Enter Different Mobile Number:");
                        phone = sc.nextLine();

                        while (phone.length() != 10 || !phone.matches("[0-9]{10}")) {
                            System.out.println("Invalid Mobile Number!");
                            System.out.print("Enter 10 Digit Mobile Number:");
                            phone = sc.nextLine();
                        }

                        found5 = false;
                        for (int i = 0; i < memberphones.size(); i++) {
                            if (memberphones.get(i).equals(phone)) {
                                found5 = true;
                                break;
                            }
                        }
                    }
                    memberids.add(member);
                    membernames.add(name);
                    memberphones.add(phone);
                    System.out.println();
                    System.out.println("Member Added Successfully!");
                    break;

                case 7:
                    System.out.println("----------- ALL MEMBERS -----------");
                    if (memberids.isEmpty()) {
                        System.out.println("No Members Found!");
                    } else {
                        for (int i = 0; i < memberids.size(); i++) {
                            System.out.println("Member Id:" + memberids.get(i));
                            System.out.println("Member Name:" + membernames.get(i));
                            System.out.println("Member Phone Number:" + memberphones.get(i));
                            System.out.println("----------------------------------");
                        }

                    }
                    break;

                case 8:
                    System.out.print("Enter Member Id To Search:");
                    int search1 = sc.nextInt();

                    while (search1 <= 0) {
                        System.out.println("Member ID Must Be Positive!");
                        System.out.print("Enter Valid Member ID:");
                        search1 = sc.nextInt();
                    }

                    boolean found6 = false;
                    for (int i = 0; i < memberids.size(); i++) {
                        if (memberids.get(i) == search1) {
                            System.out.println("\n-------- MEMBERS FOUND ---------");
                            System.out.println("Member Id:" + memberids.get(i));
                            System.out.println("Member Name:" + membernames.get(i));
                            System.out.println("Member Phone Number:" + memberphones.get(i));
                            System.out.println();
                            found6 = true;
                            break;
                        }
                    }

                    if (found6 != true) {
                        System.out.println();
                        System.out.println("Member Not Found!");
                    }
                    break;

                case 9:
                    System.out.print("Enter Member Id To Update:");
                    int update1 = sc.nextInt();

                    while (update1 <= 0) {
                        System.out.println("Member ID Must Be Positive!");
                        System.out.print("Enter Valid Member ID:");
                        update1 = sc.nextInt();
                    }

                    boolean found7 = false;
                    for (int i = 0; i < memberids.size(); i++) {
                        if (memberids.get(i) == update1) {
                            System.out.print("Enter New Member Name:");
                            sc.nextLine();
                            String update2 = sc.nextLine();

                            System.out.print("Enter New Member Phone Number:");
                            String update3 = sc.nextLine();

                            while (update3.length() != 10 || !update3.matches("[0-9]{10}")) {
                                System.out.println("Invalid Mobile Number!");
                                System.out.print("Enter 10 Digit Mobile Number:");
                                update3 = sc.nextLine();
                            }
                            boolean found8 = false;
                            for (int j = 0; j < memberphones.size(); j++) {
                                if (j != i && memberphones.get(j).equals(update3)) {
                                    found8 = true;
                                    break;
                                }
                            }
                            while (found8) {
                                System.out.println("\nThis Phone Number Already Exist!");
                                System.out.print("Enter Different 10 Digit Mobile Number:");
                                update3 = sc.nextLine();
                                while (update3.length() != 10 || !update3.matches("[0-9]{10}")) {
                                    System.out.println("Invalid Mobile Number!");
                                    System.out.print("Enter 10 Digit Mobile Number:");
                                    update3 = sc.nextLine();
                                }
                                found8 = false;
                                for (int j = 0; j < memberphones.size(); j++) {
                                    if (j != i && memberphones.get(j).equals(update3)) {
                                        found8 = true;
                                        break;
                                    }
                                }
                            }
                            membernames.set(i, update2);
                            memberphones.set(i, update3);
                            System.out.println();
                            System.out.println("Member Updated Successfully!");
                            found7 = true;
                            break;
                        }
                    }
                    if (found7 != true) {
                        System.out.println();
                        System.out.println("Member Not Found!");
                    }
                    break;

                case 10:
                    System.out.print("Enter Member Id To Delete:");
                    int delete1 = sc.nextInt();

                    while (delete1 <= 0) {
                        System.out.println("Member ID Must Be Positive!");
                        System.out.print("Enter Valid Member ID:");
                        delete1 = sc.nextInt();
                    }

                    boolean found9 = false;
                    for (int i = 0; i < memberids.size(); i++) {
                        if (memberids.get(i) == delete1) {
                            found9 = true;
                            if (issuedmemberids.contains(delete1)) {
                                System.out.println();
                                System.out.println("Member Has Issued Books!");
                                System.out.println("Return All Books Before Deleting.");
                            } else {
                                memberids.remove(i);
                                membernames.remove(i);
                                memberphones.remove(i);

                                System.out.println();
                                System.out.println("Member Deleted Successfully!");
                            }
                            break;
                        }
                    }

                    if (!found9) {
                        System.out.println();
                        System.out.println("Member Not Found!");
                    }
                    break;

                case 11:
                    if (memberids.isEmpty()) {
                        System.out.println("No Members Available!");
                        break;
                    }
                    if (ids.isEmpty()) {
                        System.out.println("No Books Available!");
                        break;
                    }

                    System.out.print("Enter Member Id:");
                    int id1 = sc.nextInt();

                    while (id1 <= 0) {
                        System.out.println("Member ID Must Be Positive!");
                        System.out.print("Enter Valid Member ID:");
                        id1 = sc.nextInt();
                    }

                    boolean get = false;
                    for (int i = 0; i < memberids.size(); i++) {
                        if (memberids.get(i) == id1) {
                            get = true;
                            break;
                        }
                    }

                    if (!get) {
                        System.out.println();
                        System.out.println("Member Not Found!");
                        break;
                    }

                    int count = 0;
                    for (int i = 0; i < issuedmemberids.size(); i++) {
                        if (issuedmemberids.get(i) == id1) {
                            count++;
                        }
                    }

                    if (count >= 3) {
                        System.out.println("Maximum Borrowing Limit Reached!");
                        break;
                    }

                    System.out.print("Enter Book Id:");
                    int id2 = sc.nextInt();

                    while (id2 <= 0) {
                        System.out.println("Book ID Must Be Positive!");
                        System.out.print("Enter Valid Book ID:");
                        id2 = sc.nextInt();
                    }

                    boolean get1 = false;

                    for (int i = 0; i < ids.size(); i++) {
                        if (ids.get(i) == id2) {
                            get1 = true;
                            break;
                        }
                    }

                    if (!get1) {
                        System.out.println();
                        System.out.println("Book Not Found!");
                        break;
                    }

                    if (issuedbookids.contains(id2)) {
                        System.out.println("Book Already Issued.");
                        break;
                    } else {
                        issuedbookids.add(id2);
                        issuedmemberids.add(id1);
                        System.out.println("Book Issued Successfully!");
                    }
                    break;

                case 12:
                    System.out.print("Enter Member Id For Book Return:");
                    int return1 = sc.nextInt();

                    while (return1 <= 0) {
                        System.out.println("Member ID Must Be Positive!");
                        System.out.print("Enter Valid Member ID:");
                        return1 = sc.nextInt();
                    }

                    boolean get3 = false;
                    for (int i = 0; i < memberids.size(); i++) {
                        if (memberids.get(i) == return1) {
                            get3 = true;
                            break;
                        }
                    }
                    if (get3 != true) {
                        System.out.println();
                        System.out.println("Member Not Found!");
                        break;
                    }
                    System.out.print("Enter Book Id:");
                    int return2 = sc.nextInt();

                    while (return2 <= 0) {
                        System.out.println("Book ID Must Be Positive!");
                        System.out.print("Enter Valid Book ID:");
                        return2 = sc.nextInt();
                    }

                    boolean get4 = false;
                    for (int i = 0; i < ids.size(); i++) {
                        if (ids.get(i) == return2) {
                            get4 = true;
                            break;
                        }
                    }
                    if (get4 != true) {
                        System.out.println();
                        System.out.println("Book Not Found!");
                        break;
                    }
                    boolean get5 = false;
                    for (int i = 0; i < issuedbookids.size(); i++) {
                        if (issuedbookids.get(i) == return2 && issuedmemberids.get(i) == return1) {
                            get5 = true;
                            issuedbookids.remove(i);
                            issuedmemberids.remove(i);
                            System.out.println("Book Return Successfully.");
                            break;
                        }
                    }
                    if (get5 != true) {
                        System.out.println();
                        System.out.println("This Book Is Not Allowed To This Member!");
                    }
                    break;

                case 13:
                    System.out.println("=============== BORROWING RECORDS =============");
                    if (issuedbookids.isEmpty()) {
                        System.out.println("No Borrowing Records Found!");
                    } else {
                        for (int i = 0; i < issuedbookids.size(); i++) {
                            int bookid = issuedbookids.get(i);
                            int memberid = issuedmemberids.get(i);

                            String bookname1 = "";
                            for (int j = 0; j < ids.size(); j++) {
                                if (ids.get(j) == bookid) {
                                    bookname1 = booknames.get(j);
                                    break;
                                }

                            }
                            String membername1 = "";
                            for (int j = 0; j < memberids.size(); j++) {
                                if (memberids.get(j) == memberid) {
                                    membername1 = membernames.get(j);
                                    break;
                                }
                            }
                            System.out.println("Book Id: " + bookid);
                            System.out.println("Book Name: " + bookname1);
                            System.out.println("Member Id: " + memberid);
                            System.out.println("Member Name: " + membername1);
                            System.out.println("----------------------------------------------");
                        }
                    }
                    break;

                case 14:
                    System.out.println("Thank You for Using Library Management System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }
        } while (choice != 14);
    }
}
