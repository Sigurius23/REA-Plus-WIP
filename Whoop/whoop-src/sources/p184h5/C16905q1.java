package p184h5;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;
import p543v4.C35643b;

/* JADX INFO: renamed from: h5.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C16905q1 {

    /* JADX INFO: renamed from: b */
    public static final C16905q1 f64863b;

    /* JADX INFO: renamed from: a */
    public final C16899o1 f64864a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f64863b = C16896n1.f64848q;
        } else {
            f64863b = C16899o1.f64849b;
        }
    }

    public C16905q1(WindowInsets windowInsets) {
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 30) {
            this.f64864a = new C16896n1(this, windowInsets);
        } else if (i13 >= 29) {
            this.f64864a = new C16890l1(this, windowInsets);
        } else {
            this.f64864a = new C16887k1(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: e */
    public static C35643b m47595e(C35643b c35643b, int i13, int i14, int i15, int i16) {
        int iMax = Math.max(0, c35643b.f151449a - i13);
        int iMax2 = Math.max(0, c35643b.f151450b - i14);
        int iMax3 = Math.max(0, c35643b.f151451c - i15);
        int iMax4 = Math.max(0, c35643b.f151452d - i16);
        return (iMax == i13 && iMax2 == i14 && iMax3 == i15 && iMax4 == i16) ? c35643b : C35643b.m112840b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: h */
    public static C16905q1 m47596h(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C16905q1 c16905q1 = new C16905q1(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = AbstractC16901p0.f64851a;
            C16905q1 c16905q1M47522a = AbstractC16880i0.m47522a(view);
            C16899o1 c16899o1 = c16905q1.f64864a;
            c16899o1.mo47538t(c16905q1M47522a);
            c16899o1.mo47528d(view.getRootView());
        }
        return c16905q1;
    }

    /* JADX INFO: renamed from: a */
    public final int m47597a() {
        return this.f64864a.mo47532l().f151452d;
    }

    /* JADX INFO: renamed from: b */
    public final int m47598b() {
        return this.f64864a.mo47532l().f151449a;
    }

    /* JADX INFO: renamed from: c */
    public final int m47599c() {
        return this.f64864a.mo47532l().f151451c;
    }

    /* JADX INFO: renamed from: d */
    public final int m47600d() {
        return this.f64864a.mo47532l().f151450b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C16905q1) {
            return Objects.equals(this.f64864a, ((C16905q1) obj).f64864a);
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final C16905q1 m47601f(int i13, int i14, int i15, int i16) {
        AbstractC16878h1 c16872f1;
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 30) {
            c16872f1 = new C16875g1(this);
        } else {
            c16872f1 = i17 >= 29 ? new C16872f1(this) : new C16869e1(this);
        }
        c16872f1.mo47497g(C35643b.m112840b(i13, i14, i15, i16));
        return c16872f1.mo47495b();
    }

    /* JADX INFO: renamed from: g */
    public final WindowInsets m47602g() {
        C16899o1 c16899o1 = this.f64864a;
        if (c16899o1 instanceof C16881i1) {
            return ((C16881i1) c16899o1).f64829c;
        }
        return null;
    }

    public final int hashCode() {
        C16899o1 c16899o1 = this.f64864a;
        if (c16899o1 == null) {
            return 0;
        }
        return c16899o1.hashCode();
    }

    public C16905q1(C16905q1 c16905q1) {
        if (c16905q1 != null) {
            C16899o1 c16899o1 = c16905q1.f64864a;
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 30 && (c16899o1 instanceof C16896n1)) {
                this.f64864a = new C16896n1(this, (C16896n1) c16899o1);
            } else if (i13 >= 29 && (c16899o1 instanceof C16890l1)) {
                this.f64864a = new C16890l1(this, (C16890l1) c16899o1);
            } else if (c16899o1 instanceof C16887k1) {
                this.f64864a = new C16887k1(this, (C16887k1) c16899o1);
            } else if (c16899o1 instanceof C16884j1) {
                this.f64864a = new C16884j1(this, (C16884j1) c16899o1);
            } else if (c16899o1 instanceof C16881i1) {
                this.f64864a = new C16881i1(this, (C16881i1) c16899o1);
            } else {
                this.f64864a = new C16899o1(this);
            }
            c16899o1.mo47529e(this);
            return;
        }
        this.f64864a = new C16899o1(this);
    }
}
