package p631xz;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: xz.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C38724h extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f166672w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C38747x f166673x;

    /* JADX INFO: renamed from: y */
    public int f166674y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38724h(C38747x c38747x, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f166673x = c38747x;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f166672w = obj;
        this.f166674y |= Integer.MIN_VALUE;
        Object objM124157h = this.f166673x.m124157h(this);
        return objM124157h == EnumC31071a.f128113w ? objM124157h : new C23468n(objM124157h);
    }
}
