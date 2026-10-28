package t23;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: t23.v3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33468v3 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C33366b4 f139740w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f139741x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C33366b4 f139742y;

    /* JADX INFO: renamed from: z */
    public int f139743z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33468v3(C33366b4 c33366b4, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f139742y = c33366b4;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f139741x = obj;
        this.f139743z |= Integer.MIN_VALUE;
        return this.f139742y.m105803u(null, null, 0, false, this);
    }
}
