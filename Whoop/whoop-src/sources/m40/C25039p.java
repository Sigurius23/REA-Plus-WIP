package m40;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: m40.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C25039p extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f98098w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C25046w f98099x;

    /* JADX INFO: renamed from: y */
    public int f98100y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25039p(C25046w c25046w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f98099x = c25046w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.f98098w = obj;
        this.f98100y |= Integer.MIN_VALUE;
        Object objM73487g = this.f98099x.m73487g(null, 0, 0, this);
        return objM73487g == EnumC31071a.f128113w ? objM73487g : new C23468n(objM73487g);
    }
}
