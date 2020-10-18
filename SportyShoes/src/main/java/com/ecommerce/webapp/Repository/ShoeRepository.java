package com.ecommerce.webapp.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.webapp.Pojo.ShoeDetails;

@Repository
public interface ShoeRepository extends JpaRepository <ShoeDetails, Long > {
	

}
