package p605x6;

import android.content.Context;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: x6.j */
/* JADX INFO: loaded from: classes5.dex */
public final class C38005j extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public Context f162801w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f162802x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C38006k f162803y;

    /* JADX INFO: renamed from: z */
    public int f162804z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38005j(C38006k c38006k, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f162803y = c38006k;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f162802x = obj;
        this.f162804z |= Integer.MIN_VALUE;
        return this.f162803y.m121741c(null, null, this);
    }
}
