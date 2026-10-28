package p631xz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C38716d extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f166645w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38747x f166646x;

    /* JADX INFO: renamed from: y */
    public int f166647y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38716d(C38747x c38747x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166646x = c38747x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166645w = obj;
        this.f166647y |= Integer.MIN_VALUE;
        Object objM124153d = this.f166646x.m124153d(this);
        return objM124153d == EnumC31071a.f128113w ? objM124153d : new C23468n(objM124153d);
    }
}
