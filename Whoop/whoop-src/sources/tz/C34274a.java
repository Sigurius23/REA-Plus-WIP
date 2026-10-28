package tz;

import android.content.Context;
import b20.C2326f;
import p442qy.C30765d;
import p537ux.C35338j;
import p537ux.EnumC35336i;
import p537ux.InterfaceC35320a;
import p537ux.InterfaceC35322b;
import p715kotlin.jvm.internal.AbstractC22676k;
import sz.C33125d;
import sz.EnumC33131g;

/* JADX INFO: renamed from: tz.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C34274a {

    /* JADX INFO: renamed from: a */
    public final Context f143962a;

    /* JADX INFO: renamed from: b */
    public final C30765d f143963b;

    /* JADX INFO: renamed from: c */
    public final C2326f f143964c;

    public C34274a(Context appContext, C30765d logger, C2326f errorReporter) {
        AbstractC22676k.m65750j(appContext, "appContext");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        this.f143962a = appContext;
        this.f143963b = logger;
        this.f143964c = errorReporter;
    }

    /* JADX INFO: renamed from: a */
    public final C33125d m108532a(EnumC33131g environment, InterfaceC35322b cardFundingFilter, InterfaceC35320a cardBrandFilter) {
        AbstractC22676k.m65750j(environment, "environment");
        AbstractC22676k.m65750j(cardFundingFilter, "cardFundingFilter");
        AbstractC22676k.m65750j(cardBrandFilter, "cardBrandFilter");
        return new C33125d(this.f143962a, environment, new C35338j(false, EnumC35336i.Min, false), true, true, this.f143964c, this.f143963b, cardBrandFilter, cardFundingFilter);
    }
}
