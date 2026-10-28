package p133f1;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: f1.r1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13974r1 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C13977s1 f49832w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f49833x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13977s1 f49834y;

    /* JADX INFO: renamed from: z */
    public int f49835z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13974r1(C13977s1 c13977s1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f49834y = c13977s1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f49833x = obj;
        this.f49835z |= Integer.MIN_VALUE;
        return this.f49834y.m39788r(this);
    }
}
