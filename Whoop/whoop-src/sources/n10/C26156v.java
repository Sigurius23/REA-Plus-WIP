package n10;

import android.content.Context;
import b10.InterfaceC2227c1;
import b20.C2326f;
import c93.InterfaceC4339a;
import p442qy.C30765d;
import q83.InterfaceC30063j;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;
import v10.C35539o;

/* JADX INFO: renamed from: n10.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C26156v implements InterfaceC35517d {

    /* JADX INFO: renamed from: E */
    public final InterfaceC35521h f103621E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC35521h f103622F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103623w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35521h f103624x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35521h f103625y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC35521h f103626z;

    public /* synthetic */ C26156v(InterfaceC35517d interfaceC35517d, InterfaceC35517d interfaceC35517d2, InterfaceC35517d interfaceC35517d3, InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2, int i13) {
        this.f103623w = i13;
        this.f103624x = interfaceC35517d;
        this.f103625y = interfaceC35517d2;
        this.f103626z = interfaceC35517d3;
        this.f103621E = interfaceC35521h;
        this.f103622F = interfaceC35521h2;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f103623w) {
            case 0:
                return new C26155u(this.f103624x, this.f103625y, this.f103626z, (C2326f) this.f103621E.get(), this.f103622F);
            default:
                return new C35539o((Context) this.f103624x.get(), (InterfaceC4339a) this.f103625y.get(), (InterfaceC2227c1) this.f103626z.get(), (C30765d) this.f103621E.get(), (InterfaceC30063j) this.f103622F.get());
        }
    }
}
