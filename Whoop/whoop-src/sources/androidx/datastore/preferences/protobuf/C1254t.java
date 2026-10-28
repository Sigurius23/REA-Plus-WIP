package androidx.datastore.preferences.protobuf;

import androidx.health.platform.client.proto.C1533u;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import p000.AbstractC30802r;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.t */
/* JADX INFO: loaded from: classes.dex */
public final class C1254t {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f5473c = 0;

    /* JADX INFO: renamed from: a */
    public final C1202b1 f5474a = C1202b1.m3779g();

    /* JADX INFO: renamed from: b */
    public boolean f5475b;

    static {
        new C1254t(0);
    }

    public C1254t() {
    }

    /* JADX INFO: renamed from: b */
    public static void m4010b(C1236n c1236n, EnumC1259u1 enumC1259u1, int i13, Object obj) {
        if (enumC1259u1 == EnumC1259u1.f5486z) {
            c1236n.m3946L0(i13, 3);
            ((AbstractC1197a) obj).mo3749b(c1236n);
            c1236n.m3946L0(i13, 4);
        }
        c1236n.m3946L0(i13, enumC1259u1.f5488x);
        switch (enumC1259u1.ordinal()) {
            case 0:
                c1236n.m3940F0(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c1236n.m3938D0(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c1236n.m3950P0(((Long) obj).longValue());
                break;
            case 3:
                c1236n.m3950P0(((Long) obj).longValue());
                break;
            case 4:
                c1236n.m3942H0(((Integer) obj).intValue());
                break;
            case 5:
                c1236n.m3940F0(((Long) obj).longValue());
                break;
            case 6:
                c1236n.m3938D0(((Integer) obj).intValue());
                break;
            case 7:
                c1236n.m3959x0(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C1218h)) {
                    c1236n.m3945K0((String) obj);
                } else {
                    c1236n.m3936B0((C1218h) obj);
                }
                break;
            case 9:
                ((AbstractC1197a) obj).mo3749b(c1236n);
                break;
            case 10:
                AbstractC1197a abstractC1197a = (AbstractC1197a) obj;
                c1236n.getClass();
                c1236n.m3948N0(((AbstractC1269z) abstractC1197a).mo3748a(null));
                abstractC1197a.mo3749b(c1236n);
                break;
            case 11:
                if (!(obj instanceof C1218h)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c1236n.m3948N0(length);
                    c1236n.m3960y0(bArr, 0, length);
                } else {
                    c1236n.m3936B0((C1218h) obj);
                }
                break;
            case 12:
                c1236n.m3948N0(((Integer) obj).intValue());
                break;
            case 13:
                c1236n.m3942H0(((Integer) obj).intValue());
                break;
            case 14:
                c1236n.m3938D0(((Integer) obj).intValue());
                break;
            case 15:
                c1236n.m3940F0(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c1236n.m3948N0((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                c1236n.m3950P0((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4011a() {
        if (this.f5475b) {
            return;
        }
        C1202b1 c1202b1 = this.f5474a;
        int size = c1202b1.f5356w.size();
        for (int i13 = 0; i13 < size; i13++) {
            Map.Entry entryM3782c = c1202b1.m3782c(i13);
            if (entryM3782c.getValue() instanceof AbstractC1269z) {
                AbstractC1269z abstractC1269z = (AbstractC1269z) entryM3782c.getValue();
                abstractC1269z.getClass();
                C1264w0 c1264w0 = C1264w0.f5502c;
                c1264w0.getClass();
                c1264w0.m4012a(abstractC1269z.getClass()).mo3989b(abstractC1269z);
                abstractC1269z.m4026h();
            }
        }
        if (!c1202b1.f5358y) {
            if (c1202b1.f5356w.size() > 0) {
                c1202b1.m3782c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = c1202b1.m3783d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!c1202b1.f5358y) {
            c1202b1.f5357x = c1202b1.f5357x.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c1202b1.f5357x);
            c1202b1.f5355E = c1202b1.f5355E.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c1202b1.f5355E);
            c1202b1.f5358y = true;
        }
        this.f5475b = true;
    }

    public final Object clone() {
        C1254t c1254t = new C1254t();
        C1202b1 c1202b1 = this.f5474a;
        if (c1202b1.f5356w.size() > 0) {
            Map.Entry entryM3782c = c1202b1.m3782c(0);
            AbstractC30802r.m94771t(entryM3782c.getKey());
            entryM3782c.getValue();
            throw null;
        }
        Iterator it = c1202b1.m3783d().iterator();
        if (!it.hasNext()) {
            return c1254t;
        }
        Map.Entry entry = (Map.Entry) it.next();
        AbstractC30802r.m94771t(entry.getKey());
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1254t) {
            return this.f5474a.equals(((C1254t) obj).f5474a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5474a.hashCode();
    }

    public C1254t(int i13) {
        m4011a();
        m4011a();
    }
}
