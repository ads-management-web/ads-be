package com.adsmanagement.wards;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.Optional;

public interface WardRepository extends CrudRepository<Ward, Short> {

}