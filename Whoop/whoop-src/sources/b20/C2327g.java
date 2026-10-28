package b20;

import android.content.Context;
import android.content.res.Resources;
import androidx.lifecycle.AbstractC1640x1;
import b10.C2222b;
import b10.EnumC2228d;
import b10.InterfaceC2227c1;
import b30.C2476a1;
import b30.C2519f4;
import bc3.InterfaceC2994c0;
import bi.AbstractC3269g;
import c93.InterfaceC4339a;
import com.google.android.gms.common.api.C4976g;
import com.stripe.android.link.NativeLinkActivityContract;
import com.stripe.android.link.WebLinkActivityContract;
import e10.C12568r0;
import g30.C15296g;
import h20.C16663h;
import h20.C16759x;
import java.util.Set;
import m40.C25046w;
import n10.C26135j0;
import n20.C26167b;
import n20.C26176k;
import n20.C26186u;
import p003a1.C0103b;
import p012ab.C0684i0;
import p077d0.C11387o2;
import p078d1.C11457j;
import p096dq.AbstractC12277u;
import p096dq.C12272p;
import p096dq.C12276t;
import p20.C28747i;
import p442qy.C30765d;
import p537ux.C35339j0;
import p599wz.C37751r0;
import p631xz.C38721f0;
import p664yy.AbstractC39851c;
import p664yy.C39857f;
import p664yy.C39865j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29827l;
import q83.InterfaceC30063j;
import s00.C32038a;
import sz.C33124c0;
import sz.C33127e;
import sz.EnumC33131g;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;

/* JADX INFO: renamed from: b20.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C2327g implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9230w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC35521h f9231x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35521h f9232y;

    public /* synthetic */ C2327g(InterfaceC35521h interfaceC35521h, InterfaceC35521h interfaceC35521h2, int i13) {
        this.f9230w = i13;
        this.f9231x = interfaceC35521h;
        this.f9232y = interfaceC35521h2;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f9230w) {
            case 0:
                return new C2326f((C39865j) this.f9231x.get(), (AbstractC39851c) this.f9232y.get());
            case 1:
                C30765d logger = (C30765d) this.f9231x.get();
                InterfaceC30063j workContext = (InterfaceC30063j) this.f9232y.get();
                AbstractC22676k.m65750j(logger, "logger");
                AbstractC22676k.m65750j(workContext, "workContext");
                return new C15296g(new C0684i0(workContext, logger, 14), C35339j0.f150551c);
            case 2:
                C30765d logger2 = (C30765d) this.f9231x.get();
                InterfaceC30063j workContext2 = (InterfaceC30063j) this.f9232y.get();
                AbstractC22676k.m65750j(logger2, "logger");
                AbstractC22676k.m65750j(workContext2, "workContext");
                return new C15296g(new C0684i0(workContext2, logger2, 14), C35339j0.f150551c);
            case 3:
                return new C16663h((Context) this.f9231x.get(), (InterfaceC30063j) this.f9232y.get());
            case 4:
                return new C26176k((InterfaceC2994c0) this.f9231x.get(), (C12568r0) this.f9232y.get());
            case 5:
                C26186u viewModel = (C26186u) this.f9231x.get();
                C37751r0 walletsButtonLinkLauncher = (C37751r0) this.f9232y.get();
                AbstractC22676k.m65750j(viewModel, "viewModel");
                AbstractC22676k.m65750j(walletsButtonLinkLauncher, "walletsButtonLinkLauncher");
                C26167b c26167b = viewModel.f103862y;
                C16759x c16759x = (C16759x) c26167b.f103703Y.get();
                C39865j c39865j = new C39865j((C30765d) c26167b.f103717g.get(), (InterfaceC30063j) c26167b.f103719h.get());
                Context context = (Context) c26167b.f103725k.get();
                C28747i paymentConfiguration = c26167b.f103727l;
                AbstractC22676k.m65750j(paymentConfiguration, "paymentConfiguration");
                new C11457j(AbstractC3269g.m9513t(c16759x.f64391a.f161687c, viewModel.f103859H, viewModel.f103858G, new C2476a1(viewModel, 0)), (C12568r0) c26167b.f103702X.get(), AbstractC1640x1.m5043b(viewModel), new C2326f(c39865j, new C2222b(context, (Set) c26167b.f103731n.get(), new C26135j0(paymentConfiguration, 2))), (C32038a) c26167b.f103718g0.get(), walletsButtonLinkLauncher, (C38721f0) c26167b.f103698T.get(), c26167b.f103706a0, new C0103b(viewModel, 16));
                return new C2519f4();
            case 6:
                return new C29827l((Resources) this.f9231x.get(), (C25046w) this.f9232y.get());
            case 7:
                C33124c0 googlePayConfig = (C33124c0) this.f9231x.get();
                C33127e paymentsClientFactory = (C33127e) this.f9232y.get();
                AbstractC22676k.m65750j(googlePayConfig, "googlePayConfig");
                AbstractC22676k.m65750j(paymentsClientFactory, "paymentsClientFactory");
                EnumC33131g environment = googlePayConfig.f138175w;
                AbstractC22676k.m65750j(environment, "environment");
                C11387o2 c11387o2 = new C11387o2(2);
                c11387o2.m30623o(environment.f138197w);
                return new C12272p(paymentsClientFactory.f138189a, null, AbstractC12277u.f41106a, new C12276t(c11387o2), C4976g.f20501c);
            case 8:
                return new NativeLinkActivityContract((String) this.f9231x.get(), (EnumC2228d) this.f9232y.get());
            case 9:
                return new WebLinkActivityContract((InterfaceC2227c1) this.f9231x.get(), (C2326f) this.f9232y.get());
            case 10:
                return new C39857f((InterfaceC4339a) this.f9231x.get(), (InterfaceC4339a) this.f9232y.get());
            default:
                return new C39865j((C30765d) this.f9231x.get(), (InterfaceC30063j) this.f9232y.get());
        }
    }
}
