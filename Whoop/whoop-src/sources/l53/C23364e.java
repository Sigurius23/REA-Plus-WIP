package l53;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: l53.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C23364e extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f92618E;

    /* JADX INFO: renamed from: w */
    public C23369j f92619w;

    /* JADX INFO: renamed from: x */
    public String f92620x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f92621y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C23369j f92622z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23364e(C23369j c23369j, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f92622z = c23369j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f92621y = obj;
        this.f92618E |= Integer.MIN_VALUE;
        return this.f92622z.setPublisher(null, this);
    }
}
