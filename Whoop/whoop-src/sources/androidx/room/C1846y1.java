package androidx.room;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: androidx.room.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class C1846y1 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public Object f7224w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f7225x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1797i2 f7226y;

    /* JADX INFO: renamed from: z */
    public int f7227z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1846y1(C1797i2 c1797i2, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f7226y = c1797i2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f7225x = obj;
        this.f7227z |= Integer.MIN_VALUE;
        return C1797i2.m5419a(this.f7226y, null, this);
    }
}
