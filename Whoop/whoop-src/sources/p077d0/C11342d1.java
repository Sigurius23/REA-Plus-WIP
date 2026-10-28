package p077d0;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: d0.d1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11342d1 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public Object f36335w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f36336x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11350f1 f36337y;

    /* JADX INFO: renamed from: z */
    public int f36338z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11342d1(C11350f1 c11350f1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f36337y = c11350f1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f36336x = obj;
        this.f36338z |= Integer.MIN_VALUE;
        return C11350f1.m30579J0(this.f36337y, this);
    }
}
