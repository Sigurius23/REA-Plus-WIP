package cz;

import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: cz.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11207j0 extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public /* synthetic */ Object f35938w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C11215n0 f35939x;

    /* JADX INFO: renamed from: y */
    public int f35940y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11207j0(C11215n0 c11215n0, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f35939x = c11215n0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f35938w = obj;
        this.f35940y |= Integer.MIN_VALUE;
        C11215n0.m30336j(this.f35939x, null, this);
        return EnumC31071a.f128113w;
    }
}
