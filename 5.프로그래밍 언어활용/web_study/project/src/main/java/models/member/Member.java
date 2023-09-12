package models.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder // 생성자가 private
// @AllArgsConstructor @NoArgsConstructor // Builder 패턴일 때 public 범위의 기본 생성자 추가
public class Member { 
    private String userId; // 아이디
    private String userPw; // 비밀번호
    private String userPwRe; // 비밀번호 확인
    private String userNm; // 사용자명
    private boolean agree; // 약관 동의 여부
}
