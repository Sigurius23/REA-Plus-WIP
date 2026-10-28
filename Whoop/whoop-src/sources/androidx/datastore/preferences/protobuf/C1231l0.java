package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.l0 */
/* JADX INFO: loaded from: classes.dex */
public final class C1231l0 extends LinkedHashMap {

    /* JADX INFO: renamed from: x */
    public static final C1231l0 f5424x;

    /* JADX INFO: renamed from: w */
    public boolean f5425w = true;

    static {
        C1231l0 c1231l0 = new C1231l0();
        f5424x = c1231l0;
        c1231l0.f5425w = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m3877a() {
        if (!this.f5425w) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: b */
    public final C1231l0 m3878b() {
        if (isEmpty()) {
            return new C1231l0();
        }
        C1231l0 c1231l0 = new C1231l0(this);
        c1231l0.f5425w = true;
        return c1231l0;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m3877a();
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
        int iHashCode;
        int i13 = 0;
        for (Map.Entry entry : entrySet()) {
            Object key = entry.getKey();
            int iHashCode2 = 1;
            if (key instanceof byte[]) {
                byte[] bArr = (byte[]) key;
                int length = bArr.length;
                Charset charset = AbstractC1204c0.f5362a;
                iHashCode = length;
                for (byte b : bArr) {
                    iHashCode = (iHashCode * 31) + b;
                }
                if (iHashCode == 0) {
                    iHashCode = 1;
                }
            } else {
                iHashCode = key.hashCode();
            }
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                int length2 = bArr2.length;
                Charset charset2 = AbstractC1204c0.f5362a;
                int i14 = length2;
                for (byte b6 : bArr2) {
                    i14 = (i14 * 31) + b6;
                }
                if (i14 != 0) {
                    iHashCode2 = i14;
                }
            } else {
                iHashCode2 = value.hashCode();
            }
            i13 += iHashCode ^ iHashCode2;
        }
        return i13;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m3877a();
        Charset charset = AbstractC1204c0.f5362a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m3877a();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC1204c0.f5362a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m3877a();
        return super.remove(obj);
    }
}
