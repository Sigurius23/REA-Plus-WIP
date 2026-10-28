package p664yy;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: yy.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C39869l extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f172168E;

    /* JADX INFO: renamed from: w */
    public Object f172169w;

    /* JADX INFO: renamed from: x */
    public Object f172170x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f172171y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C39873n f172172z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39869l(C39873n c39873n, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f172172z = c39873n;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f172171y = obj;
        this.f172168E |= Integer.MIN_VALUE;
        return this.f172172z.m127941b(null, this);
    }
}
