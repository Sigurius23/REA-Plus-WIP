package ec3;

import p040c0.C3723a0;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: ec3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C13046i extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f45090w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C3723a0 f45091x;

    /* JADX INFO: renamed from: y */
    public int f45092y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13046i(C3723a0 c3723a0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f45091x = c3723a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f45090w = obj;
        this.f45092y |= Integer.MIN_VALUE;
        return this.f45091x.emit(null, this);
    }
}
