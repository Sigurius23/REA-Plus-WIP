package bm;

import c93.InterfaceC4339a;
import p329n0.C26062o;
import p329n0.InterfaceC26054g;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: bm.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C3380d extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f13202w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3396t f13203x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3380d(C3396t c3396t, int i13) {
        super(0);
        this.f13202w = i13;
        this.f13203x = c3396t;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f13202w) {
            case 0:
                return Boolean.valueOf(this.f13203x.f13252a.f103226i.mo9765b());
            default:
                InterfaceC26054g interfaceC26054gM9771j = this.f13203x.m9771j();
                if (interfaceC26054gM9771j != null) {
                    return Integer.valueOf(((C26062o) interfaceC26054gM9771j).f103184a);
                }
                return null;
        }
    }
}
