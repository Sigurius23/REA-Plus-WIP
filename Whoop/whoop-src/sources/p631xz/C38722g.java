package p631xz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C38722g extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C38747x f166665w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f166666x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C38747x f166667y;

    /* JADX INFO: renamed from: z */
    public int f166668z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38722g(C38747x c38747x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166667y = c38747x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166666x = obj;
        this.f166668z |= Integer.MIN_VALUE;
        Object objM124156g = this.f166667y.m124156g(null, this);
        return objM124156g == EnumC31071a.f128113w ? objM124156g : new C23468n(objM124156g);
    }
}
