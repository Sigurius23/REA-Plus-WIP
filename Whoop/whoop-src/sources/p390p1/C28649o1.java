package p390p1;

import fa3.C14328u;
import java.util.ArrayList;
import l83.C23470p;
import p002a0.C0023g0;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: p1.o1 */
/* JADX INFO: loaded from: classes.dex */
public final class C28649o1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f115870a;

    /* JADX INFO: renamed from: b */
    public final int f115871b;

    /* JADX INFO: renamed from: c */
    public int f115872c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f115873d;

    /* JADX INFO: renamed from: e */
    public final C0023g0 f115874e;

    /* JADX INFO: renamed from: f */
    public final C23470p f115875f;

    public C28649o1(ArrayList arrayList, int i13) {
        this.f115870a = arrayList;
        this.f115871b = i13;
        if (i13 < 0) {
            AbstractC28657q1.m87188a("Invalid start index");
        }
        this.f115873d = new ArrayList();
        C0023g0 c0023g0 = new C0023g0();
        int size = arrayList.size();
        int i14 = 0;
        for (int i15 = 0; i15 < size; i15++) {
            C28660r0 c28660r0 = (C28660r0) this.f115870a.get(i15);
            int i16 = c28660r0.f115947c;
            int i17 = c28660r0.f115948d;
            c0023g0.m51h(i16, new C28636l0(i15, i14, i17));
            i14 += i17;
        }
        this.f115874e = c0023g0;
        this.f115875f = AbstractC30060g.m92088H(new C14328u(this, 11));
    }

    /* JADX INFO: renamed from: a */
    public final boolean m87111a(int i13, int i14) {
        int i15;
        C0023g0 c0023g0 = this.f115874e;
        C28636l0 c28636l0 = (C28636l0) c0023g0.m121b(i13);
        if (c28636l0 == null) {
            return false;
        }
        int i16 = c28636l0.f115823b;
        int i17 = i14 - c28636l0.f115824c;
        c28636l0.f115824c = i14;
        if (i17 == 0) {
            return true;
        }
        Object[] objArr = c0023g0.f150c;
        long[] jArr = c0023g0.f148a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i18 = 0;
        while (true) {
            long j7 = jArr[i18];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i19 = 8 - ((~(i18 - length)) >>> 31);
                for (int i24 = 0; i24 < i19; i24++) {
                    if ((255 & j7) < 128) {
                        C28636l0 c28636l1 = (C28636l0) objArr[(i18 << 3) + i24];
                        if (c28636l1.f115823b >= i16 && !c28636l1.equals(c28636l0) && (i15 = c28636l1.f115823b + i17) >= 0) {
                            c28636l1.f115823b = i15;
                        }
                    }
                    j7 >>= 8;
                }
                if (i19 != 8) {
                    return true;
                }
            }
            if (i18 == length) {
                return true;
            }
            i18++;
        }
    }
}
