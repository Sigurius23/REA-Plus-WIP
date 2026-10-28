package k20;

import a30.C0294h;
import android.content.Context;
import b10.C2222b;
import bz.C3710i;
import bz.InterfaceC3704c;
import com.stripe.android.paymentsheet.analytics.EventReporter$Mode;
import p664yy.C39865j;
import p664yy.C39873n;
import q83.InterfaceC30063j;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;

/* JADX INFO: renamed from: k20.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C22137b implements InterfaceC35517d {

    /* JADX INFO: renamed from: E */
    public final InterfaceC35521h f85873E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC35521h f85874F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC35517d f85875G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC35521h f85876H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC35521h f85877I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC35521h f85878J;

    /* JADX INFO: renamed from: w */
    public final InterfaceC35521h f85879w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35521h f85880x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35521h f85881y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC35521h f85882z;

    public C22137b(InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2, InterfaceC35521h interfaceC35521h3, InterfaceC35521h interfaceC35521h4, InterfaceC35521h interfaceC35521h5, InterfaceC35521h interfaceC35521h6, InterfaceC35517d interfaceC35517d, InterfaceC35521h interfaceC35521h7, C0294h c0294h, InterfaceC35521h interfaceC35521h8) {
        this.f85879w = interfaceC35521h;
        this.f85880x = interfaceC35521h2;
        this.f85881y = interfaceC35521h3;
        this.f85882z = interfaceC35521h4;
        this.f85873E = interfaceC35521h5;
        this.f85874F = interfaceC35521h6;
        this.f85875G = interfaceC35517d;
        this.f85876H = interfaceC35521h7;
        this.f85877I = c0294h;
        this.f85878J = interfaceC35521h8;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        return new C22136a((Context) this.f85879w.get(), (EventReporter$Mode) this.f85880x.get(), (C39865j) this.f85881y.get(), (C39873n) this.f85882z.get(), (C2222b) this.f85873E.get(), (InterfaceC3704c) this.f85874F.get(), this.f85875G, (InterfaceC30063j) this.f85876H.get(), (C3710i) this.f85877I.get(), this.f85878J);
    }
}
