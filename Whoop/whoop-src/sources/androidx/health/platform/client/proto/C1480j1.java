package androidx.health.platform.client.proto;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.j1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1480j1 extends LinkedHashMap {

    /* JADX INFO: renamed from: x */
    public static final C1480j1 f6054x;

    /* JADX INFO: renamed from: w */
    public boolean f6055w = true;

    static {
        C1480j1 c1480j1 = new C1480j1();
        f6054x = c1480j1;
        c1480j1.f6055w = false;
    }

    /* JADX INFO: renamed from: a */
    public static int m4650a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof EnumC1535u1) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = AbstractC1549x0.f6150a;
        int i13 = length;
        for (byte b : bArr) {
            i13 = (i13 * 31) + b;
        }
        if (i13 == 0) {
            return 1;
        }
        return i13;
    }

    /* JADX INFO: renamed from: b */
    public final void m4651b() {
        if (!this.f6055w) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final C1480j1 m4652c() {
        if (isEmpty()) {
            return new C1480j1();
        }
        C1480j1 c1480j1 = new C1480j1(this);
        c1480j1.f6055w = true;
        return c1480j1;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m4651b();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        boolean z4;
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this != map) {
                if (size() == map.size()) {
                    Iterator it = entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            if (map.containsKey(entry.getKey())) {
                                Object value = entry.getValue();
                                Object obj2 = map.get(entry.getKey());
                                if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                                }
                            }
                        } else {
                            z4 = true;
                        }
                    }
                }
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int iM4650a = 0;
        for (Map.Entry entry : entrySet()) {
            iM4650a += m4650a(entry.getValue()) ^ m4650a(entry.getKey());
        }
        return iM4650a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m4651b();
        Charset charset = AbstractC1549x0.f6150a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m4651b();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC1549x0.f6150a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m4651b();
        return super.remove(obj);
    }
}
