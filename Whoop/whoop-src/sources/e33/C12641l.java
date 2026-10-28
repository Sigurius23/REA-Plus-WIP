package e33;

import l83.C23468n;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: e33.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C12641l extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f43174w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12645n f43175x;

    /* JADX INFO: renamed from: y */
    public int f43176y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12641l(C12645n c12645n, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f43175x = c12645n;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f43174w = obj;
        this.f43176y |= Integer.MIN_VALUE;
        Object objM35407w = this.f43175x.m35407w(null, this);
        return objM35407w == EnumC31071a.f128113w ? objM35407w : new C23468n(objM35407w);
    }
}
