package y10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: y10.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C39044f extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f168022w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39046h f168023x;

    /* JADX INFO: renamed from: y */
    public int f168024y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39044f(C39046h c39046h, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f168023x = c39046h;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f168022w = obj;
        this.f168024y |= Integer.MIN_VALUE;
        Object objM124466b = this.f168023x.m124466b(null, null, null, null, null, this);
        return objM124466b == EnumC31071a.f128113w ? objM124466b : new C23468n(objM124466b);
    }
}
