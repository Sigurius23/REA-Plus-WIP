package androidx.room;

import p277kb.C22317a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: androidx.room.c2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1773c2 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C22317a f6991w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f6992x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1797i2 f6993y;

    /* JADX INFO: renamed from: z */
    public int f6994z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1773c2(C1797i2 c1797i2, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f6993y = c1797i2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f6992x = obj;
        this.f6994z |= Integer.MIN_VALUE;
        return C1797i2.m5420b(this.f6993y, this);
    }
}
