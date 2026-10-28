package p148fg;

import mc3.C25437c;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: fg.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C14450t extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f52737E;

    /* JADX INFO: renamed from: w */
    public int f52738w;

    /* JADX INFO: renamed from: x */
    public C25437c f52739x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f52740y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C14451u f52741z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14450t(C14451u c14451u, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f52741z = c14451u;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f52740y = obj;
        this.f52737E |= Integer.MIN_VALUE;
        return C14451u.m41170a(this.f52741z, 0, this);
    }
}
