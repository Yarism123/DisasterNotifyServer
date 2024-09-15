package org.example.disasternotifyserver.test;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrawlingRepository extends MongoRepository<CrawlingInfo, String> {
    CrawlingInfo findCrawlingInfoByName(String name);
}