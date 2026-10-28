package p409q0;

import p132f0.EnumC13840z0;
import q83.InterfaceC30057d;
import s83.AbstractC32269c;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: q0.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C29700x extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ AbstractC29701y f121415E;

    /* JADX INFO: renamed from: F */
    public int f121416F;

    /* JADX INFO: renamed from: w */
    public AbstractC29701y f121417w;

    /* JADX INFO: renamed from: x */
    public EnumC13840z0 f121418x;

    /* JADX INFO: renamed from: y */
    public AbstractC32275i f121419y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f121420z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29700x(AbstractC29701y abstractC29701y, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f121415E = abstractC29701y;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f121420z = obj;
        this.f121416F |= Integer.MIN_VALUE;
        return AbstractC29701y.m91157u(this.f121415E, null, null, this);
    }
}
