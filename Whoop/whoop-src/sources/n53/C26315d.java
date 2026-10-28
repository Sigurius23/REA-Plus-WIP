package n53;

import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: n53.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C26315d extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f104626w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26318e f104627x;

    /* JADX INFO: renamed from: y */
    public int f104628y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26315d(C26318e c26318e, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f104627x = c26318e;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f104626w = obj;
        this.f104628y |= Integer.MIN_VALUE;
        this.f104627x.collect(null, this);
        return EnumC31071a.f128113w;
    }
}
