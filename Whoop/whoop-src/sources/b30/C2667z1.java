package b30;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import java.util.List;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: b30.z1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C2667z1 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ Function1 f10436w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ List f10437x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ float f10438y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ float f10439z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2667z1(Function1 function1, List list, float f13, float f14, InterfaceC30057d interfaceC30057d) {
        super(2, interfaceC30057d);
        float f15 = AbstractC2581n2.f10041a;
        this.f10436w = function1;
        this.f10437x = list;
        this.f10438y = f13;
        this.f10439z = f14;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        float f13 = AbstractC2581n2.f10041a;
        return new C2667z1(this.f10436w, this.f10437x, this.f10438y, this.f10439z, interfaceC30057d);
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        C2667z1 c2667z1 = (C2667z1) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2);
        C23454a0 c23454a0 = C23454a0.f92919a;
        c2667z1.invokeSuspend(c23454a0);
        return c23454a0;
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        AbstractC34132o.m107864I(obj);
        float f13 = AbstractC2581n2.f10041a;
        this.f10436w.invoke(new C2474a(this.f10437x, this.f10438y, this.f10439z));
        return C23454a0.f92919a;
    }
}
