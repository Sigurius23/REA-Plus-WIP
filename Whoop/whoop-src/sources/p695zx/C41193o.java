package p695zx;

import android.content.Context;
import b10.C2222b;
import b10.C2224b1;
import b10.EnumC2228d;
import b10.InterfaceC2227c1;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import java.util.Set;
import l83.C23470p;
import p664yy.C39850b0;
import p664yy.C39865j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: renamed from: zx.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C41193o {

    /* JADX INFO: renamed from: a */
    public final Set f177718a;

    /* JADX INFO: renamed from: b */
    public final EnumC2228d f177719b;

    /* JADX INFO: renamed from: c */
    public final C39865j f177720c;

    /* JADX INFO: renamed from: d */
    public final Context f177721d;

    /* JADX INFO: renamed from: e */
    public final C23470p f177722e;

    public C41193o(Context context, Set productUsageTokens, EnumC2228d requestSurface, C39865j analyticsRequestExecutor) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(productUsageTokens, "productUsageTokens");
        AbstractC22676k.m65750j(requestSurface, "requestSurface");
        AbstractC22676k.m65750j(analyticsRequestExecutor, "analyticsRequestExecutor");
        this.f177718a = productUsageTokens;
        this.f177719b = requestSurface;
        this.f177720c = analyticsRequestExecutor;
        this.f177721d = context.getApplicationContext();
        this.f177722e = AbstractC30060g.m92088H(new C39850b0(this, 11));
    }

    /* JADX INFO: renamed from: a */
    public final void m133832a(PaymentAnalyticsEvent paymentAnalyticsEvent, String str) {
        Context appContext = this.f177721d;
        AbstractC22676k.m65749i(appContext, "appContext");
        this.f177720c.m127938a(C2222b.m7051c(new C2222b(appContext, this.f177718a, str), paymentAnalyticsEvent, null, null, null, null, 62));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C41193o(Context context, Set productUsageTokens) {
        this(context, productUsageTokens, C2224b1.f8860b, new C39865j());
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(productUsageTokens, "productUsageTokens");
        InterfaceC2227c1.f8867a.getClass();
    }
}
