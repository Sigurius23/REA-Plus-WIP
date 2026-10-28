package t23;

import c93.InterfaceC4351m;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: t23.o0 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C33430o0 extends C22672i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public static final C33430o0 f139565w = new C33430o0(2, Integer.TYPE, "plus", "plus(I)I", 0);

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(((Number) obj2).intValue() + ((Number) obj).intValue());
    }
}
