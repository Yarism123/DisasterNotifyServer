package com.company.disasternotifyapp.user.entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class InitializeCityCountyData {
    // 지역과 해당 시/군 데이터 초기화
    HashMap<String, List<String>> cityCountyMap = new HashMap<>();

    public InitializeCityCountyData(){
        // 서울특별시
        List<String> seoulCounties = new ArrayList<>();
        seoulCounties.add("강남구");
        seoulCounties.add("강동구");
        seoulCounties.add("관악구");
        seoulCounties.add("광진구");
        seoulCounties.add("구로구");
        seoulCounties.add("금천구");
        seoulCounties.add("노원구");
        seoulCounties.add("도봉구");
        seoulCounties.add("동대문구");
        seoulCounties.add("동작구");
        seoulCounties.add("마포구");
        seoulCounties.add("서대문구");
        seoulCounties.add("서초구");
        seoulCounties.add("성동구");
        seoulCounties.add("성북구");
        seoulCounties.add("송파구");
        seoulCounties.add("양천구");
        seoulCounties.add("영등포구");
        seoulCounties.add("용산구");
        seoulCounties.add("은평구");
        seoulCounties.add("종로구");
        seoulCounties.add("중구");
        seoulCounties.add("중랑구");
        cityCountyMap.put("서울특별시", seoulCounties);

        // 부산광역시
        List<String> busanCounties = new ArrayList<>();
        busanCounties.add("강서구");
        busanCounties.add("금정구");
        busanCounties.add("기장군");
        busanCounties.add("남구");
        busanCounties.add("동구");
        busanCounties.add("부산진구");
        busanCounties.add("사하구");
        busanCounties.add("서구");
        busanCounties.add("수영구");
        busanCounties.add("연제구");
        busanCounties.add("영도구");
        busanCounties.add("중구");
        busanCounties.add("해운대구");
        cityCountyMap.put("부산광역시", busanCounties);

        // 대구광역시
        List<String> daeguCounties = new ArrayList<>();
        daeguCounties.add("남구");
        daeguCounties.add("달성군");
        daeguCounties.add("달서구");
        daeguCounties.add("동구");
        daeguCounties.add("북구");
        daeguCounties.add("서구");
        daeguCounties.add("수성구");
        daeguCounties.add("중구");
        cityCountyMap.put("대구광역시", daeguCounties);

        // 인천광역시
        List<String> incheonCounties = new ArrayList<>();
        incheonCounties.add("강화군");
        incheonCounties.add("계양구");
        incheonCounties.add("남동구");
        incheonCounties.add("동구");
        incheonCounties.add("미추홀구");
        incheonCounties.add("부평구");
        incheonCounties.add("서구");
        incheonCounties.add("연수구");
        incheonCounties.add("중구");
        cityCountyMap.put("인천광역시", incheonCounties);

        // 광주광역시
        List<String> gwangjuCounties = new ArrayList<>();
        gwangjuCounties.add("광산구");
        gwangjuCounties.add("남구");
        gwangjuCounties.add("동구");
        gwangjuCounties.add("북구");
        gwangjuCounties.add("서구");
        cityCountyMap.put("광주광역시", gwangjuCounties);

        // 대전광역시
        List<String> daejeonCounties = new ArrayList<>();
        daejeonCounties.add("대덕구");
        daejeonCounties.add("동구");
        daejeonCounties.add("서구");
        daejeonCounties.add("유성구");
        daejeonCounties.add("중구");
        cityCountyMap.put("대전광역시", daejeonCounties);

        // 울산광역시
        List<String> ulsanCounties = new ArrayList<>();
        ulsanCounties.add("남구");
        ulsanCounties.add("동구");
        ulsanCounties.add("북구");
        ulsanCounties.add("울주군");
        ulsanCounties.add("중구");
        cityCountyMap.put("울산광역시", ulsanCounties);

        // 세종특별자치시
        List<String> sejongCounties = new ArrayList<>();
        sejongCounties.add("세종시");
        cityCountyMap.put("세종특별자치시", sejongCounties);

        // 경기도
        List<String> gyeonggiCounties = new ArrayList<>();
        gyeonggiCounties.add("수원시");
        gyeonggiCounties.add("성남시");
        gyeonggiCounties.add("고양시");
        gyeonggiCounties.add("용인시");
        gyeonggiCounties.add("화성시");
        gyeonggiCounties.add("평택시");
        gyeonggiCounties.add("안산시");
        gyeonggiCounties.add("안양시");
        gyeonggiCounties.add("부천시");
        gyeonggiCounties.add("시흥시");
        gyeonggiCounties.add("이천시");
        gyeonggiCounties.add("오산시");
        gyeonggiCounties.add("광명시");
        gyeonggiCounties.add("군포시");
        gyeonggiCounties.add("구리시");
        gyeonggiCounties.add("남양주시");
        gyeonggiCounties.add("양주시");
        gyeonggiCounties.add("포천시");
        gyeonggiCounties.add("동두천시");
        gyeonggiCounties.add("의정부시");
        gyeonggiCounties.add("파주시");
        gyeonggiCounties.add("김포시");
        gyeonggiCounties.add("하남시");
        gyeonggiCounties.add("의왕시");
        gyeonggiCounties.add("양평군");
        gyeonggiCounties.add("가평군");
        gyeonggiCounties.add("연천군");
        cityCountyMap.put("경기도", gyeonggiCounties);

        // 강원도
        List<String> gangwonCounties = new ArrayList<>();
        gangwonCounties.add("춘천시");
        gangwonCounties.add("강릉시");
        gangwonCounties.add("원주시");
        gangwonCounties.add("속초시");
        gangwonCounties.add("동해시");
        gangwonCounties.add("홍천군");
        gangwonCounties.add("횡성군");
        gangwonCounties.add("영월군");
        gangwonCounties.add("평창군");
        gangwonCounties.add("정선군");
        gangwonCounties.add("철원군");
        gangwonCounties.add("화천군");
        gangwonCounties.add("양구군");
        gangwonCounties.add("인제군");
        gangwonCounties.add("고성군");
        gangwonCounties.add("양양군");
        cityCountyMap.put("강원도", gangwonCounties);

        // 충청북도
        List<String> chungcheongbukCounties = new ArrayList<>();
        chungcheongbukCounties.add("청주시");
        chungcheongbukCounties.add("충주시");
        chungcheongbukCounties.add("제천시");
        chungcheongbukCounties.add("음성군");
        chungcheongbukCounties.add("진천군");
        chungcheongbukCounties.add("괴산군");
        chungcheongbukCounties.add("증평군");
        chungcheongbukCounties.add("옥천군");
        chungcheongbukCounties.add("영동군");
        chungcheongbukCounties.add("보은군");
        cityCountyMap.put("충청북도", chungcheongbukCounties);

        // 충청남도
        List<String> chungcheongnamCounties = new ArrayList<>();
        chungcheongnamCounties.add("천안시");
        chungcheongnamCounties.add("공주시");
        chungcheongnamCounties.add("보령시");
        chungcheongnamCounties.add("아산시");
        chungcheongnamCounties.add("서산시");
        chungcheongnamCounties.add("태안군");
        chungcheongnamCounties.add("논산시");
        chungcheongnamCounties.add("금산군");
        chungcheongnamCounties.add("계룡시");
        chungcheongnamCounties.add("홍성군");
        chungcheongnamCounties.add("예산군");
        chungcheongnamCounties.add("당진시");
        cityCountyMap.put("충청남도", chungcheongnamCounties);

        // 전라북도
        List<String> jeollabukCounties = new ArrayList<>();
        jeollabukCounties.add("전주시");
        jeollabukCounties.add("익산시");
        jeollabukCounties.add("군산시");
        jeollabukCounties.add("정읍시");
        jeollabukCounties.add("남원시");
        jeollabukCounties.add("김제시");
        jeollabukCounties.add("완주군");
        jeollabukCounties.add("진안군");
        jeollabukCounties.add("무주군");
        jeollabukCounties.add("장수군");
        jeollabukCounties.add("임실군");
        jeollabukCounties.add("순창군");
        jeollabukCounties.add("고창군");
        jeollabukCounties.add("부안군");
        cityCountyMap.put("전라북도", jeollabukCounties);

        // 전라남도
        List<String> jeollanamCounties = new ArrayList<>();
        jeollanamCounties.add("목포시");
        jeollanamCounties.add("여수시");
        jeollanamCounties.add("전남도");
        jeollanamCounties.add("남원시");
        jeollanamCounties.add("장흥군");
        jeollanamCounties.add("곡성군");
        jeollanamCounties.add("순천시");
        jeollanamCounties.add("광양시");
        jeollanamCounties.add("해남군");
        jeollanamCounties.add("함평군");
        jeollanamCounties.add("장성군");
        jeollanamCounties.add("구례군");
        jeollanamCounties.add("산청군");
        cityCountyMap.put("전라남도", jeollanamCounties);

        // 경상북도
        List<String> gyeongbukCounties = new ArrayList<>();
        gyeongbukCounties.add("포항시");
        gyeongbukCounties.add("경주시");
        gyeongbukCounties.add("경산시");
        gyeongbukCounties.add("안동시");
        gyeongbukCounties.add("김천시");
        gyeongbukCounties.add("상주시");
        gyeongbukCounties.add("영주시");
        gyeongbukCounties.add("의성군");
        gyeongbukCounties.add("영천시");
        gyeongbukCounties.add("칠곡군");
        gyeongbukCounties.add("고령군");
        gyeongbukCounties.add("봉화군");
        gyeongbukCounties.add("성주군");
        gyeongbukCounties.add("청도군");
        cityCountyMap.put("경상북도", gyeongbukCounties);

        // 경상남도
        List<String> gyeongnamCounties = new ArrayList<>();
        gyeongnamCounties.add("창원시");
        gyeongnamCounties.add("김해시");
        gyeongnamCounties.add("진주시");
        gyeongnamCounties.add("마산시");
        gyeongnamCounties.add("사천시");
        gyeongnamCounties.add("밀양시");
        gyeongnamCounties.add("경산시");
        gyeongnamCounties.add("통영시");
        gyeongnamCounties.add("동영천시");
        gyeongnamCounties.add("하만군");
        gyeongnamCounties.add("산청군");
        gyeongnamCounties.add("구례군");
        gyeongnamCounties.add("장성군");
        gyeongnamCounties.add("고령군");
        gyeongnamCounties.add("경주군");
        cityCountyMap.put("경상남도", gyeongnamCounties);

        // 제주특별자치도
        List<String> jejuCounties = new ArrayList<>();
        jejuCounties.add("제주시");
        jejuCounties.add("서귀포시");
        cityCountyMap.put("제주특별자치도", jejuCounties);
    }
}
