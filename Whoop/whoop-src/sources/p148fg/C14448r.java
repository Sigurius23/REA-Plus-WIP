package p148fg;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: fg.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C14448r extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f52729w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14451u f52730x;

    /* JADX INFO: renamed from: y */
    public int f52731y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14448r(C14451u c14451u, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f52730x = c14451u;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f52729w = obj;
        this.f52731y |= Integer.MIN_VALUE;
        return this.f52730x.m41171b(this);
    }
}
