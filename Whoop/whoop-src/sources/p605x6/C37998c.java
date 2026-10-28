package p605x6;

import bc3.AbstractC3028k2;
import bc3.C3033m;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ge3.AbstractC15751g;
import l83.C23454a0;
import p000.C31931s;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: x6.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C37998c extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f162772w;

    /* JADX INFO: renamed from: x */
    public int f162773x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37999d f162774y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37998c(C37999d c37999d, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f162772w = i13;
        this.f162774y = c37999d;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f162772w) {
            case 0:
                return new C37998c(this.f162774y, interfaceC30057d, 0);
            default:
                return new C37998c(this.f162774y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f162772w) {
            case 0:
                break;
        }
        return ((C37998c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f162772w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f162773x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    this.f162774y.m121738a();
                    C37999d c37999d = this.f162774y;
                    this.f162773x = 1;
                    C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(this));
                    c3033m.m8774s();
                    synchronized (c37999d.f162781z) {
                        c37999d.f162775E = 20;
                        c37999d.f162777G = c3033m;
                    }
                    c3033m.m8776u(new C31931s(c37999d, 27));
                    if (c3033m.m8773r() == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f162773x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C37999d c37999d2 = this.f162774y;
                    this.f162773x = 1;
                    c37999d2.getClass();
                    if (AbstractC3028k2.m8750d(5000L, new C37998c(c37999d2, null, 0), this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
        }
    }
}
