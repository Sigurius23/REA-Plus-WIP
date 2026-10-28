package p133f1;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: f1.q1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13971q1 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f49812w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13977s1 f49813x;

    /* JADX INFO: renamed from: y */
    public int f49814y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13971q1(C13977s1 c13977s1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f49813x = c13977s1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f49812w = obj;
        this.f49814y |= Integer.MIN_VALUE;
        return C13977s1.m39772b(this.f49813x, this);
    }
}
