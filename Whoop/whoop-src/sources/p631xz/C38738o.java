package p631xz;

import d00.C11433l;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C38738o extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C11433l f166705w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f166706x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C38747x f166707y;

    /* JADX INFO: renamed from: z */
    public int f166708z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38738o(C38747x c38747x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166707y = c38747x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166706x = obj;
        this.f166708z |= Integer.MIN_VALUE;
        return this.f166707y.m124164o(null, null, null, null, this);
    }
}
