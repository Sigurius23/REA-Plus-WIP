package cd1;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.whoop.design.showcase.gallery.view.fragment.AtomicGalleryFragment;
import p163g1.C15048j2;
import p163g1.C15136s0;
import p163g1.EnumC15146t0;

/* JADX INFO: renamed from: cd1.d */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class C4440d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f17920w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C15136s0 f17921x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC2994c0 f17922y;

    public /* synthetic */ C4440d(InterfaceC2994c0 interfaceC2994c0, C15136s0 c15136s0) {
        this.f17922y = interfaceC2994c0;
        this.f17921x = c15136s0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        int i13 = this.f17920w;
        InterfaceC2994c0 interfaceC2994c0 = this.f17922y;
        C15136s0 c15136s0 = this.f17921x;
        switch (i13) {
            case 0:
                return AtomicGalleryFragment.m21118K0(interfaceC2994c0, c15136s0);
            default:
                EnumC15146t0 enumC15146t0 = EnumC15146t0.f56806w;
                c15136s0.getClass();
                if (((Boolean) c15136s0.f56747a.f55767d.invoke(EnumC15146t0.f56806w)).booleanValue()) {
                    AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new C15048j2(c15136s0, null, 1), 3);
                }
                return Boolean.TRUE;
        }
    }

    public /* synthetic */ C4440d(C15136s0 c15136s0, InterfaceC2994c0 interfaceC2994c0) {
        this.f17921x = c15136s0;
        this.f17922y = interfaceC2994c0;
    }
}
