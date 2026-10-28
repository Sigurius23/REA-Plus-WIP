package o20;

import p000.C36623w;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: o20.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C27458c extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f110657w;

    /* JADX INFO: renamed from: x */
    public int f110658x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C36623w f110659y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27458c(C36623w c36623w, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f110659y = c36623w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f110657w = obj;
        this.f110658x |= Integer.MIN_VALUE;
        return this.f110659y.emit(null, this);
    }
}
