package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.v */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5180v implements InterfaceC5168p0, Cloneable {

    /* JADX INFO: renamed from: w */
    public final AbstractC5184x f21593w;

    /* JADX INFO: renamed from: x */
    public AbstractC5184x f21594x;

    public AbstractC5180v(AbstractC5184x abstractC5184x) {
        this.f21593w = abstractC5184x;
        if (abstractC5184x.m16364p()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f21594x = abstractC5184x.m16367s();
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC5184x m16347b() {
        AbstractC5184x abstractC5184xM16348c = m16348c();
        abstractC5184xM16348c.getClass();
        if (AbstractC5184x.m16355o(abstractC5184xM16348c, true)) {
            return abstractC5184xM16348c;
        }
        throw new UninitializedMessageException();
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC5184x m16348c() {
        if (!this.f21594x.m16364p()) {
            return this.f21594x;
        }
        AbstractC5184x abstractC5184x = this.f21594x;
        abstractC5184x.getClass();
        C5185x0.m16370a().m16372c(abstractC5184x).mo16113b(abstractC5184x);
        abstractC5184x.m16365q();
        return this.f21594x;
    }

    /* JADX INFO: renamed from: d */
    public final AbstractC5180v m16349d() {
        AbstractC5180v abstractC5180vM16366r = this.f21593w.mo16107d();
        abstractC5180vM16366r.f21594x = m16348c();
        return abstractC5180vM16366r;
    }

    /* JADX INFO: renamed from: e */
    public final void m16350e() {
        if (this.f21594x.m16364p()) {
            return;
        }
        AbstractC5184x abstractC5184xM16367s = this.f21593w.m16367s();
        C5185x0.f21595c.m16372c(abstractC5184xM16367s).mo16112a(abstractC5184xM16367s, this.f21594x);
        this.f21594x = abstractC5184xM16367s;
    }

    /* JADX INFO: renamed from: f */
    public final void m16351f(AbstractC5184x abstractC5184x) {
        if (this.f21593w.equals(abstractC5184x)) {
            return;
        }
        m16350e();
        AbstractC5184x abstractC5184x2 = this.f21594x;
        C5185x0.f21595c.m16372c(abstractC5184x2).mo16112a(abstractC5184x2, abstractC5184x);
    }
}
