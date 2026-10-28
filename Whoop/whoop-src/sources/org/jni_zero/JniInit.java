package org.jni_zero;

import java.util.Collections;

/* JADX INFO: loaded from: classes3.dex */
@JNINamespace("jni_zero")
public class JniInit {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    @CalledByNative
    private static void crashIfMultiplexingMisaligned(long j7, long j13) {
        try {
            long j14 = Class.forName("J.N").getField("WHOLE_HASH").getLong(null);
            long j15 = Class.forName("J.N").getField("PRIORITY_HASH").getLong(null);
            if (j14 != j7 && j14 != j13 && j15 != j7) {
                throw new RuntimeException("JNI Zero multiplexing hashes do not align. Native: " + j7 + " or " + j13 + " Java: " + j14 + " or " + j15);
            }
        } catch (ReflectiveOperationException unused) {
        }
    }

    @CalledByNative
    private static Object[] init() {
        return new Object[]{Collections.EMPTY_LIST, Collections.EMPTY_MAP};
    }
}
