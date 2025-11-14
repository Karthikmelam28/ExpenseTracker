📌 Expense Tracker (Java Console Application)

A simple and beginner-friendly Java console project to record and analyze daily expenses. This project demonstrates core Java concepts like arrays, loops, conditions, methods, and OOP principles.

🚀 Features

Add expenses with notes and amount

View total expenditure

Find highest and lowest expense

Display all recorded expenses

Simple menu-driven interface

Uses OOP (Classes: Expense, ExpenseManager)

No external libraries required

🛠️ Tech Stack

Java (Core Java)

Console-based application

📂 Project Structure
src/
│
├── Expense.java
├── ExpenseManager.java
└── Main.java

📘 Concepts Used

Arrays

Loops

Conditional statements

OOP: Classes, Objects, Encapsulation

Methods & constructors

Switch-case menu

▶️ How to Run

Download or clone the repository

Open in any Java IDE (IntelliJ / VS Code / Eclipse)

Compile and run Main.java

Use the menu to manage expenses

📈 Future Enhancements

Add file storage (save expenses to a file)

Add categories (food, travel, shopping, etc.)

Monthly analysis reports

Convert to GUI app using JavaFX

📜 License

Free for learning & personal use.

✅ 2. UML Class Diagram (Text-based + image-ready layout)

You can draw this as a diagram using any UML tool:

+------------------+
|     Expense      |
+------------------+
| - note: String   |
| - amount: double |
+------------------+
| + getNote(): String
| + getAmount(): double
+------------------+

          1..*
             |
             |
+---------------------------+
|      ExpenseManager       |
+---------------------------+
| - expenses: Expense[]     |
| - count: int              |
+---------------------------+
| + addExpense(e: Expense)  |
| + getTotal(): double      |
| + getHighest(): double    |
| + getLowest(): double     |
| + showAll(): void         |
+---------------------------+

               |
              uses
               |
         +------------+
         |   Main     |
         +------------+
         | + main()   |
         +------------+
