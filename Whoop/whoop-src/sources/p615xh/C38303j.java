package p615xh;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: xh.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C38303j extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f164148E;

    /* JADX INFO: renamed from: w */
    public C38304k f164149w;

    /* JADX INFO: renamed from: x */
    public InterfaceC38302i f164150x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f164151y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C38304k f164152z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38303j(C38304k c38304k, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f164152z = c38304k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f164151y = obj;
        this.f164148E |= Integer.MIN_VALUE;
        return this.f164152z.m122695c(this);
    }
}
