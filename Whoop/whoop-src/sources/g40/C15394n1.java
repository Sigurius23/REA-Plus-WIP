package g40;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: g40.n1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C15394n1 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f57843w;

    /* JADX INFO: renamed from: x */
    public int f57844x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f57845y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15394n1(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f57845y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f57843w = obj;
        this.f57844x |= Integer.MIN_VALUE;
        return this.f57845y.emit(null, this);
    }
}
