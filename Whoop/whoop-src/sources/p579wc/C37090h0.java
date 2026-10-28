package p579wc;

import gm.C15990r;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.h0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C37090h0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C15990r f158671w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f158672x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37093i0 f158673y;

    /* JADX INFO: renamed from: z */
    public int f158674z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37090h0(C37093i0 c37093i0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158673y = c37093i0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158672x = obj;
        this.f158674z |= Integer.MIN_VALUE;
        return this.f158673y.mo79294b(null, this);
    }
}
