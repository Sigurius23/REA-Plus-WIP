package p631xz;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C38720f extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f166660w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38747x f166661x;

    /* JADX INFO: renamed from: y */
    public int f166662y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38720f(C38747x c38747x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166661x = c38747x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166660w = obj;
        this.f166662y |= Integer.MIN_VALUE;
        return this.f166661x.m124155f(null, false, this);
    }
}
