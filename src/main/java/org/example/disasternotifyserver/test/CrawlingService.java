package org.example.disasternotifyserver.test;

import com.mongodb.DuplicateKeyException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
@Slf4j
public class CrawlingService {
    private final CrawlingRepository crawlingRepository;

    public CrawlingInfo getCrawlingInfoByName(String name) {
        CrawlingInfo crawlingInfo = crawlingRepository.findCrawlingInfoByName(name);
        return crawlingInfo;
    }

    @Transactional
    public ResponseEntity<Void> addCrawlingInfo(CrawlingInfo crawlingInfo){
        try{
            crawlingRepository.save(crawlingInfo);
        }catch (DuplicateKeyException e){
            log.error("중복키 오류 발생");
            return ResponseEntity.status(HttpStatus.CONFLICT).build(); // 409 Conflict
        }catch(Exception e){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok().build();
    }

    public ResponseEntity<List<CrawlingInfo>> getAllCrawlingInfo(){

        List<CrawlingInfo> result;
        try{
            result = crawlingRepository.findAll();
        }catch (Exception e){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(result);
    }
}