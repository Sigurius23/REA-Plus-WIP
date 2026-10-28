package p395p6;

import c93.InterfaceC4351m;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: p6.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C28897m extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public InterfaceC4351m f116971w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f116972x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C28900n f116973y;

    /* JADX INFO: renamed from: z */
    public int f116974z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28897m(C28900n c28900n, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f116973y = c28900n;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f116972x = obj;
        this.f116974z |= Integer.MIN_VALUE;
        this.f116973y.m87818a(null, this);
        return EnumC31071a.f128113w;
    }
}
