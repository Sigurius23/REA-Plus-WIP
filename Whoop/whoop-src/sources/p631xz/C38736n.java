package p631xz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C38736n extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public Object f166700w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f166701x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C38747x f166702y;

    /* JADX INFO: renamed from: z */
    public int f166703z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38736n(C38747x c38747x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166702y = c38747x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166701x = obj;
        this.f166703z |= Integer.MIN_VALUE;
        Object objM124163n = this.f166702y.m124163n(this);
        return objM124163n == EnumC31071a.f128113w ? objM124163n : new C23468n(objM124163n);
    }
}
