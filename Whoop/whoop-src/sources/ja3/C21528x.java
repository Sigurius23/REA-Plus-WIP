package ja3;

import c93.InterfaceC4339a;
import ga3.C15630h;
import ia3.C18295a;
import kb3.C22339h;
import kb3.C22342k;
import kb3.InterfaceC22345n;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22669g0;
import r93.InterfaceC31145n0;
import x93.C38128t;

/* JADX INFO: renamed from: ja3.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C21528x implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f82567w;

    /* JADX INFO: renamed from: x */
    public final AbstractC21500a0 f82568x;

    /* JADX INFO: renamed from: y */
    public final C38128t f82569y;

    /* JADX INFO: renamed from: z */
    public final C22669g0 f82570z;

    public /* synthetic */ C21528x(AbstractC21500a0 abstractC21500a0, C38128t c38128t, C22669g0 c22669g0, int i13) {
        this.f82567w = i13;
        this.f82568x = abstractC21500a0;
        this.f82569y = c38128t;
        this.f82570z = c22669g0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f82567w) {
            case 0:
                AbstractC21500a0 abstractC21500a0 = this.f82568x;
                InterfaceC22345n interfaceC22345n = ((C18295a) abstractC21500a0.f82465b.f177224x).f71223a;
                C21528x c21528x = new C21528x(abstractC21500a0, this.f82569y, this.f82570z, 1);
                C22342k c22342k = (C22342k) interfaceC22345n;
                c22342k.getClass();
                return new C22339h(c22342k, c21528x);
            default:
                C15630h c15630h = ((C18295a) this.f82568x.f82465b.f177224x).f71230h;
                InterfaceC31145n0 descriptor = (InterfaceC31145n0) this.f82570z.f89336w;
                c15630h.getClass();
                C38128t field = this.f82569y;
                AbstractC22676k.m65750j(field, "field");
                AbstractC22676k.m65750j(descriptor, "descriptor");
                return null;
        }
    }
}
