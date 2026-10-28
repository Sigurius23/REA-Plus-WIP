package androidx.room;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: androidx.room.f2 */
/* JADX INFO: loaded from: classes5.dex */
public final class C1785f2 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f7034E;

    /* JADX INFO: renamed from: F */
    public /* synthetic */ Object f7035F;

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ C1797i2 f7036G;

    /* JADX INFO: renamed from: H */
    public int f7037H;

    /* JADX INFO: renamed from: w */
    public InterfaceC1799j0 f7038w;

    /* JADX INFO: renamed from: x */
    public String f7039x;

    /* JADX INFO: renamed from: y */
    public String[] f7040y;

    /* JADX INFO: renamed from: z */
    public int f7041z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1785f2(C1797i2 c1797i2, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f7036G = c1797i2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f7035F = obj;
        this.f7037H |= Integer.MIN_VALUE;
        return C1797i2.m5422d(this.f7036G, null, 0, this);
    }
}
