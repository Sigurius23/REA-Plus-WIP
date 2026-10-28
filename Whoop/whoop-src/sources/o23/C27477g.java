package o23;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import n23.AbstractC26205h;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: o23.g */
/* JADX INFO: loaded from: classes3.dex */
public final class C27477g extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f110685w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC27471a f110686x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ AbstractC26205h f110687y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C27477g(InterfaceC27471a interfaceC27471a, AbstractC26205h abstractC26205h, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f110685w = i13;
        this.f110686x = interfaceC27471a;
        this.f110687y = abstractC26205h;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f110685w) {
            case 0:
                return new C27477g(this.f110686x, this.f110687y, interfaceC30057d, 0);
            case 1:
                return new C27477g(this.f110686x, this.f110687y, interfaceC30057d, 1);
            case 2:
                return new C27477g(this.f110686x, this.f110687y, interfaceC30057d, 2);
            case 3:
                return new C27477g(this.f110686x, this.f110687y, interfaceC30057d, 3);
            case 4:
                return new C27477g(this.f110686x, this.f110687y, interfaceC30057d, 4);
            default:
                return new C27477g(this.f110686x, this.f110687y, interfaceC30057d, 5);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f110685w) {
            case 0:
                C27477g c27477g = (C27477g) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c27477g.invokeSuspend(c23454a0);
                return c23454a0;
            case 1:
                C27477g c27477g2 = (C27477g) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c27477g2.invokeSuspend(c23454a1);
                return c23454a1;
            case 2:
                C27477g c27477g3 = (C27477g) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a2 = C23454a0.f92919a;
                c27477g3.invokeSuspend(c23454a2);
                return c23454a2;
            case 3:
                C27477g c27477g4 = (C27477g) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a3 = C23454a0.f92919a;
                c27477g4.invokeSuspend(c23454a3);
                return c23454a3;
            case 4:
                C27477g c27477g5 = (C27477g) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a4 = C23454a0.f92919a;
                c27477g5.invokeSuspend(c23454a4);
                return c23454a4;
            default:
                C27477g c27477g6 = (C27477g) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a5 = C23454a0.f92919a;
                c27477g6.invokeSuspend(c23454a5);
                return c23454a5;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f110685w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        AbstractC26205h abstractC26205h = this.f110687y;
        InterfaceC27471a interfaceC27471a = this.f110686x;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                interfaceC27471a.onResult(abstractC26205h);
                break;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                interfaceC27471a.onResult(abstractC26205h);
                break;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                interfaceC27471a.onResult(abstractC26205h);
                break;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                interfaceC27471a.onResult(abstractC26205h);
                break;
            case 4:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                interfaceC27471a.onResult(abstractC26205h);
                break;
            default:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                interfaceC27471a.onResult(abstractC26205h);
                break;
        }
        return c23454a0;
    }
}
