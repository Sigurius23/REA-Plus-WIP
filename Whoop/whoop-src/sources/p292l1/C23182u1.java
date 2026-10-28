package p292l1;

import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: l1.u1 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C23182u1 extends C22672i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public static final C23182u1 f91703w = new C23182u1(2, AbstractC12889b.class, "min", "min(II)I", 1);

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
