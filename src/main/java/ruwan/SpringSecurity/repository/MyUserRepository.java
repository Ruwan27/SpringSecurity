package ruwan.SpringSecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ruwan.SpringSecurity.model.MyUser;


import java.util.Optional;

public interface MyUserRepository extends JpaRepository <MyUser, Long> {
    Optional<MyUser>findByUsername(String username) ;
}
