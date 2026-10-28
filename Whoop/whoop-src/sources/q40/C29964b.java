package q40;

import bc3.InterfaceC3027k1;
import n53.C26318e;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: q40.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C29964b extends AbstractC32269c {

    /* JADX INFO: renamed from: w */
    public InterfaceC3027k1 f122386w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f122387x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C26318e f122388y;

    /* JADX INFO: renamed from: z */
    public int f122389z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29964b(C26318e c26318e, InterfaceC30057d interfaceC30057d) {
        super(interfaceC30057d);
        this.f122388y = c26318e;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        this.f122387x = obj;
        this.f122389z |= Integer.MIN_VALUE;
        this.f122388y.collect(null, this);
        return EnumC31071a.f128113w;
    }
}
