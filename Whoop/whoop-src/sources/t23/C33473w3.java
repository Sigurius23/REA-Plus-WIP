package t23;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: t23.w3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33473w3 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C33366b4 f139747w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f139748x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C33366b4 f139749y;

    /* JADX INFO: renamed from: z */
    public int f139750z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33473w3(C33366b4 c33366b4, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f139749y = c33366b4;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f139748x = obj;
        this.f139750z |= Integer.MIN_VALUE;
        return C33366b4.m105793k(this.f139749y, this);
    }
}
