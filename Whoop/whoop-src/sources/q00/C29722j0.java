package q00;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ch.C4588i;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import n20.C26175j;
import n53.C26318e;
import p266jz.C22058f;
import p505ts.AbstractC34132o;
import p631xz.C38747x;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import y00.C38876k2;

/* JADX INFO: renamed from: q00.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29722j0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f121564w;

    /* JADX INFO: renamed from: x */
    public int f121565x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C29734p0 f121566y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C29722j0(C29734p0 c29734p0, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f121564w = i13;
        this.f121566y = c29734p0;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f121564w) {
            case 0:
                return new C29722j0(this.f121566y, interfaceC30057d, 0);
            case 1:
                return new C29722j0(this.f121566y, interfaceC30057d, 1);
            case 2:
                return new C29722j0(this.f121566y, interfaceC30057d, 2);
            case 3:
                return new C29722j0(this.f121566y, interfaceC30057d, 3);
            default:
                return new C29722j0(this.f121566y, interfaceC30057d, 4);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) obj;
        InterfaceC30057d interfaceC30057d = (InterfaceC30057d) obj2;
        switch (this.f121564w) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((C29722j0) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM124153d;
        Object value;
        switch (this.f121564w) {
            case 0:
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f121565x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C29734p0 c29734p0 = this.f121566y;
                    String strM91180n = C29734p0.m91180n(c29734p0.f121602H);
                    this.f121565x = 1;
                    if (c29734p0.m91182o(strM91180n, false, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 1:
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i14 = this.f121565x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C29734p0 c29734p1 = this.f121566y;
                    C4588i c4588i = new C4588i(c29734p1.f121613y.f166754i, 2);
                    C26175j c26175j = new C26175j(c29734p1, (InterfaceC30057d) null, 17);
                    this.f121565x = 1;
                    if (AbstractC13091v.m36604n(c4588i, c26175j, this) == enumC31071a2) {
                        return enumC31071a2;
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i15 = this.f121565x;
                if (i15 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C29734p0 c29734p2 = this.f121566y;
                    C26318e c26318e = c29734p2.f121609O.f57725x;
                    C29724k0 c29724k0 = new C29724k0(c29734p2, null, 0);
                    this.f121565x = 1;
                    if (AbstractC13091v.m36604n(c26318e, c29724k0, this) == enumC31071a3) {
                        return enumC31071a3;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            case 3:
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i16 = this.f121565x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C29734p0 c29734p3 = this.f121566y;
                    C26318e c26318e2 = c29734p3.f121610P.f162224q;
                    C29724k0 c29724k1 = new C29724k0(c29734p3, null, 1);
                    this.f121565x = 1;
                    if (AbstractC13091v.m36604n(c26318e2, c29724k1, this) == enumC31071a4) {
                        return enumC31071a4;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            default:
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i17 = this.f121565x;
                C29734p0 c29734p4 = this.f121566y;
                if (i17 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C38747x c38747x = c29734p4.f121613y;
                    this.f121565x = 1;
                    objM124153d = c38747x.m124153d(this);
                    if (objM124153d == enumC31071a5) {
                        return enumC31071a5;
                    }
                } else {
                    if (i17 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM124153d = ((C23468n) obj).f92940w;
                }
                if (!(objM124153d instanceof C23467m)) {
                    try {
                        String str = ((C38876k2) objM124153d).f167323x;
                        String str2 = c29734p4.f121612x.f36660x;
                        AbstractC22676k.m65747g(str2);
                        objM124153d = new C22058f(str, str2, null);
                    } catch (Throwable th3) {
                        objM124153d = AbstractC34132o.m107888l(th3);
                    }
                }
                Throwable thM68037a = C23468n.m68037a(objM124153d);
                if (thM68037a == null) {
                    C22058f c22058f = (C22058f) objM124153d;
                    C13045h2 c13045h2 = c29734p4.f121607M;
                    do {
                        value = c13045h2.getValue();
                    } while (!c13045h2.m36569i(value, C29720i0.m91172a((C29720i0) value, null, null, false, null, null, null, null, null, new C29705b(c22058f), null, 267386879)));
                } else {
                    C29734p0.m91178j(c29734p4, thM68037a, "Failed to create Link account session");
                }
                return C23454a0.f92919a;
        }
    }
}
