package ka3;

import c93.InterfaceC4339a;
import com.google.crypto.tink.internal.C5101l0;
import lb3.InterfaceC23796q0;
import p005a3.C0237p;
import r93.InterfaceC31126h;
import r93.InterfaceC31165x0;
import x93.C38124p;

/* JADX INFO: renamed from: ka3.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C22311c implements InterfaceC4339a {

    /* JADX INFO: renamed from: E */
    public final C38124p f87075E;

    /* JADX INFO: renamed from: w */
    public final C0237p f87076w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC31165x0 f87077x;

    /* JADX INFO: renamed from: y */
    public final C22309a f87078y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC23796q0 f87079z;

    public C22311c(C0237p c0237p, InterfaceC31165x0 interfaceC31165x0, C22309a c22309a, InterfaceC23796q0 interfaceC23796q0, C38124p c38124p) {
        this.f87076w = c0237p;
        this.f87077x = interfaceC31165x0;
        this.f87078y = c22309a;
        this.f87079z = interfaceC23796q0;
        this.f87075E = c38124p;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        C5101l0 c5101l0 = (C5101l0) this.f87076w.f814z;
        InterfaceC31126h interfaceC31126hMo1784d = this.f87079z.mo1784d();
        return c5101l0.m16037P(this.f87077x, C22309a.m64108a(this.f87078y, null, false, null, interfaceC31126hMo1784d != null ? interfaceC31126hMo1784d.mo60594i() : null, 31).m64115h(this.f87075E.m122111g()));
    }
}
