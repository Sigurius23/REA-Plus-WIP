package b30;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: b30.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2595p0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f10090w;

    /* JADX INFO: renamed from: x */
    public int f10091x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f10092y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2595p0(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f10092y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f10090w = obj;
        this.f10091x |= Integer.MIN_VALUE;
        return this.f10092y.emit(null, this);
    }
}
