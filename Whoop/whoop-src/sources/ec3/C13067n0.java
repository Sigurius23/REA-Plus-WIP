package ec3;

import p040c0.C3723a0;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.n0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13067n0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f45156w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3723a0 f45157x;

    /* JADX INFO: renamed from: y */
    public int f45158y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13067n0(C3723a0 c3723a0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45157x = c3723a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45156w = obj;
        this.f45158y |= Integer.MIN_VALUE;
        return this.f45157x.emit(null, this);
    }
}
