package f10;

import a20.C0162b;
import android.os.Parcelable;
import b20.C2326f;
import b20.EnumC2325e;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4339a;
import com.stripe.android.attestation.AttestationActivityContract;
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
import java.util.Set;
import n10.EnumC26121c0;
import p236j.AbstractC21065d;
import p236j.InterfaceC21064c;
import p479s4.AbstractC32123d;
import p479s4.AbstractC32128i;
import p550vd.AbstractC35903f;
import p597wx.C37673b;
import p597wx.C37674c;
import p597wx.C37675d;
import p597wx.InterfaceC37676e;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import q83.InterfaceC30063j;
import t40.C33536f;
import v00.C35459c0;
import y00.C38780a6;
import y00.C38803d;
import y00.C38809d5;

/* JADX INFO: renamed from: f10.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C14000b implements InterfaceC12551j {

    /* JADX INFO: renamed from: a */
    public final C2326f f49951a;

    /* JADX INFO: renamed from: b */
    public final C33536f f49952b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC2994c0 f49953c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC30063j f49954d;

    /* JADX INFO: renamed from: e */
    public final C29938w0 f49955e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4339a f49956f;

    /* JADX INFO: renamed from: g */
    public final Set f49957g;

    public C14000b(C2326f errorReporter, C33536f integrityRequestManager, InterfaceC2994c0 coroutineScope, InterfaceC30063j workContext, C29938w0 attestationAnalyticsEventsReporter, InterfaceC4339a publishableKeyProvider, Set productUsage) {
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(integrityRequestManager, "integrityRequestManager");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(workContext, "workContext");
        AbstractC22676k.m65750j(attestationAnalyticsEventsReporter, "attestationAnalyticsEventsReporter");
        AbstractC22676k.m65750j(publishableKeyProvider, "publishableKeyProvider");
        AbstractC22676k.m65750j(productUsage, "productUsage");
        this.f49951a = errorReporter;
        this.f49952b = integrityRequestManager;
        this.f49953c = coroutineScope;
        this.f49954d = workContext;
        this.f49955e = attestationAnalyticsEventsReporter;
        this.f49956f = publishableKeyProvider;
        this.f49957g = productUsage;
    }

    /* JADX INFO: renamed from: i */
    public static C12572t0 m39838i(C12572t0 c12572t0, String str) {
        C38780a6 c38780a6;
        if (str != null) {
            C38780a6 c38780a7 = c12572t0.f42935w.f167021R;
            if (c38780a7 != null) {
                c38780a6 = new C38780a6(c38780a7.f166916w, new C38803d(str));
            } else {
                c38780a6 = new C38780a6(null, new C38803d(str));
            }
        } else {
            c38780a6 = c12572t0.f42935w.f167021R;
        }
        return C12572t0.m35252b(c12572t0, C38809d5.m124340f(c12572t0.f42935w, c38780a6, null, 4063231), null, 30);
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: a */
    public final void mo35206a(Object obj, Object obj2, InterfaceC12555l interfaceC12555l, C12553k confirmationArgs) {
        C12572t0 confirmationOption = (C12572t0) interfaceC12555l;
        AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
        AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
        ((AbstractC21065d) obj).mo4052a((C37673b) obj2, null);
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
        C38803d c38803d;
        C12572t0 c12572t0 = (C12572t0) interfaceC12555l;
        AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
        C38809d5 c38809d5 = c12572t0.f42935w;
        if (!AbstractC22676k.m65745e(c38809d5.f167026w, "card") || !confirmationArgs.f42878x.f150988e0 || c12572t0.f42934F) {
            return false;
        }
        C38780a6 c38780a6 = c38809d5.f167021R;
        return ((c38780a6 == null || (c38803d = c38780a6.f166917x) == null) ? null : c38803d.f166993w) == null;
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: d */
    public final void mo35209d(C35459c0 paymentMethodMetadata) {
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        if (paymentMethodMetadata.f150988e0) {
            AbstractC3006f0.m8732z(this.f49953c, this.f49954d, null, new C0162b(this, null, 19), 2);
        }
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: e */
    public final Object mo35210e(InterfaceC12555l interfaceC12555l, C12553k c12553k, C12548h0 c12548h0) {
        if (c12553k.f42878x.f150988e0) {
            return new C12537c(new C37673b((String) this.f49956f.invoke(), this.f49957g), false, null);
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Attestation is not enabled on intent confirmation");
        EnumC2325e enumC2325e = EnumC2325e.INTENT_CONFIRMATION_HANDLER_ATTESTATION_INVOKED_WHEN_DISABLED;
        int i13 = StripeException.f22154E;
        AbstractC35903f.m113990H(this.f49951a, enumC2325e, AbstractC32123d.m100024d(illegalArgumentException), null, 4);
        return new C12535b(illegalArgumentException, AbstractC32128i.m100055i("Attestation is not enabled on intent confirmation"), C12567r.f42912a);
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: f */
    public final InterfaceC12549i mo35211f(InterfaceC12555l interfaceC12555l, C12553k confirmationArgs, EnumC26121c0 enumC26121c0, Parcelable parcelable) {
        C12572t0 confirmationOption = (C12572t0) interfaceC12555l;
        InterfaceC37676e result = (InterfaceC37676e) parcelable;
        AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
        AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
        AbstractC22676k.m65750j(result, "result");
        if (result instanceof C37674c) {
            return new C12545g(m39838i(confirmationOption, null), confirmationArgs);
        }
        if (result instanceof C37675d) {
            return new C12545g(m39838i(confirmationOption, ((C37675d) result).f161428w), confirmationArgs);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: g */
    public final Object mo35212g(InterfaceC21064c activityResultCaller, C9790n c9790n) {
        AbstractC22676k.m65750j(activityResultCaller, "activityResultCaller");
        return activityResultCaller.registerForActivityResult(new AttestationActivityContract(), new C13999a(c9790n, 0));
    }

    @Override // e10.InterfaceC12551j
    public final String getKey() {
        return "Attestation";
    }

    @Override // e10.InterfaceC12551j
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo35213h(Object obj) {
    }
}
