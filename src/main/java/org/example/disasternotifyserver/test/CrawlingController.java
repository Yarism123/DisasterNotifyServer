package org.example.disasternotifyserver.test;

import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class CrawlingController {

    private final CrawlingService crawlingService;

    @GetMapping("/")
    public String home(){
        return "index";
    }


    @GetMapping("/api/crawling/find/name/{title}")
    public ResponseEntity<Message> getName(@PathVariable String title){

        Message message = new Message();
        CrawlingInfo crawlingInfo = crawlingService.getCrawlingInfoByName(title);
        message.setStatus(StatusEnum.OK);
        message.setMessage("해당하는 이름을 가져옵니다.");
        message.setData(crawlingInfo);

        return new ResponseEntity(message, HttpStatus.OK);
    }

    @PostMapping("/api/crawling/info")
    public ResponseEntity<Void> saveCrawlingInfo(@RequestBody CrawlingInfo crawlingInfo) {
        return crawlingService.addCrawlingInfo(crawlingInfo);
    }

    @GetMapping("/api/crawling/getAllInfo")
    public ResponseEntity<List<CrawlingInfo>> getAllInfo(){
        return crawlingService.getAllCrawlingInfo();
    }

}
