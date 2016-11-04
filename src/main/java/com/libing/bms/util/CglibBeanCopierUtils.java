package com.libing.bms.util;

import org.springframework.cglib.beans.BeanCopier;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by libing on 2016/11/4.
 */
public class CglibBeanCopierUtils {

    private static Map<String, BeanCopier> beanCopierMap = new HashMap<String, BeanCopier>();

    /**
     * 使用 cglib 库中的 BeanCopier 来拷贝对象
     * @param source
     * @param target
     */
    public static void copyProperties(Object source, Object target) {
        String beanKey = generateKey(source.getClass(), target.getClass());
        BeanCopier copier = null;
        if (!beanCopierMap.containsKey(beanKey)) {
            copier = BeanCopier.create(source.getClass(), target.getClass(), false);
            beanCopierMap.put(beanKey, copier);
        } else {
            copier = beanCopierMap.get(beanKey);
        }
        copier.copy(source, target, null);
    }

    /**
     * 使用 cglib 库中的 BeanCopier 来拷贝对象
     * @param class1
     * @param class2
     * @return
     */
    private static String generateKey(Class<?> class1, Class<?> class2) {
        return class1.toString() + class2.toString();
    }

}
