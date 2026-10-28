package l53;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: l53.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C23368i extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f92638E;

    /* JADX INFO: renamed from: w */
    public C23369j f92639w;

    /* JADX INFO: renamed from: x */
    public String f92640x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f92641y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C23369j f92642z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23368i(C23369j c23369j, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f92642z = c23369j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f92641y = obj;
        this.f92638E |= Integer.MIN_VALUE;
        return this.f92642z.updateSubscriptions(null, this);
    }
}
