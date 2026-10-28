package p470rv;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: rv.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C31822b extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f131842w;

    /* JADX INFO: renamed from: x */
    public int f131843x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f131844y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31822b(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f131844y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f131842w = obj;
        this.f131843x |= Integer.MIN_VALUE;
        return this.f131844y.emit(null, this);
    }
}
