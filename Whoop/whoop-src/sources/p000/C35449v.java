package p000;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: v */
/* JADX INFO: loaded from: classes9.dex */
public final class C35449v extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f150952w;

    /* JADX INFO: renamed from: x */
    public int f150953x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f150954y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35449v(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f150954y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f150952w = obj;
        this.f150953x |= Integer.MIN_VALUE;
        return this.f150954y.emit(null, this);
    }
}
