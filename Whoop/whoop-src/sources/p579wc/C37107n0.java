package p579wc;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37107n0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f158736w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C37111p0 f158737x;

    /* JADX INFO: renamed from: y */
    public int f158738y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37107n0(C37111p0 c37111p0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158737x = c37111p0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158736w = obj;
        this.f158738y |= Integer.MIN_VALUE;
        return this.f158737x.m119030a(this);
    }
}
