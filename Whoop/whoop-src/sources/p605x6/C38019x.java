package p605x6;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: x6.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C38019x extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f162851w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38014s f162852x;

    /* JADX INFO: renamed from: y */
    public int f162853y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38019x(C38014s c38014s, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f162852x = c38014s;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f162851w = obj;
        this.f162853y |= Integer.MIN_VALUE;
        return this.f162852x.m121745a(null, null, this);
    }
}
