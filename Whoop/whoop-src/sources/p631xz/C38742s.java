package p631xz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C38742s extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C38747x f166718w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f166719x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C38747x f166720y;

    /* JADX INFO: renamed from: z */
    public int f166721z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38742s(C38747x c38747x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166720y = c38747x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166719x = obj;
        this.f166721z |= Integer.MIN_VALUE;
        Object objM124169u = this.f166720y.m124169u(null, null, null, null, null, null, this);
        return objM124169u == EnumC31071a.f128113w ? objM124169u : new C23468n(objM124169u);
    }
}
