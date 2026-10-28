package p132f0;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: f0.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C13792i extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public long f49215w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f49216x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13798k f49217y;

    /* JADX INFO: renamed from: z */
    public int f49218z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13792i(C13798k c13798k, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f49217y = c13798k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f49216x = obj;
        this.f49218z |= Integer.MIN_VALUE;
        return this.f49217y.m39162b(0L, null, this);
    }
}
