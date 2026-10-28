package l53;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: l53.c */
/* JADX INFO: loaded from: classes3.dex */
public final class C23362c extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f92608E;

    /* JADX INFO: renamed from: w */
    public C23369j f92609w;

    /* JADX INFO: renamed from: x */
    public String f92610x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f92611y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C23369j f92612z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23362c(C23369j c23369j, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f92612z = c23369j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f92611y = obj;
        this.f92608E |= Integer.MIN_VALUE;
        return this.f92612z.iceTrickle(null, this);
    }
}
