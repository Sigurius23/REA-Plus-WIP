package p597wx;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: wx.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C37680i extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f161434E;

    /* JADX INFO: renamed from: w */
    public Object f161435w;

    /* JADX INFO: renamed from: x */
    public Object f161436x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f161437y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C37681j f161438z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37680i(C37681j c37681j, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f161438z = c37681j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f161437y = obj;
        this.f161434E |= Integer.MIN_VALUE;
        return C37681j.m121101g(this.f161438z, this);
    }
}
