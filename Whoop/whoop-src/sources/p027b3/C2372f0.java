package p027b3;

import dc3.C11918c;
import p002a0.C0026h0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b3.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class C2372f0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f9354E;

    /* JADX INFO: renamed from: w */
    public C0026h0 f9355w;

    /* JADX INFO: renamed from: x */
    public C11918c f9356x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f9357y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C2382h0 f9358z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2372f0(C2382h0 c2382h0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f9358z = c2382h0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f9357y = obj;
        this.f9354E |= Integer.MIN_VALUE;
        return this.f9358z.m7377l(this);
    }
}
