package v10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: v10.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C35537m extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f151192w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C35539o f151193x;

    /* JADX INFO: renamed from: y */
    public int f151194y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35537m(C35539o c35539o, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f151193x = c35539o;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f151192w = obj;
        this.f151194y |= Integer.MIN_VALUE;
        Object objMo112690f = this.f151193x.mo112690f(null, null, this);
        return objMo112690f == EnumC31071a.f128113w ? objMo112690f : new C23468n(objMo112690f);
    }
}
