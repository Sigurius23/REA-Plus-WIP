package fc3;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: fc3.l */
/* JADX INFO: loaded from: classes5.dex */
public final class C14381l extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f52503w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C14382m f52504x;

    /* JADX INFO: renamed from: y */
    public int f52505y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14381l(C14382m c14382m, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f52504x = c14382m;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f52503w = obj;
        this.f52505y |= Integer.MIN_VALUE;
        return this.f52504x.emit(null, this);
    }
}
