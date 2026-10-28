package q00;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: q00.o0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29732o0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C29734p0 f121592w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f121593x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C29734p0 f121594y;

    /* JADX INFO: renamed from: z */
    public int f121595z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29732o0(C29734p0 c29734p0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f121594y = c29734p0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f121593x = obj;
        this.f121595z |= Integer.MIN_VALUE;
        return this.f121594y.m91184q(null, this);
    }
}
