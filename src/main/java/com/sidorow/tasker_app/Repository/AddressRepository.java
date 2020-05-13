package com.sidorow.tasker_app.Repository;


import com.sidorow.tasker_app.Repository.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface AddressRepository extends JpaRepository<Address,Long> {
}
