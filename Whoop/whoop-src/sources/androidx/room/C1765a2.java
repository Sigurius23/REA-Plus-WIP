package androidx.room;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: androidx.room.a2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1765a2 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public int[] f6954w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f6955x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C1769b2 f6956y;

    /* JADX INFO: renamed from: z */
    public int f6957z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1765a2(C1769b2 c1769b2, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f6956y = c1769b2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f6955x = obj;
        this.f6957z |= Integer.MIN_VALUE;
        return this.f6956y.m5363c(null, this);
    }
}
