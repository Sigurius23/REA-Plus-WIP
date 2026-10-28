package p184h5;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p543v4.C35643b;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: h5.i1 */
/* JADX INFO: loaded from: classes.dex */
public class C16881i1 extends C16899o1 {

    /* JADX INFO: renamed from: h */
    public static boolean f64824h = false;

    /* JADX INFO: renamed from: i */
    public static Method f64825i;

    /* JADX INFO: renamed from: j */
    public static Class f64826j;

    /* JADX INFO: renamed from: k */
    public static Field f64827k;

    /* JADX INFO: renamed from: l */
    public static Field f64828l;

    /* JADX INFO: renamed from: c */
    public final WindowInsets f64829c;

    /* JADX INFO: renamed from: d */
    public C35643b[] f64830d;

    /* JADX INFO: renamed from: e */
    public C35643b f64831e;

    /* JADX INFO: renamed from: f */
    public C16905q1 f64832f;

    /* JADX INFO: renamed from: g */
    public C35643b f64833g;

    public C16881i1(C16905q1 c16905q1, WindowInsets windowInsets) {
        super(c16905q1);
        this.f64831e = null;
        this.f64829c = windowInsets;
    }

    @SuppressLint({"PrivateApi"})
    /* JADX INFO: renamed from: A */
    private static void m47524A() {
        try {
            f64825i = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f64826j = cls;
            f64827k = cls.getDeclaredField("mVisibleInsets");
            f64828l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f64827k.setAccessible(true);
            f64828l.setAccessible(true);
        } catch (ReflectiveOperationException e5) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e5.getMessage(), e5);
        }
        f64824h = true;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: v */
    private C35643b m47525v(int i13, boolean z4) {
        C35643b c35643bM112839a = C35643b.f151448e;
        for (int i14 = 1; i14 <= 256; i14 <<= 1) {
            if ((i13 & i14) != 0) {
                c35643bM112839a = C35643b.m112839a(c35643bM112839a, m47539w(i14, z4));
            }
        }
        return c35643bM112839a;
    }

    /* JADX INFO: renamed from: x */
    private C35643b m47526x() {
        C16905q1 c16905q1 = this.f64832f;
        return c16905q1 != null ? c16905q1.f64864a.mo47544j() : C35643b.f151448e;
    }

    /* JADX INFO: renamed from: y */
    private C35643b m47527y(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }
        if (!f64824h) {
            m47524A();
        }
        Method method = f64825i;
        if (method != null && f64826j != null && f64827k != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f64827k.get(f64828l.get(objInvoke));
                if (rect != null) {
                    return C35643b.m112840b(rect.left, rect.top, rect.right, rect.bottom);
                }
            } catch (ReflectiveOperationException e5) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e5.getMessage(), e5);
            }
        }
        return null;
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: d */
    public void mo47528d(View view) {
        C35643b c35643bM47527y = m47527y(view);
        if (c35643bM47527y == null) {
            c35643bM47527y = C35643b.f151448e;
        }
        mo47537s(c35643bM47527y);
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: e */
    public void mo47529e(C16905q1 c16905q1) {
        c16905q1.f64864a.mo47538t(this.f64832f);
        c16905q1.f64864a.mo47537s(this.f64833g);
    }

    @Override // p184h5.C16899o1
    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return Objects.equals(this.f64833g, ((C16881i1) obj).f64833g);
        }
        return false;
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: g */
    public C35643b mo47530g(int i13) {
        return m47525v(i13, false);
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: h */
    public C35643b mo47531h(int i13) {
        return m47525v(i13, true);
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: l */
    public final C35643b mo47532l() {
        if (this.f64831e == null) {
            WindowInsets windowInsets = this.f64829c;
            this.f64831e = C35643b.m112840b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f64831e;
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: n */
    public C16905q1 mo47533n(int i13, int i14, int i15, int i16) {
        AbstractC16878h1 c16872f1;
        C16905q1 c16905q1M47596h = C16905q1.m47596h(null, this.f64829c);
        int i17 = Build.VERSION.SDK_INT;
        if (i17 >= 30) {
            c16872f1 = new C16875g1(c16905q1M47596h);
        } else {
            c16872f1 = i17 >= 29 ? new C16872f1(c16905q1M47596h) : new C16869e1(c16905q1M47596h);
        }
        c16872f1.mo47497g(C16905q1.m47595e(mo47532l(), i13, i14, i15, i16));
        c16872f1.mo47496e(C16905q1.m47595e(mo47544j(), i13, i14, i15, i16));
        return c16872f1.mo47495b();
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: p */
    public boolean mo47534p() {
        return this.f64829c.isRound();
    }

    @Override // p184h5.C16899o1
    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: q */
    public boolean mo47535q(int i13) {
        for (int i14 = 1; i14 <= 256; i14 <<= 1) {
            if ((i13 & i14) != 0 && !m47540z(i14)) {
                return false;
            }
        }
        return true;
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: r */
    public void mo47536r(C35643b[] c35643bArr) {
        this.f64830d = c35643bArr;
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: s */
    public void mo47537s(C35643b c35643b) {
        this.f64833g = c35643b;
    }

    @Override // p184h5.C16899o1
    /* JADX INFO: renamed from: t */
    public void mo47538t(C16905q1 c16905q1) {
        this.f64832f = c16905q1;
    }

    /* JADX INFO: renamed from: w */
    public C35643b m47539w(int i13, boolean z4) {
        C35643b c35643bMo47544j;
        int i14;
        if (i13 == 1) {
            return z4 ? C35643b.m112840b(0, Math.max(m47526x().f151450b, mo47532l().f151450b), 0, 0) : C35643b.m112840b(0, mo47532l().f151450b, 0, 0);
        }
        if (i13 == 2) {
            if (z4) {
                C35643b c35643bM47526x = m47526x();
                C35643b c35643bMo47544j2 = mo47544j();
                return C35643b.m112840b(Math.max(c35643bM47526x.f151449a, c35643bMo47544j2.f151449a), 0, Math.max(c35643bM47526x.f151451c, c35643bMo47544j2.f151451c), Math.max(c35643bM47526x.f151452d, c35643bMo47544j2.f151452d));
            }
            C35643b c35643bMo47532l = mo47532l();
            C16905q1 c16905q1 = this.f64832f;
            c35643bMo47544j = c16905q1 != null ? c16905q1.f64864a.mo47544j() : null;
            int iMin = c35643bMo47532l.f151452d;
            if (c35643bMo47544j != null) {
                iMin = Math.min(iMin, c35643bMo47544j.f151452d);
            }
            return C35643b.m112840b(c35643bMo47532l.f151449a, 0, c35643bMo47532l.f151451c, iMin);
        }
        C35643b c35643b = C35643b.f151448e;
        if (i13 == 8) {
            C35643b[] c35643bArr = this.f64830d;
            c35643bMo47544j = c35643bArr != null ? c35643bArr[AbstractC30060g.m92084B(8)] : null;
            if (c35643bMo47544j != null) {
                return c35643bMo47544j;
            }
            C35643b c35643bMo47532l2 = mo47532l();
            C35643b c35643bM47526x2 = m47526x();
            int i15 = c35643bMo47532l2.f151452d;
            if (i15 > c35643bM47526x2.f151452d) {
                return C35643b.m112840b(0, 0, 0, i15);
            }
            C35643b c35643b2 = this.f64833g;
            return (c35643b2 == null || c35643b2.equals(c35643b) || (i14 = this.f64833g.f151452d) <= c35643bM47526x2.f151452d) ? c35643b : C35643b.m112840b(0, 0, 0, i14);
        }
        if (i13 == 16) {
            return mo47558k();
        }
        if (i13 == 32) {
            return mo47557i();
        }
        if (i13 == 64) {
            return mo47559m();
        }
        if (i13 != 128) {
            return c35643b;
        }
        C16905q1 c16905q2 = this.f64832f;
        C16876h c16876hMo47550f = c16905q2 != null ? c16905q2.f64864a.mo47550f() : mo47550f();
        if (c16876hMo47550f == null) {
            return c35643b;
        }
        DisplayCutout displayCutout = c16876hMo47550f.f64821a;
        return C35643b.m112840b(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
    }

    /* JADX INFO: renamed from: z */
    public boolean m47540z(int i13) {
        if (i13 != 1 && i13 != 2) {
            if (i13 == 4) {
                return false;
            }
            if (i13 != 8 && i13 != 128) {
                return true;
            }
        }
        return !m47539w(i13, false).equals(C35643b.f151448e);
    }

    public C16881i1(C16905q1 c16905q1, C16881i1 c16881i1) {
        this(c16905q1, new WindowInsets(c16881i1.f64829c));
    }
}
