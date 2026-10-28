package ec3;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.d0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13027d0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C13031e0 f45031w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f45032x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13031e0 f45033y;

    /* JADX INFO: renamed from: z */
    public int f45034z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13027d0(C13031e0 c13031e0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45033y = c13031e0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45032x = obj;
        this.f45034z |= Integer.MIN_VALUE;
        return this.f45033y.emit(null, this);
    }
}
