package p631xz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C38726i extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public C38747x f166676w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f166677x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C38747x f166678y;

    /* JADX INFO: renamed from: z */
    public int f166679z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38726i(C38747x c38747x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166678y = c38747x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166677x = obj;
        this.f166679z |= Integer.MIN_VALUE;
        Object objM124158i = this.f166678y.m124158i(this);
        return objM124158i == EnumC31071a.f128113w ? objM124158i : new C23468n(objM124158i);
    }
}
