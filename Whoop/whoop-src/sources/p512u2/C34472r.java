package p512u2;

import java.util.ArrayList;
import java.util.List;
import m83.C25271y;
import p181h2.C16617b;

/* JADX INFO: renamed from: u2.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C34472r {

    /* JADX INFO: renamed from: a */
    public final long f144815a;

    /* JADX INFO: renamed from: b */
    public final long f144816b;

    /* JADX INFO: renamed from: c */
    public final long f144817c;

    /* JADX INFO: renamed from: d */
    public final boolean f144818d;

    /* JADX INFO: renamed from: e */
    public final float f144819e;

    /* JADX INFO: renamed from: f */
    public final long f144820f;

    /* JADX INFO: renamed from: g */
    public final long f144821g;

    /* JADX INFO: renamed from: h */
    public final boolean f144822h;

    /* JADX INFO: renamed from: i */
    public final int f144823i;

    /* JADX INFO: renamed from: j */
    public final long f144824j;

    /* JADX INFO: renamed from: k */
    public final List f144825k;

    /* JADX INFO: renamed from: l */
    public final long f144826l;

    /* JADX INFO: renamed from: m */
    public boolean f144827m;

    /* JADX INFO: renamed from: n */
    public boolean f144828n;

    /* JADX INFO: renamed from: o */
    public C34472r f144829o;

    public /* synthetic */ C34472r(long j7, long j13, long j14, float f13, long j15, long j16, boolean z4, boolean z13, int i13) {
        this(j7, j13, j14, false, f13, j15, j16, z4, z13, i13, 0L);
    }

    /* JADX INFO: renamed from: b */
    public static C34472r m108945b(C34472r c34472r, long j7, long j13, ArrayList arrayList) {
        C34472r c34472r2 = c34472r;
        C34472r c34472r3 = new C34472r(c34472r2.f144815a, c34472r2.f144816b, j7, c34472r2.f144818d, c34472r2.f144819e, c34472r2.f144820f, j13, c34472r2.f144822h, c34472r2.f144823i, arrayList, c34472r2.f144824j, c34472r2.f144826l);
        C34472r c34472r4 = c34472r2.f144829o;
        if (c34472r4 == null) {
            c34472r4 = c34472r2;
        }
        c34472r3.f144829o = c34472r4;
        C34472r c34472r5 = c34472r2.f144829o;
        if (c34472r5 != null) {
            c34472r2 = c34472r5;
        }
        c34472r3.f144829o = c34472r2;
        return c34472r3;
    }

    /* JADX INFO: renamed from: a */
    public final void m108946a() {
        C34472r c34472r = this.f144829o;
        if (c34472r == null) {
            this.f144827m = true;
            this.f144828n = true;
        } else if (c34472r != null) {
            c34472r.m108946a();
        }
    }

    /* JADX INFO: renamed from: c */
    public final List m108947c() {
        List list = this.f144825k;
        return list == null ? C25271y.f99162w : list;
    }

    /* JADX INFO: renamed from: d */
    public final long m108948d() {
        return this.f144815a;
    }

    /* JADX INFO: renamed from: e */
    public final long m108949e() {
        return this.f144817c;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m108950f() {
        return this.f144818d;
    }

    /* JADX INFO: renamed from: g */
    public final float m108951g() {
        return this.f144819e;
    }

    /* JADX INFO: renamed from: h */
    public final long m108952h() {
        return this.f144821g;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m108953i() {
        return this.f144822h;
    }

    /* JADX INFO: renamed from: j */
    public final int m108954j() {
        return this.f144823i;
    }

    /* JADX INFO: renamed from: k */
    public final long m108955k() {
        return this.f144816b;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m108956l() {
        C34472r c34472r = this.f144829o;
        if (c34472r != null) {
            return c34472r.m108956l();
        }
        return this.f144827m || this.f144828n;
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder("PointerInputChange(id=");
        sb4.append((Object) AbstractC34471q.m108944b(this.f144815a));
        sb4.append(", uptimeMillis=");
        sb4.append(this.f144816b);
        sb4.append(", position=");
        sb4.append((Object) C16617b.m47194j(this.f144817c));
        sb4.append(", pressed=");
        sb4.append(this.f144818d);
        sb4.append(", pressure=");
        sb4.append(this.f144819e);
        sb4.append(", previousUptimeMillis=");
        sb4.append(this.f144820f);
        sb4.append(", previousPosition=");
        sb4.append((Object) C16617b.m47194j(this.f144821g));
        sb4.append(", previousPressed=");
        sb4.append(this.f144822h);
        sb4.append(", isConsumed=");
        sb4.append(m108956l());
        sb4.append(", type=");
        int i13 = this.f144823i;
        if (i13 == 1) {
            str = "Touch";
        } else if (i13 == 2) {
            str = "Mouse";
        } else if (i13 != 3) {
            str = i13 != 4 ? "Unknown" : "Eraser";
        } else {
            str = "Stylus";
        }
        sb4.append((Object) str);
        sb4.append(", historical=");
        sb4.append(m108947c());
        sb4.append(",scrollDelta=");
        sb4.append((Object) C16617b.m47194j(this.f144824j));
        sb4.append(')');
        return sb4.toString();
    }

    public C34472r(long j7, long j13, long j14, boolean z4, float f13, long j15, long j16, boolean z13, boolean z14, int i13, long j17) {
        this.f144815a = j7;
        this.f144816b = j13;
        this.f144817c = j14;
        this.f144818d = z4;
        this.f144819e = f13;
        this.f144820f = j15;
        this.f144821g = j16;
        this.f144822h = z13;
        this.f144823i = i13;
        this.f144824j = j17;
        this.f144826l = 0L;
        this.f144827m = z14;
        this.f144828n = z14;
    }

    public C34472r(long j7, long j13, long j14, boolean z4, float f13, long j15, long j16, boolean z13, int i13, List list, long j17, long j18) {
        this(j7, j13, j14, z4, f13, j15, j16, z13, false, i13, j17);
        this.f144825k = list;
        this.f144826l = j18;
    }
}
