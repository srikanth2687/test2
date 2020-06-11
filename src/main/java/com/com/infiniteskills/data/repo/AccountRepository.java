package com.com.infiniteskills.data.repo;

import com.infiniteskills.data.entities.Account;
import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
