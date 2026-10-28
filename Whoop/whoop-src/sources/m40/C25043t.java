package m40;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: m40.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C25043t extends AbstractC32269c {

    /* JADX INFO: renamed from: E */
    public int f98115E;

    /* JADX INFO: renamed from: w */
    public C25046w f98116w;

    /* JADX INFO: renamed from: x */
    public String f98117x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f98118y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ C25046w f98119z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25043t(C25046w c25046w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f98119z = c25046w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f98118y = obj;
        this.f98115E |= Integer.MIN_VALUE;
        Object objM73483c = C25046w.m73483c(this.f98119z, null, 0, 0, this);
        return objM73483c == EnumC31071a.f128113w ? objM73483c : new C23468n(objM73483c);
    }
}
