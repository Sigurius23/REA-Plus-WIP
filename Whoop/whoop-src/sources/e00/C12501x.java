package e00;

import android.app.Application;
import b10.C2221a1;
import b10.C2225c;
import b10.EnumC2228d;
import b10.InterfaceC2227c1;
import b20.C2326f;
import b20.C2327g;
import c93.InterfaceC4339a;
import g30.C15296g;
import java.util.Locale;
import ng3.C26702o;
import p012ab.C0684i0;
import p20.C28747i;
import p442qy.C30765d;
import p537ux.C35339j0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import v03.C35518e;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;

/* JADX INFO: renamed from: e00.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C12501x implements InterfaceC35517d {

    /* JADX INFO: renamed from: E */
    public final InterfaceC35521h f42693E;

    /* JADX INFO: renamed from: F */
    public final InterfaceC35521h f42694F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC35521h f42695G;

    /* JADX INFO: renamed from: H */
    public final InterfaceC35521h f42696H;

    /* JADX INFO: renamed from: I */
    public final InterfaceC35521h f42697I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC35521h f42698J;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42699w = 1;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35521h f42700x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35521h f42701y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC35521h f42702z;

    public C12501x(InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2, InterfaceC35521h interfaceC35521h3, InterfaceC35521h interfaceC35521h4, InterfaceC35521h interfaceC35521h5, InterfaceC35521h interfaceC35521h6, InterfaceC35521h interfaceC35521h7, InterfaceC35521h interfaceC35521h8, InterfaceC35521h interfaceC35521h9) {
        this.f42700x = interfaceC35521h;
        this.f42701y = interfaceC35521h2;
        this.f42702z = interfaceC35521h3;
        this.f42693E = interfaceC35521h4;
        this.f42694F = interfaceC35521h5;
        this.f42695G = interfaceC35521h6;
        this.f42696H = interfaceC35521h7;
        this.f42697I = interfaceC35521h8;
        this.f42698J = interfaceC35521h9;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f42699w) {
            case 0:
                return new C12500w((Application) this.f42700x.get(), (EnumC2228d) this.f42701y.get(), (InterfaceC4339a) this.f42702z.get(), (InterfaceC4339a) this.f42693E.get(), (InterfaceC2227c1) this.f42694F.get(), (C15296g) this.f42695G.get(), (InterfaceC30063j) this.f42696H.get(), (Locale) this.f42697I.get(), (C2326f) this.f42698J.get());
            default:
                Application application = (Application) this.f42700x.get();
                InterfaceC4339a publishableKeyProvider = (InterfaceC4339a) this.f42701y.get();
                InterfaceC4339a stripeAccountIdProvider = (InterfaceC4339a) this.f42702z.get();
                EnumC2228d requestSurface = (EnumC2228d) this.f42693E.get();
                InterfaceC2227c1 stripeRepository = (InterfaceC2227c1) this.f42694F.get();
                InterfaceC30063j workContext = (InterfaceC30063j) this.f42695G.get();
                C30765d logger = (C30765d) this.f42696H.get();
                Locale locale = (Locale) this.f42697I.get();
                C2326f errorReporter = (C2326f) this.f42698J.get();
                AbstractC22676k.m65750j(application, "application");
                AbstractC22676k.m65750j(publishableKeyProvider, "publishableKeyProvider");
                AbstractC22676k.m65750j(stripeAccountIdProvider, "stripeAccountIdProvider");
                AbstractC22676k.m65750j(requestSurface, "requestSurface");
                AbstractC22676k.m65750j(stripeRepository, "stripeRepository");
                AbstractC22676k.m65750j(workContext, "workContext");
                AbstractC22676k.m65750j(logger, "logger");
                AbstractC22676k.m65750j(errorReporter, "errorReporter");
                return new C12500w(application, requestSurface, publishableKeyProvider, stripeAccountIdProvider, stripeRepository, new C15296g(new C0684i0(workContext, logger, 14), C35339j0.f150551c), workContext, locale, errorReporter);
        }
    }

    public C12501x(C26702o c26702o, C35518e c35518e, C2225c c2225c, C28747i c28747i, C2225c c2225c2, C2221a1 c2221a1, InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2, InterfaceC35521h interfaceC35521h3, C2327g c2327g) {
        this.f42700x = c35518e;
        this.f42701y = c2225c;
        this.f42702z = c28747i;
        this.f42693E = c2225c2;
        this.f42694F = c2221a1;
        this.f42695G = interfaceC35521h;
        this.f42696H = interfaceC35521h2;
        this.f42697I = interfaceC35521h3;
        this.f42698J = c2327g;
    }
}
