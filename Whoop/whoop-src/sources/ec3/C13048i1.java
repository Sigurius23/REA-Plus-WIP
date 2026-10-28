package ec3;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.i1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13048i1 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public InterfaceC13062m f45096E;

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f45097w;

    /* JADX INFO: renamed from: x */
    public int f45098x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13031e0 f45099y;

    /* JADX INFO: renamed from: z */
    public Object f45100z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13048i1(C13031e0 c13031e0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45099y = c13031e0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45097w = obj;
        this.f45098x |= Integer.MIN_VALUE;
        return this.f45099y.emit(null, this);
    }
}
