package d33;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: d33.g1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11599g1 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f37414w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11602h1 f37415x;

    /* JADX INFO: renamed from: y */
    public int f37416y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11599g1(C11602h1 c11602h1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f37415x = c11602h1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f37414w = obj;
        this.f37416y |= Integer.MIN_VALUE;
        return C11602h1.m31022h(this.f37415x, null, this);
    }
}
