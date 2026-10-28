package d33;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: d33.d0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11589d0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f37384w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11602h1 f37385x;

    /* JADX INFO: renamed from: y */
    public int f37386y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11589d0(C11602h1 c11602h1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f37385x = c11602h1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f37384w = obj;
        this.f37386y |= Integer.MIN_VALUE;
        return this.f37385x.m31042r(null, this);
    }
}
