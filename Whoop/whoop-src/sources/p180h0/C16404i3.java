package p180h0;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h0.i3 */
/* JADX INFO: loaded from: classes5.dex */
public final class C16404i3 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f63054w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C16398h2 f63055x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16404i3(C16398h2 c16398h2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f63054w = i13;
        this.f63055x = c16398h2;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f63054w) {
            case 0:
                return new C16404i3(this.f63055x, interfaceC30057d, 0);
            case 1:
                return new C16404i3(this.f63055x, interfaceC30057d, 1);
            case 2:
                return new C16404i3(this.f63055x, interfaceC30057d, 2);
            case 3:
                return new C16404i3(this.f63055x, interfaceC30057d, 3);
            case 4:
                return new C16404i3(this.f63055x, interfaceC30057d, 4);
            case 5:
                return new C16404i3(this.f63055x, interfaceC30057d, 5);
            case 6:
                return new C16404i3(this.f63055x, interfaceC30057d, 6);
            default:
                return new C16404i3(this.f63055x, interfaceC30057d, 7);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f63054w) {
            case 0:
                C16404i3 c16404i3 = (C16404i3) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c16404i3.invokeSuspend(c23454a0);
                return c23454a0;
            case 1:
                C16404i3 c16404i4 = (C16404i3) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a1 = C23454a0.f92919a;
                c16404i4.invokeSuspend(c23454a1);
                return c23454a1;
            case 2:
                C16404i3 c16404i5 = (C16404i3) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a2 = C23454a0.f92919a;
                c16404i5.invokeSuspend(c23454a2);
                return c23454a2;
            case 3:
                C16404i3 c16404i6 = (C16404i3) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a3 = C23454a0.f92919a;
                c16404i6.invokeSuspend(c23454a3);
                return c23454a3;
            case 4:
                C16404i3 c16404i7 = (C16404i3) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a4 = C23454a0.f92919a;
                c16404i7.invokeSuspend(c23454a4);
                return c23454a4;
            case 5:
                C16404i3 c16404i8 = (C16404i3) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a5 = C23454a0.f92919a;
                c16404i8.invokeSuspend(c23454a5);
                return c23454a5;
            case 6:
                C16404i3 c16404i9 = (C16404i3) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a6 = C23454a0.f92919a;
                c16404i9.invokeSuspend(c23454a6);
                return c23454a6;
            default:
                C16404i3 c16404i10 = (C16404i3) create(interfaceC2994c0, interfaceC30057d);
                C23454a0 c23454a7 = C23454a0.f92919a;
                c16404i10.invokeSuspend(c23454a7);
                return c23454a7;
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        int i13 = this.f63054w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        C16398h2 c16398h2 = this.f63055x;
        switch (i13) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c16398h2.m46587b();
                break;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c16398h2.m46588c();
                break;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c16398h2.m46588c();
                break;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c16398h2.m46587b();
                break;
            case 4:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c16398h2.m46588c();
                break;
            case 5:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c16398h2.m46588c();
                break;
            case 6:
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c16398h2.m46587b();
                break;
            default:
                EnumC31071a enumC31071a8 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                c16398h2.m46588c();
                break;
        }
        return c23454a0;
    }
}
