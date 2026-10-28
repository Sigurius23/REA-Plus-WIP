package p007a6;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a6.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0408b0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f1396E;

    /* JADX INFO: renamed from: w */
    public boolean f1397w;

    /* JADX INFO: renamed from: x */
    public AbstractC0418e1 f1398x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f1399y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C0429i0 f1400z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0408b0(C0429i0 c0429i0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f1400z = c0429i0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1399y = obj;
        this.f1396E |= Integer.MIN_VALUE;
        return C0429i0.m1110f(this.f1400z, false, this);
    }
}
