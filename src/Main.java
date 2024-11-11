public class Main {
    public static void main(String[] args) {
        // Tạo 3 cuốn sách ProgrammingBook
        ProgrammingBook pBook1 = new ProgrammingBook("P001", "Java Programming", 100, "Author A", "Java", "Spring");
        ProgrammingBook pBook2 = new ProgrammingBook("P002", "C++ Programming", 120, "Author B", "C++", "Qt");
        ProgrammingBook pBook3 = new ProgrammingBook("P003", "Python Programming", 90, "Author C", "Python", "Django");

        // Tạo 3 cuốn sách FictionBook
        FictionBook fBook1 = new FictionBook("F001", "Mystery Island", 80, "Author X", "Viễn tưởng 1");
        FictionBook fBook2 = new FictionBook("F002", "Space Odyssey", 110, "Author Y", "Viễn tưởng 2");
        FictionBook fBook3 = new FictionBook("F003", "Fantasy Realm", 95, "Author Z", "Viễn tưởng 1");

        // Tính tổng tiền của 6 cuốn sách sau khi áp dụng giảm giá
        double totalCost = pBook1.getPriceAfterDiscount() + pBook2.getPriceAfterDiscount() + pBook3.getPriceAfterDiscount() +
                fBook1.getPriceAfterDiscount() + fBook2.getPriceAfterDiscount() + fBook3.getPriceAfterDiscount();
        System.out.printf("Tổng tiền của 6 cuốn sách sau khi giảm giá: %.2f\n", totalCost);

        // Đếm số sách ProgrammingBook có language là "Java"
        int javaBookCount = 0;
        if (pBook1.getLanguage().equals("Java")) javaBookCount++;
        if (pBook2.getLanguage().equals("Java")) javaBookCount++;
        if (pBook3.getLanguage().equals("Java")) javaBookCount++;
        System.out.println("Số sách ProgrammingBook có language là 'Java': " + javaBookCount);

        // Đếm số sách FictionBook có category là "Viễn tưởng 1"
        int fictionCategoryCount = 0;
        if (fBook1.getCategory().equals("Viễn tưởng 1")) fictionCategoryCount++;
        if (fBook2.getCategory().equals("Viễn tưởng 1")) fictionCategoryCount++;
        if (fBook3.getCategory().equals("Viễn tưởng 1")) fictionCategoryCount++;
        System.out.println("Số sách FictionBook có category là 'Viễn tưởng 1': " + fictionCategoryCount);

        // Đếm số sách FictionBook có giá < 100
        int fictionPriceCount = 0;
        if (fBook1.getPrice() < 100) fictionPriceCount++;
        if (fBook2.getPrice() < 100) fictionPriceCount++;
        if (fBook3.getPrice() < 100) fictionPriceCount++;
        System.out.println("Số sách FictionBook có giá < 100: " + fictionPriceCount);
    }
}