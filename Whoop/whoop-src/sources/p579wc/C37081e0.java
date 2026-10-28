package p579wc;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37081e0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public String f158632w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f158633x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37084f0 f158634y;

    /* JADX INFO: renamed from: z */
    public int f158635z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37081e0(C37084f0 c37084f0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158634y = c37084f0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158633x = obj;
        this.f158635z |= Integer.MIN_VALUE;
        return this.f158634y.m119012f(null, this);
    }
}
