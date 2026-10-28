package p510u0;

import c93.InterfaceC4339a;
import c93.InterfaceC4351m;
import p132f0.EnumC13840z0;
import p180h0.InterfaceC16478x2;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import q83.InterfaceC30057d;

/* JADX INFO: renamed from: u0.m1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C34337m1 implements InterfaceC16478x2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC16478x2 f144230a;

    /* JADX INFO: renamed from: b */
    public final C28612f0 f144231b;

    /* JADX INFO: renamed from: c */
    public final C28612f0 f144232c;

    public C34337m1(InterfaceC16478x2 interfaceC16478x2, final C34340n1 c34340n1) {
        this.f144230a = interfaceC16478x2;
        final int i13 = 0;
        this.f144231b = AbstractC28683x.m87264r(new InterfaceC4339a() { // from class: u0.l1
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i13) {
                    case 0:
                        C34340n1 c34340n2 = c34340n1;
                        return Boolean.valueOf(c34340n2.f144248a.m87022x() < c34340n2.f144249b.m87022x());
                    default:
                        return Boolean.valueOf(c34340n1.f144248a.m87022x() > 0.0f);
                }
            }
        });
        final int i14 = 1;
        this.f144232c = AbstractC28683x.m87264r(new InterfaceC4339a() { // from class: u0.l1
            @Override // c93.InterfaceC4339a
            public final Object invoke() {
                switch (i14) {
                    case 0:
                        C34340n1 c34340n2 = c34340n1;
                        return Boolean.valueOf(c34340n2.f144248a.m87022x() < c34340n2.f144249b.m87022x());
                    default:
                        return Boolean.valueOf(c34340n1.f144248a.m87022x() > 0.0f);
                }
            }
        });
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: a */
    public final Object mo9764a(EnumC13840z0 enumC13840z0, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        return this.f144230a.mo9764a(enumC13840z0, interfaceC4351m, interfaceC30057d);
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: b */
    public final boolean mo9765b() {
        return this.f144230a.mo9765b();
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: c */
    public final boolean mo39182c() {
        return ((Boolean) this.f144232c.getValue()).booleanValue();
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: d */
    public final boolean mo39183d() {
        return ((Boolean) this.f144231b.getValue()).booleanValue();
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: e */
    public final float mo9766e(float f13) {
        return this.f144230a.mo9766e(f13);
    }
}
