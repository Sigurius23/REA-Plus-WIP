package p579wc;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37125w0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public String f158825w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f158826x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37127x0 f158827y;

    /* JADX INFO: renamed from: z */
    public int f158828z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37125w0(C37127x0 c37127x0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158827y = c37127x0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158826x = obj;
        this.f158828z |= Integer.MIN_VALUE;
        return this.f158827y.m119043e(null, this);
    }
}
