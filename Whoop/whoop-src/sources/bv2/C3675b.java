package bv2;

import c93.InterfaceC4339a;
import ih2.AbstractC18527b;
import l83.C23454a0;
import mf2.AbstractC25515f;
import ny0.AbstractC27248d1;
import o42.AbstractC27531k;
import p705ea2.AbstractC42783n;
import p715kotlin.jvm.functions.Function1;
import sy0.AbstractC33090m;
import sy0.AbstractC33095r;
import tj1.AbstractC33866a;
import tp0.AbstractC34060e;
import uz1.AbstractC35428f;
import uz1.AbstractC35430h;
import w51.AbstractC36841g;
import yb0.AbstractC39388k;

/* JADX INFO: renamed from: bv2.b */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C3675b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14958w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f14959x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ boolean f14960y;

    public /* synthetic */ C3675b(Function1 function1, boolean z4, int i13) {
        this.f14958w = i13;
        this.f14959x = function1;
        this.f14960y = z4;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f14958w) {
            case 0:
                return AbstractC3676c.m11385u(this.f14960y, this.f14959x);
            case 1:
                return AbstractC42783n.m36329B(this.f14959x, this.f14960y);
            case 2:
                this.f14959x.invoke(Boolean.valueOf(!this.f14960y));
                return C23454a0.f92919a;
            case 3:
                return AbstractC18527b.m53716Q(this.f14959x, this.f14960y);
            case 4:
                return AbstractC25515f.m75050f0(this.f14959x, this.f14960y);
            case 5:
                return AbstractC27248d1.m82115g(this.f14959x, this.f14960y);
            case 6:
                return AbstractC27531k.m83022o0(this.f14959x, this.f14960y);
            case 7:
                this.f14959x.invoke(Boolean.valueOf(!this.f14960y));
                return C23454a0.f92919a;
            case 8:
                return AbstractC33090m.m104837e(this.f14959x, this.f14960y);
            case 9:
                return AbstractC33095r.m104855d(this.f14959x, this.f14960y);
            case 10:
                return AbstractC33866a.m107088d(this.f14959x, this.f14960y);
            case 11:
                return AbstractC34060e.m107655q(this.f14959x, this.f14960y);
            case 12:
                return AbstractC35428f.m112423k(this.f14959x, this.f14960y);
            case 13:
                return AbstractC35430h.m112453u(this.f14959x, this.f14960y);
            case 14:
                return AbstractC36841g.m118127u(this.f14959x, this.f14960y);
            default:
                return AbstractC39388k.m125732m1(this.f14959x, this.f14960y);
        }
    }

    public /* synthetic */ C3675b(boolean z4, Function1 function1) {
        this.f14958w = 0;
        this.f14960y = z4;
        this.f14959x = function1;
    }
}
