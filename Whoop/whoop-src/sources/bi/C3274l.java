package bi;

import p715kotlin.jvm.internal.C22669g0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: bi.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C3274l extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C3277o f12780E;

    /* JADX INFO: renamed from: F */
    public int f12781F;

    /* JADX INFO: renamed from: w */
    public Object f12782w;

    /* JADX INFO: renamed from: x */
    public C22669g0 f12783x;

    /* JADX INFO: renamed from: y */
    public C22669g0 f12784y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f12785z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3274l(C3277o c3277o, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f12780E = c3277o;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f12785z = obj;
        this.f12781F |= Integer.MIN_VALUE;
        return this.f12780E.mo9540a(this);
    }
}
