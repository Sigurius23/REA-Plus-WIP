package w23;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: w23.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C36746d extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f157270w;

    /* JADX INFO: renamed from: x */
    public int f157271x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f157272y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36746d(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f157272y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f157270w = obj;
        this.f157271x |= Integer.MIN_VALUE;
        return this.f157272y.emit(null, this);
    }
}
