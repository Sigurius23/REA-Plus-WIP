package x20;

import a20.C0162b;
import androidx.lifecycle.AbstractC1640x1;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.C13031e0;
import f30.C14042e;
import l83.C23454a0;
import o23.C27486p;
import p000.C36623w;
import p023ay.C2138l;
import p337n8.C26444a;
import p505ts.AbstractC34132o;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: x20.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C37850r extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f162031w;

    /* JADX INFO: renamed from: x */
    public int f162032x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C37855w f162033y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37850r(C37855w c37855w, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f162031w = i13;
        this.f162033y = c37855w;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f162031w) {
            case 0:
                return new C37850r(this.f162033y, interfaceC30057d, 0);
            default:
                return new C37850r(this.f162033y, interfaceC30057d, 1);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f162031w) {
            case 0:
                break;
        }
        return ((C37850r) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        switch (this.f162031w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f162032x;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return C23454a0.f92919a;
                }
                AbstractC34132o.m107864I(obj);
                this.f162032x = 1;
                C37855w c37855w = this.f162033y;
                c37855w.f162052x.f50113g.collect(new C36623w(new C13031e0(2, new C2138l(c37855w, 1), new C27486p(c37855w, null, 16)), 23), this);
                return enumC31071a;
            default:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f162032x;
                C37855w c37855w2 = this.f162033y;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    long j7 = c37855w2.f162051w.f162036c;
                    this.f162032x = 1;
                    if (AbstractC3034m0.m8783c(j7, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                C14042e c14042e = c37855w2.f162052x;
                C26444a c26444aM5043b = AbstractC1640x1.m5043b(c37855w2);
                c14042e.getClass();
                c14042e.f50111e = AbstractC3006f0.m8732z(c26444aM5043b, c14042e.f50110d, null, new C0162b(c14042e, null, 20), 2);
                return C23454a0.f92919a;
        }
    }
}
