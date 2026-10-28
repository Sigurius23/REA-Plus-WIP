package f63;

import q83.InterfaceC30057d;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: f63.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C14160h extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f51016E;

    /* JADX INFO: renamed from: w */
    public Object f51017w;

    /* JADX INFO: renamed from: x */
    public Object f51018x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f51019y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C14162j f51020z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14160h(C14162j c14162j, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f51020z = c14162j;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f51019y = obj;
        this.f51016E |= Integer.MIN_VALUE;
        return this.f51020z.m40347b(null, this);
    }
}
