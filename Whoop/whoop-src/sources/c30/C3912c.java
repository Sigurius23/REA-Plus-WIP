package c30;

import a40.InterfaceC0356a;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import l83.InterfaceC23459e;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.InterfaceC22666f;

/* JADX INFO: renamed from: c30.c */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C3912c implements InterfaceC0356a, InterfaceC22666f {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Function1 f15997w;

    public C3912c(Function1 function) {
        AbstractC22676k.m65750j(function, "function");
        this.f15997w = function;
    }

    @Override // a40.InterfaceC0356a
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void mo991a() {
        this.f15997w.invoke(PaymentAnalyticsEvent.CardMetadataExpectedExtraDigitsButUserEntered16ThenSwitchedFields);
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof InterfaceC0356a) && (obj instanceof InterfaceC22666f)) {
            return AbstractC22676k.m65745e(getFunctionDelegate(), ((InterfaceC22666f) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // p715kotlin.jvm.internal.InterfaceC22666f
    public final InterfaceC23459e getFunctionDelegate() {
        return this.f15997w;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
