package waiting.vo;

import lombok.Data;

@Data
public class Imagefile {

    private Long id;
    private String filePath;
    private Store store;
    private Menu menu;

}
