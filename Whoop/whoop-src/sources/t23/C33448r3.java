package t23;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: t23.r3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33448r3 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C33366b4 f139605w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f139606x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C33366b4 f139607y;

    /* JADX INFO: renamed from: z */
    public int f139608z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33448r3(C33366b4 c33366b4, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f139607y = c33366b4;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f139606x = obj;
        this.f139608z |= Integer.MIN_VALUE;
        return this.f139607y.m105798p(this);
    }
}
