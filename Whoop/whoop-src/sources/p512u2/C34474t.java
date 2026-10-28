package p512u2;

import java.util.ArrayList;
import java.util.List;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p181h2.C16617b;

/* JADX INFO: renamed from: u2.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C34474t {

    /* JADX INFO: renamed from: a */
    public final long f144833a;

    /* JADX INFO: renamed from: b */
    public final long f144834b;

    /* JADX INFO: renamed from: c */
    public final long f144835c;

    /* JADX INFO: renamed from: d */
    public final long f144836d;

    /* JADX INFO: renamed from: e */
    public final boolean f144837e;

    /* JADX INFO: renamed from: f */
    public final float f144838f;

    /* JADX INFO: renamed from: g */
    public final int f144839g;

    /* JADX INFO: renamed from: h */
    public final boolean f144840h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f144841i;

    /* JADX INFO: renamed from: j */
    public final long f144842j;

    /* JADX INFO: renamed from: k */
    public final long f144843k;

    public C34474t(long j7, long j13, long j14, long j15, boolean z4, float f13, int i13, boolean z13, ArrayList arrayList, long j16, long j17) {
        this.f144833a = j7;
        this.f144834b = j13;
        this.f144835c = j14;
        this.f144836d = j15;
        this.f144837e = z4;
        this.f144838f = f13;
        this.f144839g = i13;
        this.f144840h = z13;
        this.f144841i = arrayList;
        this.f144842j = j16;
        this.f144843k = j17;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m108960a() {
        return this.f144837e;
    }

    /* JADX INFO: renamed from: b */
    public final List m108961b() {
        return this.f144841i;
    }

    /* JADX INFO: renamed from: c */
    public final long m108962c() {
        return this.f144833a;
    }

    /* JADX INFO: renamed from: d */
    public final long m108963d() {
        return this.f144843k;
    }

    /* JADX INFO: renamed from: e */
    public final long m108964e() {
        return this.f144836d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34474t)) {
            return false;
        }
        C34474t c34474t = (C34474t) obj;
        return AbstractC34471q.m108943a(this.f144833a, c34474t.f144833a) && this.f144834b == c34474t.f144834b && C16617b.m47187c(this.f144835c, c34474t.f144835c) && C16617b.m47187c(this.f144836d, c34474t.f144836d) && this.f144837e == c34474t.f144837e && Float.compare(this.f144838f, c34474t.f144838f) == 0 && this.f144839g == c34474t.f144839g && this.f144840h == c34474t.f144840h && this.f144841i.equals(c34474t.f144841i) && C16617b.m47187c(this.f144842j, c34474t.f144842j) && C16617b.m47187c(this.f144843k, c34474t.f144843k);
    }

    /* JADX INFO: renamed from: f */
    public final long m108965f() {
        return this.f144835c;
    }

    /* JADX INFO: renamed from: g */
    public final float m108966g() {
        return this.f144838f;
    }

    /* JADX INFO: renamed from: h */
    public final long m108967h() {
        return this.f144842j;
    }

    public final int hashCode() {
        return Long.hashCode(this.f144843k) + AbstractC11266d.m30451e((this.f144841i.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30448b(this.f144839g, AbstractC11266d.m30447a(this.f144838f, AbstractC2875y.m8289b(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.f144833a) * 31, this.f144834b, 31), this.f144835c, 31), this.f144836d, 31), 31, this.f144837e), 31), 31), 31, this.f144840h)) * 31, this.f144842j, 31);
    }

    /* JADX INFO: renamed from: i */
    public final int m108968i() {
        return this.f144839g;
    }

    /* JADX INFO: renamed from: j */
    public final long m108969j() {
        return this.f144834b;
    }

    public final String toString() {
        String str;
        StringBuilder sb4 = new StringBuilder("PointerInputEventData(id=");
        sb4.append((Object) AbstractC34471q.m108944b(this.f144833a));
        sb4.append(", uptime=");
        sb4.append(this.f144834b);
        sb4.append(", positionOnScreen=");
        sb4.append((Object) C16617b.m47194j(this.f144835c));
        sb4.append(", position=");
        sb4.append((Object) C16617b.m47194j(this.f144836d));
        sb4.append(", down=");
        sb4.append(this.f144837e);
        sb4.append(", pressure=");
        sb4.append(this.f144838f);
        sb4.append(", type=");
        int i13 = this.f144839g;
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
        sb4.append(", activeHover=");
        sb4.append(this.f144840h);
        sb4.append(", historical=");
        sb4.append(this.f144841i);
        sb4.append(", scrollDelta=");
        sb4.append((Object) C16617b.m47194j(this.f144842j));
        sb4.append(", originalEventPosition=");
        sb4.append((Object) C16617b.m47194j(this.f144843k));
        sb4.append(')');
        return sb4.toString();
    }
}
