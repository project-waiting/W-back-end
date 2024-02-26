package waiting.vo;

import lombok.Data;

import java.math.BigInteger;
import java.util.Date;

/**
 * reserve : 프론트에서는 달력 형식으로 출력
 */
@Data
public class Reservation {

    private Long id;
    private User user;
    private Store store;
    private Menu menu;
    private int size; // 인원수

    private Date reserveDate;
}
