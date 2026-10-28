package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1220h1 implements PrivilegedExceptionAction {
    /* JADX INFO: renamed from: a */
    public static Unsafe m3809a() throws IllegalAccessException {
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
        return m3809a();
    }
}
