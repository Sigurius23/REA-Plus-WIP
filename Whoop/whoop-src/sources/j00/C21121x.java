package j00;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p390p1.InterfaceC28601c1;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.functions.Function1;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: j00.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C21121x extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f80171w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Function1 f80172x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC28601c1 f80173y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21121x(Function1 function1, InterfaceC28601c1 interfaceC28601c1, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f80171w = i13;
        this.f80172x = function1;
        this.f80173y = interfaceC28601c1;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f80171w) {
            case 0:
                return new C21121x(this.f80172x, this.f80173y, interfaceC30057d, 0);
            default:
                return new C21121x(this.f80172x, this.f80173y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f80171w) {
            case 0:
                C21121x c21121x = (C21121x) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c21121x.invokeSuspend(c23454a0);
                return c23454a0;
            default:
                C21121x c21121x2 = (C21121x) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c21121x2.invokeSuspend(c23454a1);
                return c23454a1;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f80171w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        InterfaceC28601c1 interfaceC28601c1 = this.f80173y;
        Function1 function1 = this.f80172x;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                function1.invoke((C21108k) interfaceC28601c1.getValue());
                break;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                function1.invoke((C21108k) interfaceC28601c1.getValue());
                break;
        }
        return c23454a0;
    }
}
