package l53;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: l53.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C23367h extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f92633E;

    /* JADX INFO: renamed from: w */
    public C23369j f92634w;

    /* JADX INFO: renamed from: x */
    public String f92635x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f92636y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C23369j f92637z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23367h(C23369j c23369j, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f92637z = c23369j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f92636y = obj;
        this.f92633E |= Integer.MIN_VALUE;
        return this.f92637z.updateMuteStates(null, this);
    }
}
