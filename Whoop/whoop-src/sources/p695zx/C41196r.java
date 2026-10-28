package p695zx;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: zx.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C41196r extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f177727w;

    /* JADX INFO: renamed from: x */
    public int f177728x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f177729y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C41196r(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f177729y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f177727w = obj;
        this.f177728x |= Integer.MIN_VALUE;
        return this.f177729y.emit(null, this);
    }
}
