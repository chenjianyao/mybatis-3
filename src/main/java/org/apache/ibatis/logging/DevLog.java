package org.apache.ibatis.logging;

import org.apache.ibatis.cache.decorators.TransactionalCache;

/**
 * 开发日志打印，便于理解
 *
 * @author ChenJian
 * @Date 2019年4月8日 下午3:47:11
 */
public class DevLog {
    private static final Log LOGGER = LogFactory.getLog(TransactionalCache.class);

    private static final boolean ENABLE = true;

    public static void debug(String msg) {
        if (ENABLE)
            LOGGER.debug(msg);
    }

    public static void info(String msg) {
        if (ENABLE)
            LOGGER.debug(msg);
    }

    public static void warn(String msg) {
        if (ENABLE)
            LOGGER.warn(msg);
    }

    public static void error(String msg) {
        if (ENABLE)
            LOGGER.error(msg);
    }

    public static void error(String msg, Throwable t) {
        if (ENABLE)
            LOGGER.error(msg, t);
    }

}
