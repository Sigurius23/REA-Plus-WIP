package j20;

import p664yy.AbstractC39851c;
import p664yy.C39865j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;

/* JADX INFO: renamed from: j20.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C21241c {

    /* JADX INFO: renamed from: a */
    public final C39865j f81098a;

    /* JADX INFO: renamed from: b */
    public final AbstractC39851c f81099b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC30063j f81100c;

    public C21241c(C39865j analyticsRequestExecutor, AbstractC39851c analyticsRequestFactory, InterfaceC30063j workContext) {
        AbstractC22676k.m65750j(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC22676k.m65750j(analyticsRequestFactory, "analyticsRequestFactory");
        AbstractC22676k.m65750j(workContext, "workContext");
        this.f81098a = analyticsRequestExecutor;
        this.f81099b = analyticsRequestFactory;
        this.f81100c = workContext;
    }
}
