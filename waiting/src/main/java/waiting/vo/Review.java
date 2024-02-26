package waiting.vo;

import lombok.Data;

@Data
public class Review {

    private Long id;
    private String content;
    private int rating; // 평점
    private User user;
    private Store store;

}
