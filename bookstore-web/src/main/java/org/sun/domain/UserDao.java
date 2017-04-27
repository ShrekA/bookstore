package org.sun.domain;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import org.sun.entity.User;

/**
 * Created by Mr.sun on 2017/4/18.
 */
@Repository
public interface UserDao extends PagingAndSortingRepository<User,Long> {

}
