package com.ms.email.repositories;

import com.ms.email.models.EmailModel;
import org.hibernate.validator.constraints.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmailRepository extends JpaRepository<EmailModel, UUID> {
}
