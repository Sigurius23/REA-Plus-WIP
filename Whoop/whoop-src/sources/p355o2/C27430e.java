package p355o2;

import p000.AbstractC11266d;
import p208i2.C17919x;
import p249jc.C21565a;
import p636y3.C39174f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C27430e {

    /* JADX INFO: renamed from: k */
    public static int f110536k;

    /* JADX INFO: renamed from: l */
    public static final C21565a f110537l = new C21565a(13);

    /* JADX INFO: renamed from: a */
    public final String f110538a;

    /* JADX INFO: renamed from: b */
    public final float f110539b;

    /* JADX INFO: renamed from: c */
    public final float f110540c;

    /* JADX INFO: renamed from: d */
    public final float f110541d;

    /* JADX INFO: renamed from: e */
    public final float f110542e;

    /* JADX INFO: renamed from: f */
    public final C27431e0 f110543f;

    /* JADX INFO: renamed from: g */
    public final long f110544g;

    /* JADX INFO: renamed from: h */
    public final int f110545h;

    /* JADX INFO: renamed from: i */
    public final boolean f110546i;

    /* JADX INFO: renamed from: j */
    public final int f110547j;

    public C27430e(String str, float f13, float f14, float f15, float f16, C27431e0 c27431e0, long j7, int i13, boolean z4) {
        int i14;
        synchronized (f110537l) {
            i14 = f110536k;
            f110536k = i14 + 1;
        }
        this.f110538a = str;
        this.f110539b = f13;
        this.f110540c = f14;
        this.f110541d = f15;
        this.f110542e = f16;
        this.f110543f = c27431e0;
        this.f110544g = j7;
        this.f110545h = i13;
        this.f110546i = z4;
        this.f110547j = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C27430e)) {
            return false;
        }
        C27430e c27430e = (C27430e) obj;
        return AbstractC22676k.m65745e(this.f110538a, c27430e.f110538a) && C39174f.m124782b(this.f110539b, c27430e.f110539b) && C39174f.m124782b(this.f110540c, c27430e.f110540c) && this.f110541d == c27430e.f110541d && this.f110542e == c27430e.f110542e && this.f110543f.equals(c27430e.f110543f) && C17919x.m51542d(this.f110544g, c27430e.f110544g) && this.f110545h == c27430e.f110545h && this.f110546i == c27430e.f110546i;
    }

    public final int hashCode() {
        int iHashCode = (this.f110543f.hashCode() + AbstractC11266d.m30447a(this.f110542e, AbstractC11266d.m30447a(this.f110541d, AbstractC11266d.m30447a(this.f110540c, AbstractC11266d.m30447a(this.f110539b, this.f110538a.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i13 = C17919x.f69638o;
        return Boolean.hashCode(this.f110546i) + AbstractC11266d.m30448b(this.f110545h, AbstractC11266d.m30451e(iHashCode, this.f110544g, 31), 31);
    }
}
