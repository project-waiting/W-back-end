package waiting.vo;

import lombok.Data;

import java.math.BigInteger;

@Data
public class User {

    private Long id;
    private String email;
    private String name;
    private char role;  //enum 으로 변경
    private String phoneNumber;
    private char gender; //enum 으로 변경

}
