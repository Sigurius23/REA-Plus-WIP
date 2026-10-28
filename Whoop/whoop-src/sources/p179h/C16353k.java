package p179h;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import p133f1.C13968p1;
import p161g.AbstractC14917t;
import p161g.C14894a;

/* JADX INFO: renamed from: h.k */
/* JADX INFO: loaded from: classes.dex */
public final class C16353k extends AbstractC14917t {

    /* JADX INFO: renamed from: d */
    public InterfaceC2994c0 f62869d;

    /* JADX INFO: renamed from: e */
    public InterfaceC4351m f62870e;

    /* JADX INFO: renamed from: f */
    public C13968p1 f62871f;

    /* JADX INFO: renamed from: g */
    public boolean f62872g;

    @Override // p161g.AbstractC14917t
    /* JADX INFO: renamed from: c */
    public final void mo4072c() {
        super.mo4072c();
        C13968p1 c13968p1 = this.f62871f;
        if (c13968p1 != null) {
            c13968p1.m39750d();
        }
        C13968p1 c13968p2 = this.f62871f;
        if (c13968p2 != null) {
            c13968p2.m39764v();
        }
        this.f62872g = false;
    }

    @Override // p161g.AbstractC14917t
    /* JADX INFO: renamed from: d */
    public final void mo4073d() {
        C13968p1 c13968p1 = this.f62871f;
        if (c13968p1 != null && !c13968p1.m39758p()) {
            c13968p1.m39750d();
            this.f62871f = null;
        }
        if (this.f62871f == null) {
            this.f62871f = new C13968p1(this.f62869d, false, this.f62870e, this);
        }
        C13968p1 c13968p2 = this.f62871f;
        if (c13968p2 != null) {
            c13968p2.m39752h();
        }
        C13968p1 c13968p3 = this.f62871f;
        if (c13968p3 != null) {
            c13968p3.m39764v();
        }
        this.f62872g = false;
    }

    @Override // p161g.AbstractC14917t
    /* JADX INFO: renamed from: e */
    public final void mo4074e(C14894a c14894a) {
        super.mo4074e(c14894a);
        C13968p1 c13968p1 = this.f62871f;
        if (c13968p1 != null) {
            c13968p1.m39762t(c14894a);
        }
    }

    @Override // p161g.AbstractC14917t
    /* JADX INFO: renamed from: f */
    public final void mo4075f(C14894a c14894a) {
        super.mo4075f(c14894a);
        C13968p1 c13968p1 = this.f62871f;
        if (c13968p1 != null) {
            c13968p1.m39750d();
        }
        if (m43010g()) {
            this.f62871f = new C13968p1(this.f62869d, true, this.f62870e, this);
        }
        this.f62872g = true;
    }
}
