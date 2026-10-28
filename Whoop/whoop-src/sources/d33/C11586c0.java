package d33;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: d33.c0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11586c0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C11602h1 f37370w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f37371x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11602h1 f37372y;

    /* JADX INFO: renamed from: z */
    public int f37373z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11586c0(C11602h1 c11602h1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f37372y = c11602h1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f37371x = obj;
        this.f37373z |= Integer.MIN_VALUE;
        return this.f37372y.m31040p(null, this);
    }
}
