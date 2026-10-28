package androidx.health.platform.client.proto;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.j3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1482j3 implements PrivilegedExceptionAction {
    /* JADX INFO: renamed from: a */
    public static Unsafe m4653a() throws IllegalAccessException {
        for (Field field : Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            Object obj = field.get(null);
            if (Unsafe.class.isInstance(obj)) {
                return (Unsafe) Unsafe.class.cast(obj);
            }
        }
        return null;
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ Object run() {
        return m4653a();
    }
}
