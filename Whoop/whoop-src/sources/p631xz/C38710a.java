package p631xz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C38710a extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C38747x f166609w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f166610x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C38747x f166611y;

    /* JADX INFO: renamed from: z */
    public int f166612z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38710a(C38747x c38747x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166611y = c38747x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166610x = obj;
        this.f166612z |= Integer.MIN_VALUE;
        Object objM124150a = this.f166611y.m124150a(null, null, this);
        return objM124150a == EnumC31071a.f128113w ? objM124150a : new C23468n(objM124150a);
    }
}
