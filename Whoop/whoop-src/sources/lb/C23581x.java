package lb;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: lb.x */
/* JADX INFO: loaded from: classes5.dex */
public final class C23581x extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f93516E;

    /* JADX INFO: renamed from: w */
    public boolean f93517w;

    /* JADX INFO: renamed from: x */
    public C23565h f93518x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f93519y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C23557a0 f93520z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23581x(C23557a0 c23557a0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f93520z = c23557a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f93519y = obj;
        this.f93516E |= Integer.MIN_VALUE;
        return this.f93520z.m68208f(false, this);
    }
}
