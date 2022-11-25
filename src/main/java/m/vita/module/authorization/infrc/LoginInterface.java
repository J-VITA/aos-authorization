package m.vita.module.authorization.infrc;

/**
 * @author skyware
 * @see
 * */
public interface LoginInterface {
    /**
     * @apiNote 로그인 하기
     * @return null = fail, T = success
     * */
    <T> T login(T info);

    /**
     * @apiNote 로그아웃
     * @return null = fail, T = success
     * */
    <T> T logout(T info);

    /**
     * @apiNote 회원정보 가져오기
     * @param <T> info
     * @return T member info VO
     * */
    public <T> T memberInfo(T info);

    /**
     * @apiNote : 회원정보 업데이트
     * @param <T>
     * @return 0 = fail, 1 = success
     * */
    <T> int updateMemberInfo(T info);


}