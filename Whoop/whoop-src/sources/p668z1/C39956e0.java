package p668z1;

import p602x1.AbstractC37817c;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: z1.e0 */
/* JADX INFO: loaded from: classes.dex */
public final class C39956e0 extends AbstractC39957f {

    /* JADX INFO: renamed from: e */
    public final AbstractC39957f f172437e;

    /* JADX INFO: renamed from: f */
    public final boolean f172438f;

    /* JADX INFO: renamed from: g */
    public final boolean f172439g;

    /* JADX INFO: renamed from: h */
    public Function1 f172440h;

    /* JADX INFO: renamed from: i */
    public final long f172441i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39956e0(AbstractC39957f abstractC39957f, Function1 function1, boolean z4, boolean z13) {
        Function1 function1Mo128133e;
        super(0L, C39961j.f172454E);
        C39962k c39962k = AbstractC39963l.f172460a;
        this.f172437e = abstractC39957f;
        this.f172438f = z4;
        this.f172439g = z13;
        this.f172440h = AbstractC39963l.m128172l(function1, (abstractC39957f == null || (function1Mo128133e = abstractC39957f.mo128133e()) == null) ? AbstractC39963l.f172469j.f172410e : function1Mo128133e, z4);
        this.f172441i = AbstractC37817c.m121342c();
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: c */
    public final void mo128122c() {
        AbstractC39957f abstractC39957f;
        this.f172444c = true;
        if (!this.f172439g || (abstractC39957f = this.f172437e) == null) {
            return;
        }
        abstractC39957f.mo128122c();
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: d */
    public final C39961j mo128146d() {
        return m128150v().mo128146d();
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: e */
    public final Function1 mo128133e() {
        return this.f172440h;
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: f */
    public final boolean mo128134f() {
        return m128150v().mo128134f();
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: g */
    public final long mo128147g() {
        return m128150v().mo128147g();
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
        m128150v().mo128125m();
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: n */
    public final void mo128137n(InterfaceC39977z interfaceC39977z) {
        m128150v().mo128137n(interfaceC39977z);
    }

    @Override // p668z1.AbstractC39957f
    /* JADX INFO: renamed from: u */
    public final AbstractC39957f mo128126u(Function1 function1) {
        Function1 function1M128172l = AbstractC39963l.m128172l(function1, this.f172440h, true);
        return !this.f172438f ? AbstractC39963l.m128168h(m128150v().mo128126u(null), function1M128172l, true) : m128150v().mo128126u(function1M128172l);
    }

    /* JADX INFO: renamed from: v */
    public final AbstractC39957f m128150v() {
        AbstractC39957f abstractC39957f = this.f172437e;
        return abstractC39957f == null ? AbstractC39963l.f172469j : abstractC39957f;
    }
}
