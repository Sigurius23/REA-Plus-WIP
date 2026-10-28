package p631xz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C38745v extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C38747x f166737w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f166738x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C38747x f166739y;

    /* JADX INFO: renamed from: z */
    public int f166740z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38745v(C38747x c38747x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166739y = c38747x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166738x = obj;
        this.f166740z |= Integer.MIN_VALUE;
        Object objM124171w = this.f166739y.m124171w(false, this);
        return objM124171w == EnumC31071a.f128113w ? objM124171w : new C23468n(objM124171w);
    }
}
