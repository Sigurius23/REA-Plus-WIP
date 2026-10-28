package p291l0;

import android.view.View;
import com.whoop.android.R;
import java.util.WeakHashMap;
import p002a0.C0059w0;
import p184h5.C16876h;
import p184h5.C16905q1;
import p668z1.AbstractC39963l;

/* JADX INFO: renamed from: l0.c2 */
/* JADX INFO: loaded from: classes.dex */
public final class C22944c2 {

    /* JADX INFO: renamed from: v */
    public static final WeakHashMap f90553v = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public final C22937b f90554a = C22949e.m66710b(4, "captionBar");

    /* JADX INFO: renamed from: b */
    public final C22937b f90555b;

    /* JADX INFO: renamed from: c */
    public final C22937b f90556c;

    /* JADX INFO: renamed from: d */
    public final C22937b f90557d;

    /* JADX INFO: renamed from: e */
    public final C22937b f90558e;

    /* JADX INFO: renamed from: f */
    public final C22937b f90559f;

    /* JADX INFO: renamed from: g */
    public final C22937b f90560g;

    /* JADX INFO: renamed from: h */
    public final C22937b f90561h;

    /* JADX INFO: renamed from: i */
    public final C22937b f90562i;

    /* JADX INFO: renamed from: j */
    public final C23018z1 f90563j;

    /* JADX INFO: renamed from: k */
    public final C23009w1 f90564k;

    /* JADX INFO: renamed from: l */
    public final C23018z1 f90565l;

    /* JADX INFO: renamed from: m */
    public final C23018z1 f90566m;

    /* JADX INFO: renamed from: n */
    public final C23018z1 f90567n;

    /* JADX INFO: renamed from: o */
    public final C23018z1 f90568o;

    /* JADX INFO: renamed from: p */
    public final C23018z1 f90569p;

    /* JADX INFO: renamed from: q */
    public final C23018z1 f90570q;

    /* JADX INFO: renamed from: r */
    public final C23018z1 f90571r;

    /* JADX INFO: renamed from: s */
    public final boolean f90572s;

    /* JADX INFO: renamed from: t */
    public int f90573t;

    /* JADX INFO: renamed from: u */
    public final RunnableC23005v0 f90574u;

    public C22944c2(View view) {
        C22937b c22937bM66710b = C22949e.m66710b(128, "displayCutout");
        this.f90555b = c22937bM66710b;
        C22937b c22937bM66710b2 = C22949e.m66710b(8, "ime");
        this.f90556c = c22937bM66710b2;
        C22937b c22937bM66710b3 = C22949e.m66710b(32, "mandatorySystemGestures");
        this.f90557d = c22937bM66710b3;
        this.f90558e = C22949e.m66710b(2, "navigationBars");
        this.f90559f = C22949e.m66710b(1, "statusBars");
        C22937b c22937bM66710b4 = C22949e.m66710b(7, "systemBars");
        this.f90560g = c22937bM66710b4;
        C22937b c22937bM66710b5 = C22949e.m66710b(16, "systemGestures");
        this.f90561h = c22937bM66710b5;
        C22937b c22937bM66710b6 = C22949e.m66710b(64, "tappableElement");
        this.f90562i = c22937bM66710b6;
        C23018z1 c23018z1 = new C23018z1(new C23014y0(0, 0, 0, 0), "waterfall");
        this.f90563j = c23018z1;
        this.f90564k = new C23009w1(new C23009w1(c22937bM66710b4, c22937bM66710b2), c22937bM66710b);
        new C23009w1(new C23009w1(new C23009w1(c22937bM66710b6, c22937bM66710b3), c22937bM66710b5), c23018z1);
        this.f90565l = C22949e.m66711d(4, "captionBarIgnoringVisibility");
        this.f90566m = C22949e.m66711d(2, "navigationBarsIgnoringVisibility");
        this.f90567n = C22949e.m66711d(1, "statusBarsIgnoringVisibility");
        this.f90568o = C22949e.m66711d(7, "systemBarsIgnoringVisibility");
        this.f90569p = C22949e.m66711d(64, "tappableElementIgnoringVisibility");
        this.f90570q = C22949e.m66711d(8, "imeAnimationTarget");
        this.f90571r = C22949e.m66711d(8, "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(R.id.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.f90572s = bool != null ? bool.booleanValue() : false;
        this.f90574u = new RunnableC23005v0(this);
    }

    /* JADX INFO: renamed from: a */
    public static void m66709a(C22944c2 c22944c2, C16905q1 c16905q1) {
        boolean z4 = false;
        c22944c2.f90554a.m66706f(c16905q1, 0);
        c22944c2.f90556c.m66706f(c16905q1, 0);
        c22944c2.f90555b.m66706f(c16905q1, 0);
        c22944c2.f90558e.m66706f(c16905q1, 0);
        c22944c2.f90559f.m66706f(c16905q1, 0);
        c22944c2.f90560g.m66706f(c16905q1, 0);
        c22944c2.f90561h.m66706f(c16905q1, 0);
        c22944c2.f90562i.m66706f(c16905q1, 0);
        c22944c2.f90557d.m66706f(c16905q1, 0);
        c22944c2.f90565l.m66781f(AbstractC22953f.m66726o(c16905q1.f64864a.mo47531h(4)));
        c22944c2.f90566m.m66781f(AbstractC22953f.m66726o(c16905q1.f64864a.mo47531h(2)));
        c22944c2.f90567n.m66781f(AbstractC22953f.m66726o(c16905q1.f64864a.mo47531h(1)));
        c22944c2.f90568o.m66781f(AbstractC22953f.m66726o(c16905q1.f64864a.mo47531h(7)));
        c22944c2.f90569p.m66781f(AbstractC22953f.m66726o(c16905q1.f64864a.mo47531h(64)));
        C16876h c16876hMo47550f = c16905q1.f64864a.mo47550f();
        if (c16876hMo47550f != null) {
            c22944c2.f90563j.m66781f(AbstractC22953f.m66726o(c16876hMo47550f.m47505a()));
        }
        synchronized (AbstractC39963l.f172462c) {
            C0059w0 c0059w0 = AbstractC39963l.f172469j.f172413h;
            if (c0059w0 != null && c0059w0.m143h()) {
                z4 = true;
            }
        }
        if (z4) {
            AbstractC39963l.m128161a();
        }
    }
}
