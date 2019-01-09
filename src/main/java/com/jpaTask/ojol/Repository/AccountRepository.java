package com.jpaTask.ojol.Repository;

        import com.jpaTask.ojol.model.Account;
        import org.springframework.data.jpa.repository.JpaRepository;

        import java.math.BigInteger;

public interface AccountRepository extends JpaRepository<Account, String> {
    Account findById(BigInteger id);
    boolean existsById(BigInteger id);
}
