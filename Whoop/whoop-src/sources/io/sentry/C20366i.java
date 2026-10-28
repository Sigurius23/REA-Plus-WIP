package io.sentry;

import io.sentry.protocol.C20466a;
import io.sentry.protocol.C20468b;
import io.sentry.protocol.C20470c;
import io.sentry.protocol.C20475e0;
import io.sentry.protocol.C20476f;
import io.sentry.protocol.C20482i;
import io.sentry.protocol.C20488l;
import io.sentry.protocol.C20492p;
import io.sentry.protocol.C20497r;
import io.sentry.protocol.C20503x;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Set;

/* JADX INFO: renamed from: io.sentry.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C20366i extends C20470c {

    /* JADX INFO: renamed from: E */
    public final C20470c f76392E;

    /* JADX INFO: renamed from: F */
    public final EnumC20341g4 f76393F;

    /* JADX INFO: renamed from: y */
    public final C20470c f76394y;

    /* JADX INFO: renamed from: z */
    public final C20470c f76395z;

    public C20366i(C20470c c20470c, C20470c c20470c2, C20470c c20470c3, EnumC20341g4 enumC20341g4) {
        this.f76394y = c20470c;
        this.f76395z = c20470c2;
        this.f76392E = c20470c3;
        this.f76393F = enumC20341g4;
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: a */
    public final boolean mo56535a(Object obj) {
        throw null;
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: b */
    public final Set mo56536b() {
        return m56558y().f76618w.entrySet();
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: c */
    public final Object mo56537c(Object obj) {
        Object objMo56537c = this.f76392E.mo56537c(obj);
        if (objMo56537c != null) {
            return objMo56537c;
        }
        Object objMo56537c2 = this.f76395z.mo56537c(obj);
        return objMo56537c2 != null ? objMo56537c2 : this.f76394y.mo56537c(obj);
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: d */
    public final C20466a mo56538d() {
        C20466a c20466aMo56538d = this.f76392E.mo56538d();
        if (c20466aMo56538d != null) {
            return c20466aMo56538d;
        }
        C20466a c20466aMo56538d2 = this.f76395z.mo56538d();
        return c20466aMo56538d2 != null ? c20466aMo56538d2 : this.f76394y.mo56538d();
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: e */
    public final C20476f mo56539e() {
        C20476f c20476fMo56539e = this.f76392E.mo56539e();
        if (c20476fMo56539e != null) {
            return c20476fMo56539e;
        }
        C20476f c20476fMo56539e2 = this.f76395z.mo56539e();
        return c20476fMo56539e2 != null ? c20476fMo56539e2 : this.f76394y.mo56539e();
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: f */
    public final C20482i mo56540f() {
        C20482i c20482iMo56540f = this.f76392E.mo56540f();
        if (c20482iMo56540f != null) {
            return c20482iMo56540f;
        }
        C20482i c20482iMo56540f2 = this.f76395z.mo56540f();
        return c20482iMo56540f2 != null ? c20482iMo56540f2 : this.f76394y.mo56540f();
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: g */
    public final C20492p mo56541g() {
        C20492p c20492pMo56541g = this.f76392E.mo56541g();
        if (c20492pMo56541g != null) {
            return c20492pMo56541g;
        }
        C20492p c20492pMo56541g2 = this.f76395z.mo56541g();
        return c20492pMo56541g2 != null ? c20492pMo56541g2 : this.f76394y.mo56541g();
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: h */
    public final C20503x mo56542h() {
        C20503x c20503xMo56542h = this.f76392E.mo56542h();
        if (c20503xMo56542h != null) {
            return c20503xMo56542h;
        }
        C20503x c20503xMo56542h2 = this.f76395z.mo56542h();
        return c20503xMo56542h2 != null ? c20503xMo56542h2 : this.f76394y.mo56542h();
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: i */
    public final C20323e7 mo56543i() {
        C20323e7 c20323e7Mo56543i = this.f76392E.mo56543i();
        if (c20323e7Mo56543i != null) {
            return c20323e7Mo56543i;
        }
        C20323e7 c20323e7Mo56543i2 = this.f76395z.mo56543i();
        return c20323e7Mo56543i2 != null ? c20323e7Mo56543i2 : this.f76394y.mo56543i();
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: j */
    public final Enumeration mo56544j() {
        return m56558y().f76618w.keys();
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: k */
    public final Object mo56545k(Object obj, String str) {
        return m56557x().mo56545k(obj, str);
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: l */
    public final void mo56546l(C20470c c20470c) {
        throw null;
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: m */
    public final void mo56547m(C20466a c20466a) {
        m56557x().mo56547m(c20466a);
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: n */
    public final void mo56548n(C20468b c20468b) {
        m56557x().mo56548n(c20468b);
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: o */
    public final void mo56549o(C20476f c20476f) {
        m56557x().mo56549o(c20476f);
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: p */
    public final void mo56550p(C20482i c20482i) {
        throw null;
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: q */
    public final void mo56551q(C20488l c20488l) {
        m56557x().mo56551q(c20488l);
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: r */
    public final void mo56552r(C20492p c20492p) {
        m56557x().mo56552r(c20492p);
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: s */
    public final void mo56553s(C20497r c20497r) {
        m56557x().mo56553s(c20497r);
    }

    @Override // io.sentry.protocol.C20470c, io.sentry.InterfaceC20348h2
    public final void serialize(InterfaceC20401k3 interfaceC20401k3, InterfaceC20602v0 interfaceC20602v0) throws IOException {
        m56558y().serialize(interfaceC20401k3, interfaceC20602v0);
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: t */
    public final void mo56554t(C20503x c20503x) {
        m56557x().mo56554t(c20503x);
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: u */
    public final void mo56555u(C20475e0 c20475e0) {
        m56557x().mo56555u(c20475e0);
    }

    @Override // io.sentry.protocol.C20470c
    /* JADX INFO: renamed from: v */
    public final void mo56556v(C20323e7 c20323e7) {
        m56557x().mo56556v(c20323e7);
    }

    /* JADX INFO: renamed from: x */
    public final C20470c m56557x() {
        int i13 = AbstractC20345h.f76368a[this.f76393F.ordinal()];
        C20470c c20470c = this.f76392E;
        if (i13 == 1) {
            return c20470c;
        }
        if (i13 != 2) {
            return i13 != 3 ? c20470c : this.f76394y;
        }
        return this.f76395z;
    }

    /* JADX INFO: renamed from: y */
    public final C20470c m56558y() {
        C20470c c20470c = new C20470c();
        c20470c.mo56546l(this.f76394y);
        c20470c.mo56546l(this.f76395z);
        c20470c.mo56546l(this.f76392E);
        return c20470c;
    }
}
