package models.member;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Member {
    private String userId;
    private String userPw;
    private String userPwRe;
    private String userNm;
    private boolean agree;

}
