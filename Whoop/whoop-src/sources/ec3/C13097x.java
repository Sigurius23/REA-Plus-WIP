package ec3;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C13097x extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public InterfaceC13062m f45258E;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f45259w;

    /* JADX INFO: renamed from: x */
    public int f45260x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13100y f45261y;

    /* JADX INFO: renamed from: z */
    public Object f45262z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13097x(C13100y c13100y, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45261y = c13100y;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45259w = obj;
        this.f45260x |= Integer.MIN_VALUE;
        return this.f45261y.collect(null, this);
    }
}
