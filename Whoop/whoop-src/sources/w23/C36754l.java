package w23;

import ec3.C13036f1;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: w23.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C36754l extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f157293w;

    /* JADX INFO: renamed from: x */
    public int f157294x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C13036f1 f157295y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36754l(C13036f1 c13036f1, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f157295y = c13036f1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f157293w = obj;
        this.f157294x |= Integer.MIN_VALUE;
        return this.f157295y.emit(null, this);
    }
}
