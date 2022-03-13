package ru.job4j.dream.model;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Store {

    private static final Store INST = new Store();

    private Map<Integer, Post> posts = new ConcurrentHashMap<>();

    private Map<Integer, Candidate> candidates = new ConcurrentHashMap<>();

    private Store() {
        posts.put(1, new Post(1, "Junior Java Job", "Без опыта работы", LocalDateTime.of(2021, 11, 12, 10, 15)));
        posts.put(2, new Post(2, "Middle Java Job", "Опыт от года", LocalDateTime.of(2021, 12, 12, 12, 34)));
        posts.put(3, new Post(3, "Senior Java Job", "Опыт от трёх лет", LocalDateTime.of(2022, 10, 5, 13, 5)));
        candidates.put(1, new Candidate(1, "Tom - Junior Java"));
        candidates.put(2, new Candidate(2, "Bob - Middle Java"));
        candidates.put(3, new Candidate(3, "Alise - Senior Java"));
    }

    public static Store instOf() {
        return INST;
    }

    public Collection<Post> findAllPosts() {
        return posts.values();
    }

    public Collection<Candidate> findAllCandidate() {
        return candidates.values();
    }
}
