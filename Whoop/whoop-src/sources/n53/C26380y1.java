package n53;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: n53.y1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C26380y1 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f104825w;

    /* JADX INFO: renamed from: x */
    public int f104826x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C26383z1 f104827y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26380y1(C26383z1 c26383z1, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f104827y = c26383z1;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f104825w = obj;
        this.f104826x |= Integer.MIN_VALUE;
        return this.f104827y.emit(null, this);
    }
}
