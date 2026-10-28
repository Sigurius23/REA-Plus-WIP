package p579wc;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.b0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37072b0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C37126x f158599w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f158600x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37084f0 f158601y;

    /* JADX INFO: renamed from: z */
    public int f158602z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37072b0(C37084f0 c37084f0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158601y = c37084f0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158600x = obj;
        this.f158602z |= Integer.MIN_VALUE;
        return C37084f0.m119008a(this.f158601y, this);
    }
}
