package p605x6;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: x6.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C38004i extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f162798w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38006k f162799x;

    /* JADX INFO: renamed from: y */
    public int f162800y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38004i(C38006k c38006k, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f162799x = c38006k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f162798w = obj;
        this.f162800y |= Integer.MIN_VALUE;
        return this.f162799x.m121740b(null, this);
    }
}
