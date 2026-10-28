package d33;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: d33.w0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C11635w0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f37582w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11637x0 f37583x;

    /* JADX INFO: renamed from: y */
    public int f37584y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11635w0(C11637x0 c11637x0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f37583x = c11637x0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f37582w = obj;
        this.f37584y |= Integer.MIN_VALUE;
        return this.f37583x.emit(null, this);
    }
}
