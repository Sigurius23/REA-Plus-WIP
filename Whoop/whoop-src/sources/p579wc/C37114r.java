package p579wc;

import mc3.C25437c;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: wc.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C37114r extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C25437c f158781w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f158782x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37116s f158783y;

    /* JADX INFO: renamed from: z */
    public int f158784z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37114r(C37116s c37116s, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f158783y = c37116s;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f158782x = obj;
        this.f158784z |= Integer.MIN_VALUE;
        return this.f158783y.m119032i(null, this);
    }
}
