package androidx.health.platform.client.proto;

import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: androidx.health.platform.client.proto.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1504o0 {

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f6080c = 0;

    /* JADX INFO: renamed from: a */
    public final C1546w2 f6081a = new C1546w2(16);

    /* JADX INFO: renamed from: b */
    public boolean f6082b;

    static {
        new C1504o0(0);
    }

    public C1504o0() {
    }

    /* JADX INFO: renamed from: b */
    public static void m4738b(C1483k c1483k, EnumC1542v3 enumC1542v3, int i13, Object obj) {
        if (enumC1542v3 == EnumC1542v3.f6129z) {
            c1483k.m4673O(i13, 3);
            ((AbstractC1433a) obj).mo4564c(c1483k);
            c1483k.m4673O(i13, 4);
        }
        c1483k.m4673O(i13, enumC1542v3.f6131x);
        switch (enumC1542v3.ordinal()) {
            case 0:
                c1483k.m4670L(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                break;
            case 1:
                c1483k.m4668J(Float.floatToRawIntBits(((Float) obj).floatValue()));
                break;
            case 2:
                c1483k.m4676R(((Long) obj).longValue());
                break;
            case 3:
                c1483k.m4676R(((Long) obj).longValue());
                break;
            case 4:
                c1483k.m4671M(((Integer) obj).intValue());
                break;
            case 5:
                c1483k.m4670L(((Long) obj).longValue());
                break;
            case 6:
                c1483k.m4668J(((Integer) obj).intValue());
                break;
            case 7:
                c1483k.m4664F(((Boolean) obj).booleanValue() ? (byte) 1 : (byte) 0);
                break;
            case 8:
                if (!(obj instanceof C1468h)) {
                    c1483k.m4672N((String) obj);
                } else {
                    c1483k.m4666H((C1468h) obj);
                }
                break;
            case 9:
                ((AbstractC1433a) obj).mo4564c(c1483k);
                break;
            case 10:
                AbstractC1433a abstractC1433a = (AbstractC1433a) obj;
                c1483k.m4674P(((AbstractC1534u0) abstractC1433a).mo4563b(null));
                abstractC1433a.mo4564c(c1483k);
                break;
            case 11:
                if (!(obj instanceof C1468h)) {
                    byte[] bArr = (byte[]) obj;
                    int length = bArr.length;
                    c1483k.m4674P(length);
                    c1483k.m4665G(bArr, 0, length);
                } else {
                    c1483k.m4666H((C1468h) obj);
                }
                break;
            case 12:
                c1483k.m4674P(((Integer) obj).intValue());
                break;
            case 13:
                if (!(obj instanceof EnumC1535u1)) {
                    c1483k.m4671M(((Integer) obj).intValue());
                } else {
                    c1483k.m4671M(((EnumC1535u1) obj).f6121w);
                }
                break;
            case 14:
                c1483k.m4668J(((Integer) obj).intValue());
                break;
            case 15:
                c1483k.m4670L(((Long) obj).longValue());
                break;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                c1483k.m4674P((iIntValue >> 31) ^ (iIntValue << 1));
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                long jLongValue = ((Long) obj).longValue();
                c1483k.m4676R((jLongValue >> 63) ^ (jLongValue << 1));
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m4739a() {
        C1546w2 c1546w2;
        if (this.f6082b) {
            return;
        }
        int i13 = 0;
        while (true) {
            c1546w2 = this.f6081a;
            if (i13 >= c1546w2.f6136x.size()) {
                break;
            }
            Map.Entry entryM4930c = c1546w2.m4930c(i13);
            if (entryM4930c.getValue() instanceof AbstractC1534u0) {
                AbstractC1534u0 abstractC1534u0 = (AbstractC1534u0) entryM4930c.getValue();
                abstractC1534u0.getClass();
                C1554y1 c1554y1 = C1554y1.f6164c;
                c1554y1.getClass();
                c1554y1.m4946a(abstractC1534u0.getClass()).mo4765b(abstractC1534u0);
                abstractC1534u0.m4872j();
            }
            i13++;
        }
        if (!c1546w2.f6138z) {
            if (c1546w2.f6136x.size() > 0) {
                c1546w2.m4930c(0).getKey().getClass();
                throw new ClassCastException();
            }
            Iterator it = c1546w2.m4931d().iterator();
            if (it.hasNext()) {
                ((Map.Entry) it.next()).getKey().getClass();
                throw new ClassCastException();
            }
        }
        if (!c1546w2.f6138z) {
            c1546w2.f6137y = c1546w2.f6137y.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c1546w2.f6137y);
            c1546w2.f6134F = c1546w2.f6134F.isEmpty() ? Collections.EMPTY_MAP : Collections.unmodifiableMap(c1546w2.f6134F);
            c1546w2.f6138z = true;
        }
        this.f6082b = true;
    }

    public final Object clone() {
        C1504o0 c1504o0 = new C1504o0();
        C1546w2 c1546w2 = this.f6081a;
        if (c1546w2.f6136x.size() > 0) {
            Map.Entry entryM4930c = c1546w2.m4930c(0);
            if (entryM4930c.getKey() != null) {
                throw new ClassCastException();
            }
            entryM4930c.getValue();
            throw null;
        }
        Iterator it = c1546w2.m4931d().iterator();
        if (!it.hasNext()) {
            return c1504o0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (entry.getKey() != null) {
            throw new ClassCastException();
        }
        entry.getValue();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1504o0) {
            return this.f6081a.equals(((C1504o0) obj).f6081a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f6081a.hashCode();
    }

    public C1504o0(int i13) {
        m4739a();
        m4739a();
    }
}
