package d33;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: d33.a1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11581a1 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f37359w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11584b1 f37360x;

    /* JADX INFO: renamed from: y */
    public int f37361y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11581a1(C11584b1 c11584b1, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f37360x = c11584b1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f37359w = obj;
        this.f37361y |= Integer.MIN_VALUE;
        return this.f37360x.emit(null, this);
    }
}
