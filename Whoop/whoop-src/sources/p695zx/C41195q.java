package p695zx;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: zx.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C41195q extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f177724w;

    /* JADX INFO: renamed from: x */
    public int f177725x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f177726y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41195q(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f177726y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f177724w = obj;
        this.f177725x |= Integer.MIN_VALUE;
        return this.f177726y.emit(null, this);
    }
}
