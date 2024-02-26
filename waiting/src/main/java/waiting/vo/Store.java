package waiting.vo;

import lombok.Data;

import java.math.BigInteger;
import java.time.LocalTime;
import java.util.Date;

/**
 * weekdayOpenTime 주중 오픈 시간을 LocalTime으로 저장하는 변수명
 * weekdayCloseTime 주중 마감 시간을 LocalTime으로 저장하는 변수명
 * weekendOpenTime 주말 오픈 시간을 LocalTime으로 저장하는 변수명
 * weekendCloseTime 주말 마감 시간을 LocalTime으로 저장하는 변수명
 * size 테이블 갯수
 * seatingTime 착석시간
 */
@Data
public class Store {

    private Long id;
    private String name;
    private String licenseNo;
    private String address;
    private String info;
    private String content;
    private String storeNumber;
    private char status; //enum 으로 변경
    private User user;
    private Menu menu;
    private int size;
    private Date seatingTime;

    private LocalTime weekdayOpenTime;
    private LocalTime weekdayCloseTime;
    private LocalTime weekendOpenTime;
    private LocalTime weekendCloseTime;

}
