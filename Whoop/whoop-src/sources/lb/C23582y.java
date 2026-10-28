package lb;

import s83.AbstractC32269c;

/* JADX INFO: renamed from: lb.y */
/* JADX INFO: loaded from: classes5.dex */
public final class C23582y extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C23557a0 f93521E;

    /* JADX INFO: renamed from: F */
    public int f93522F;

    /* JADX INFO: renamed from: w */
    public Object f93523w;

    /* JADX INFO: renamed from: x */
    public Throwable f93524x;

    /* JADX INFO: renamed from: y */
    public int f93525y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f93526z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23582y(C23557a0 c23557a0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f93521E = c23557a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f93526z = obj;
        this.f93522F |= Integer.MIN_VALUE;
        return this.f93521E.m68209g(null, null, this);
    }
}
