package h30;

import h20.C16661g3;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.C35459c0;

/* JADX INFO: renamed from: h30.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C16800e {

    /* JADX INFO: renamed from: a */
    public final C35459c0 f64560a;

    /* JADX INFO: renamed from: b */
    public final C16661g3 f64561b;

    /* JADX INFO: renamed from: c */
    public final String f64562c;

    /* JADX INFO: renamed from: d */
    public final String f64563d;

    public C16800e(C35459c0 paymentMethodMetadata, C16661g3 shopPayConfiguration, String customerSessionClientSecret, String businessName) {
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(shopPayConfiguration, "shopPayConfiguration");
        AbstractC22676k.m65750j(customerSessionClientSecret, "customerSessionClientSecret");
        AbstractC22676k.m65750j(businessName, "businessName");
        this.f64560a = paymentMethodMetadata;
        this.f64561b = shopPayConfiguration;
        this.f64562c = customerSessionClientSecret;
        this.f64563d = businessName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16800e)) {
            return false;
        }
        C16800e c16800e = (C16800e) obj;
        return AbstractC22676k.m65745e(this.f64560a, c16800e.f64560a) && AbstractC22676k.m65745e(this.f64561b, c16800e.f64561b) && AbstractC22676k.m65745e(this.f64562c, c16800e.f64562c) && AbstractC22676k.m65745e(this.f64563d, c16800e.f64563d);
    }

    public final int hashCode() {
        return this.f64563d.hashCode() + AbstractC11266d.m30450d((this.f64561b.hashCode() + (this.f64560a.hashCode() * 31)) * 31, 31, this.f64562c);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Args(paymentMethodMetadata=");
        sb4.append(this.f64560a);
        sb4.append(", shopPayConfiguration=");
        sb4.append(this.f64561b);
        sb4.append(", customerSessionClientSecret=");
        return AbstractC11266d.m30464r(sb4, this.f64562c, ", businessName=", this.f64563d, ")");
    }
}
