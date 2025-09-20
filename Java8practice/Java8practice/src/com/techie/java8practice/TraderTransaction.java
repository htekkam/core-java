package com.techie.java8practice;

import com.techie.java8practice.entities.Trader;
import com.techie.java8practice.entities.Transaction;

import java.util.*;
import java.util.stream.Collectors;

public class TraderTransaction {
    public static final String CITY="Cambridge";
    public static void main(String[] args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario","Milan");
        Trader alan = new Trader("Alan","Cambridge");
        Trader brian = new Trader("Brian","Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        System.out.println("sorting all transactions in 2011");
        transactions.stream()
                .filter(transaction -> transaction.getYear()==2011)
                .sorted(Comparator.comparing(Transaction::getValue))
                .forEach(System.out::println);

        System.out.println("unique cities traders work");
        transactions.stream()
                .map(Transaction::getTrader)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        System.out.println("Finding all traders from 'Cambridge and sorting them'");
        transactions.stream()
                .map(Transaction::getTrader)
                .filter(trader -> trader.getCity().equalsIgnoreCase(CITY))
                .distinct()
                .sorted(Comparator.comparing(Trader::getName))
                .forEach(System.out::println);

        System.out.println("Names  of all traders");
        String traderNames = transactions.stream()
                .map(transaction -> transaction.getTrader())
                .map(trader -> trader.getName())
                .distinct()
                        .collect(Collectors.joining());
                //.reduce("", (n1, n2) -> n1 + n2);
        System.out.println("Trader names::"+traderNames);


        System.out.println("Traders baesd on Milan");
        transactions.stream()
                .map(transaction -> transaction.getTrader())
                .filter(trader -> trader.getCity().equalsIgnoreCase("Milan"))
                .distinct()
                .forEach(System.out::println);

        System.out.println("Are any traders based on Milan");
        boolean anyTraderFromMilan =
                transactions.stream()
                                .anyMatch(transaction -> transaction.getTrader().getCity().equalsIgnoreCase("Milan"));
        System.out.println(anyTraderFromMilan);

        System.out.println("All transactions of traders living in cambridge");
        transactions.stream()
                .filter(transaction -> transaction.getTrader().getCity().equalsIgnoreCase(CITY))
                .map(Transaction::getValue)
                .distinct()
                .forEach(System.out::println);

        System.out.println("Getting highest value of all transaction");

        Optional<Integer> highestTransaction =
                transactions.stream()
                        .map(Transaction::getValue)
                        .reduce(Integer::max);

        System.out.println(highestTransaction.isPresent()?highestTransaction.get():0);

        System.out.println("Highest value using optionalInt");

        OptionalInt maxValue = transactions.stream()
                        .mapToInt(Transaction::getValue)
                                .max();
        int maxValueInt = maxValue.orElse(1);


        System.out.println("Finding the transaction with smallest value");
        Optional<Transaction> min = transactions.stream()
                .min(Comparator.comparing(Transaction::getValue));

        System.out.println(min);


    }
}
