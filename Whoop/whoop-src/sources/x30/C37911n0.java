package x30;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: x30.n0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37911n0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f162308w;

    /* JADX INFO: renamed from: x */
    public int f162309x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f162310y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37911n0(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f162310y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f162308w = obj;
        this.f162309x |= Integer.MIN_VALUE;
        return this.f162310y.emit(null, this);
    }
}
