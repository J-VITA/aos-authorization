package m.vita.module.authorization.data;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class MemberInfo {

    @Setter(value = AccessLevel.PRIVATE)
    int mbrNo;
    String mbrNm;
    @Setter(value = AccessLevel.PRIVATE)
    String loginId;
    @Setter(value = AccessLevel.PRIVATE)
    String grade;
    @Setter(value = AccessLevel.PRIVATE)
    int age;
    String birthday;

}
