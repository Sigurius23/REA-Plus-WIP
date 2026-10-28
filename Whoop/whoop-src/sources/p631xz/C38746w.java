package p631xz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C38746w extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f166741E;

    /* JADX INFO: renamed from: w */
    public C38747x f166742w;

    /* JADX INFO: renamed from: x */
    public String f166743x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f166744y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C38747x f166745z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38746w(C38747x c38747x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166745z = c38747x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166744y = obj;
        this.f166741E |= Integer.MIN_VALUE;
        Object objM124172x = this.f166745z.m124172x(null, null, this);
        return objM124172x == EnumC31071a.f128113w ? objM124172x : new C23468n(objM124172x);
    }
}
