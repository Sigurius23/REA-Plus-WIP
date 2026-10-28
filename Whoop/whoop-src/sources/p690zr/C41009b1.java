package p690zr;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import p012ab.C0682h0;

/* JADX INFO: renamed from: zr.b1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C41009b1 implements Map, Serializable {

    /* JADX INFO: renamed from: G */
    public static final C41009b1 f176959G = new C41009b1(new Object[0], 0, null);

    /* JADX INFO: renamed from: E */
    public final transient Object[] f176960E;

    /* JADX INFO: renamed from: F */
    public final transient int f176961F;

    /* JADX INFO: renamed from: w */
    public transient C41064y0 f176962w;

    /* JADX INFO: renamed from: x */
    public transient C41066z0 f176963x;

    /* JADX INFO: renamed from: y */
    public transient C41006a1 f176964y;

    /* JADX INFO: renamed from: z */
    public final transient Object f176965z;

    public C41009b1(Object[] objArr, int i13, Object obj) {
        this.f176965z = obj;
        this.f176960E = objArr;
        this.f176961F = i13;
    }

    /* JADX INFO: renamed from: a */
    public static C41009b1 m133232a(Map map) {
        if ((map instanceof C41009b1) && !(map instanceof SortedMap)) {
            return (C41009b1) map;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        boolean z4 = setEntrySet instanceof Collection;
        C0682h0 c0682h0 = new C0682h0(z4 ? setEntrySet.size() : 4);
        if (z4) {
            int size = setEntrySet.size() * 2;
            Object[] objArr = (Object[]) c0682h0.f2433y;
            if (size > objArr.length) {
                c0682h0.f2433y = Arrays.copyOf(objArr, AbstractC41005a0.m133221e(objArr.length, size));
            }
        }
        for (Map.Entry entry : setEntrySet) {
            c0682h0.m1704t(entry.getKey(), entry.getValue());
        }
        return c0682h0.m1694i();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final AbstractC41032j0 entrySet() {
        C41064y0 c41064y0 = this.f176962w;
        if (c41064y0 != null) {
            return c41064y0;
        }
        C41064y0 c41064y1 = new C41064y0(this, this.f176960E, this.f176961F);
        this.f176962w = c41064y1;
        return c41064y1;
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final AbstractC41008b0 values() {
        C41006a1 c41006a1 = this.f176964y;
        if (c41006a1 != null) {
            return c41006a1;
        }
        C41006a1 c41006a2 = new C41006a1(1, this.f176961F, this.f176960E);
        this.f176964y = c41006a2;
        return c41006a2;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return AbstractC41047q.m133275e(obj, this);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        if (obj == null) {
            obj2 = null;
        } else {
            Object[] objArr = this.f176960E;
            if (this.f176961F == 1) {
                Object obj3 = objArr[0];
                Objects.requireNonNull(obj3);
                if (obj3.equals(obj)) {
                    obj2 = objArr[1];
                    Objects.requireNonNull(obj2);
                } else {
                    obj2 = null;
                }
            } else {
                Object obj4 = this.f176965z;
                if (obj4 == null) {
                    obj2 = null;
                } else if (obj4 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj4;
                    int length = bArr.length - 1;
                    int iM133286p = AbstractC41047q.m133286p(obj.hashCode());
                    while (true) {
                        int i13 = iM133286p & length;
                        int i14 = bArr[i13] & 255;
                        if (i14 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i14])) {
                            obj2 = objArr[i14 ^ 1];
                        } else {
                            iM133286p = i13 + 1;
                        }
                    }
                    obj2 = null;
                } else if (obj4 instanceof short[]) {
                    short[] sArr = (short[]) obj4;
                    int length2 = sArr.length - 1;
                    int iM133286p2 = AbstractC41047q.m133286p(obj.hashCode());
                    while (true) {
                        int i15 = iM133286p2 & length2;
                        int i16 = sArr[i15] & 65535;
                        if (i16 == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[i16])) {
                            obj2 = objArr[i16 ^ 1];
                        } else {
                            iM133286p2 = i15 + 1;
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj4;
                    int length3 = iArr.length - 1;
                    int iM133286p3 = AbstractC41047q.m133286p(obj.hashCode());
                    while (true) {
                        int i17 = iM133286p3 & length3;
                        int i18 = iArr[i17];
                        if (i18 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i18])) {
                            obj2 = objArr[i18 ^ 1];
                        } else {
                            iM133286p3 = i17 + 1;
                        }
                    }
                    obj2 = null;
                }
            }
        }
        if (obj2 == null) {
            return null;
        }
        return obj2;
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return AbstractC41047q.m133280j(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        C41066z0 c41066z0 = this.f176963x;
        if (c41066z0 != null) {
            return c41066z0;
        }
        C41066z0 c41066z1 = new C41066z0(this, new C41006a1(0, this.f176961F, this.f176960E));
        this.f176963x = c41066z1;
        return c41066z1;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final int size() {
        return this.f176961F;
    }

    public final String toString() {
        int i13 = this.f176961F;
        AbstractC41047q.m133273c(i13, "size");
        StringBuilder sb4 = new StringBuilder((int) Math.min(((long) i13) * 8, 1073741824L));
        sb4.append('{');
        AbstractC41036k1 it = ((C41064y0) entrySet()).iterator();
        boolean z4 = true;
        while (true) {
            C41017e0 c41017e0 = (C41017e0) it;
            if (!c41017e0.hasNext()) {
                sb4.append('}');
                return sb4.toString();
            }
            Map.Entry entry = (Map.Entry) c41017e0.next();
            if (!z4) {
                sb4.append(", ");
            }
            sb4.append(entry.getKey());
            sb4.append('=');
            sb4.append(entry.getValue());
            z4 = false;
        }
    }
}
