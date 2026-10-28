package androidx.room;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: androidx.room.e2 */
/* JADX INFO: loaded from: classes.dex */
public final class C1781e2 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f7018E;

    /* JADX INFO: renamed from: F */
    public int f7019F;

    /* JADX INFO: renamed from: G */
    public /* synthetic */ Object f7020G;

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ C1797i2 f7021H;

    /* JADX INFO: renamed from: I */
    public int f7022I;

    /* JADX INFO: renamed from: w */
    public InterfaceC1799j0 f7023w;

    /* JADX INFO: renamed from: x */
    public String f7024x;

    /* JADX INFO: renamed from: y */
    public String[] f7025y;

    /* JADX INFO: renamed from: z */
    public int f7026z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1781e2(C1797i2 c1797i2, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f7021H = c1797i2;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f7020G = obj;
        this.f7022I |= Integer.MIN_VALUE;
        return C1797i2.m5421c(this.f7021H, null, 0, this);
    }
}
