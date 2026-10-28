package z53;

import e63.C12776e;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: z53.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C40112d extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f173138E;

    /* JADX INFO: renamed from: w */
    public C40115g f173139w;

    /* JADX INFO: renamed from: x */
    public C12776e f173140x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f173141y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C40115g f173142z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C40112d(C40115g c40115g, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f173142z = c40115g;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f173141y = obj;
        this.f173138E |= Integer.MIN_VALUE;
        return this.f173142z.m128659b(null, this);
    }
}
