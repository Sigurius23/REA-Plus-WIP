package p668z1;

import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: z1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C39955e extends AbstractC39957f {

    /* JADX INFO: renamed from: e */
    public final Function1 f172435e;

    /* JADX INFO: renamed from: f */
    public int f172436f;

    public C39955e(long j7, C39961j c39961j, Function1 function1) {
        super(j7, c39961j);
        this.f172435e = function1;
        this.f172436f = 1;
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: c */
    public final void mo128122c() {
        if (this.f172444c) {
            return;
        }
        mo128124l();
        this.f172444c = true;
        synchronized (AbstractC39963l.f172462c) {
            m128154o();
        }
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: e */
    public final Function1 mo128133e() {
        return this.f172435e;
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
        this.f172436f++;
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: l */
    public final void mo128124l() {
        int i13 = this.f172436f - 1;
        this.f172436f = i13;
        if (i13 == 0) {
            m128152a();
        }
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
        AbstractC39963l.m128164d(this);
        return new C39953d(this.f172443b, this.f172442a, AbstractC39963l.m128172l(function1, this.f172435e, true), this);
    }
}
