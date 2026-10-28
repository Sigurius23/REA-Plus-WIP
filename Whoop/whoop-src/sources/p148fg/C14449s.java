package p148fg;

import mc3.InterfaceC25435a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: fg.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C14449s extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f52732E;

    /* JADX INFO: renamed from: w */
    public int f52733w;

    /* JADX INFO: renamed from: x */
    public InterfaceC25435a f52734x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f52735y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C14451u f52736z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14449s(C14451u c14451u, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f52736z = c14451u;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f52735y = obj;
        this.f52732E |= Integer.MIN_VALUE;
        return this.f52736z.m41172c(0, this);
    }
}
