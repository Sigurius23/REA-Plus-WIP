package t23;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: t23.p3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33438p3 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f139586w;

    /* JADX INFO: renamed from: x */
    public int f139587x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f139588y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33438p3(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f139588y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f139586w = obj;
        this.f139587x |= Integer.MIN_VALUE;
        return this.f139588y.emit(null, this);
    }
}
