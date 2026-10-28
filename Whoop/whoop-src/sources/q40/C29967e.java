package q40;

import n53.C26383z1;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: q40.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C29967e extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f122390w;

    /* JADX INFO: renamed from: x */
    public int f122391x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C26383z1 f122392y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29967e(C26383z1 c26383z1, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f122392y = c26383z1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f122390w = obj;
        this.f122391x |= Integer.MIN_VALUE;
        return this.f122392y.emit(null, this);
    }
}
