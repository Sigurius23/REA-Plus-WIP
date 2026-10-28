package lb;

import c93.InterfaceC4339a;
import p715kotlin.jvm.internal.C22669g0;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: lb.r */
/* JADX INFO: loaded from: classes5.dex */
public final class C23575r extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C23576s f93492E;

    /* JADX INFO: renamed from: F */
    public int f93493F;

    /* JADX INFO: renamed from: w */
    public long f93494w;

    /* JADX INFO: renamed from: x */
    public InterfaceC4339a f93495x;

    /* JADX INFO: renamed from: y */
    public C22669g0 f93496y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f93497z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23575r(C23576s c23576s, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f93492E = c23576s;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f93497z = obj;
        this.f93493F |= Integer.MIN_VALUE;
        return this.f93492E.m68219b(0L, null, this);
    }
}
