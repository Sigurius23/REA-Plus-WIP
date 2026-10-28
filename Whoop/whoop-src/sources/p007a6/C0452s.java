package p007a6;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: a6.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0452s extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f1557w;

    /* JADX INFO: renamed from: x */
    public int f1558x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0454t f1559y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0452s(C0454t c0454t, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f1559y = c0454t;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f1557w = obj;
        this.f1558x |= Integer.MIN_VALUE;
        return this.f1559y.emit(null, this);
    }
}
