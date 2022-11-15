package com.company;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
class Transaction {
    private java.util.Date mDate;

    @Override
    public String toString() {
        return "Transaction{" +
                "mDate=" + mDate +
                ", mType=" + mType +
                ", mAmount=" + mAmount +
                ", mBalance=" + mBalance +
                ", mDescription='" + mDescription + '\'' +
                '}'+"\n";
    }

    private char mType;
    private double mAmount;
    private double mBalance;
    private String mDescription;
    public Transaction(char type, double amount, double balance, String description) {
        mType = type;
        mAmount = amount;
        mBalance = balance;
        mDescription = description;
        mDate = new java.util.Date();
    }
    public char getType() {
        return mType;
    }
    public void setType(char type) {
        mType = type;
    }
    public double getAmount() {
        return mAmount;
    }
    public void setAmount(double amount) {
        mAmount = amount;
    }
    public double getBalance() {
        return mBalance;
    }
    public void setBalance(double balance) {
        mBalance = balance;
    }
    public String getDescription() {
        return mDescription;
    }
    public void setDescription(String description) {
        mDescription = description;
    }
    public java.util.Date getDate() {
        return mDate;
    }
}
class Account {
    private int id = 0;
    private double balance = 0.0;
    private static double annualInterestRate = 0.0;
    private java.util.Date dateCreated;
    private String name;
    private ArrayList<Transaction> transactions;

    public Account() {
        dateCreated = new java.util.Date();
        transactions = new ArrayList<Transaction>();
    }

    public Account(int id, double balance) {
        this();
        this.id = id;
        this.balance = balance;
    }

    public Account(int id, double balance, String n) {
        this(id, balance);
        this.name = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public int getId() {
        return this.id;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public String getDateCreated() {
        return this.dateCreated.toString();
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (annualInterestRate / 100) / 12 ;
    }

    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    public void withdraw(double amount) {
        this.balance -= amount;
        Transaction t = new Transaction('W', amount, this.balance, "Withdraw from account.");
        transactions.add(t);
    }

    public void deposit(double amount) {
        this.balance += amount;
        Transaction t = new Transaction('D', amount, this.balance, "Deposit to account.");
        transactions.add(t);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", balance=" + balance +
                ", dateCreated=" + dateCreated +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Main {
    public static void main(String[] args)
    {
        Account Person = new Account(1122,1000,"Yaroslav_Solomianiy");
        Person.setAnnualInterestRate(14.0);
        Person.deposit(50);
        Person.deposit(100);
        Person.deposit(200);
        Person.withdraw(40);
        Person.withdraw(20);
        Person.withdraw(100);
        System.out.println(Person);
        System.out.println(Person.getTransactions());
        printTimeStamp();

    }
    public static void printTimeStamp() {
        final String sname = "Yaroslav Solomianyi";
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = null;
        dateFormat = new SimpleDateFormat();
        System.out.println("Made by: " + sname + " on " + dateFormat.format(currentDate));
    }
}
