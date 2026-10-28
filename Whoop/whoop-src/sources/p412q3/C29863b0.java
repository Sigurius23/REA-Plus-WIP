package p412q3;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.p018ui.platform.AndroidComposeView;
import e93.AbstractC12889b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import l83.EnumC23463i;
import lr.RunnableC24693e;
import p000.C31931s;
import p005a3.C0222l0;
import p005a3.C0237p;
import p181h2.C16618c;
import p294l3.C23277r0;
import p294l3.C23283u0;
import p446r1.C30849c;
import p510u0.C34362v;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import s90.C32290f;

/* JADX INFO: renamed from: q3.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C29863b0 implements InterfaceC29886t {

    /* JADX INFO: renamed from: a */
    public final View f122049a;

    /* JADX INFO: renamed from: b */
    public final C0237p f122050b;

    /* JADX INFO: renamed from: c */
    public final ExecutorC29865c0 f122051c;

    /* JADX INFO: renamed from: d */
    public boolean f122052d;

    /* JADX INFO: renamed from: e */
    public Function1 f122053e;

    /* JADX INFO: renamed from: f */
    public Function1 f122054f;

    /* JADX INFO: renamed from: g */
    public C29891y f122055g;

    /* JADX INFO: renamed from: h */
    public C29878l f122056h;

    /* JADX INFO: renamed from: i */
    public final ArrayList f122057i;

    /* JADX INFO: renamed from: j */
    public final Object f122058j;

    /* JADX INFO: renamed from: k */
    public Rect f122059k;

    /* JADX INFO: renamed from: l */
    public final C29866d f122060l;

    /* JADX INFO: renamed from: m */
    public final C30849c f122061m;

    /* JADX INFO: renamed from: n */
    public RunnableC24693e f122062n;

    public C29863b0(View view, AndroidComposeView androidComposeView) {
        C0237p c0237p = new C0237p(view);
        ExecutorC29865c0 executorC29865c0 = new ExecutorC29865c0(Choreographer.getInstance());
        this.f122049a = view;
        this.f122050b = c0237p;
        this.f122051c = executorC29865c0;
        this.f122053e = C29864c.f122064y;
        this.f122054f = C29864c.f122065z;
        this.f122055g = new C29891y(4, "", C23283u0.f92251b);
        this.f122056h = C29878l.f122098g;
        this.f122057i = new ArrayList();
        this.f122058j = AbstractC30060g.m92087G(EnumC23463i.f92935y, new C0222l0(this, 18));
        this.f122060l = new C29866d(androidComposeView, c0237p);
        this.f122061m = new C30849c(new EnumC29861a0[16]);
    }

    @Override // p412q3.InterfaceC29886t
    /* JADX INFO: renamed from: a */
    public final void mo30718a() {
        m91493i(EnumC29861a0.f122041w);
    }

    @Override // p412q3.InterfaceC29886t
    /* JADX INFO: renamed from: b */
    public final void mo30719b() {
        this.f122052d = false;
        this.f122053e = C29862b.f122046y;
        this.f122054f = C29862b.f122047z;
        this.f122059k = null;
        m91493i(EnumC29861a0.f122042x);
    }

    /* JADX WARN: Type inference failed for: r10v14, types: [java.lang.Object, l83.h] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.Object, l83.h] */
    @Override // p412q3.InterfaceC29886t
    /* JADX INFO: renamed from: c */
    public final void mo30720c(C29891y c29891y, C29891y c29891y2) {
        boolean z4 = (C23283u0.m67356b(this.f122055g.f122126b, c29891y2.f122126b) && AbstractC22676k.m65745e(this.f122055g.f122127c, c29891y2.f122127c)) ? false : true;
        this.f122055g = c29891y2;
        int size = this.f122057i.size();
        for (int i13 = 0; i13 < size; i13++) {
            InputConnectionC29887u inputConnectionC29887u = (InputConnectionC29887u) ((WeakReference) this.f122057i.get(i13)).get();
            if (inputConnectionC29887u != null) {
                inputConnectionC29887u.m91508d(c29891y2);
            }
        }
        C29866d c29866d = this.f122060l;
        synchronized (c29866d.f122070c) {
            c29866d.f122077j = null;
            c29866d.f122079l = null;
            c29866d.f122078k = null;
            c29866d.f122080m = C29862b.f122045x;
            c29866d.f122081n = null;
            c29866d.f122082o = null;
        }
        if (AbstractC22676k.m65745e(c29891y, c29891y2)) {
            if (z4) {
                C0237p c0237p = this.f122050b;
                int iM67360f = C23283u0.m67360f(c29891y2.f122126b);
                int iM67359e = C23283u0.m67359e(c29891y2.f122126b);
                C23283u0 c23283u0 = this.f122055g.f122127c;
                int iM67360f2 = c23283u0 != null ? C23283u0.m67360f(c23283u0.f92253a) : -1;
                C23283u0 c23283u1 = this.f122055g.f122127c;
                ((InputMethodManager) c0237p.f813y.getValue()).updateSelection((View) c0237p.f812x, iM67360f, iM67359e, iM67360f2, c23283u1 != null ? C23283u0.m67359e(c23283u1.f92253a) : -1);
                return;
            }
            return;
        }
        if (c29891y != null && (!AbstractC22676k.m65745e(c29891y.f122125a.f92135x, c29891y2.f122125a.f92135x) || (C23283u0.m67356b(c29891y.f122126b, c29891y2.f122126b) && !AbstractC22676k.m65745e(c29891y.f122127c, c29891y2.f122127c)))) {
            C0237p c0237p2 = this.f122050b;
            ((InputMethodManager) c0237p2.f813y.getValue()).restartInput((View) c0237p2.f812x);
            return;
        }
        int size2 = this.f122057i.size();
        for (int i14 = 0; i14 < size2; i14++) {
            InputConnectionC29887u inputConnectionC29887u2 = (InputConnectionC29887u) ((WeakReference) this.f122057i.get(i14)).get();
            if (inputConnectionC29887u2 != null) {
                inputConnectionC29887u2.m91509e(this.f122055g, this.f122050b);
            }
        }
    }

    @Override // p412q3.InterfaceC29886t
    /* JADX INFO: renamed from: d */
    public final void mo30721d() {
        m91493i(EnumC29861a0.f122044z);
    }

    @Override // p412q3.InterfaceC29886t
    /* JADX INFO: renamed from: e */
    public final void mo30722e(C16618c c16618c) {
        Rect rect;
        this.f122059k = new Rect(AbstractC12889b.m36258X(c16618c.f63939a), AbstractC12889b.m36258X(c16618c.f63940b), AbstractC12889b.m36258X(c16618c.f63941c), AbstractC12889b.m36258X(c16618c.f63942d));
        if (!this.f122057i.isEmpty() || (rect = this.f122059k) == null) {
            return;
        }
        this.f122049a.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // p412q3.InterfaceC29886t
    /* JADX INFO: renamed from: f */
    public final void mo30723f(C29891y c29891y, C29878l c29878l, C32290f c32290f, C34362v c34362v) {
        this.f122052d = true;
        this.f122055g = c29891y;
        this.f122056h = c29878l;
        this.f122053e = c32290f;
        this.f122054f = c34362v;
        m91493i(EnumC29861a0.f122041w);
    }

    @Override // p412q3.InterfaceC29886t
    /* JADX INFO: renamed from: g */
    public final void mo30724g(C29891y c29891y, InterfaceC29884r interfaceC29884r, C23277r0 c23277r0, C31931s c31931s, C16618c c16618c, C16618c c16618c2) {
        C29866d c29866d = this.f122060l;
        synchronized (c29866d.f122070c) {
            try {
                c29866d.f122077j = c29891y;
                c29866d.f122079l = interfaceC29884r;
                c29866d.f122078k = c23277r0;
                c29866d.f122080m = c31931s;
                c29866d.f122081n = c16618c;
                c29866d.f122082o = c16618c2;
                if (c29866d.f122072e || c29866d.f122071d) {
                    c29866d.m91494a();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // p412q3.InterfaceC29886t
    /* JADX INFO: renamed from: h */
    public final void mo30725h() {
        m91493i(EnumC29861a0.f122043y);
    }

    /* JADX INFO: renamed from: i */
    public final void m91493i(EnumC29861a0 enumC29861a0) {
        this.f122061m.m94885b(enumC29861a0);
        if (this.f122062n == null) {
            RunnableC24693e runnableC24693e = new RunnableC24693e(this, 8);
            this.f122051c.execute(runnableC24693e);
            this.f122062n = runnableC24693e;
        }
    }
}
