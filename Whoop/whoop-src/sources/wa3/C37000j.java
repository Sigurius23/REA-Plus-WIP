package wa3;

import androidx.health.platform.client.proto.C1533u;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: wa3.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C37000j {

    /* JADX INFO: renamed from: c */
    public static final C37000j f158349c = new C37000j(0);

    /* JADX INFO: renamed from: a */
    public final C36983a0 f158350a = new C36983a0(16);

    /* JADX INFO: renamed from: b */
    public boolean f158351b;

    public C37000j() {
    }

    /* JADX INFO: renamed from: c */
    public static int m118801c(EnumC37011o0 enumC37011o0, Object obj) {
        switch (enumC37011o0.ordinal()) {
            case 0:
                ((Double) obj).getClass();
                return 8;
            case 1:
                ((Float) obj).getClass();
                return 4;
            case 2:
                return C36994g.m118782g(((Long) obj).longValue());
            case 3:
                return C36994g.m118782g(((Long) obj).longValue());
            case 4:
                return C36994g.m118778c(((Integer) obj).intValue());
            case 5:
                ((Long) obj).getClass();
                return 8;
            case 6:
                ((Integer) obj).getClass();
                return 4;
            case 7:
                ((Boolean) obj).getClass();
                return 1;
            case 8:
                try {
                    byte[] bytes = ((String) obj).getBytes("UTF-8");
                    return C36994g.m118781f(bytes.length) + bytes.length;
                } catch (UnsupportedEncodingException e5) {
                    throw new RuntimeException("UTF-8 not supported.", e5);
                }
            case 9:
                return ((InterfaceC37019v) obj).mo92262d();
            case 10:
                return C36994g.m118780e((InterfaceC37019v) obj);
            case 11:
                if (obj instanceof AbstractC36990e) {
                    AbstractC36990e abstractC36990e = (AbstractC36990e) obj;
                    return abstractC36990e.size() + C36994g.m118781f(abstractC36990e.size());
                }
                byte[] bArr = (byte[]) obj;
                return C36994g.m118781f(bArr.length) + bArr.length;
            case 12:
                return C36994g.m118781f(((Integer) obj).intValue());
            case 13:
                return obj instanceof InterfaceC37014q ? C36994g.m118778c(((InterfaceC37014q) obj).mo92274a()) : C36994g.m118778c(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).getClass();
                return 4;
            case 15:
                ((Long) obj).getClass();
                return 8;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                return C36994g.m118781f((iIntValue >> 31) ^ (iIntValue << 1));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                return C36994g.m118782g((jLongValue >> 63) ^ (jLongValue << 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m118802d(C37008n c37008n, Object obj) {
        EnumC37011o0 enumC37011o0 = c37008n.f158358x;
        int i13 = c37008n.f158357w;
        if (!c37008n.f158359y) {
            int iM118783h = C36994g.m118783h(i13);
            if (enumC37011o0 == EnumC37011o0.f158365E) {
                iM118783h *= 2;
            }
            return m118801c(enumC37011o0, obj) + iM118783h;
        }
        int iM118801c = 0;
        for (Object obj2 : (List) obj) {
            int iM118783h2 = C36994g.m118783h(i13);
            if (enumC37011o0 == EnumC37011o0.f158365E) {
                iM118783h2 *= 2;
            }
            iM118801c += m118801c(enumC37011o0, obj2) + iM118783h2;
        }
        return iM118801c;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m118803e(Map.Entry entry) {
        C37008n c37008n = (C37008n) entry.getKey();
        if (c37008n.f158358x.f158371w != EnumC37013p0.MESSAGE) {
            return true;
        }
        if (!c37008n.f158359y) {
            Object value = entry.getValue();
            if (value instanceof InterfaceC37019v) {
                return ((InterfaceC37019v) value).mo92260b();
            }
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        Iterator it = ((List) entry.getValue()).iterator();
        while (it.hasNext()) {
            if (!((InterfaceC37019v) it.next()).mo92260b()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static Object m118804h(C36992f c36992f, EnumC37011o0 enumC37011o0) {
        switch (enumC37011o0.ordinal()) {
            case 0:
                return Double.valueOf(Double.longBitsToDouble(c36992f.m118765k()));
            case 1:
                return Float.valueOf(Float.intBitsToFloat(c36992f.m118764j()));
            case 2:
                return Long.valueOf(c36992f.m118767m());
            case 3:
                return Long.valueOf(c36992f.m118767m());
            case 4:
                return Integer.valueOf(c36992f.m118766l());
            case 5:
                return Long.valueOf(c36992f.m118765k());
            case 6:
                return Integer.valueOf(c36992f.m118764j());
            case 7:
                return Boolean.valueOf(c36992f.m118767m() != 0);
            case 8:
                int iM118766l = c36992f.m118766l();
                int i13 = c36992f.f158326b;
                int i14 = c36992f.f158328d;
                if (iM118766l > i13 - i14 || iM118766l <= 0) {
                    return iM118766l == 0 ? "" : new String(c36992f.m118763i(iM118766l), "UTF-8");
                }
                String str = new String(c36992f.f158325a, i14, iM118766l, "UTF-8");
                c36992f.f158328d += iM118766l;
                return str;
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return c36992f.m118760f();
            case 12:
                return Integer.valueOf(c36992f.m118766l());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(c36992f.m118764j());
            case 15:
                return Long.valueOf(c36992f.m118765k());
            case 16:
                int iM118766l2 = c36992f.m118766l();
                return Integer.valueOf((-(iM118766l2 & 1)) ^ (iM118766l2 >>> 1));
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                long jM118767m = c36992f.m118767m();
                return Long.valueOf((-(jM118767m & 1)) ^ (jM118767m >>> 1));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001b  */
    /* JADX INFO: renamed from: j */
    public static void m118805j(EnumC37011o0 enumC37011o0, Object obj) {
        obj.getClass();
        boolean z4 = true;
        boolean z13 = false;
        switch (enumC37011o0.f158371w) {
            case INT:
                z13 = obj instanceof Integer;
                break;
            case LONG:
                z13 = obj instanceof Long;
                break;
            case FLOAT:
                z13 = obj instanceof Float;
                break;
            case DOUBLE:
                z13 = obj instanceof Double;
                break;
            case BOOLEAN:
                z13 = obj instanceof Boolean;
                break;
            case STRING:
                z13 = obj instanceof String;
                break;
            case BYTE_STRING:
                if (!(obj instanceof AbstractC36990e) && !(obj instanceof byte[])) {
                    z4 = false;
                }
                z13 = z4;
                break;
            case ENUM:
                if (!(obj instanceof Integer) && !(obj instanceof InterfaceC37014q)) {
                    z4 = false;
                }
                z13 = z4;
                break;
            case MESSAGE:
                z13 = obj instanceof InterfaceC37019v;
                break;
        }
        if (!z13) {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m118806k(C36994g c36994g, EnumC37011o0 enumC37011o0, Object obj) throws IOException {
        switch (enumC37011o0.ordinal()) {
            case 0:
                double dDoubleValue = ((Double) obj).doubleValue();
                c36994g.getClass();
                c36994g.m118796u(Double.doubleToRawLongBits(dDoubleValue));
                break;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                c36994g.getClass();
                c36994g.m118795t(Float.floatToRawIntBits(fFloatValue));
                break;
            case 2:
                c36994g.m118798w(((Long) obj).longValue());
                break;
            case 3:
                c36994g.m118798w(((Long) obj).longValue());
                break;
            case 4:
                c36994g.m118789n(((Integer) obj).intValue());
                break;
            case 5:
                c36994g.m118796u(((Long) obj).longValue());
                break;
            case 6:
                c36994g.m118795t(((Integer) obj).intValue());
                break;
            case 7:
                c36994g.m118792q(((Boolean) obj).booleanValue() ? 1 : 0);
                break;
            case 8:
                c36994g.getClass();
                byte[] bytes = ((String) obj).getBytes("UTF-8");
                c36994g.m118797v(bytes.length);
                c36994g.m118794s(bytes);
                break;
            case 9:
                c36994g.getClass();
                ((InterfaceC37019v) obj).mo92264f(c36994g);
                break;
            case 10:
                c36994g.m118791p((InterfaceC37019v) obj);
                break;
            case 11:
                if (!(obj instanceof AbstractC36990e)) {
                    byte[] bArr = (byte[]) obj;
                    c36994g.getClass();
                    c36994g.m118797v(bArr.length);
                    c36994g.m118794s(bArr);
                } else {
                    AbstractC36990e abstractC36990e = (AbstractC36990e) obj;
                    c36994g.getClass();
                    c36994g.m118797v(abstractC36990e.size());
                    c36994g.m118793r(abstractC36990e);
                }
                break;
            case 12:
                c36994g.m118797v(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof InterfaceC37014q)) {
                    c36994g.m118789n(((Integer) obj).intValue());
                } else {
                    c36994g.m118789n(((InterfaceC37014q) obj).mo92274a());
                }
                break;
            case 14:
                c36994g.m118795t(((Integer) obj).intValue());
                break;
            case 15:
                c36994g.m118796u(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c36994g.m118797v((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                c36994g.m118798w((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m118807a(C37008n c37008n, Object obj) {
        List arrayList;
        if (!c37008n.f158359y) {
            throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
        }
        m118805j(c37008n.f158358x, obj);
        C36983a0 c36983a0 = this.f158350a;
        Object obj2 = c36983a0.get(c37008n);
        if (obj2 == null) {
            arrayList = new ArrayList();
            c36983a0.put(c37008n, arrayList);
        } else {
            arrayList = (List) obj2;
        }
        arrayList.add(obj);
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C37000j clone() {
        C36983a0 c36983a0;
        C37000j c37000j = new C37000j();
        int i13 = 0;
        while (true) {
            c36983a0 = this.f158350a;
            if (i13 >= c36983a0.f158310x.size()) {
                break;
            }
            Map.Entry entry = (Map.Entry) c36983a0.f158310x.get(i13);
            c37000j.m118811i((C37008n) entry.getKey(), entry.getValue());
            i13++;
        }
        for (Map.Entry entry2 : c36983a0.m118729c()) {
            c37000j.m118811i((C37008n) entry2.getKey(), entry2.getValue());
        }
        return c37000j;
    }

    /* JADX INFO: renamed from: f */
    public final void m118809f() {
        if (this.f158351b) {
            return;
        }
        C36983a0 c36983a0 = this.f158350a;
        if (!c36983a0.f158312z) {
            for (int i13 = 0; i13 < c36983a0.f158310x.size(); i13++) {
                Map.Entry entry = (Map.Entry) c36983a0.f158310x.get(i13);
                if (((C37008n) entry.getKey()).f158359y) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
            for (Map.Entry entry2 : c36983a0.m118729c()) {
                if (((C37008n) entry2.getKey()).f158359y) {
                    entry2.setValue(Collections.unmodifiableList((List) entry2.getValue()));
                }
            }
        }
        if (!c36983a0.f158312z) {
            c36983a0.f158311y = c36983a0.f158311y.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c36983a0.f158311y);
            c36983a0.f158312z = true;
        }
        this.f158351b = true;
    }

    /* JADX INFO: renamed from: g */
    public final void m118810g(Map.Entry entry) {
        C37008n c37008n = (C37008n) entry.getKey();
        Object value = entry.getValue();
        boolean z4 = c37008n.f158359y;
        C36983a0 c36983a0 = this.f158350a;
        if (z4) {
            Object arrayList = c36983a0.get(c37008n);
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            for (Object obj : (List) value) {
                List list = (List) arrayList;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    byte[] bArr2 = new byte[bArr.length];
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    obj = bArr2;
                }
                list.add(obj);
            }
            c36983a0.put(c37008n, arrayList);
            return;
        }
        if (c37008n.f158358x.f158371w != EnumC37013p0.MESSAGE) {
            if (value instanceof byte[]) {
                byte[] bArr3 = (byte[]) value;
                byte[] bArr4 = new byte[bArr3.length];
                System.arraycopy(bArr3, 0, bArr4, 0, bArr3.length);
                value = bArr4;
            }
            c36983a0.put(c37008n, value);
            return;
        }
        Object obj2 = c36983a0.get(c37008n);
        if (obj2 != null) {
            c36983a0.put(c37008n, ((InterfaceC37019v) obj2).mo92261c().mo92279i((AbstractC37012p) ((InterfaceC37019v) value)).mo92277g());
            return;
        }
        if (value instanceof byte[]) {
            byte[] bArr5 = (byte[]) value;
            byte[] bArr6 = new byte[bArr5.length];
            System.arraycopy(bArr5, 0, bArr6, 0, bArr5.length);
            value = bArr6;
        }
        c36983a0.put(c37008n, value);
    }

    /* JADX INFO: renamed from: i */
    public final void m118811i(C37008n c37008n, Object obj) {
        boolean z4 = c37008n.f158359y;
        EnumC37011o0 enumC37011o0 = c37008n.f158358x;
        if (!z4) {
            m118805j(enumC37011o0, obj);
        } else {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                m118805j(enumC37011o0, it.next());
            }
            obj = arrayList;
        }
        this.f158350a.put(c37008n, obj);
    }

    public C37000j(int i13) {
        m118809f();
    }
}
