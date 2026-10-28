package com.google.crypto.tink.shaded.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C5156l0 extends LinkedHashMap {

    /* JADX INFO: renamed from: x */
    public static final C5156l0 f21540x;

    /* JADX INFO: renamed from: w */
    public boolean f21541w = true;

    static {
        C5156l0 c5156l0 = new C5156l0();
        f21540x = c5156l0;
        c5156l0.f21541w = false;
    }

    /* JADX INFO: renamed from: a */
    public static int m16242a(Object obj) {
        if (!(obj instanceof byte[])) {
            if (obj instanceof InterfaceC5188z) {
                throw new UnsupportedOperationException();
            }
            return obj.hashCode();
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = AbstractC5126b0.f21479a;
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
    public final void m16243b() {
        if (!this.f21541w) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: c */
    public final C5156l0 m16244c() {
        if (isEmpty()) {
            return new C5156l0();
        }
        C5156l0 c5156l0 = new C5156l0(this);
        c5156l0.f21541w = true;
        return c5156l0;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        m16243b();
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
        int iM16242a = 0;
        for (Map.Entry entry : entrySet()) {
            iM16242a += m16242a(entry.getValue()) ^ m16242a(entry.getKey());
        }
        return iM16242a;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        m16243b();
        Charset charset = AbstractC5126b0.f21479a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        m16243b();
        for (Object obj : map.keySet()) {
            Charset charset = AbstractC5126b0.f21479a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        m16243b();
        return super.remove(obj);
    }
}
