package ec3;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.o0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13071o0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f45166w;

    /* JADX INFO: renamed from: x */
    public int f45167x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13015a0 f45168y;

    /* JADX INFO: renamed from: z */
    public C13077q0 f45169z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13071o0(C13015a0 c13015a0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45168y = c13015a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45166w = obj;
        this.f45167x |= Integer.MIN_VALUE;
        return this.f45168y.collect(null, this);
    }
}
