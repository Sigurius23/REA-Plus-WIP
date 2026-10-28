package bi;

import ne3.C26616h;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: bi.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C3275m extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f12786E;

    /* JADX INFO: renamed from: w */
    public C3277o f12787w;

    /* JADX INFO: renamed from: x */
    public C26616h f12788x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f12789y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C3277o f12790z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3275m(C3277o c3277o, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f12790z = c3277o;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f12789y = obj;
        this.f12786E |= Integer.MIN_VALUE;
        return C3277o.m9537b(this.f12790z, null, this);
    }
}
