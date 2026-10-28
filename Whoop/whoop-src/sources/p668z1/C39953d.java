package p668z1;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: z1.d */
/* JADX INFO: loaded from: classes.dex */
public final class C39953d extends AbstractC39957f {

    /* JADX INFO: renamed from: e */
    public final Function1 f172427e;

    /* JADX INFO: renamed from: f */
    public final AbstractC39957f f172428f;

    public C39953d(long j7, C39961j c39961j, Function1 function1, AbstractC39957f abstractC39957f) {
        super(j7, c39961j);
        this.f172427e = function1;
        this.f172428f = abstractC39957f;
        abstractC39957f.mo128123k();
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: c */
    public final void mo128122c() {
        AbstractC39957f abstractC39957f = this.f172428f;
        if (this.f172444c) {
            return;
        }
        if (this.f172443b != abstractC39957f.mo128147g()) {
            m128152a();
        }
        abstractC39957f.mo128124l();
        this.f172444c = true;
        synchronized (AbstractC39963l.f172462c) {
            m128154o();
        }
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: e */
    public final Function1 mo128133e() {
        return this.f172427e;
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: f */
    public final boolean mo128134f() {
        return true;
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: i */
    public final Function1 mo128136i() {
        return null;
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: k */
    public final void mo128123k() {
        AbstractC39971t.m128195a();
        throw null;
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: l */
    public final void mo128124l() {
        AbstractC39971t.m128195a();
        throw null;
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: m */
    public final void mo128125m() {
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: n */
    public final void mo128137n(InterfaceC39977z interfaceC39977z) {
        C39962k c39962k = AbstractC39963l.f172460a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: u */
    public final AbstractC39957f mo128126u(Function1 function1) {
        return new C39953d(this.f172443b, this.f172442a, AbstractC39963l.m128172l(function1, this.f172427e, true), this.f172428f);
    }
}
