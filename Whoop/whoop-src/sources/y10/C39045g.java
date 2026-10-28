package y10;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: y10.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C39045g extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f168025w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C39046h f168026x;

    /* JADX INFO: renamed from: y */
    public int f168027y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C39045g(C39046h c39046h, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f168026x = c39046h;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f168025w = obj;
        this.f168027y |= Integer.MIN_VALUE;
        Object objM124467c = this.f168026x.m124467c(null, null, null, null, null, this);
        return objM124467c == EnumC31071a.f128113w ? objM124467c : new C23468n(objM124467c);
    }
}
