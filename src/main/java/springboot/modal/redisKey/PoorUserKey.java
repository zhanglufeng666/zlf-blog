package springboot.modal.redisKey;

/**
 * @author june
 * @date 2018/5/13 17:45
 */
public class PoorUserKey {
    // 表名
    public static final String TABLE_NAME = "t_poorusers";

    // 主键名
    public static final String MAJOR_KEY = "uid";

    // 默认主键值
    public static final String DEFAULT_VALUE = "all";

    // 生存周期
    public static final int LIVE_TIME = 6;
}
