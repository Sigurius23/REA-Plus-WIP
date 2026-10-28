package d33;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: d33.o0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11619o0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C11602h1 f37511w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f37512x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11602h1 f37513y;

    /* JADX INFO: renamed from: z */
    public int f37514z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11619o0(C11602h1 c11602h1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f37513y = c11602h1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f37512x = obj;
        this.f37514z |= Integer.MIN_VALUE;
        return this.f37513y.m31050z(this);
    }
}
