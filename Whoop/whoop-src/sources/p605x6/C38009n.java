package p605x6;

import androidx.glance.session.SessionWorker;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: x6.n */
/* JADX INFO: loaded from: classes5.dex */
public final class C38009n extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f162813E;

    /* JADX INFO: renamed from: w */
    public int f162814w;

    /* JADX INFO: renamed from: x */
    public Object f162815x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f162816y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ SessionWorker f162817z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38009n(SessionWorker sessionWorker, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f162817z = sessionWorker;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f162816y = obj;
        this.f162813E |= Integer.MIN_VALUE;
        return this.f162817z.doWork(this);
    }
}
