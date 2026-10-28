package oa3;

import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: oa3.s */
/* JADX INFO: loaded from: classes3.dex */
public final class C27776s implements Function1 {

    /* JADX INFO: renamed from: w */
    public static final C27776s f111973w = new C27776s();

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String it = (String) obj;
        AbstractC22676k.m65750j(it, "it");
        return it.length() > 1 ? AbstractC31061c.m95633i(';', "L", it) : it;
    }
}
