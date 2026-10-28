package p078d1;

import am2.C1040r;
import android.graphics.Rect;
import android.view.View;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.EnumC2998d0;
import dc3.EnumC11916a;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.InterfaceC13072o1;
import java.lang.ref.WeakReference;
import java.util.concurrent.CancellationException;
import p000.C12473e;
import p000.C31931s;
import p005a3.AbstractC0201g;
import p026b2.C2319y;
import p027b3.AbstractC2453v1;
import p027b3.C2463x1;
import p027b3.InterfaceC2464x2;
import p035bp.AbstractC3511b;
import p041c1.AbstractC3817b;
import p181h2.C16618c;
import p268k0.AbstractC22086a;
import p294l3.C23277r0;
import p294l3.C23283u0;
import p412q3.C29878l;
import p412q3.C29891y;
import p412q3.InterfaceC29884r;
import p412q3.InterfaceC29886t;
import p510u0.C34362v;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import s90.C32290f;

/* JADX INFO: renamed from: d1.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C11449b implements InterfaceC29886t {

    /* JADX INFO: renamed from: a */
    public C11458k f36726a;

    /* JADX INFO: renamed from: b */
    public C2996c2 f36727b;

    /* JADX INFO: renamed from: c */
    public C11462o f36728c;

    /* JADX INFO: renamed from: d */
    public C13096w1 f36729d;

    @Override // p412q3.InterfaceC29886t
    /* JADX INFO: renamed from: a */
    public final void mo30718a() {
        m30727j(null);
    }

    @Override // p412q3.InterfaceC29886t
    /* JADX INFO: renamed from: b */
    public final void mo30719b() throws Throwable {
        C2996c2 c2996c2 = this.f36727b;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        this.f36727b = null;
        InterfaceC13072o1 interfaceC13072o1M30726i = m30726i();
        if (interfaceC13072o1M30726i != null) {
            ((C13096w1) interfaceC13072o1M30726i).mo36566d();
        }
    }

    @Override // p412q3.InterfaceC29886t
    /* JADX INFO: renamed from: c */
    public final void mo30720c(C29891y c29891y, C29891y c29891y2) {
        C11462o c11462o = this.f36728c;
        if (c11462o != null) {
            boolean z4 = (C23283u0.m67356b(c11462o.f36785h.f122126b, c29891y2.f122126b) && AbstractC22676k.m65745e(c11462o.f36785h.f122127c, c29891y2.f122127c)) ? false : true;
            c11462o.f36785h = c29891y2;
            int size = c11462o.f36787j.size();
            for (int i13 = 0; i13 < size; i13++) {
                InputConnectionC11463p inputConnectionC11463p = (InputConnectionC11463p) ((WeakReference) c11462o.f36787j.get(i13)).get();
                if (inputConnectionC11463p != null) {
                    inputConnectionC11463p.f36797g = c29891y2;
                }
            }
            C11459l c11459l = c11462o.f36790m;
            synchronized (c11459l.f36761c) {
                c11459l.f36768j = null;
                c11459l.f36770l = null;
                c11459l.f36769k = null;
                c11459l.f36771m = null;
                c11459l.f36772n = null;
            }
            if (AbstractC22676k.m65745e(c29891y, c29891y2)) {
                if (z4) {
                    C11457j c11457j = c11462o.f36779b;
                    int iM67360f = C23283u0.m67360f(c29891y2.f122126b);
                    int iM67359e = C23283u0.m67359e(c29891y2.f122126b);
                    C23283u0 c23283u0 = c11462o.f36785h.f122127c;
                    int iM67360f2 = c23283u0 != null ? C23283u0.m67360f(c23283u0.f92253a) : -1;
                    C23283u0 c23283u1 = c11462o.f36785h.f122127c;
                    c11457j.m30754y().updateSelection((View) c11457j.f36753x, iM67360f, iM67359e, iM67360f2, c23283u1 != null ? C23283u0.m67359e(c23283u1.f92253a) : -1);
                    return;
                }
                return;
            }
            if (c29891y != null && (!AbstractC22676k.m65745e(c29891y.f122125a.f92135x, c29891y2.f122125a.f92135x) || (C23283u0.m67356b(c29891y.f122126b, c29891y2.f122126b) && !AbstractC22676k.m65745e(c29891y.f122127c, c29891y2.f122127c)))) {
                C11457j c11457j2 = c11462o.f36779b;
                c11457j2.m30754y().restartInput((View) c11457j2.f36753x);
                return;
            }
            int size2 = c11462o.f36787j.size();
            for (int i14 = 0; i14 < size2; i14++) {
                InputConnectionC11463p inputConnectionC11463p2 = (InputConnectionC11463p) ((WeakReference) c11462o.f36787j.get(i14)).get();
                if (inputConnectionC11463p2 != null) {
                    C29891y c29891y3 = c11462o.f36785h;
                    C11457j c11457j3 = c11462o.f36779b;
                    if (inputConnectionC11463p2.f36801k) {
                        inputConnectionC11463p2.f36797g = c29891y3;
                        if (inputConnectionC11463p2.f36799i) {
                            c11457j3.m30754y().updateExtractedText((View) c11457j3.f36753x, inputConnectionC11463p2.f36798h, AbstractC3511b.m10376e(c29891y3));
                        }
                        C23283u0 c23283u2 = c29891y3.f122127c;
                        long j7 = c29891y3.f122126b;
                        int iM67360f3 = c23283u2 != null ? C23283u0.m67360f(c23283u2.f92253a) : -1;
                        C23283u0 c23283u3 = c29891y3.f122127c;
                        c11457j3.m30754y().updateSelection((View) c11457j3.f36753x, C23283u0.m67360f(j7), C23283u0.m67359e(j7), iM67360f3, c23283u3 != null ? C23283u0.m67359e(c23283u3.f92253a) : -1);
                    }
                }
            }
        }
    }

    @Override // p412q3.InterfaceC29886t
    /* JADX INFO: renamed from: d */
    public final void mo30721d() {
        InterfaceC2464x2 interfaceC2464x2;
        C11458k c11458k = this.f36726a;
        if (c11458k == null || (interfaceC2464x2 = (InterfaceC2464x2) AbstractC0201g.m506f(c11458k, AbstractC2453v1.f9577p)) == null) {
            return;
        }
        ((C2463x1) interfaceC2464x2).m7442a();
    }

    @Override // p412q3.InterfaceC29886t
    /* JADX INFO: renamed from: e */
    public final void mo30722e(C16618c c16618c) {
        Rect rect;
        C11462o c11462o = this.f36728c;
        if (c11462o != null) {
            c11462o.f36789l = new Rect(AbstractC12889b.m36258X(c16618c.f63939a), AbstractC12889b.m36258X(c16618c.f63940b), AbstractC12889b.m36258X(c16618c.f63941c), AbstractC12889b.m36258X(c16618c.f63942d));
            if (!c11462o.f36787j.isEmpty() || (rect = c11462o.f36789l) == null) {
                return;
            }
            c11462o.f36778a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    @Override // p412q3.InterfaceC29886t
    /* JADX INFO: renamed from: f */
    public final void mo30723f(C29891y c29891y, C29878l c29878l, C32290f c32290f, C34362v c34362v) {
        m30727j(new C1040r((Object) c29891y, (Object) this, (Object) c29878l, (Object) c32290f, (Function1) c34362v, 6));
    }

    @Override // p412q3.InterfaceC29886t
    /* JADX INFO: renamed from: g */
    public final void mo30724g(C29891y c29891y, InterfaceC29884r interfaceC29884r, C23277r0 c23277r0, C31931s c31931s, C16618c c16618c, C16618c c16618c2) {
        C11462o c11462o = this.f36728c;
        if (c11462o != null) {
            C11459l c11459l = c11462o.f36790m;
            synchronized (c11459l.f36761c) {
                try {
                    c11459l.f36768j = c29891y;
                    c11459l.f36770l = interfaceC29884r;
                    c11459l.f36769k = c23277r0;
                    c11459l.f36771m = c16618c;
                    c11459l.f36772n = c16618c2;
                    if (c11459l.f36763e || c11459l.f36762d) {
                        c11459l.m30756a();
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // p412q3.InterfaceC29886t
    /* JADX INFO: renamed from: h */
    public final void mo30725h() {
        InterfaceC2464x2 interfaceC2464x2;
        C11458k c11458k = this.f36726a;
        if (c11458k == null || (interfaceC2464x2 = (InterfaceC2464x2) AbstractC0201g.m506f(c11458k, AbstractC2453v1.f9577p)) == null) {
            return;
        }
        ((C2463x1) interfaceC2464x2).m7443b();
    }

    /* JADX INFO: renamed from: i */
    public final InterfaceC13072o1 m30726i() {
        C13096w1 c13096w1 = this.f36729d;
        if (c13096w1 != null) {
            return c13096w1;
        }
        if (!AbstractC3817b.f15656a) {
            return null;
        }
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(1, 0, EnumC11916a.f38984y, 2);
        this.f36729d = c13096w1M36592b;
        return c13096w1M36592b;
    }

    /* JADX INFO: renamed from: j */
    public final void m30727j(C1040r c1040r) {
        C11458k c11458k = this.f36726a;
        if (c11458k == null) {
            return;
        }
        C2996c2 c2996c2 = null;
        this.f36727b = c11458k.f9141N ? AbstractC3006f0.m8732z(c11458k.m7158L0(), null, EnumC2998d0.f12007z, new C12473e(c11458k, new C2319y(c1040r, this, c11458k, c2996c2, 1), c2996c2, 29), 1) : null;
    }

    /* JADX INFO: renamed from: k */
    public final void m30728k(C11458k c11458k) {
        if (this.f36726a != c11458k) {
            AbstractC22086a.m63160c("Expected textInputModifierNode to be " + c11458k + " but was " + this.f36726a);
        }
        this.f36726a = null;
    }
}
