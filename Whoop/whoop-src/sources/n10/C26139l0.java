package n10;

import a30.C0294h;
import android.content.Context;
import b10.C2221a1;
import b10.C2225c;
import b10.InterfaceC2227c1;
import c93.InterfaceC4339a;
import g20.C15278x;
import g73.C15556d;
import j10.C21196a;
import js2.C21930h;
import p20.C28747i;
import p442qy.C30765d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import v03.C35518e;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;
import v10.C35535k;
import z20.C40018l;

/* JADX INFO: renamed from: n10.l0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C26139l0 implements InterfaceC35517d {

    /* JADX INFO: renamed from: E */
    public final InterfaceC35521h f103554E;

    /* JADX INFO: renamed from: F */
    public final Object f103555F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103556w = 2;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35521h f103557x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35521h f103558y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC35521h f103559z;

    public C26139l0(C2221a1 c2221a1, C28747i c28747i, InterfaceC35521h interfaceC35521h, C2225c c2225c, C0294h c0294h) {
        this.f103557x = c2221a1;
        this.f103558y = c28747i;
        this.f103559z = interfaceC35521h;
        this.f103555F = c2225c;
        this.f103554E = c0294h;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f103556w) {
            case 0:
                C15556d c15556d = (C15556d) this.f103555F;
                InterfaceC26131h0 interceptorFactory = (InterfaceC26131h0) this.f103557x.get();
                C15278x stripePaymentLauncherAssistedFactory = (C15278x) this.f103558y.get();
                Integer num = (Integer) this.f103559z.get();
                c15556d.getClass();
                AbstractC22676k.m65750j(interceptorFactory, "interceptorFactory");
                AbstractC22676k.m65750j(stripePaymentLauncherAssistedFactory, "stripePaymentLauncherAssistedFactory");
                InterfaceC35521h paymentConfigurationProvider = this.f103554E;
                AbstractC22676k.m65750j(paymentConfigurationProvider, "paymentConfigurationProvider");
                return new C21196a(interceptorFactory, new C21930h(stripePaymentLauncherAssistedFactory, num, paymentConfigurationProvider, 25));
            case 1:
                return new C35535k((Context) this.f103557x.get(), (InterfaceC4339a) this.f103558y.get(), (InterfaceC2227c1) ((C2221a1) this.f103555F).get(), (C30765d) this.f103559z.get(), (InterfaceC30063j) this.f103554E.get());
            default:
                return new C40018l((InterfaceC2227c1) this.f103557x.get(), this.f103558y, (InterfaceC30063j) this.f103559z.get(), (C2225c) this.f103555F, (String) ((C0294h) this.f103554E).get());
        }
    }

    public C26139l0(C15556d c15556d, InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2, InterfaceC35517d interfaceC35517d, InterfaceC35521h interfaceC35521h3) {
        this.f103555F = c15556d;
        this.f103557x = interfaceC35521h;
        this.f103558y = interfaceC35521h2;
        this.f103559z = interfaceC35517d;
        this.f103554E = interfaceC35521h3;
    }

    public C26139l0(C35518e c35518e, C35518e c35518e2, C2221a1 c2221a1, InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2) {
        this.f103557x = c35518e;
        this.f103558y = c35518e2;
        this.f103555F = c2221a1;
        this.f103559z = interfaceC35521h;
        this.f103554E = interfaceC35521h2;
    }
}
