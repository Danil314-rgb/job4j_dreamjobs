package dream;

import ru.job4j.dream.model.Candidate;
import ru.job4j.dream.model.City;
import ru.job4j.dream.model.Post;
import ru.job4j.dream.model.User;

import java.util.Collection;

public interface Store {

    Collection<Post> findAllPosts();

    Collection<Candidate> findAllCandidates();

    Collection<User> findAllUsers();

    Collection<City> findAllCities();

    void save(Post post);

    void save(Candidate candidate);

    void save(User user);

    Post findByPostId(int id);

    Candidate findByCandidateId(int id);

    User findByUserId(int id);

    User findByUserEmail(String email);

    Collection<Post> allTodayPost();

    Collection<Candidate> allTodayCandidate();
}
