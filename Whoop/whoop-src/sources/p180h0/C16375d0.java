package p180h0;

import bc3.AbstractC3006f0;
import c93.InterfaceC4351m;
import g20.C15270p;
import l83.C23454a0;
import p132f0.C13776c1;
import p132f0.EnumC13840z0;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;

/* JADX INFO: renamed from: h0.d0 */
/* JADX INFO: loaded from: classes.dex */
public final class C16375d0 implements InterfaceC16478x2 {

    /* JADX INFO: renamed from: a */
    public final Function1 f62961a;

    /* JADX INFO: renamed from: b */
    public final C16369c0 f62962b = new C16369c0(this);

    /* JADX INFO: renamed from: c */
    public final C13776c1 f62963c = new C13776c1();

    /* JADX INFO: renamed from: d */
    public final C28633k1 f62964d;

    /* JADX INFO: renamed from: e */
    public final C28633k1 f62965e;

    /* JADX INFO: renamed from: f */
    public final C28633k1 f62966f;

    public C16375d0(Function1 function1) {
        this.f62961a = function1;
        Boolean bool = Boolean.FALSE;
        this.f62964d = AbstractC28683x.m87272z(bool);
        this.f62965e = AbstractC28683x.m87272z(bool);
        this.f62966f = AbstractC28683x.m87272z(bool);
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: a */
    public final Object mo9764a(EnumC13840z0 enumC13840z0, InterfaceC4351m interfaceC4351m, InterfaceC30057d interfaceC30057d) {
        Object objM8719m = AbstractC3006f0.m8719m(new C15270p(this, enumC13840z0, interfaceC4351m, (InterfaceC30057d) null, 5), interfaceC30057d);
        return objM8719m == EnumC31071a.f128113w ? objM8719m : C23454a0.f92919a;
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: b */
    public final boolean mo9765b() {
        return ((Boolean) this.f62964d.getValue()).booleanValue();
    }

    @Override // p180h0.InterfaceC16478x2
    /* JADX INFO: renamed from: e */
    public final float mo9766e(float f13) {
        return ((Number) this.f62961a.invoke(Float.valueOf(f13))).floatValue();
    }
}
