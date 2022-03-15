package dream;

import org.junit.Test;
import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.Post;

import java.util.Collection;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class DbStoreTest {

    @Test
    public void whenCreatePost() {
        Store store = DbStore.instOf();
        Post post = new Post(0, "Java Job");
        store.save(post);
        Post postInDb = store.findByPostId(post.getId());
        assertThat(postInDb.getName(), is(post.getName()));
    }

    @Test
    public void whenUpdatePost() {
        Store store = DbStore.instOf();
        Post post1 = new Post(0, "Java Job");
        Post post2 = new Post(1, "Java Job4j");
        store.save(post1);
        store.save(post2);
        assertThat(store.findByPostId(1).getName(), is("Java Job4j"));
    }

    @Test
    public void whenFindAllPosts() {
        Store store = DbStore.instOf();
        Post post1 = new Post(0, "Java Job");
        Post post2 = new Post(0, "Java Job4j");
        Post post3 = new Post(0, "Java");
        Post post4 = new Post(0, "Java Middle");
        store.save(post1);
        store.save(post2);
        store.save(post3);
        store.save(post4);
        Collection<Post> posts = store.findAllPosts();
        assertTrue(posts.contains(post1));
        assertTrue(posts.contains(post2));
        assertTrue(posts.contains(post3));
        assertTrue(posts.contains(post4));
    }

    @Test
    public void whenCreateCandidate() {
        Store store = DbStore.instOf();
        Candidate candidate = new Candidate(0, "Danil - Junior");
        store.save(candidate);
        Candidate candidateInDb = store.findByCandidateId(candidate.getId());
        assertThat(candidateInDb.getName(), is(candidate.getName()));
    }

    @Test
    public void whenUpdateCandidate() {
        Store store = DbStore.instOf();
        Candidate candidate1 = new Candidate(0, "Danil - Junior");
        Candidate candidate2 = new Candidate(1, "Andrey - Junior");
        store.save(candidate1);
        store.save(candidate2);
        assertThat(store.findByCandidateId(1).getName(), is("Andrey - Junior"));
    }

    @Test
    public void whenFindAllCandidates() {
        Store store = DbStore.instOf();
        Candidate candidate1 = new Candidate(0, "Danil - Junior");
        Candidate candidate2 = new Candidate(0, "Andrey - Junior");
        Candidate candidate3 = new Candidate(0, "Dima - Junior+");
        Candidate candidate4 = new Candidate(0, "Andrey - Junior+");
        store.save(candidate1);
        store.save(candidate2);
        store.save(candidate3);
        store.save(candidate4);
        Collection<Candidate> candidates = store.findAllCandidates();
        assertTrue(candidates.contains(candidate1));
        assertTrue(candidates.contains(candidate2));
        assertTrue(candidates.contains(candidate3));
        assertTrue(candidates.contains(candidate4));
    }
}