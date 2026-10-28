package y10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: y10.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C39043e extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f168019w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39046h f168020x;

    /* JADX INFO: renamed from: y */
    public int f168021y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39043e(C39046h c39046h, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f168020x = c39046h;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f168019w = obj;
        this.f168021y |= Integer.MIN_VALUE;
        Object objM124465a = this.f168020x.m124465a(null, null, null, null, null, null, null, null, null, null, this);
        return objM124465a == EnumC31071a.f128113w ? objM124465a : new C23468n(objM124465a);
    }
}
