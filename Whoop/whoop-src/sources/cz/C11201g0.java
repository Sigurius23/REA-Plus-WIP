package cz;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: cz.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11201g0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C11215n0 f35925w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f35926x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11215n0 f35927y;

    /* JADX INFO: renamed from: z */
    public int f35928z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11201g0(C11215n0 c11215n0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f35927y = c11215n0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f35926x = obj;
        this.f35928z |= Integer.MIN_VALUE;
        return C11215n0.m30335g(this.f35927y, this);
    }
}
