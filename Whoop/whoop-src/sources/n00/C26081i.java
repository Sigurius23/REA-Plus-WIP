package n00;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: n00.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C26081i extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f103286w;

    /* JADX INFO: renamed from: x */
    public int f103287x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f103288y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26081i(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f103288y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f103286w = obj;
        this.f103287x |= Integer.MIN_VALUE;
        return this.f103288y.emit(null, this);
    }
}
