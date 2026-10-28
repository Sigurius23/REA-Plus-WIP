package p007a6;

import c93.InterfaceC4351m;
import ec3.EnumC13102y1;
import l83.C23454a0;
import p390p1.EnumC28681w1;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: a6.p */
/* JADX INFO: loaded from: classes.dex */
public final class C0446p extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f1540w;

    /* JADX INFO: renamed from: x */
    public /* synthetic */ Object f1541x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0446p(int i13, int i14, InterfaceC30057d interfaceC30057d) {
        super(i13, interfaceC30057d);
        this.f1540w = i14;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f1540w) {
            case 0:
                C0446p c0446p = new C0446p(2, 0, interfaceC30057d);
                c0446p.f1541x = obj;
                return c0446p;
            case 1:
                C0446p c0446p2 = new C0446p(2, 1, interfaceC30057d);
                c0446p2.f1541x = obj;
                return c0446p2;
            default:
                C0446p c0446p3 = new C0446p(2, 2, interfaceC30057d);
                c0446p3.f1541x = obj;
                return c0446p3;
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f1540w) {
            case 0:
                return ((C0446p) create((AbstractC0418e1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C0446p) create((EnumC13102y1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C0446p) create((EnumC28681w1) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1540w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(!(((AbstractC0418e1) this.f1541x) instanceof C0453s0));
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(((EnumC13102y1) this.f1541x) != EnumC13102y1.f45274w);
            default:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                AbstractC34132o.m107864I(obj);
                return Boolean.valueOf(((EnumC28681w1) this.f1541x) == EnumC28681w1.f116014w);
        }
    }
}
