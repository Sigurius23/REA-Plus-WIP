package p168g6;

import a33.C0352d;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import fr.C14699j;
import fr.C14700k;
import java.util.ArrayList;
import p032bc.C2942c0;
import p032bc.C2971t;
import p522uf.AbstractC34870c0;

/* JADX INFO: renamed from: g6.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C15525f {

    /* JADX INFO: renamed from: p */
    public static final C15522c f58199p = new C15522c(1);

    /* JADX INFO: renamed from: q */
    public static final C15522c f58200q = new C15522c(2);

    /* JADX INFO: renamed from: r */
    public static final C15522c f58201r = new C15522c(3);

    /* JADX INFO: renamed from: s */
    public static final C15522c f58202s = new C15522c(4);

    /* JADX INFO: renamed from: t */
    public static final C15522c f58203t = new C15522c(5);

    /* JADX INFO: renamed from: u */
    public static final C15522c f58204u = new C15522c(0);

    /* JADX INFO: renamed from: a */
    public float f58205a;

    /* JADX INFO: renamed from: b */
    public float f58206b;

    /* JADX INFO: renamed from: c */
    public boolean f58207c;

    /* JADX INFO: renamed from: d */
    public final C14700k f58208d;

    /* JADX INFO: renamed from: e */
    public final AbstractC34870c0 f58209e;

    /* JADX INFO: renamed from: f */
    public boolean f58210f;

    /* JADX INFO: renamed from: g */
    public float f58211g;

    /* JADX INFO: renamed from: h */
    public float f58212h;

    /* JADX INFO: renamed from: i */
    public long f58213i;

    /* JADX INFO: renamed from: j */
    public float f58214j;

    /* JADX INFO: renamed from: k */
    public final ArrayList f58215k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f58216l;

    /* JADX INFO: renamed from: m */
    public C15526g f58217m;

    /* JADX INFO: renamed from: n */
    public float f58218n;

    /* JADX INFO: renamed from: o */
    public boolean f58219o;

    public C15525f(C15524e c15524e) {
        this.f58205a = 0.0f;
        this.f58206b = Float.MAX_VALUE;
        this.f58207c = false;
        this.f58210f = false;
        this.f58211g = Float.MAX_VALUE;
        this.f58212h = -3.4028235E38f;
        this.f58213i = 0L;
        this.f58215k = new ArrayList();
        this.f58216l = new ArrayList();
        this.f58208d = null;
        this.f58209e = new C15523d(c15524e);
        this.f58214j = 1.0f;
        this.f58217m = null;
        this.f58218n = Float.MAX_VALUE;
        this.f58219o = false;
    }

    /* JADX INFO: renamed from: a */
    public final void m43708a(float f13) {
        if (this.f58210f) {
            this.f58218n = f13;
            return;
        }
        if (this.f58217m == null) {
            this.f58217m = new C15526g(f13);
        }
        C15526g c15526g = this.f58217m;
        double d3 = f13;
        c15526g.f58228i = d3;
        double d14 = (float) d3;
        if (d14 > this.f58211g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d14 < this.f58212h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.f58214j * 0.75f);
        c15526g.f58223d = dAbs;
        c15526g.f58224e = dAbs * 62.5d;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        boolean z4 = this.f58210f;
        if (z4 || z4) {
            return;
        }
        this.f58210f = true;
        if (!this.f58207c) {
            this.f58206b = this.f58209e.mo42140X(this.f58208d);
        }
        float f14 = this.f58206b;
        if (f14 > this.f58211g || f14 < this.f58212h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        ThreadLocal threadLocal = C15521b.f58190f;
        if (threadLocal.get() == null) {
            threadLocal.set(new C15521b());
        }
        C15521b c15521b = (C15521b) threadLocal.get();
        ArrayList arrayList = c15521b.f58192b;
        if (arrayList.size() == 0) {
            if (c15521b.f58194d == null) {
                c15521b.f58194d = new C0352d(c15521b.f58193c);
            }
            C0352d c0352d = c15521b.f58194d;
            ((Choreographer) c0352d.f1238y).postFrameCallback((ChoreographerFrameCallbackC15520a) c0352d.f1239z);
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    /* JADX INFO: renamed from: b */
    public final void m43709b(float f13) {
        ArrayList arrayList;
        this.f58209e.mo42141k0(this.f58208d, f13);
        int i13 = 0;
        while (true) {
            arrayList = this.f58216l;
            if (i13 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i13) != null) {
                C2971t c2971t = (C2971t) arrayList.get(i13);
                float f14 = this.f58206b;
                C2942c0 c2942c0 = c2971t.f11901g;
                long jMax = Math.max(-1L, Math.min(c2942c0.f11930X + 1, Math.round(f14)));
                c2942c0.mo8580G(jMax, c2971t.f11895a);
                c2971t.f11895a = jMax;
            }
            i13++;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m43710c() {
        if (this.f58217m.f58221b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        if (this.f58210f) {
            this.f58219o = true;
        }
    }

    public C15525f(C14700k c14700k) {
        C14699j c14699j = C14700k.f54342Q;
        this.f58205a = 0.0f;
        this.f58206b = Float.MAX_VALUE;
        this.f58207c = false;
        this.f58210f = false;
        this.f58211g = Float.MAX_VALUE;
        this.f58212h = -3.4028235E38f;
        this.f58213i = 0L;
        this.f58215k = new ArrayList();
        this.f58216l = new ArrayList();
        this.f58208d = c14700k;
        this.f58209e = c14699j;
        if (c14699j != f58201r && c14699j != f58202s && c14699j != f58203t) {
            if (c14699j != f58204u && c14699j != f58199p && c14699j != f58200q) {
                this.f58214j = 1.0f;
            } else {
                this.f58214j = 0.00390625f;
            }
        } else {
            this.f58214j = 0.1f;
        }
        this.f58217m = null;
        this.f58218n = Float.MAX_VALUE;
        this.f58219o = false;
    }
}
