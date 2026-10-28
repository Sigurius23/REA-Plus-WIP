package p470rv;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: rv.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C31827g extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f131859w;

    /* JADX INFO: renamed from: x */
    public int f131860x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f131861y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31827g(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f131861y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f131859w = obj;
        this.f131860x |= Integer.MIN_VALUE;
        return this.f131861y.emit(null, this);
    }
}
