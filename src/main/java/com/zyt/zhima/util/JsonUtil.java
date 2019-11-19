package com.zyt.zhima.util;

import com.fasterxml.jackson.core.type.TypeReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonUtil extends JsonUtils {

    private static Logger LOG = LoggerFactory.getLogger(JsonUtil.class);

    /**
     * 将字符串转为对象:支持泛型<br/>
     * 例子： JsonUtil.toObjectByType(json, new TypeReference&lt;ResponseVo&lt;T>>(){})
     *
     * @param obj
     * @param valueTypeRef
     * @return
     */
    public static <T> T toObjectByType(Object obj, TypeReference<T> valueTypeRef) {
        if (null == obj) {
            return null;
        }
        try {
            return JsonFormatter.toObjectByType(JsonUtil.toString(obj), valueTypeRef);
        } catch (Exception e) {
            LOG.debug("JsonFormatter.toObject error: {}", e);
        }
        return null;
    }

    /**
     * @param obj
     * @param serializeNull 是否序列化null值
     * @return
     */
    public static String toString(Object obj, boolean serializeNull) {
        if (obj instanceof String) {
            return (String) obj;
        } else if (null == obj) {
            return null;
        }
        try {
            return JsonFormatter.toJsonString(obj, serializeNull);
        } catch (Exception e) {
            LOG.error("JsonFormatter.toJsonString error: ", e);
        }
        return null;
    }

}
