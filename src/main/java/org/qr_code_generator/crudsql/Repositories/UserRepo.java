package org.qr_code_generator.crudsql.Repositories;

import org.qr_code_generator.crudsql.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo extends JpaRepository<User,Long> {
}
