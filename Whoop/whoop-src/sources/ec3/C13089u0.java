package ec3;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.u0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13089u0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f45223w;

    /* JADX INFO: renamed from: x */
    public int f45224x;

    /* JADX INFO: renamed from: y */
    public InterfaceC13062m f45225y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C13077q0 f45226z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13089u0(C13077q0 c13077q0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45226z = c13077q0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45223w = obj;
        this.f45224x |= Integer.MIN_VALUE;
        return this.f45226z.emit(null, this);
    }
}
