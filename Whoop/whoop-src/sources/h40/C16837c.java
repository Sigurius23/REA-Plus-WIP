package h40;

import c93.InterfaceC4351m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: h40.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C16837c extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f64705w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ boolean f64706x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C16837c(int i13, int i14, InterfaceC30057d interfaceC30057d) {
        super(i13, interfaceC30057d);
        this.f64705w = i14;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f64705w) {
            case 0:
                C16837c c16837c = new C16837c(2, 0, interfaceC30057d);
                c16837c.f64706x = ((Boolean) obj).booleanValue();
                return c16837c;
            case 1:
                C16837c c16837c2 = new C16837c(2, 1, interfaceC30057d);
                c16837c2.f64706x = ((Boolean) obj).booleanValue();
                return c16837c2;
            case 2:
                C16837c c16837c3 = new C16837c(2, 2, interfaceC30057d);
                c16837c3.f64706x = ((Boolean) obj).booleanValue();
                return c16837c3;
            case 3:
                C16837c c16837c4 = new C16837c(2, 3, interfaceC30057d);
                c16837c4.f64706x = ((Boolean) obj).booleanValue();
                return c16837c4;
            case 4:
                C16837c c16837c5 = new C16837c(2, 4, interfaceC30057d);
                c16837c5.f64706x = ((Boolean) obj).booleanValue();
                return c16837c5;
            default:
                C16837c c16837c6 = new C16837c(2, 5, interfaceC30057d);
                c16837c6.f64706x = ((Boolean) obj).booleanValue();
                return c16837c6;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f64705w;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (i13) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
        }
        return ((C16837c) create(bool, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f64705w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(!this.f64706x);
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(!this.f64706x);
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(this.f64706x);
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(!this.f64706x);
            case 4:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(this.f64706x);
            default:
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(this.f64706x);
        }
    }
}
