package androidx.room;

import p277kb.C22317a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: androidx.room.g2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1789g2 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C22317a f7070w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f7071x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1797i2 f7072y;

    /* JADX INFO: renamed from: z */
    public int f7073z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1789g2(C1797i2 c1797i2, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f7072y = c1797i2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f7071x = obj;
        this.f7073z |= Integer.MIN_VALUE;
        return this.f7072y.m5424f(this);
    }
}
