package org.test.client.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.test.client.Model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {
}
