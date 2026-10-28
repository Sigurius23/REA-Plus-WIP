package h10;

import android.os.Parcelable;
import b20.C2326f;
import b20.EnumC2325e;
import c93.InterfaceC4339a;
import com.stripe.android.challenge.passive.PassiveChallengeActivityContract;
import com.stripe.android.challenge.passive.warmer.activity.PassiveChallengeWarmerContract;
import com.stripe.android.core.exception.StripeException;
import com.whoop.profile.view.edit.C9790n;
import e10.C12535b;
import e10.C12537c;
import e10.C12545g;
import e10.C12548h0;
import e10.C12553k;
import e10.C12567r;
import e10.C12572t0;
import e10.InterfaceC12549i;
import e10.InterfaceC12551j;
import e10.InterfaceC12555l;
import f10.C13999a;
import java.util.Set;
import n10.EnumC26121c0;
import p023ay.C2151y;
import p102dy.C12434c;
import p102dy.C12435d;
import p102dy.C12436e;
import p102dy.InterfaceC12437f;
import p130ey.C13733a;
import p159fy.C14860e;
import p236j.AbstractC21065d;
import p236j.InterfaceC21064c;
import p479s4.AbstractC32123d;
import p479s4.AbstractC32128i;
import p550vd.AbstractC35903f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35459c0;
import y00.C38780a6;
import y00.C38797c3;
import y00.C38809d5;

/* JADX INFO: renamed from: h10.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C16605a implements InterfaceC12551j {

    /* JADX INFO: renamed from: a */
    public final C2326f f63876a;

    /* JADX INFO: renamed from: b */
    public final C2151y f63877b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC4339a f63878c;

    /* JADX INFO: renamed from: d */
    public final Set f63879d;

    public C16605a(C2326f errorReporter, C2151y passiveChallengeWarmer, InterfaceC4339a publishableKeyProvider, Set productUsage) {
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(passiveChallengeWarmer, "passiveChallengeWarmer");
        AbstractC22676k.m65750j(publishableKeyProvider, "publishableKeyProvider");
        AbstractC22676k.m65750j(productUsage, "productUsage");
        this.f63876a = errorReporter;
        this.f63877b = passiveChallengeWarmer;
        this.f63878c = publishableKeyProvider;
        this.f63879d = productUsage;
    }

    /* JADX INFO: renamed from: i */
    public static C12572t0 m47122i(C12572t0 c12572t0, String str) {
        C38780a6 c38780a6;
        if (str != null) {
            C38780a6 c38780a7 = c12572t0.f42935w.f167021R;
            c38780a6 = c38780a7 != null ? new C38780a6(str, c38780a7.f166917x) : new C38780a6(str, null);
        } else {
            c38780a6 = c12572t0.f42935w.f167021R;
        }
        return C12572t0.m35252b(c12572t0, C38809d5.m124340f(c12572t0.f42935w, c38780a6, null, 4063231), null, 46);
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: a */
    public final void mo35206a(Object obj, Object obj2, InterfaceC12555l interfaceC12555l, C12553k confirmationArgs) {
        C12572t0 confirmationOption = (C12572t0) interfaceC12555l;
        AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
        AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
        ((AbstractC21065d) obj).mo4052a((C12434c) obj2, null);
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: b */
    public final InterfaceC12555l mo35207b(InterfaceC12555l confirmationOption) {
        AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
        if (confirmationOption instanceof C12572t0) {
            return (C12572t0) confirmationOption;
        }
        return null;
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: c */
    public final boolean mo35208c(InterfaceC12555l interfaceC12555l, C12553k confirmationArgs) {
        C12572t0 c12572t0 = (C12572t0) interfaceC12555l;
        AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
        return (confirmationArgs.f42878x.f150985b0 == null || !AbstractC22676k.m65745e(c12572t0.f42935w.f167026w, "card") || c12572t0.f42933E) ? false : true;
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: d */
    public final void mo35209d(C35459c0 paymentMethodMetadata) {
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        C38797c3 c38797c3 = paymentMethodMetadata.f150985b0;
        if (c38797c3 == null) {
            return;
        }
        String publishableKey = (String) this.f63878c.invoke();
        C2151y c2151y = this.f63877b;
        c2151y.getClass();
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        Set productUsage = this.f63879d;
        AbstractC22676k.m65750j(productUsage, "productUsage");
        AbstractC21065d abstractC21065d = c2151y.f8558a;
        if (abstractC21065d != null) {
            abstractC21065d.mo4052a(new C14860e(c38797c3, publishableKey, productUsage), null);
        }
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: e */
    public final Object mo35210e(InterfaceC12555l interfaceC12555l, C12553k c12553k, C12548h0 c12548h0) {
        C38797c3 c38797c3 = c12553k.f42878x.f150985b0;
        if (c38797c3 != null) {
            return new C12537c(new C12434c(c38797c3, (String) this.f63878c.invoke(), this.f63879d), false, null);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Passive challenge params are null");
        EnumC2325e enumC2325e = EnumC2325e.INTENT_CONFIRMATION_HANDLER_PASSIVE_CHALLENGE_PARAMS_NULL;
        int i13 = StripeException.f22154E;
        AbstractC35903f.m113990H(this.f63876a, enumC2325e, AbstractC32123d.m100024d(illegalArgumentException), null, 4);
        return new C12535b(illegalArgumentException, AbstractC32128i.m100055i("Passive challenge params are null"), C12567r.f42912a);
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: f */
    public final InterfaceC12549i mo35211f(InterfaceC12555l interfaceC12555l, C12553k confirmationArgs, EnumC26121c0 enumC26121c0, Parcelable parcelable) {
        C12572t0 confirmationOption = (C12572t0) interfaceC12555l;
        InterfaceC12437f result = (InterfaceC12437f) parcelable;
        AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
        AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
        AbstractC22676k.m65750j(result, "result");
        if (result instanceof C12435d) {
            return new C12545g(m47122i(confirmationOption, null), confirmationArgs);
        }
        if (result instanceof C12436e) {
            return new C12545g(m47122i(confirmationOption, ((C12436e) result).f42369w), confirmationArgs);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: g */
    public final Object mo35212g(InterfaceC21064c activityResultCaller, C9790n c9790n) {
        AbstractC22676k.m65750j(activityResultCaller, "activityResultCaller");
        C2151y c2151y = this.f63877b;
        c2151y.getClass();
        PassiveChallengeWarmerContract passiveChallengeWarmerContract = new PassiveChallengeWarmerContract();
        AbstractC21065d abstractC21065d = c2151y.f8558a;
        if (abstractC21065d != null) {
            abstractC21065d.mo4053b();
        }
        c2151y.f8558a = activityResultCaller.registerForActivityResult(passiveChallengeWarmerContract, new C13733a(0));
        return activityResultCaller.registerForActivityResult(new PassiveChallengeActivityContract(), new C13999a(c9790n, 2));
    }

    @Override // e10.InterfaceC12551j
    public final String getKey() {
        return "ChallengePassive";
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: h */
    public final void mo35213h(Object obj) {
        AbstractC21065d launcher = (AbstractC21065d) obj;
        AbstractC22676k.m65750j(launcher, "launcher");
        C2151y c2151y = this.f63877b;
        AbstractC21065d abstractC21065d = c2151y.f8558a;
        if (abstractC21065d != null) {
            abstractC21065d.mo4053b();
        }
        c2151y.f8558a = null;
    }
}
