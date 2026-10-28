package h53;

import qg3.C30352d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: h53.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C16942g extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f65021w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C30352d f65022x;

    /* JADX INFO: renamed from: y */
    public int f65023y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16942g(C30352d c30352d, AbstractC32269c abstractC32269c) {
        super(abstractC32269c);
        this.f65022x = c30352d;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f65021w = obj;
        this.f65023y |= Integer.MIN_VALUE;
        this.f65022x.m92824y(null, this);
        return EnumC31071a.f128113w;
    }
}
