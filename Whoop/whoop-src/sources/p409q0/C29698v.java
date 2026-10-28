package p409q0;

import p077d0.InterfaceC11372l;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: q0.v */
/* JADX INFO: loaded from: classes5.dex */
public final class C29698v extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f121404E;

    /* JADX INFO: renamed from: w */
    public int f121405w;

    /* JADX INFO: renamed from: x */
    public InterfaceC11372l f121406x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f121407y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ AbstractC29701y f121408z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29698v(AbstractC29701y abstractC29701y, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f121408z = abstractC29701y;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f121407y = obj;
        this.f121404E |= Integer.MIN_VALUE;
        return this.f121408z.m91159f(0, null, this);
    }
}
