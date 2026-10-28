package ec3;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C13101y0 extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public Object f45269E;

    /* JADX INFO: renamed from: w */
    public C13031e0 f45270w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f45271x;

    /* JADX INFO: renamed from: y */
    public int f45272y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C13031e0 f45273z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13101y0(C13031e0 c13031e0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45273z = c13031e0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45271x = obj;
        this.f45272y |= Integer.MIN_VALUE;
        return this.f45273z.emit(null, this);
    }
}
