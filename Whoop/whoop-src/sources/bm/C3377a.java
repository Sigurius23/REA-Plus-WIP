package bm;

import ge3.AbstractC15751g;
import p181h2.C16617b;
import p479s4.AbstractC32128i;
import p492t2.InterfaceC33313a;
import p636y3.C39185q;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: bm.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C3377a implements InterfaceC33313a {

    /* JADX INFO: renamed from: w */
    public final boolean f13186w;

    /* JADX INFO: renamed from: x */
    public final C3396t f13187x;

    public C3377a(boolean z4, C3396t pagerState) {
        AbstractC22676k.m65750j(pagerState, "pagerState");
        this.f13186w = z4;
        this.f13187x = pagerState;
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: J */
    public final long mo9761J(long j7, long j13, int i13) {
        if (i13 == 2) {
            return AbstractC15751g.m44450c(this.f13186w ? C16617b.m47189e(j13) : 0.0f, 0.0f);
        }
        return 0L;
    }

    @Override // p492t2.InterfaceC33313a
    /* JADX INFO: renamed from: V */
    public final Object mo9762V(long j7, long j13, InterfaceC30057d interfaceC30057d) {
        long jM100047a;
        if (this.f13187x.m9769h() == 0.0f) {
            jM100047a = AbstractC32128i.m100047a(this.f13186w ? C39185q.m124813d(j13) : 0.0f, 0.0f);
        } else {
            jM100047a = 0;
        }
        return new C39185q(jM100047a);
    }
}
