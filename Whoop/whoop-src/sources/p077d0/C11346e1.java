package p077d0;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: d0.e1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11346e1 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public Object f36352w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f36353x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C11350f1 f36354y;

    /* JADX INFO: renamed from: z */
    public int f36355z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11346e1(C11350f1 c11350f1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f36354y = c11350f1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f36353x = obj;
        this.f36355z |= Integer.MIN_VALUE;
        return C11350f1.m30580K0(this.f36354y, this);
    }
}
