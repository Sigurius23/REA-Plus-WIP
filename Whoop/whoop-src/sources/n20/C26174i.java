package n20;

import a30.C0273a;
import a30.C0289f0;
import a30.C0290f1;
import a30.C0307l0;
import a30.C0320q0;
import a30.EnumC0304k0;
import a30.InterfaceC0301j0;
import a30.InterfaceC0310m0;
import android.app.Application;
import android.content.Context;
import androidx.core.app.ActivityOptionsCompat;
import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.InterfaceC1585g0;
import androidx.room.C1778e;
import b20.C2326f;
import b30.C2657x5;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import com.stripe.android.paymentsheet.PaymentOptionContract;
import com.stripe.android.paymentsheet.p055ui.SepaMandateContract;
import com.whoop.android.R;
import d00.C11424c;
import d00.C11433l;
import d00.InterfaceC11427f;
import d33.C11629t0;
import e10.C12559n;
import e10.C12566q0;
import e10.C12575v;
import e10.C12577w;
import e10.InterfaceC12578x;
import f20.EnumC14023b;
import g20.AbstractC15276v;
import g20.C15273s;
import g20.C15274t;
import g20.C15275u;
import h20.C16626a4;
import h20.C16652f0;
import h20.C16665h1;
import h20.C16671i1;
import h20.C16689l1;
import h20.C16729s;
import h20.C16744u2;
import h20.C16756w2;
import h20.C16759x;
import h20.C16761x1;
import h20.InterfaceC16638c4;
import h20.InterfaceC16642d2;
import h20.InterfaceC16646e0;
import i20.C17928b;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import jo2.C21841d;
import k20.AbstractC22143h;
import k20.C22136a;
import k20.C22142g;
import m83.AbstractC25265s;
import n10.EnumC26121c0;
import p026b2.C2319y;
import p097ds.AbstractC12314q;
import p236j.AbstractC21065d;
import p236j.InterfaceC21064c;
import p236j.InterfaceC21072k;
import p279kd.C22379f;
import p322m7.C25158l0;
import p478s3.AbstractC32098d;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p599wz.AbstractC37760u0;
import p599wz.C37702b;
import p599wz.C37708d;
import p599wz.C37718g0;
import p599wz.C37751r0;
import p599wz.InterfaceC37711e;
import p631xz.C38721f0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import pg3.C29205p;
import q20.AbstractC29835t;
import q20.AbstractC29840y;
import q20.C29810c;
import q20.C29818g;
import q20.C29822i;
import q20.C29824j;
import q20.C29828m;
import q20.C29838w;
import q20.C29839x;
import q83.InterfaceC30057d;
import se.AbstractC32417h;
import u00.C34377e;
import ug.AbstractC34924m;
import v00.AbstractC35455a0;
import v00.C35459c0;
import v00.C35480n;
import v00.C35484p;
import v00.InterfaceC35471i0;
import w30.InterfaceC36786c;
import x43.AbstractC37978j;
import y00.C38797c3;
import y00.C38901n;
import y00.C38915o4;
import y00.C38939r1;
import y00.EnumC38828f4;
import y00.EnumC38922p2;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: n20.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C26174i implements InterfaceC16642d2 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2994c0 f103770a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC1585g0 f103771b;

    /* JADX INFO: renamed from: c */
    public final C29205p f103772c;

    /* JADX INFO: renamed from: d */
    public final C16729s f103773d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC16638c4 f103774e;

    /* JADX INFO: renamed from: f */
    public final Context f103775f;

    /* JADX INFO: renamed from: g */
    public final C22136a f103776g;

    /* JADX INFO: renamed from: h */
    public final C26186u f103777h;

    /* JADX INFO: renamed from: i */
    public final C26176k f103778i;

    /* JADX INFO: renamed from: j */
    public final C34377e f103779j;

    /* JADX INFO: renamed from: k */
    public final C16759x f103780k;

    /* JADX INFO: renamed from: l */
    public final C38721f0 f103781l;

    /* JADX INFO: renamed from: m */
    public final C37751r0 f103782m;

    /* JADX INFO: renamed from: n */
    public final C37751r0 f103783n;

    /* JADX INFO: renamed from: o */
    public final boolean f103784o;

    /* JADX INFO: renamed from: p */
    public final Set f103785p;

    /* JADX INFO: renamed from: q */
    public final C26181p f103786q;

    /* JADX INFO: renamed from: r */
    public final C2326f f103787r;

    /* JADX INFO: renamed from: s */
    public final boolean f103788s;

    /* JADX INFO: renamed from: t */
    public final String f103789t;

    /* JADX INFO: renamed from: u */
    public final AbstractC21065d f103790u;

    /* JADX INFO: renamed from: v */
    public final AbstractC21065d f103791v;

    public C26174i(InterfaceC2994c0 viewModelScope, InterfaceC1585g0 lifecycleOwner, C29205p paymentOptionFactory, C16729s paymentOptionResultCallback, InterfaceC16638c4 paymentResultCallback, InterfaceC21064c activityResultCaller, InterfaceC21072k activityResultRegistryOwner, Context context, C22136a eventReporter, C26186u viewModel, C26176k confirmationHandler, C34377e linkGateFactory, C16759x linkHandler, C38721f0 linkAccountHolder, C37751r0 flowControllerLinkLauncher, C37751r0 walletsButtonLinkLauncher, boolean z4, Set productUsage, C26181p configurationHandler, C2326f errorReporter, boolean z13, String paymentElementCallbackIdentifier) {
        AbstractC22676k.m65750j(viewModelScope, "viewModelScope");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(paymentOptionFactory, "paymentOptionFactory");
        AbstractC22676k.m65750j(paymentOptionResultCallback, "paymentOptionResultCallback");
        AbstractC22676k.m65750j(paymentResultCallback, "paymentResultCallback");
        AbstractC22676k.m65750j(activityResultCaller, "activityResultCaller");
        AbstractC22676k.m65750j(activityResultRegistryOwner, "activityResultRegistryOwner");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        AbstractC22676k.m65750j(viewModel, "viewModel");
        AbstractC22676k.m65750j(confirmationHandler, "confirmationHandler");
        AbstractC22676k.m65750j(linkGateFactory, "linkGateFactory");
        AbstractC22676k.m65750j(linkHandler, "linkHandler");
        AbstractC22676k.m65750j(linkAccountHolder, "linkAccountHolder");
        AbstractC22676k.m65750j(flowControllerLinkLauncher, "flowControllerLinkLauncher");
        AbstractC22676k.m65750j(walletsButtonLinkLauncher, "walletsButtonLinkLauncher");
        AbstractC22676k.m65750j(productUsage, "productUsage");
        AbstractC22676k.m65750j(configurationHandler, "configurationHandler");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        this.f103770a = viewModelScope;
        this.f103771b = lifecycleOwner;
        this.f103772c = paymentOptionFactory;
        this.f103773d = paymentOptionResultCallback;
        this.f103774e = paymentResultCallback;
        this.f103775f = context;
        this.f103776g = eventReporter;
        this.f103777h = viewModel;
        this.f103778i = confirmationHandler;
        this.f103779j = linkGateFactory;
        this.f103780k = linkHandler;
        this.f103781l = linkAccountHolder;
        this.f103782m = flowControllerLinkLauncher;
        this.f103783n = walletsButtonLinkLauncher;
        this.f103784o = z4;
        this.f103785p = productUsage;
        this.f103786q = configurationHandler;
        this.f103787r = errorReporter;
        this.f103788s = z13;
        this.f103789t = paymentElementCallbackIdentifier;
        confirmationHandler.f103797b.m35250f(activityResultCaller, lifecycleOwner);
        this.f103790u = activityResultCaller.registerForActivityResult(new PaymentOptionContract(), new C26172g(this, 0));
        this.f103791v = activityResultCaller.registerForActivityResult(new SepaMandateContract(), new C26172g(this, 1));
        flowControllerLinkLauncher.m121160c("LinkPaymentLauncher_DefaultFlowController", activityResultRegistryOwner.getActivityResultRegistry(), new C25158l0(1, this, C26174i.class, "onLinkResultFromFlowController", "onLinkResultFromFlowController(Lcom/stripe/android/link/LinkActivityResult;)V", 0, 24));
        walletsButtonLinkLauncher.m121160c("LinkPaymentLauncher_WalletsButton", activityResultRegistryOwner.getActivityResultRegistry(), new C25158l0(1, this, C26174i.class, "onLinkResultFromWalletsButton", "onLinkResultFromWalletsButton(Lcom/stripe/android/link/LinkActivityResult;)V", 0, 25));
        lifecycleOwner.getLifecycle().mo4986a(new C12566q0(this, 5));
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(lifecycleOwner), null, null, new C22379f(this, (InterfaceC30057d) null, 9), 3);
    }

    /* JADX INFO: renamed from: a */
    public static final void m77718a(C26174i c26174i, InterfaceC12578x interfaceC12578x) {
        AbstractC29840y abstractC29840y;
        if (interfaceC12578x instanceof C12577w) {
            AbstractC29840y abstractC29840y2 = c26174i.f103777h.f103856E;
            if (abstractC29840y2 != null) {
                C12577w c12577w = (C12577w) interfaceC12578x;
                c26174i.f103776g.m63396p(abstractC29840y2, c12577w.f42948b, c12577w.f42947a.getId());
            }
            C12577w c12577w2 = (C12577w) interfaceC12578x;
            c26174i.m77722d(C15274t.f57360w, c12577w2.f42948b, false, c12577w2.f42949c, c12577w2.f42947a.getId());
            return;
        }
        if (interfaceC12578x instanceof C12575v) {
            C12575v c12575v = (C12575v) interfaceC12578x;
            AbstractC22143h abstractC22143hM34317I = AbstractC12314q.m34317I(c12575v);
            if (abstractC22143hM34317I != null && (abstractC29840y = c26174i.f103777h.f103856E) != null) {
                c26174i.f103776g.m63393m(abstractC29840y, abstractC22143hM34317I);
            }
            m77719e(c26174i, new C15275u(c12575v.f42944a), 24);
            return;
        }
        if (!(interfaceC12578x instanceof C12559n)) {
            throw new NoWhenBranchMatchedException();
        }
        int iOrdinal = ((C12559n) interfaceC12578x).f42891a.ordinal();
        if (iOrdinal == 0) {
            m77719e(c26174i, C15273s.f57359w, 24);
        } else if (iOrdinal == 1) {
            c26174i.m77723f();
        } else if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m77719e(C26174i c26174i, AbstractC15276v abstractC15276v, int i13) {
        c26174i.m77722d(abstractC15276v, null, (i13 & 4) != 0, true, null);
    }

    /* JADX INFO: renamed from: b */
    public final void m77720b(C16744u2 c16744u2, C16761x1 c16761x1, C21841d c21841d) {
        C0320q0 c0320q0 = new C0320q0(c16744u2);
        if (c16761x1 == null) {
            c16761x1 = AbstractC32417h.m101217z(this.f103775f);
        }
        C16761x1 c16761x2 = c16761x1;
        C26181p c26181p = this.f103786q;
        c26181p.getClass();
        InterfaceC2994c0 scope = this.f103770a;
        AbstractC22676k.m65750j(scope, "scope");
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) c26181p.f103840f.getAndSet(AbstractC3006f0.m8732z(scope, null, null, new C11629t0(c26181p, c0320q0, c16761x2, this.f103788s, c21841d, (InterfaceC30057d) null), 3));
        if (interfaceC3027k1 != null) {
            interfaceC3027k1.cancel((CancellationException) null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m77721c() {
        AbstractC29840y abstractC29840y;
        C26173h c26173hM77735g = this.f103777h.m77735g();
        if (c26173hM77735g == null) {
            m77719e(this, new C15275u(new IllegalStateException("FlowController must be successfully initialized using configureWithPaymentIntent(), configureWithSetupIntent() or configureWithIntentConfiguration() before calling confirm().")), 30);
            return;
        }
        C26181p c26181p = this.f103786q;
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) c26181p.f103840f.get();
        boolean z4 = false;
        if (!(interfaceC3027k1 != null ? !interfaceC3027k1.isCompleted() : false) && !c26181p.f103841g) {
            z4 = true;
        }
        if (!z4) {
            m77719e(this, new C15275u(new IllegalStateException("FlowController.confirm() can only be called if the most recent call to configureWithPaymentIntent(), configureWithSetupIntent() or configureWithIntentConfiguration() has completed successfully.")), 30);
            return;
        }
        AbstractC29840y abstractC29840y2 = this.f103777h.f103856E;
        if ((abstractC29840y2 instanceof C29828m) || (abstractC29840y2 instanceof C29824j) || (abstractC29840y2 instanceof C29822i) || (abstractC29840y2 instanceof C29818g) || (abstractC29840y2 instanceof AbstractC29835t) || (abstractC29840y2 instanceof C29839x) || abstractC29840y2 == null) {
            C0290f1 state = c26173hM77735g.f103767w;
            AbstractC22676k.m65750j(state, "state");
            AbstractC3006f0.m8732z(this.f103770a, null, null, new C2319y(abstractC29840y2, state, this, null, 18), 3);
        } else {
            if (!(abstractC29840y2 instanceof C29838w)) {
                throw new NoWhenBranchMatchedException();
            }
            C29838w c29838w = (C29838w) abstractC29840y2;
            C0290f1 state2 = c26173hM77735g.f103767w;
            if (c29838w.f121955x.f167511E == EnumC38828f4.f167093L && (abstractC29840y = this.f103777h.f103856E) != null && !abstractC29840y.f121959w) {
                this.f103791v.mo4052a(new C2657x5(state2.f1020w.f102970w), null);
            } else {
                AbstractC22676k.m65750j(state2, "state");
                AbstractC3006f0.m8732z(this.f103770a, null, null, new C2319y(c29838w, state2, this, null, 18), 3);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m77722d(AbstractC15276v abstractC15276v, EnumC26121c0 enumC26121c0, boolean z4, boolean z13, String str) {
        AbstractC29840y abstractC29840y;
        if (z4) {
            if (abstractC15276v instanceof C15274t) {
                AbstractC29840y abstractC29840y2 = this.f103777h.f103856E;
                if (abstractC29840y2 != null) {
                    this.f103776g.m63396p(abstractC29840y2, enumC26121c0, str);
                }
            } else if ((abstractC15276v instanceof C15275u) && (abstractC29840y = this.f103777h.f103856E) != null) {
                this.f103776g.m63393m(abstractC29840y, new C22142g(((C15275u) abstractC15276v).f57361w));
            }
        }
        AbstractC29840y abstractC29840y3 = this.f103777h.f103856E;
        C26173h c26173hM77735g = this.f103777h.m77735g();
        InterfaceC30057d interfaceC30057d = null;
        boolean z14 = false;
        if (c26173hM77735g != null) {
            C0307l0 c0307l0 = c26173hM77735g.f103767w.f1019E.f150995l0;
            C37718g0 c37718g0 = c0307l0 != null ? c0307l0.f1058w : null;
            if (c37718g0 != null && c37718g0.f161616P) {
                z14 = true;
            }
        }
        boolean z15 = abstractC15276v instanceof C15274t;
        if (z15 && abstractC29840y3 != null && AbstractC34924m.m110125G(abstractC29840y3) && !z14) {
            this.f103780k.m47277b();
        }
        if (z15 && z13) {
            this.f103777h.f103856E = null;
            this.f103777h.f103861x.m5004e(null, "state");
        }
        AbstractC3006f0.m8732z(this.f103770a, null, null, new C1778e(this, abstractC15276v, interfaceC30057d, 24), 3);
    }

    /* JADX INFO: renamed from: f */
    public final void m77723f() {
        m77727j(new C26171f(this, 0));
    }

    /* JADX INFO: renamed from: g */
    public final void m77724g(C26173h c26173h, AbstractC29840y abstractC29840y) {
        C0290f1 c0290f1M821b = C0290f1.m821b(c26173h.f103767w, null, abstractC29840y, null, 27);
        C16761x1 c16761x1 = c26173h.f103768x;
        C37708d c37708d = (C37708d) this.f103781l.f166664b.f45200w.getValue();
        C26186u c26186u = this.f103777h;
        C16652f0 c16652f0 = new C16652f0(c0290f1M821b, c16761x1, c37708d, this.f103784o, c26186u.f103863z, this.f103785p, this.f103789t);
        Application application = c26186u.f6189w;
        AbstractC22676k.m65748h(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        ActivityOptionsCompat activityOptionsCompatMakeCustomAnimation = ActivityOptionsCompat.makeCustomAnimation(application, R.anim.stripe_transition_fade_in, R.anim.stripe_transition_fade_out);
        AbstractC22676k.m65749i(activityOptionsCompatMakeCustomAnimation, "makeCustomAnimation(...)");
        try {
            this.f103790u.mo4052a(c16652f0, activityOptionsCompatMakeCustomAnimation);
        } catch (IllegalStateException e5) {
            this.f103774e.mo43511a(new C16626a4(new IllegalStateException("The host activity is not in a valid state (" + this.f103771b.getLifecycle().getCurrentState() + ").", e5)));
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m77725h(InterfaceC37711e interfaceC37711e) {
        InterfaceC11427f interfaceC11427f;
        InterfaceC0310m0 c0307l0;
        AbstractC32098d.m99854u(interfaceC37711e, this.f103781l);
        if (!(interfaceC37711e instanceof C37708d)) {
            if (!interfaceC37711e.equals(C37702b.f161559w)) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        C26186u c26186u = this.f103777h;
        C26173h c26173hM77735g = c26186u.m77735g();
        if (c26173hM77735g == null) {
            return;
        }
        C35459c0 c35459c0 = c26173hM77735g.f103767w.f1019E;
        C11433l c11433l = ((C37708d) interfaceC37711e).f161571w;
        if (c11433l == null || (interfaceC11427f = c11433l.f36657L) == null) {
            interfaceC11427f = C11424c.f36644a;
        }
        InterfaceC0310m0 interfaceC0310m0 = c35459c0.f150978U;
        if (interfaceC0310m0 instanceof C0307l0) {
            C0307l0 c0307l1 = (C0307l0) interfaceC0310m0;
            EnumC0304k0 enumC0304k0M121639X = AbstractC37978j.m121639X(interfaceC11427f);
            C37718g0 configuration = c0307l1.f1058w;
            InterfaceC0301j0 signupModeResult = c0307l1.f1060y;
            AbstractC22676k.m65750j(configuration, "configuration");
            AbstractC22676k.m65750j(signupModeResult, "signupModeResult");
            c0307l0 = new C0307l0(configuration, enumC0304k0M121639X, signupModeResult);
        } else {
            if (!(interfaceC0310m0 instanceof C0289f0) && interfaceC0310m0 != null) {
                throw new NoWhenBranchMatchedException();
            }
            c0307l0 = interfaceC0310m0;
        }
        InterfaceC38802c8 stripeIntent = c35459c0.f150996w;
        C16689l1 billingDetailsCollectionConfiguration = c35459c0.f150997x;
        boolean z4 = c35459c0.f150998y;
        boolean z13 = c35459c0.f150999z;
        boolean z14 = c35459c0.f150962E;
        List list = c35459c0.f150963F;
        List paymentMethodOrder = c35459c0.f150964G;
        InterfaceC36786c cbcEligibility = c35459c0.f150965H;
        String merchantName = c35459c0.f150966I;
        String str = c35459c0.f150967J;
        C16671i1 c16671i1 = c35459c0.f150968K;
        C17928b c17928b = c35459c0.f150969L;
        List list2 = c35459c0.f150970M;
        List list3 = c35459c0.f150971N;
        List list4 = c35459c0.f150972O;
        C35484p c35484p = c35459c0.f150973P;
        boolean z15 = c35459c0.f150974Q;
        C16756w2 linkConfiguration = c35459c0.f150975R;
        InterfaceC35471i0 paymentMethodSaveConsentBehavior = c35459c0.f150976S;
        EnumC38922p2 enumC38922p2 = c35459c0.f150977T;
        C29810c c29810c = c35459c0.f150979V;
        EnumC14023b enumC14023b = c35459c0.f150980W;
        InterfaceC35320a cardBrandFilter = c35459c0.f150981X;
        InterfaceC35322b cardFundingFilter = c35459c0.f150982Y;
        Map termsDisplay = c35459c0.f150983Z;
        boolean z16 = c35459c0.f150984a0;
        C38797c3 c38797c3 = c35459c0.f150985b0;
        boolean z17 = c35459c0.f150986c0;
        C38901n clientAttributionMetadata = c35459c0.f150987d0;
        boolean z18 = c35459c0.f150988e0;
        C16665h1 appearance = c35459c0.f150989f0;
        String str2 = c35459c0.f150990g0;
        AbstractC35455a0 integrationMetadata = c35459c0.f150991h0;
        C35480n analyticsMetadata = c35459c0.f150992i0;
        C38939r1 c38939r1 = c35459c0.f150993j0;
        boolean z19 = c35459c0.f150994k0;
        AbstractC22676k.m65750j(stripeIntent, "stripeIntent");
        AbstractC22676k.m65750j(billingDetailsCollectionConfiguration, "billingDetailsCollectionConfiguration");
        AbstractC22676k.m65750j(paymentMethodOrder, "paymentMethodOrder");
        AbstractC22676k.m65750j(cbcEligibility, "cbcEligibility");
        AbstractC22676k.m65750j(merchantName, "merchantName");
        AbstractC22676k.m65750j(linkConfiguration, "linkConfiguration");
        AbstractC22676k.m65750j(paymentMethodSaveConsentBehavior, "paymentMethodSaveConsentBehavior");
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        AbstractC22676k.m65750j(termsDisplay, "termsDisplay");
        AbstractC22676k.m65750j(clientAttributionMetadata, "clientAttributionMetadata");
        AbstractC22676k.m65750j(appearance, "appearance");
        AbstractC22676k.m65750j(integrationMetadata, "integrationMetadata");
        AbstractC22676k.m65750j(analyticsMetadata, "analyticsMetadata");
        c26186u.f103861x.m5004e(C26173h.m77717f(c26173hM77735g, null, new C35459c0(stripeIntent, billingDetailsCollectionConfiguration, z4, z13, z14, list, paymentMethodOrder, cbcEligibility, merchantName, str, c16671i1, c17928b, list2, list3, list4, c35484p, z15, linkConfiguration, paymentMethodSaveConsentBehavior, enumC38922p2, c0307l0, c29810c, enumC14023b, cardBrandFilter, cardFundingFilter, termsDisplay, z16, c38797c3, z17, clientAttributionMetadata, z18, appearance, str2, integrationMetadata, analyticsMetadata, c38939r1, z19), 3), "state");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x006c  */
    /* JADX INFO: renamed from: i */
    public final void m77726i(AbstractC37760u0 abstractC37760u0, boolean z4) {
        AbstractC29840y c29838w;
        C0290f1 c0290f1;
        C0273a c0273a;
        C38915o4 c38915o4;
        Object next;
        C38915o4 c38915o5;
        String str;
        AbstractC29840y abstractC29840y = this.f103777h.f103856E;
        if (abstractC29840y instanceof C29828m) {
            if (abstractC37760u0 != null) {
                c29838w = C29828m.m91328h((C29828m) abstractC29840y, abstractC37760u0);
            } else {
                C26173h c26173hM77735g = this.f103777h.m77735g();
                if (c26173hM77735g == null || (c0290f1 = c26173hM77735g.f103767w) == null || (c0273a = c0290f1.f1021x) == null) {
                    c29838w = null;
                } else {
                    C35484p c35484p = c0290f1.f1019E.f150973P;
                    if (c35484p != null ? c35484p.f151062z : false) {
                        Iterator it = c0273a.f935w.iterator();
                        do {
                            if (!it.hasNext()) {
                                next = null;
                                break;
                            } else {
                                next = it.next();
                                c38915o5 = (C38915o4) next;
                                str = c0273a.f936x;
                            }
                        } while (!(str != null && AbstractC22676k.m65745e(c38915o5.f167527w, str)));
                        c38915o4 = (C38915o4) next;
                    } else {
                        c38915o4 = (C38915o4) AbstractC25265s.m74100H0(c0273a.f935w);
                    }
                    if (c38915o4 != null) {
                        c29838w = new C29838w(c38915o4, null, null);
                    } else {
                        c29838w = null;
                    }
                }
            }
            this.f103777h.f103856E = c29838w;
            ((InterfaceC16646e0) this.f103773d.f64275a.getValue()).mo47224a(c29838w != null ? this.f103772c.m88710f(c29838w) : null);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m77727j(Function1 function1) {
        C26173h c26173hM77735g = this.f103777h.m77735g();
        InterfaceC16638c4 interfaceC16638c4 = this.f103774e;
        if (c26173hM77735g == null) {
            interfaceC16638c4.mo43511a(new C16626a4(new IllegalStateException("FlowController must be successfully initialized using configureWithPaymentIntent(), configureWithSetupIntent() or configureWithIntentConfiguration() before calling presentPaymentOptions().")));
            return;
        }
        C26181p c26181p = this.f103786q;
        InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) c26181p.f103840f.get();
        boolean z4 = false;
        if (!(interfaceC3027k1 != null ? !interfaceC3027k1.isCompleted() : false) && !c26181p.f103841g) {
            z4 = true;
        }
        if (z4) {
            function1.invoke(c26173hM77735g);
        } else {
            interfaceC16638c4.mo43511a(new C16626a4(new IllegalStateException("FlowController is not configured, or has a configuration update in flight.")));
        }
    }
}
