package p409q0;

import bc3.AbstractC3006f0;
import p180h0.InterfaceC16413k2;
import p180h0.InterfaceC16432o1;
import p180h0.InterfaceC16439p3;
import p206i0.C17829g;
import p299l9.C23517o;
import p390p1.C28617g1;
import p505ts.AbstractC34132o;
import pf.C29124b;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: q0.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C29681e0 implements InterfaceC16432o1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC16439p3 f121310a;

    /* JADX INFO: renamed from: b */
    public final AbstractC29701y f121311b;

    public C29681e0(InterfaceC16439p3 interfaceC16439p3, AbstractC29701y abstractC29701y) {
        this.f121310a = interfaceC16439p3;
        this.f121311b = abstractC29701y;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p180h0.InterfaceC16432o1
    /* JADX INFO: renamed from: a */
    public final Object mo46565a(InterfaceC16413k2 interfaceC16413k2, float f13, InterfaceC30057d interfaceC30057d) throws Throwable {
        C29679d0 c29679d0;
        if (interfaceC30057d instanceof C29679d0) {
            c29679d0 = (C29679d0) interfaceC30057d;
            int i13 = c29679d0.f121308y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c29679d0.f121308y = i13 - Integer.MIN_VALUE;
            } else {
                c29679d0 = new C29679d0(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c29679d0 = new C29679d0(this, (AbstractC32269c) interfaceC30057d);
        }
        Object objM51263d = c29679d0.f121306w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c29679d0.f121308y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM51263d);
            C29124b c29124b = new C29124b(this, interfaceC16413k2);
            c29679d0.f121308y = 1;
            objM51263d = ((C17829g) this.f121310a).m51263d(interfaceC16413k2, f13, c29124b, c29679d0);
            if (objM51263d == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM51263d);
        }
        float fFloatValue = ((Number) objM51263d).floatValue();
        AbstractC29701y abstractC29701y = this.f121311b;
        C23517o c23517o = abstractC29701y.f121433d;
        C23517o c23517o2 = abstractC29701y.f121433d;
        if (((C28617g1) c23517o.f93080d).m87022x() != 0.0f && Math.abs(((C28617g1) c23517o2.f93080d).m87022x()) < 0.001d) {
            int iM91162k = abstractC29701y.m91162k();
            if (abstractC29701y.f121440k.mo9765b()) {
                AbstractC3006f0.m8732z(((C29693q) abstractC29701y.f121445p.getValue()).f121399s, null, null, new C29689m(abstractC29701y, 2, null), 3);
            }
            abstractC29701y.m91171w(0.0f, iM91162k, false);
        } else {
            new Float(((C28617g1) c23517o2.f93080d).m87022x());
        }
        return new Float(fFloatValue);
    }
}
