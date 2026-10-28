package e33;

import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bi.C3278p;
import d33.C11629t0;
import java.util.List;
import java.util.concurrent.CancellationException;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: e33.t0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C12658t0 extends AbstractC32275i implements Function1 {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ C3278p f43256E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C12662v0 f43257w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ boolean f43258x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ List f43259y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ List f43260z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12658t0(C12662v0 c12662v0, boolean z4, List list, List list2, C3278p c3278p, InterfaceC30057d interfaceC30057d) {
        super(1, interfaceC30057d);
        this.f43257w = c12662v0;
        this.f43258x = z4;
        this.f43259y = list;
        this.f43260z = list2;
        this.f43256E = c3278p;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(InterfaceC30057d interfaceC30057d) {
        return new C12658t0(this.f43257w, this.f43258x, this.f43259y, this.f43260z, this.f43256E, interfaceC30057d);
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C12658t0 c12658t0 = (C12658t0) create((InterfaceC30057d) obj);
        C23454a0 c23454a0 = C23454a0.f92919a;
        c12658t0.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        C12662v0 c12662v0 = this.f43257w;
        C2996c2 c2996c2 = c12662v0.f43292E;
        if (c2996c2 != null) {
            c2996c2.cancel((CancellationException) null);
        }
        c12662v0.f43292E = AbstractC3006f0.m8732z(c12662v0.f43306y, null, null, new C11629t0(c12662v0, this.f43258x, this.f43259y, this.f43260z, this.f43256E, (InterfaceC30057d) null), 3);
        return C23454a0.f92919a;
    }
}
