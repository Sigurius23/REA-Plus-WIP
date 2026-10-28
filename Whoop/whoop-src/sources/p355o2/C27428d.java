package p355o2;

import java.util.ArrayList;
import p208i2.C17875c1;
import p208i2.C17919x;
import p319m4.AbstractC25012a;
import p603x2.AbstractC37831a;

/* JADX INFO: renamed from: o2.d */
/* JADX INFO: loaded from: classes.dex */
public final class C27428d {

    /* JADX INFO: renamed from: a */
    public final String f110513a;

    /* JADX INFO: renamed from: b */
    public final float f110514b;

    /* JADX INFO: renamed from: c */
    public final float f110515c;

    /* JADX INFO: renamed from: d */
    public final float f110516d;

    /* JADX INFO: renamed from: e */
    public final float f110517e;

    /* JADX INFO: renamed from: f */
    public final long f110518f;

    /* JADX INFO: renamed from: g */
    public final int f110519g;

    /* JADX INFO: renamed from: h */
    public final boolean f110520h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f110521i;

    /* JADX INFO: renamed from: j */
    public final C27426c f110522j;

    /* JADX INFO: renamed from: k */
    public boolean f110523k;

    public C27428d(String str, float f13, float f14, float f15, float f16, long j7, int i13, boolean z4, int i14) {
        str = (i14 & 1) != 0 ? "" : str;
        long j13 = (i14 & 32) != 0 ? C17919x.f69637n : j7;
        int i15 = (i14 & 64) != 0 ? 5 : i13;
        boolean z13 = (i14 & 128) != 0 ? false : z4;
        this.f110513a = str;
        this.f110514b = f13;
        this.f110515c = f14;
        this.f110516d = f15;
        this.f110517e = f16;
        this.f110518f = j13;
        this.f110519g = i15;
        this.f110520h = z13;
        ArrayList arrayList = new ArrayList();
        this.f110521i = arrayList;
        C27426c c27426c = new C27426c(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.f110522j = c27426c;
        arrayList.add(c27426c);
    }

    /* JADX INFO: renamed from: a */
    public static void m82858a(C27428d c27428d, ArrayList arrayList, C17875c1 c17875c1) {
        if (c27428d.f110523k) {
            AbstractC37831a.m121374b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ((C27426c) AbstractC25012a.m73371d(c27428d.f110521i, 1)).f110510j.add(new C27437h0("", arrayList, 0, c17875c1, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    /* JADX INFO: renamed from: b */
    public final C27430e m82859b() {
        if (this.f110523k) {
            AbstractC37831a.m121374b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.f110521i;
            if (arrayList.size() <= 1) {
                C27426c c27426c = this.f110522j;
                C27430e c27430e = new C27430e(this.f110513a, this.f110514b, this.f110515c, this.f110516d, this.f110517e, new C27431e0(c27426c.f110501a, c27426c.f110502b, c27426c.f110503c, c27426c.f110504d, c27426c.f110505e, c27426c.f110506f, c27426c.f110507g, c27426c.f110508h, c27426c.f110509i, c27426c.f110510j), this.f110518f, this.f110519g, this.f110520h);
                this.f110523k = true;
                return c27430e;
            }
            if (this.f110523k) {
                AbstractC37831a.m121374b("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
            }
            C27426c c27426c2 = (C27426c) arrayList.remove(arrayList.size() - 1);
            ((C27426c) AbstractC25012a.m73371d(arrayList, 1)).f110510j.add(new C27431e0(c27426c2.f110501a, c27426c2.f110502b, c27426c2.f110503c, c27426c2.f110504d, c27426c2.f110505e, c27426c2.f110506f, c27426c2.f110507g, c27426c2.f110508h, c27426c2.f110509i, c27426c2.f110510j));
        }
    }
}
