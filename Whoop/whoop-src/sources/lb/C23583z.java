package lb;

import p715kotlin.jvm.functions.Function1;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: lb.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C23583z extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C23557a0 f93527E;

    /* JADX INFO: renamed from: F */
    public int f93528F;

    /* JADX INFO: renamed from: w */
    public String f93529w;

    /* JADX INFO: renamed from: x */
    public Function1 f93530x;

    /* JADX INFO: renamed from: y */
    public C23565h f93531y;

    /* JADX INFO: renamed from: z */
    public /* synthetic */ Object f93532z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23583z(C23557a0 c23557a0, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f93527E = c23557a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f93532z = obj;
        this.f93528F |= Integer.MIN_VALUE;
        return this.f93527E.mo5426c(null, null, this);
    }
}
