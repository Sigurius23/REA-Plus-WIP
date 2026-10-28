package h40;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: h40.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C16843i extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C16845k f64721w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f64722x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C16845k f64723y;

    /* JADX INFO: renamed from: z */
    public int f64724z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16843i(C16845k c16845k, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f64723y = c16845k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f64722x = obj;
        this.f64724z |= Integer.MIN_VALUE;
        return this.f64723y.m47442b(this);
    }
}
