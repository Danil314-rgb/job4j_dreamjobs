package ru.job4j.dream.model;

import dream.DbStore;
import dream.Store;

public class MainStore {

    public static void main(String[] args) {
        Store store = DbStore.instOf();
        store.save(new Post(0, "Java Job"));
        for (Post post : store.findAllPosts()) {
            System.out.println(post.getId() + " " + post.getName());
        }
        System.out.println("-------------------------------------");
        store.save(new Post(1, "Java Lol"));
        for (Post post : store.findAllPosts()) {
            System.out.println(post.getId() + " " + post.getName());
        }
        System.out.println("-------------------------------------");

        System.out.println(store.findById(1).getName());
    }
}
