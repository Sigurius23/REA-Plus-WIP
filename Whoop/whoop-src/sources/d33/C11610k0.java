package d33;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: d33.k0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11610k0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f37483E;

    /* JADX INFO: renamed from: w */
    public C11602h1 f37484w;

    /* JADX INFO: renamed from: x */
    public String f37485x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f37486y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C11602h1 f37487z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11610k0(C11602h1 c11602h1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f37487z = c11602h1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f37486y = obj;
        this.f37483E |= Integer.MIN_VALUE;
        return this.f37487z.m31048x(null, this);
    }
}
