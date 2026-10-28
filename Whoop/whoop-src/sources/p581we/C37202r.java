package p581we;

import p014aj.C0928c;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: we.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C37202r extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f159044w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0928c f159045x;

    /* JADX INFO: renamed from: y */
    public int f159046y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37202r(C0928c c0928c, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f159045x = c0928c;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f159044w = obj;
        this.f159046y |= Integer.MIN_VALUE;
        return this.f159045x.m2331u(null, this);
    }
}
