package p343nk;

import bd3.C3143v;
import j43.C21317a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: nk.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C26789j extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f106704E;

    /* JADX INFO: renamed from: w */
    public C3143v f106705w;

    /* JADX INFO: renamed from: x */
    public C21317a f106706x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f106707y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C3143v f106708z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26789j(C3143v c3143v, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f106708z = c3143v;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f106707y = obj;
        this.f106704E |= Integer.MIN_VALUE;
        return this.f106708z.m9032a(null, this);
    }
}
