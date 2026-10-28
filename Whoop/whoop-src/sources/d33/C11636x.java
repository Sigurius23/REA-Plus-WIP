package d33;

import c93.InterfaceC4351m;
import e10.C12579y;
import g53.AbstractC15508m;
import g53.C15498c;
import i53.AbstractC18137i;
import i53.AbstractC18138j;
import i53.C18129a;
import l40.C23328a;
import l83.C23454a0;
import n23.AbstractC26205h;
import p180h0.InterfaceC16392g1;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: d33.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C11636x extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f37585w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f37586x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C11636x(int i13, int i14, InterfaceC30057d interfaceC30057d) {
        super(i13, interfaceC30057d);
        this.f37585w = i14;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f37585w) {
            case 0:
                C11636x c11636x = new C11636x(2, 0, interfaceC30057d);
                c11636x.f37586x = obj;
                return c11636x;
            case 1:
                C11636x c11636x2 = new C11636x(2, 1, interfaceC30057d);
                c11636x2.f37586x = obj;
                return c11636x2;
            case 2:
                C11636x c11636x3 = new C11636x(2, 2, interfaceC30057d);
                c11636x3.f37586x = obj;
                return c11636x3;
            case 3:
                C11636x c11636x4 = new C11636x(2, 3, interfaceC30057d);
                c11636x4.f37586x = obj;
                return c11636x4;
            case 4:
                C11636x c11636x5 = new C11636x(2, 4, interfaceC30057d);
                c11636x5.f37586x = obj;
                return c11636x5;
            case 5:
                C11636x c11636x6 = new C11636x(2, 5, interfaceC30057d);
                c11636x6.f37586x = obj;
                return c11636x6;
            case 6:
                C11636x c11636x7 = new C11636x(2, 6, interfaceC30057d);
                c11636x7.f37586x = obj;
                return c11636x7;
            case 7:
                C11636x c11636x8 = new C11636x(2, 7, interfaceC30057d);
                c11636x8.f37586x = obj;
                return c11636x8;
            case 8:
                C11636x c11636x9 = new C11636x(2, 8, interfaceC30057d);
                c11636x9.f37586x = obj;
                return c11636x9;
            default:
                C11636x c11636x10 = new C11636x(2, 9, interfaceC30057d);
                c11636x10.f37586x = obj;
                return c11636x10;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f37585w) {
            case 0:
                return ((C11636x) create((AbstractC18138j) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C11636x) create(obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C11636x) create((AbstractC15508m) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                C11636x c11636x = (C11636x) create((InterfaceC16392g1) obj, (InterfaceC30057d) obj2);
                C23454a0 c23454a0 = C23454a0.f92919a;
                c11636x.invokeSuspend(c23454a0);
                return c23454a0;
            case 4:
                return ((C11636x) create((AbstractC18138j) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 5:
                return ((C11636x) create((String) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 6:
                return ((C11636x) create((C23328a) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 7:
                return ((C11636x) create((AbstractC26205h) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 8:
                return ((C11636x) create((String) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C11636x) create(obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f37585w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                AbstractC18138j abstractC18138j = (AbstractC18138j) this.f37586x;
                return Boolean.valueOf((abstractC18138j instanceof C18129a) || (abstractC18138j instanceof AbstractC18137i));
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(this.f37586x instanceof C12579y);
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(((AbstractC15508m) this.f37586x) instanceof C15498c);
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                ((InterfaceC16392g1) this.f37586x).mo29024a(0.0f);
                return C23454a0.f92919a;
            case 4:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(((AbstractC18138j) this.f37586x) instanceof C18129a);
            case 5:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                String str = (String) this.f37586x;
                return Boolean.valueOf(!(str == null || AbstractC39414r.m125890i0(str)));
            case 6:
                EnumC31071a enumC31071a7 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                C23328a c23328a = (C23328a) this.f37586x;
                if (!c23328a.f92492b) {
                    c23328a = null;
                }
                if (c23328a != null) {
                    return c23328a.f92491a;
                }
                return null;
            case 7:
                EnumC31071a enumC31071a8 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return (AbstractC26205h) this.f37586x;
            case 8:
                EnumC31071a enumC31071a9 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(((String) this.f37586x) != null);
            default:
                Object obj2 = this.f37586x;
                EnumC31071a enumC31071a10 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return obj2;
        }
    }
}
