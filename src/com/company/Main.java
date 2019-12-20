package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User(4, "BMW"));
        users.add(new User(2, "Audi"));
        users.add(new User(6, "Golf"));
        users.add(new User(1, "Porsche"));
        users.add(new User(2, "Renault"));
        users.add(new User(3, "Ford"));

        Collections.sort(users);

        for(User user : users) {
            System.out.println(user);

        }}}

