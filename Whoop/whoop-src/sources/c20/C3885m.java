package c20;

import s83.AbstractC32269c;
import y00.C38945r7;

/* JADX INFO: renamed from: c20.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C3885m extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C38945r7 f15901w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f15902x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C3886n f15903y;

    /* JADX INFO: renamed from: z */
    public int f15904z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3885m(C3886n c3886n, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f15903y = c3886n;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f15902x = obj;
        this.f15904z |= Integer.MIN_VALUE;
        return this.f15903y.m11859f(null, null, this);
    }
}
