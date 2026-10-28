package androidx.room;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: androidx.room.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1822q1 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public int f7163w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f7164x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1780e1 f7165y;

    /* JADX INFO: renamed from: z */
    public int f7166z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1822q1(C1780e1 c1780e1, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f7165y = c1780e1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f7164x = obj;
        this.f7166z |= Integer.MIN_VALUE;
        return C1780e1.m5416b(this.f7165y, this);
    }
}
