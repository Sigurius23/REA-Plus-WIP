package n10;

import c93.InterfaceC4339a;
import cd.C4421a;
import java.util.Locale;
import p537ux.C35352q;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p715kotlin.jvm.internal.AbstractC22676k;
import sz.C33124c0;
import v03.C35518e;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: n10.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C26152s implements InterfaceC35517d {

    /* JADX INFO: renamed from: E */
    public final InterfaceC35521h f103609E;

    /* JADX INFO: renamed from: F */
    public final C35518e f103610F;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103611w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35521h f103612x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35521h f103613y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC35521h f103614z;

    public /* synthetic */ C26152s(InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2, InterfaceC35521h interfaceC35521h3, InterfaceC35521h interfaceC35521h4, C35518e c35518e, int i13) {
        this.f103611w = i13;
        this.f103612x = interfaceC35521h;
        this.f103613y = interfaceC35521h2;
        this.f103614z = interfaceC35521h3;
        this.f103609E = interfaceC35521h4;
        this.f103610F = c35518e;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f103611w) {
            case 0:
                return new C26150r((C26155u) this.f103612x.get(), (C26145o0) this.f103613y.get(), (C26119b0) this.f103614z.get(), (C26130h) this.f103609E.get(), (C26153s0) this.f103610F.f151137w);
            default:
                InterfaceC4339a publishableKeyProvider = (InterfaceC4339a) this.f103612x.get();
                InterfaceC4339a stripeAccountIdProvider = (InterfaceC4339a) this.f103613y.get();
                C33124c0 googlePayConfig = (C33124c0) this.f103614z.get();
                InterfaceC35320a cardBrandFilter = (InterfaceC35320a) this.f103609E.get();
                InterfaceC35322b cardFundingFilter = (InterfaceC35322b) this.f103610F.f151137w;
                AbstractC22676k.m65750j(publishableKeyProvider, "publishableKeyProvider");
                AbstractC22676k.m65750j(stripeAccountIdProvider, "stripeAccountIdProvider");
                AbstractC22676k.m65750j(googlePayConfig, "googlePayConfig");
                AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
                AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
                return new C35352q(new C4421a((String) publishableKeyProvider.invoke(), (String) stripeAccountIdProvider.invoke()), AbstractC39421y.m125921F(googlePayConfig.f138176x, Locale.JAPAN.getCountry(), true), googlePayConfig.f138174H, cardBrandFilter, cardFundingFilter);
        }
    }
}
