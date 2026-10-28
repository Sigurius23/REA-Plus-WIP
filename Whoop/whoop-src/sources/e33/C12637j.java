package e33;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: e33.j */
/* JADX INFO: loaded from: classes3.dex */
public final class C12637j extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f43148w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12645n f43149x;

    /* JADX INFO: renamed from: y */
    public int f43150y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12637j(C12645n c12645n, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43149x = c12645n;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43148w = obj;
        this.f43150y |= Integer.MIN_VALUE;
        return this.f43149x.m35406v(null, null, null, this);
    }
}
