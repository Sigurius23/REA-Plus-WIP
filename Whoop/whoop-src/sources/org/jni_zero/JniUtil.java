package org.jni_zero;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class JniUtil {
    @CalledByNative
    private static Map<Object, Object> arrayToMap(Object[] objArr) {
        int length = objArr.length;
        HashMap map = new HashMap(length / 2);
        for (int i13 = 0; i13 < length; i13 += 2) {
            map.put(objArr[i13], objArr[i13 + 1]);
        }
        return map;
    }

    @CalledByNative
    private static Object[] mapToArray(Map<Object, Object> map) {
        Object[] objArr = new Object[map.size() * 2];
        int i13 = 0;
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            int i14 = i13 + 1;
            objArr[i13] = entry.getKey();
            i13 += 2;
            objArr[i14] = entry.getValue();
        }
        return objArr;
    }
}
