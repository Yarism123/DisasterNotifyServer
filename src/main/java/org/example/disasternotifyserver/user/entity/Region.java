package org.example.disasternotifyserver.user.entity;

import lombok.Getter;

@Getter
public enum Region {
    // 광역시 및 도 (도시 코드)
    SEOUL("서울특별시", 1),
    BUSAN("부산광역시", 2),
    DAEGU("대구광역시", 3),
    INCHEON("인천광역시", 4),
    GWANGJU("광주광역시", 5),
    DAEJEON("대전광역시", 6),
    ULSAN("울산광역시", 7),
    SEJONG("세종특별자치시", 8),
    GYEONGGI("경기도", 9),
    GANGWON("강원도", 10),
    CHUNGCHEONGBUK("충청북도", 11),
    CHUNGCHEONGNAM("충청남도", 12),
    JEOLLABUK("전라북도", 13),
    JEOLLANAM("전라남도", 14),
    GYEONGBUK("경상북도", 15),
    GYEONGNAM("경상남도", 16),
    JEJU("제주특별자치도", 17);

    private final String name;
    private final int code;

    Region(String name, int code) {
        this.name = name;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    // 각 지역의 구 (군 코드)
    public enum District {
        // 서울특별시
        SEOUL_GANGNAM("서울특별시 강남구", 101),
        SEOUL_GANGDONG("서울특별시 강동구", 102),
        SEOUL_GWANAK("서울특별시 관악구", 103),
        SEOUL_GWANGJIN("서울특별시 광진구", 104),
        SEOUL_GURO("서울특별시 구로구", 105),
        SEOUL_GEUMCHEON("서울특별시 금천구", 106),
        SEOUL_NOWON("서울특별시 노원구", 107),
        SEOUL_DOBONG("서울특별시 도봉구", 108),
        SEOUL_DONGDAEMUN("서울특별시 동대문구", 109),
        SEOUL_DONGJAK("서울특별시 동작구", 110),
        SEOUL_MAPO("서울특별시 마포구", 111),
        SEOUL_SEODAEMUN("서울특별시 서대문구", 112),
        SEOUL_SEOCHO("서울특별시 서초구", 113),
        SEOUL_SEONGDONG("서울특별시 성동구", 114),
        SEOUL_SEONGBUK("서울특별시 성북구", 115),
        SEOUL_SONGPA("서울특별시 송파구", 116),
        SEOUL_YANGCHEON("서울특별시 양천구", 117),
        SEOUL_YEONGDEUNGPO("서울특별시 영등포구", 118),
        SEOUL_YONGSAN("서울특별시 용산구", 119),
        SEOUL_EUNPYEONG("서울특별시 은평구", 120),
        SEOUL_JONGNO("서울특별시 종로구", 121),
        SEOUL_JUNG("서울특별시 중구", 122),
        SEOUL_JUNGPYUNG("서울특별시 중랑구", 123),

        // 부산광역시
        BUSAN_GANGSEO("부산광역시 강서구", 201),
        BUSAN_GUMJEONG("부산광역시 금정구", 202),
        BUSAN_GIJANG("부산광역시 기장군", 203),
        BUSAN_NAM("부산광역시 남구", 204),
        BUSAN_DONG("부산광역시 동구", 205),
        BUSAN_BUSANJIN("부산광역시 부산진구", 206),
        BUSAN_SAHA("부산광역시 사하구", 207),
        BUSAN_SE("부산광역시 서구", 208),
        BUSAN_SUYONG("부산광역시 수영구", 209),
        BUSAN_YEONJE("부산광역시 연제구", 210),
        BUSAN_YEONGDO("부산광역시 영도구", 211),
        BUSAN_JUNG("부산광역시 중구", 212),
        BUSAN_HAEUNDAE("부산광역시 해운대구", 213),

        // 대구광역시
        DAEGU_NAM("대구광역시 남구", 301),
        DAEGU_DALSEONG("대구광역시 달성군", 302),
        DAEGU_DALSEO("대구광역시 달서구", 303),
        DAEGU_DONG("대구광역시 동구", 304),
        DAEGU_BUK("대구광역시 북구", 305),
        DAEGU_SE("대구광역시 서구", 306),
        DAEGU_SUSEONG("대구광역시 수성구", 307),
        DAEGU_JUNG("대구광역시 중구", 308),

        // 인천광역시
        INCHEON_GANGHWA("인천광역시 강화군", 401),
        INCHEON_GYEYANG("인천광역시 계양구", 402),
        INCHEON_NAMDONG("인천광역시 남동구", 403),
        INCHEON_DONG("인천광역시 동구", 404),
        INCHEON_MICHEON("인천광역시 미추홀구", 405),
        INCHEON_BUPYEONG("인천광역시 부평구", 406),
        INCHEON_SE("인천광역시 서구", 407),
        INCHEON_YEONSU("인천광역시 연수구", 408),
        INCHEON_JUNG("인천광역시 중구", 409),

        // 광주광역시
        GWANGJU_GWANGSAN("광주광역시 광산구", 501),
        GWANGJU_NAM("광주광역시 남구", 502),
        GWANGJU_DONG("광주광역시 동구", 503),
        GWANGJU_BUK("광주광역시 북구", 504),
        GWANGJU_SE("광주광역시 서구", 505),

        // 대전광역시
        DAEJEON_DAEDEOK("대전광역시 대덕구", 601),
        DAEJEON_DONG("대전광역시 동구", 602),
        DAEJEON_SE("대전광역시 서구", 603),
        DAEJEON_YUSEONG("대전광역시 유성구", 604),
        DAEJEON_JUNG("대전광역시 중구", 605),

        // 울산광역시
        ULSAN_NAM("울산광역시 남구", 701),
        ULSAN_DONG("울산광역시 동구", 702),
        ULSAN_BUK("울산광역시 북구", 703),
        ULSAN_ULJU("울산광역시 울주군", 704),
        ULSAN_JUNG("울산광역시 중구", 705),

        // 세종특별자치시
        SEJONG("세종특별자치시", 801),

        // 경기도
        GYEONGGI_SUWON("경기도 수원시", 901),
        GYEONGGI_SEONGNAM("경기도 성남시", 902),
        GYEONGGI_GOYANG("경기도 고양시", 903),
        GYEONGGI_YONGIN("경기도 용인시", 904),
        GYEONGGI_HWASEONG("경기도 화성시", 905),
        GYEONGGI_PYEONGTAEK("경기도 평택시", 906),
        GYEONGGI_ANSAN("경기도 안산시", 907),
        GYEONGGI_ANYANG("경기도 안양시", 908),
        GYEONGGI_BUCHEON("경기도 부천시", 909),
        GYEONGGI_SIHEUNG("경기도 시흥시", 910),
        GYEONGGI_ICHEON("경기도 이천시", 911),
        GYEONGGI_OSAN("경기도 오산시", 912),
        GYEONGGI_GWANGMYEONG("경기도 광명시", 913),
        GYEONGGI_GUNPO("경기도 군포시", 914),
        GYEONGGI_GURI("경기도 구리시", 915),
        GYEONGGI_NAMYANGJU("경기도 남양주시", 916),
        GYEONGGI_YANGJU("경기도 양주시", 917),
        GYEONGGI_POCHEON("경기도 포천시", 918),
        GYEONGGI_DONGDUCHEON("경기도 동두천시", 919),
        GYEONGGI_UJEONGBU("경기도 의정부시", 920),
        GYEONGGI_PAJU("경기도 파주시", 921),
        GYEONGGI_KIMPO("경기도 김포시", 922),
        GYEONGGI_HANAM("경기도 하남시", 923),
        GYEONGGI_UIWANG("경기도 의왕시", 924),
        GYEONGGI_YANGPYEONG("경기도 양평군", 925),
        GYEONGGI_GAPYEONG("경기도 가평군", 926),
        GYEONGGI_YEONCHEON("경기도 연천군", 927),

        // 강원도
        GANGWON_CHUNCHEON("강원도 춘천시", 1001),
        GANGWON_GANGNEUNG("강원도 강릉시", 1002),
        GANGWON_WONJU("강원도 원주시", 1003),
        GANGWON_SOKCHO("강원도 속초시", 1004),
        GANGWON_DONGHAE("강원도 동해시", 1005),
        GANGWON_HONGCHEON("강원도 홍천군", 1006),
        GANGWON_HWANGHAE("강원도 횡성군", 1007),
        GANGWON_YEONGWOL("강원도 영월군", 1008),
        GANGWON_PYEONGCHANG("강원도 평창군", 1009),
        GANGWON_JEONGSEON("강원도 정선군", 1010),
        GANGWON_CHEORWON("강원도 철원군", 1011),
        GANGWON_HACHOEN("강원도 화천군", 1012),
        GANGWON_YANGGU("강원도 양구군", 1013),
        GANGWON_INJE("강원도 인제군", 1014),
        GANGWON_GOSEONG("강원도 고성군", 1015),
        GANGWON_YANGYANG("강원도 양양군", 1016),

        // 충청북도
        CHUNGCHEONGBUK_CHUNGCHEON("충청북도 청주시", 1101),
        CHUNGCHEONGBUK_CHUNGJU("충청북도 충주시", 1102),
        CHUNGCHEONGBUK_JECHUN("충청북도 제천시", 1103),
        CHUNGCHEONGBUK_EUMSEONG("충청북도 음성군", 1104),
        CHUNGCHEONGBUK_JINCHUN("충청북도 진천군", 1105),
        CHUNGCHEONGBUK_GOEASAN("충청북도 괴산군", 1106),
        CHUNGCHEONGBUK_JEUNGPOK("충청북도 증평군", 1107),
        CHUNGCHEONGBUK_OKCHEON("충청북도 옥천군", 1108),
        CHUNGCHEONGBUK_YEONGDONG("충청북도 영동군", 1109),
        CHUNGCHEONGBUK_BOEUN("충청북도 보은군", 1110),

        // 충청남도
        CHUNGCHEONGNAM_CHUNAN("충청남도 천안시", 1201),
        CHUNGCHEONGNAM_GONGJU("충청남도 공주시", 1202),
        CHUNGCHEONGNAM_BORYEONG("충청남도 보령시", 1203),
        CHUNGCHEONGNAM_ASAN("충청남도 아산시", 1204),
        CHUNGCHEONGNAM_SEOSAN("충청남도 서산시", 1205),
        CHUNGCHEONGNAM_TAEAN("충청남도 태안군", 1206),
        CHUNGCHEONGNAM_NONSAN("충청남도 논산시", 1207),
        CHUNGCHEONGNAM_GUMSAN("충청남도 금산군", 1208),
        CHUNGCHEONGNAM_GYEONGGI("충청남도 계룡시", 1209),
        CHUNGCHEONGNAM_HONGSEONG("충청남도 홍성군", 1210),
        CHUNGCHEONGNAM_YESAN("충청남도 예산군", 1211),
        CHUNGCHEONGNAM_DANGJIN("충청남도 당진시", 1212),

        // 전라북도
        JEOLLABUK_JEONJU("전라북도 전주시", 1301),
        JEOLLABUK_IKSAN("전라북도 익산시", 1302),
        JEOLLABUK_GUNSAN("전라북도 군산시", 1303),
        JEOLLABUK_JEONGJU("전라북도 정읍시", 1304),
        JEOLLABUK_NAMWON("전라북도 남원시", 1305),
        JEOLLABUK_KIMJE("전라북도 김제시", 1306),
        JEOLLABUK_WANJU("전라북도 완주군", 1307),
        JEOLLABUK_JINAN("전라북도 진안군", 1308),
        JEOLLABUK_MUJU("전라북도 무주군", 1309),
        JEOLLABUK_JANGSU("전라북도 장수군", 1310),
        JEOLLABUK_IMSIL("전라북도 임실군", 1311),
        JEOLLABUK_SOONCHANG("전라북도 순창군", 1312),
        JEOLLABUK_GOCHANG("전라북도 고창군", 1313),
        JEOLLABUK_BUAN("전라북도 부안군", 1314),

        // 전라남도
        JEOLLANAM_MOKPO("전라남도 목포시", 1401),
        JEOLLANAM_YEOSU("전라남도 여수시", 1402),
        JEOLLANAM_JEONNAM("전라남도 전남도", 1403),
        JEOLLANAM_NAMWON("전라남도 남원시", 1404),
        JEOLLANAM_JANGHEUNG("전라남도 장흥군", 1405),
        JEOLLANAM_GOKSEONG("전라남도 곡성군", 1406),
        JEOLLANAM_SUNCHEON("전라남도 순천시", 1407),
        JEOLLANAM_GWANGYANG("전라남도 광양시", 1408),
        JEOLLANAM_HAENAM("전라남도 해남군", 1409),
        JEOLLANAM_HAMPYEONG("전라남도 함평군", 1410),
        JEOLLANAM_JANGSEONG("전라남도 장성군", 1411),
        JEOLLANAM_GURYE("전라남도 구례군", 1412),
        JEOLLANAM_SANCHUNG("전라남도 산청군", 1413),

        // 경상북도
        GYEONGBUK_POHANG("경상북도 포항시", 1501),
        GYEONGBUK_GYEONGJU("경상북도 경주시", 1502),
        GYEONGBUK_GYEONGSAN("경상북도 경산시", 1503),
        GYEONGBUK_ANSAN("경상북도 안동시", 1504),
        GYEONGBUK_KEUMGUK("경상북도 김천시", 1505),
        GYEONGBUK_SANGJU("경상북도 상주시", 1506),
        GYEONGBUK_YEONGJU("경상북도 영주시", 1507),
        GYEONGBUK_UISUNG("경상북도 의성군", 1508),
        GYEONGBUK_YEONGCHUN("경상북도 영천시", 1509),
        GYEONGBUK_CHILGOK("경상북도 칠곡군", 1510),
        GYEONGBUK_GYEONGDONG("경상북도 고령군", 1511),
        GYEONGBUK_BONGHWA("경상북도 봉화군", 1512),
        GYEONGBUK_SONGBOK("경상북도 성주군", 1513),
        GYEONGBUK_GANGDONG("경상북도 청도군", 1514),

        // 경상남도
        GYEONGNAM_CHANGWON("경상남도 창원시", 1601),
        GYEONGNAM_GIMHAE("경상남도 김해시", 1602),
        GYEONGNAM_JINJU("경상남도 진주시", 1603),
        GYEONGNAM_MASAN("경상남도 마산시", 1604),
        GYEONGNAM_SACHEON("경상남도 사천시", 1605),
        GYEONGNAM_MILYANG("경상남도 밀양시", 1606),
        GYEONGNAM_GYEONGSAN("경상남도 경산시", 1607),
        GYEONGNAM_TONGYEONG("경상남도 통영시", 1608),
        GYEONGNAM_DONGYEONG("경상남도 동영천시", 1609),
        GYEONGNAM_HAMAN("경상남도 하만군", 1610),
        GYEONGNAM_SANCHUNG("경상남도 산청군", 1611),
        GYEONGNAM_GURYE("경상남도 구례군", 1612),
        GYEONGNAM_JANGSEONG("경상남도 장성군", 1613),
        GYEONGNAM_GORYEONG("경상남도 고령군", 1614),
        GYEONGNAM_GYEONGJU("경상남도 경주군", 1615),

        // 제주특별자치도
        JEJU_JEJU("제주특별자치도 제주시", 1701),
        JEJU_SEOGWIPO("제주특별자치도 서귀포시", 1702);

        private final String name;
        private final int code;

        District(String name, int code) {
            this.name = name;
            this.code = code;
        }
    }
}

