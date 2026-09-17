# ATM_Simulation_System
The primary purpose of an ATM simulation system is to mimic the operations, transaction workflows, and security features of a real Automated Teller Machine (ATM) in a virtual, risk-free environment


# Overview of the Project

The ATM Simulation System is a console-based Java application that simulates the basic functions of an Automated Teller Machine.

The system allows a user to log in using an account number and PIN and then perform common banking operations such as checking the balance, depositing money, withdrawing money, and viewing transaction history.

The project uses Java classes and collections such as HashMap and ArrayList to store account information and transaction records during program execution.

Basic security is also included through account number and PIN validation. The system checks the available balance before allowing a withdrawal.

This project is developed mainly for understanding Java programming, Object-Oriented Programming (OOP), collections, methods, conditional statements, loops, and basic authentication.

# Features
1. Account Login
User enters an account number.
User enters a PIN.
The system checks whether the account exists.
The entered PIN is validated before allowing access.

2. Balance Inquiry
The user can check the current balance of their account.
Example:
Current Balance: Rs80000.0

3. Deposit Money
The user can deposit money into their account.
The system checks that the entered amount is greater than zero.

4. Withdraw Money
The user can withdraw money from their account.
The system checks:
Withdrawal amount is valid.
Withdrawal amount is not greater than the current balance.

5. Transaction History
The system stores and displays transactions such as:
Account opening
Deposits
Withdrawals

6. Basic Security
The project provides basic security through:
Account number verification
PIN authentication
Private PIN variable
Balance checking before withdrawal
Validation of deposit and withdrawal amounts

7. Exit

The user can exit the ATM system after completing their transactions.

# Technologies / Tools used
1. Java:	Main programming language

2. VS Code:	Code editor and development environment

3. JDK:	Compiling and running Java programs

4. HashMap: Storing account information

5. ArrayList:	Storing transaction history

6. Scanner:	Taking input from the user

7. OOP Concepts:	Organizing the project using classes and objects

# Steps to Install & Run the Project
Step 1: Install Java JDK
Install the Java Development Kit on your computer.
Check whether Java is installed: java -version
Also check the Java compiler: javac -version

Step 2: Install VS Code
Open the project in Visual Studio Code.
Make sure the Java Extension Pack is installed in VS Code.

Step 3: Create the Project Folder
Create a folder named:
ATM-Simulation
Inside the folder, create these files:
atm_simulation_system
│
├── Account.java
└── ATMSimulation.java

Step 4: Add the Java Code
Paste the Account class into:
Account.java
Paste the ATMSimulation class into:
ATMSimulation.java
Both files should be in the same folder.

Step 5: Open the Terminal
In VS Code, open:
Terminal → New Terminal
Navigate to the project folder if required.

Step 6: Compile the Program
Run:
javac Account.java ATMSimulation.java
If there are no errors, the Java files have been successfully compiled.

Step 7: Run the Program
Run:
java ATMSimulation
The ATM welcome screen will appear.

# Instructions for Testing

The project can be tested using the sample accounts already included in the program.

Test Account 1
Account Number: 234678
PIN: 9999
Initial Balance: Rs80000

Test Account 2
Account Number: 799912
PIN: 1234
Initial Balance: Rs85000

Test Case 1: Valid Login
Input:
Account Number: 234678
PIN: 9999
Expected Output:
Login Successful! Welcome back.

Test Case 2: Invalid PIN
Input:
Account Number: 234678
PIN: 1111
Expected Output:
Invalid Account Number or PIN. Please try again.
The system should not allow the user to access the ATM menu.

Test Case 3: Check Balance
After successful login, 
select: 1
Expected Output:
Current Balance: Rs80000.0

Test Case 4: Deposit Money
Select: 2
Enter: 5000
Expected Output: Successfully deposited Rs5000.0
The new balance should be: Rs85000.0

Test Case 5: Withdraw Money
Select: 3
Enter: 10000
Expected Output: Successfully withdrew Rs10000.0
The balance should decrease accordingly.

Test Case 6: Insufficient Balance
Try to withdraw an amount greater than the available balance.
For example: 1000000
Expected Output: Insufficient funds! Current balance: Rs...
The withdrawal should not take place.

Test Case 7: Invalid Deposit
Enter: -500
Expected Output: Invalid deposit amount.
The balance should remain unchanged.

Test Case 8: Invalid Withdrawal
Enter: -1000
Expected Output: Invalid withdrawal amount.
The balance should remain unchanged.

Test Case 9: View Statement
Select: 4
Expected Output:
--- Transaction History ---
Account opened with balance: Rs80000.0
Deposited: Rs5000.0
Withdrew: Rs10000.0
The displayed transactions should match the operations performed during the current program execution.

Test Case 10: Exit
Select: 5
Expected Output:
Thank you . Have a good day !

The program should terminate normally.
