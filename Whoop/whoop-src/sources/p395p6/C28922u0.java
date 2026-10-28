package p395p6;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: p6.u0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C28922u0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f117032w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C28925v0 f117033x;

    /* JADX INFO: renamed from: y */
    public int f117034y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28922u0(C28925v0 c28925v0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f117033x = c28925v0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f117032w = obj;
        this.f117034y |= Integer.MIN_VALUE;
        return C28925v0.m87836a(this.f117033x, null, this);
    }
}
