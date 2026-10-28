package e00;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e00.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C12485h extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f42629w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12500w f42630x;

    /* JADX INFO: renamed from: y */
    public int f42631y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12485h(C12500w c12500w, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f42630x = c12500w;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f42629w = obj;
        this.f42631y |= Integer.MIN_VALUE;
        Object objM35120h = this.f42630x.m35120h(null, null, this);
        return objM35120h == EnumC31071a.f128113w ? objM35120h : new C23468n(objM35120h);
    }
}
