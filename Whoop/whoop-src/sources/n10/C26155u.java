package n10;

import b20.C2326f;
import k83.InterfaceC22297a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: n10.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C26155u extends AbstractC26118b {

    /* JADX INFO: renamed from: c */
    public final InterfaceC22297a f103618c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC22297a f103619d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC22297a f103620e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26155u(InterfaceC22297a intentCreationCallbackProvider, InterfaceC22297a intentCreateIntentWithConfirmationTokenCallback, InterfaceC22297a preparePaymentMethodHandlerProvider, C2326f errorReporter, InterfaceC22297a requestOptionsProvider) {
        super(errorReporter, requestOptionsProvider);
        AbstractC22676k.m65750j(intentCreationCallbackProvider, "intentCreationCallbackProvider");
        AbstractC22676k.m65750j(intentCreateIntentWithConfirmationTokenCallback, "intentCreateIntentWithConfirmationTokenCallback");
        AbstractC22676k.m65750j(preparePaymentMethodHandlerProvider, "preparePaymentMethodHandlerProvider");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(requestOptionsProvider, "requestOptionsProvider");
        this.f103618c = intentCreationCallbackProvider;
        this.f103619d = intentCreateIntentWithConfirmationTokenCallback;
        this.f103620e = preparePaymentMethodHandlerProvider;
    }
}
