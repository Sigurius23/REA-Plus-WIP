package a00;

import e10.C12568r0;
import p442qy.C30765d;
import p599wz.C37718g0;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35459c0;

/* JADX INFO: renamed from: a00.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C0074i {

    /* JADX INFO: renamed from: a */
    public final C37718g0 f232a;

    /* JADX INFO: renamed from: b */
    public final C35459c0 f233b;

    /* JADX INFO: renamed from: c */
    public final C30765d f234c;

    public C0074i(C37718g0 configuration, C35459c0 paymentMethodMetadata, C30765d logger) {
        AbstractC22676k.m65750j(configuration, "configuration");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(logger, "logger");
        this.f232a = configuration;
        this.f233b = paymentMethodMetadata;
        this.f234c = logger;
    }

    /* JADX INFO: renamed from: a */
    public final C0072g m208a(C12568r0 confirmationHandler) {
        AbstractC22676k.m65750j(confirmationHandler, "confirmationHandler");
        return new C0072g(this.f232a, this.f233b, this.f234c, confirmationHandler);
    }
}
