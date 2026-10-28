package de;

import aws.sdk.kotlin.runtime.ConfigurationException;
import com.whoop.membership.familyPlan.navigation.C9114b;
import eg.C13162k;
import l83.C23454a0;
import p031b9.AbstractC2875y;
import p114eb.C12999y0;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: de.a */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C11978a implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f39322w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Integer f39323x;

    public /* synthetic */ C11978a(int i13, Integer num) {
        this.f39322w = i13;
        this.f39323x = num;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f39322w) {
            case 0:
                C13162k factory = (C13162k) obj;
                AbstractC22676k.m65750j(factory, "$this$factory");
                Integer num = this.f39323x;
                if (num != null) {
                    int iIntValue = num.intValue();
                    if (iIntValue < 1) {
                        throw new ConfigurationException(AbstractC2875y.m8296i(iIntValue, "max attempts was ", ", but should be at least 1"));
                    }
                    factory.f45589b = iIntValue;
                }
                return C23454a0.f92919a;
            default:
                return C9114b.m22749e(this.f39323x, (C12999y0) obj);
        }
    }
}
