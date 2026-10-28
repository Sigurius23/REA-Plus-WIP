package a63;

import l83.C23454a0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a63.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C0496m extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f1671w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0498o f1672x;

    /* JADX INFO: renamed from: y */
    public int f1673y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0496m(C0498o c0498o, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f1672x = c0498o;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1671w = obj;
        this.f1673y |= Integer.MIN_VALUE;
        C0498o.m1205a(this.f1672x, this);
        return C23454a0.f92919a;
    }
}
