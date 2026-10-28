package ec3;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.i0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13047i0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f45093w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13051j0 f45094x;

    /* JADX INFO: renamed from: y */
    public int f45095y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13047i0(C13051j0 c13051j0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45094x = c13051j0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45093w = obj;
        this.f45095y |= Integer.MIN_VALUE;
        return this.f45094x.emit(null, this);
    }
}
