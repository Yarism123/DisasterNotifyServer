package org.example.disasternotifyserver.test;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CrawlingService {
    private final CrawlingRepository crawlingRepository;

    public CrawlingInfo getCrawlingInfoByName(String name) {

        CrawlingInfo crawlingInfo = crawlingRepository.findCrawlingInfoByName(name);

        return crawlingInfo;
    }
}