package t10;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c10.C3831n;
import e10.C12568r0;
import k20.C22136a;
import p236j.InterfaceC21064c;
import p715kotlin.jvm.internal.AbstractC22676k;
import s10.C32064f;
import sz.C33151q;
import v00.C35459c0;

/* JADX INFO: renamed from: t10.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C33284d {

    /* JADX INFO: renamed from: a */
    public final C35459c0 f138811a;

    /* JADX INFO: renamed from: b */
    public final C12568r0 f138812b;

    /* JADX INFO: renamed from: c */
    public final C3831n f138813c;

    /* JADX INFO: renamed from: d */
    public final C32064f f138814d;

    /* JADX INFO: renamed from: e */
    public final C33285e f138815e;

    /* JADX INFO: renamed from: f */
    public final C33300t f138816f;

    /* JADX INFO: renamed from: g */
    public final C22136a f138817g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC2994c0 f138818h;

    public C33284d(C35459c0 paymentMethodMetadata, C12568r0 confirmationHandler, C3831n configuration, C32064f selectionHolder, C33285e stateHelper, C33300t onClickDelegate, C22136a eventReporter, InterfaceC1585g0 lifecycleOwner, InterfaceC21064c activityResultCaller, InterfaceC2994c0 coroutineScope, C33283c formActivityConfirmationHandlerRegistrar) {
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(confirmationHandler, "confirmationHandler");
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(selectionHolder, "selectionHolder");
        AbstractC22676k.m65750j(stateHelper, "stateHelper");
        AbstractC22676k.m65750j(onClickDelegate, "onClickDelegate");
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        AbstractC22676k.m65750j(lifecycleOwner, "lifecycleOwner");
        AbstractC22676k.m65750j(activityResultCaller, "activityResultCaller");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(formActivityConfirmationHandlerRegistrar, "formActivityConfirmationHandlerRegistrar");
        this.f138811a = paymentMethodMetadata;
        this.f138812b = confirmationHandler;
        this.f138813c = configuration;
        this.f138814d = selectionHolder;
        this.f138815e = stateHelper;
        this.f138816f = onClickDelegate;
        this.f138817g = eventReporter;
        this.f138818h = coroutineScope;
        C12568r0 c12568r0 = formActivityConfirmationHandlerRegistrar.f138809a;
        c12568r0.m35250f(activityResultCaller, lifecycleOwner);
        if (!formActivityConfirmationHandlerRegistrar.f138810b) {
            c12568r0.m35247c(paymentMethodMetadata);
            formActivityConfirmationHandlerRegistrar.f138810b = true;
        }
        AbstractC3006f0.m8732z(AbstractC1613o1.m5020j(lifecycleOwner), null, null, new C33151q(this, null, 2), 3);
    }
}
