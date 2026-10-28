package androidx.glance.appwidget.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: androidx.glance.appwidget.protobuf.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1407n0 extends LinkedHashMap {

    /* JADX INFO: renamed from: x */
    public static final C1407n0 f5946x;

    /* JADX INFO: renamed from: w */
    public boolean f5947w = true;

    static {
        C1407n0 c1407n0 = new C1407n0();
        f5946x = c1407n0;
        c1407n0.f5947w = false;
    }

    /* JADX INFO: renamed from: a */
    public static int m4483a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC1374c0) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = AbstractC1383f0.f5887a;
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
    public final void m4484b() {
        if (!this.f5947w) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final C1407n0 m4485c() {
        if (isEmpty()) {
            return new C1407n0();
        }
        C1407n0 c1407n0 = new C1407n0(this);
        c1407n0.f5947w = true;
        return c1407n0;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m4484b();
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
        int iM4483a = 0;
        for (Map.Entry entry : entrySet()) {
            iM4483a += m4483a(entry.getValue()) ^ m4483a(entry.getKey());
        }
        return iM4483a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m4484b();
        Charset charset = AbstractC1383f0.f5887a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m4484b();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC1383f0.f5887a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m4484b();
        return super.remove(obj);
    }
}
