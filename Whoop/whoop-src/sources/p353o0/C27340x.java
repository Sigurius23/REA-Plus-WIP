package p353o0;

import p132f0.EnumC13840z0;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: o0.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C27340x extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f109491E;

    /* JADX INFO: renamed from: w */
    public EnumC13840z0 f109492w;

    /* JADX INFO: renamed from: x */
    public AbstractC32275i f109493x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f109494y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C27341y f109495z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27340x(C27341y c27341y, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f109495z = c27341y;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f109494y = obj;
        this.f109491E |= Integer.MIN_VALUE;
        return this.f109495z.mo9764a(null, null, this);
    }
}
