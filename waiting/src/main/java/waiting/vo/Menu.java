package waiting.vo;

import lombok.Data;

import java.math.BigInteger;

@Data
public class Menu {

    private Long id;
    private String name;
    private String price;
    private String content;
    private Store store;

}
