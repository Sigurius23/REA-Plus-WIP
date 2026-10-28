package bm;

import e93.AbstractC12889b;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;
import x03.C37805b;

/* JADX INFO: renamed from: bm.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C3388l extends AbstractC22680m implements Function3 {

    /* JADX INFO: renamed from: w */
    public static final C3388l f13236w = new C3388l(3);

    @Override // p715kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        C37805b layoutInfo = (C37805b) obj;
        int iIntValue = ((Number) obj2).intValue();
        int iIntValue2 = ((Number) obj3).intValue();
        AbstractC22676k.m65750j(layoutInfo, "layoutInfo");
        return Integer.valueOf(AbstractC12889b.m36284n(AbstractC12889b.m36284n(iIntValue2, iIntValue - 1, iIntValue + 1), 0, layoutInfo.f161917a.m77565h().f103180n - 1));
    }
}
