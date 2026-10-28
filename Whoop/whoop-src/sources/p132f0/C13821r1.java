package p132f0;

import c93.InterfaceC4351m;
import ex0.C13725a;
import l83.C23454a0;
import p007a6.C0428i;
import p077d0.InterfaceC11372l;
import p180h0.AbstractC16444q3;
import p180h0.C16375d0;
import p180h0.InterfaceC16478x2;
import p238j0.C21084j;
import p389p0.C28539n0;
import p390p1.AbstractC28683x;
import p390p1.C28612f0;
import p390p1.C28621h1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: f0.r1 */
/* JADX INFO: loaded from: classes.dex */
public final class C13821r1 implements InterfaceC16478x2 {

    /* JADX INFO: renamed from: i */
    public static final C28539n0 f49317i = new C28539n0(10, new C13725a(15), new C13818q1(0));

    /* JADX INFO: renamed from: a */
    public final C28621h1 f49318a;

    /* JADX INFO: renamed from: e */
    public float f49322e;

    /* JADX INFO: renamed from: b */
    public final C28621h1 f49319b = new C28621h1(0);

    /* JADX INFO: renamed from: c */
    public final C21084j f49320c = new C21084j();

    /* JADX INFO: renamed from: d */
    public final C28621h1 f49321d = new C28621h1(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: f */
    public final C16375d0 f49323f = new C16375d0(new C0428i(this, 12));

    /* JADX INFO: renamed from: g */
    public final C28612f0 f49324g = AbstractC28683x.m87264r(new C13815p1(this, 0));

    /* JADX INFO: renamed from: h */
    public final C28612f0 f49325h = AbstractC28683x.m87264r(new C13815p1(this, 1));

    public C13821r1(int i13) {
        this.f49318a = new C28621h1(i13);
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: a */
    public final Object mo9764a(EnumC13840z0 enumC13840z0, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        Object objMo9764a = this.f49323f.mo9764a(enumC13840z0, interfaceC4351m, interfaceC30057d);
        return objMo9764a == EnumC31071a.f128113w ? objMo9764a : C23454a0.f92919a;
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: b */
    public final boolean mo9765b() {
        return this.f49323f.mo9765b();
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: c */
    public final boolean mo39182c() {
        return ((Boolean) this.f49325h.getValue()).booleanValue();
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: d */
    public final boolean mo39183d() {
        return ((Boolean) this.f49324g.getValue()).booleanValue();
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: e */
    public final float mo9766e(float f13) {
        return this.f49323f.mo9766e(f13);
    }

    /* JADX INFO: renamed from: f */
    public final Object m39184f(int i13, InterfaceC11372l interfaceC11372l, InterfaceC30057d interfaceC30057d) {
        Object objM46621c = AbstractC16444q3.m46621c(this, i13 - this.f49318a.m87024x(), interfaceC11372l, interfaceC30057d);
        return objM46621c == EnumC31071a.f128113w ? objM46621c : C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: g */
    public final Object m39185g(int i13, InterfaceC30057d interfaceC30057d) {
        return AbstractC16444q3.m46634p(this, i13 - this.f49318a.m87024x(), interfaceC30057d);
    }
}
