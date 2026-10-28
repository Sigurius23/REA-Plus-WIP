package p635y2;

import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: y2.c */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C39079c extends C22672i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public static final C39079c f168135w = new C39079c(2, AbstractC12889b.class, "max", "max(II)I", 1);

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.max(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
