package x30;

import a00.C0071f;
import a40.InterfaceC0356a;
import android.content.Context;
import androidx.glance.session.SessionWorker;
import b10.C2273z0;
import b10.InterfaceC2227c1;
import b20.C2326f;
import b20.EnumC2323c;
import b20.EnumC2324d;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.model.StripeIntent$Status;
import com.stripe.android.model.StripeIntent$Usage;
import cz.C11194d;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import l83.C23454a0;
import l83.C23467m;
import l83.C23468n;
import m83.C25271y;
import m83.C25272z;
import p012ab.C0684i0;
import p33.C28820m;
import p390p1.InterfaceC28601c1;
import p395p6.C28894l;
import p479s4.AbstractC32123d;
import p499t9.C33623c0;
import p505ts.AbstractC34132o;
import p537ux.C35331f0;
import p537ux.C35363y;
import p550vd.AbstractC35903f;
import p605x6.C38011p;
import p605x6.InterfaceC38016u;
import p664yy.C39849b;
import p664yy.C39857f;
import p664yy.C39865j;
import p664yy.C39874n0;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import wb3.AbstractC37056f;
import y00.AbstractC38792b8;
import y00.C38775a1;
import y00.C38776a2;
import y00.C38840g6;
import y00.C38857i3;
import y00.C38867j3;
import y00.C38887l3;
import y00.C38915o4;
import y00.C38966u1;
import y00.C38976v2;
import y00.C38983w0;
import y00.C38984w1;
import y00.C39001y0;
import y00.C39002y1;
import y00.EnumC38807d3;
import y00.EnumC38817e3;
import y00.EnumC38828f4;
import y00.EnumC38837g3;
import y00.InterfaceC38786b2;
import y00.InterfaceC38802c8;
import y00.InterfaceC39010z0;
import z20.C40013g;
import z20.C40014h;
import z20.C40018l;

/* JADX INFO: renamed from: x30.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C37902k0 extends AbstractC32275i implements InterfaceC4351m {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f162284E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f162285w;

    /* JADX INFO: renamed from: x */
    public int f162286x;

    /* JADX INFO: renamed from: y */
    public /* synthetic */ Object f162287y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f162288z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37902k0(Object obj, Object obj2, Object obj3, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f162285w = i13;
        this.f162287y = obj;
        this.f162288z = obj2;
        this.f162284E = obj3;
    }

    @Override // s83.AbstractC32267a
    public final InterfaceC30057d create(Object obj, InterfaceC30057d interfaceC30057d) {
        switch (this.f162285w) {
            case 0:
                return new C37902k0((C37917p0) this.f162287y, (InterfaceC28601c1) this.f162288z, (InterfaceC0356a) this.f162284E, interfaceC30057d, 0);
            case 1:
                C37902k0 c37902k0 = new C37902k0((SessionWorker) this.f162288z, (C28894l) this.f162284E, interfaceC30057d, 1);
                c37902k0.f162287y = obj;
                return c37902k0;
            case 2:
                C37902k0 c37902k1 = new C37902k0((InterfaceC4351m) this.f162288z, (C35331f0) this.f162284E, interfaceC30057d, 2);
                c37902k1.f162287y = obj;
                return c37902k1;
            case 3:
                C37902k0 c37902k2 = new C37902k0((C39865j) this.f162288z, (C39849b) this.f162284E, interfaceC30057d, 3);
                c37902k2.f162287y = obj;
                return c37902k2;
            case 4:
                return new C37902k0((C40013g) this.f162287y, (C40014h) this.f162288z, (EnumC38828f4) this.f162284E, interfaceC30057d, 4);
            default:
                return new C37902k0((InterfaceC38786b2) this.f162287y, (C40018l) this.f162288z, (Throwable) this.f162284E, interfaceC30057d, 5);
        }
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f162285w) {
            case 0:
                return ((C37902k0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 1:
                return ((C37902k0) create((InterfaceC38016u) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 2:
                return ((C37902k0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 3:
                return ((C37902k0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            case 4:
                return ((C37902k0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
            default:
                return ((C37902k0) create((InterfaceC2994c0) obj, (InterfaceC30057d) obj2)).invokeSuspend(C23454a0.f92919a);
        }
    }

    @Override // s83.AbstractC32267a
    public final Object invokeSuspend(Object obj) {
        Object objM8719m;
        AtomicReference atomicReference;
        Object objM107888l;
        Object objM1727r;
        Object objM7056B;
        Object c38840g6;
        Object objM7072R;
        InterfaceC38802c8 interfaceC38802c8M124349b;
        int i13 = this.f162285w;
        C23454a0 c23454a0 = C23454a0.f92919a;
        Object obj2 = this.f162284E;
        Object obj3 = this.f162288z;
        switch (i13) {
            case 0:
                InterfaceC28601c1 interfaceC28601c1 = (InterfaceC28601c1) obj3;
                C37917p0 c37917p0 = (C37917p0) this.f162287y;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = this.f162286x;
                if (i14 != 0) {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return c23454a0;
                }
                AbstractC34132o.m107864I(obj);
                C13052j1 c13052j1M36606p = AbstractC13091v.m36606p(AbstractC13091v.m36612v(c37917p0.f162368w, 1), c37917p0.f162355j, c37917p0.f162370y, new C37896i0(interfaceC28601c1, null));
                C37899j0 c37899j0 = new C37899j0((InterfaceC0356a) obj2, interfaceC28601c1, null);
                this.f162286x = 1;
                return AbstractC13091v.m36604n(c13052j1M36606p, c37899j0, this) == enumC31071a ? enumC31071a : c23454a0;
            case 1:
                SessionWorker sessionWorker = (SessionWorker) obj3;
                EnumC31071a enumC31071a2 = EnumC31071a.f128113w;
                int i15 = this.f162286x;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                InterfaceC38016u interfaceC38016u = (InterfaceC38016u) this.f162287y;
                Context applicationContext = sessionWorker.getApplicationContext();
                InterfaceC30057d interfaceC30057d = null;
                C38011p c38011p = new C38011p(interfaceC38016u, sessionWorker, null);
                C0071f c0071f = new C0071f(interfaceC38016u, sessionWorker, (C28894l) obj2, interfaceC30057d, 8);
                this.f162286x = 1;
                Object objM8719m2 = AbstractC3006f0.m8719m(new C28820m(applicationContext, c0071f, c38011p, interfaceC30057d, 12), this);
                return objM8719m2 == enumC31071a2 ? enumC31071a2 : objM8719m2;
            case 2:
                EnumC31071a enumC31071a3 = EnumC31071a.f128113w;
                int i16 = this.f162286x;
                if (i16 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f162287y;
                    AtomicReference atomicReference2 = new AtomicReference(null);
                    C11194d c11194d = new C11194d((InterfaceC4351m) obj3, (C35331f0) obj2, interfaceC2994c0, atomicReference2, (InterfaceC30057d) null, 16);
                    this.f162287y = atomicReference2;
                    this.f162286x = 1;
                    objM8719m = AbstractC3006f0.m8719m(c11194d, this);
                    if (objM8719m == enumC31071a3) {
                        return enumC31071a3;
                    }
                    atomicReference = atomicReference2;
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    atomicReference = (AtomicReference) this.f162287y;
                    AbstractC34132o.m107864I(obj);
                    objM8719m = obj;
                }
                InterfaceC3027k1 interfaceC3027k1 = (InterfaceC3027k1) atomicReference.get();
                if (interfaceC3027k1 != null) {
                    interfaceC3027k1.cancel((CancellationException) null);
                }
                return objM8719m;
            case 3:
                C39865j c39865j = (C39865j) obj3;
                EnumC31071a enumC31071a4 = EnumC31071a.f128113w;
                int i17 = this.f162286x;
                try {
                    if (i17 == 0) {
                        AbstractC34132o.m107864I(obj);
                        C39849b c39849b = (C39849b) obj2;
                        C0684i0 c0684i0 = c39865j.f172153a;
                        this.f162286x = 1;
                        objM1727r = c0684i0.m1727r(c39849b, this);
                        if (objM1727r == enumC31071a4) {
                            return enumC31071a4;
                        }
                    } else {
                        if (i17 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        objM1727r = obj;
                    }
                    objM107888l = (C39874n0) objM1727r;
                    break;
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                Throwable thM68037a = C23468n.m68037a(objM107888l);
                if (thM68037a == null) {
                    return c23454a0;
                }
                c39865j.f172155c.m94512b("Exception while making analytics request", thM68037a);
                return c23454a0;
            case 4:
                C40014h c40014h = (C40014h) obj3;
                C40013g c40013g = (C40013g) this.f162287y;
                C2326f c2326f = c40013g.f172623d;
                EnumC31071a enumC31071a5 = EnumC31071a.f128113w;
                int i18 = this.f162286x;
                if (i18 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC2227c1 interfaceC2227c1 = c40013g.f172620a;
                    C38976v2 c38976v2 = new C38976v2(c40014h.f172626a, (EnumC38828f4) obj2, new Integer(100), null, null);
                    Set set = c40013g.f172625f;
                    C39857f c39857f = new C39857f(c40014h.f172627b, ((C35363y) c40013g.f172621b.get()).f150634x, 4);
                    this.f162286x = 1;
                    objM7056B = ((C2273z0) interfaceC2227c1).m7056B(c38976v2, set, c39857f, this);
                    if (objM7056B == enumC31071a5) {
                        return enumC31071a5;
                    }
                } else {
                    if (i18 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM7056B = ((C23468n) obj).f92940w;
                }
                Throwable thM68037a2 = C23468n.m68037a(objM7056B);
                if (thM68037a2 != null) {
                    c40013g.f172622c.m94512b("Failed to retrieve payment methods.", thM68037a2);
                    EnumC2323c enumC2323c = EnumC2323c.GET_SAVED_PAYMENT_METHODS_FAILURE;
                    int i19 = StripeException.f22154E;
                    AbstractC35903f.m113990H(c2326f, enumC2323c, AbstractC32123d.m100024d(thM68037a2), null, 4);
                }
                if (!(objM7056B instanceof C23467m)) {
                    AbstractC35903f.m113990H(c2326f, EnumC2324d.GET_SAVED_PAYMENT_METHODS_SUCCESS, null, null, 6);
                }
                return new C23468n(objM7056B);
            default:
                C40018l c40018l = (C40018l) obj3;
                InterfaceC2227c1 interfaceC2227c2 = c40018l.f172639a;
                EnumC31071a enumC31071a6 = EnumC31071a.f128113w;
                int i24 = this.f162286x;
                C25271y c25271y = C25271y.f99162w;
                if (i24 == 0) {
                    AbstractC34132o.m107864I(obj);
                    InterfaceC38786b2 interfaceC38786b2 = (InterfaceC38786b2) this.f162287y;
                    if (interfaceC38786b2 instanceof C39002y1) {
                        String str = ((C39002y1) interfaceC38786b2).f167879w;
                        C39857f c39857fM128247c = c40018l.m128247c();
                        List listM118958J = AbstractC37056f.m118958J("payment_method");
                        this.f162286x = 1;
                        objM7072R = ((C2273z0) interfaceC2227c2).m7071Q(str, c39857fM128247c, listM118958J, this);
                        if (objM7072R == enumC31071a6) {
                            return enumC31071a6;
                        }
                    } else if (interfaceC38786b2 instanceof C38776a2) {
                        String str2 = ((C38776a2) interfaceC38786b2).f166909w;
                        C39857f c39857fM128247c2 = c40018l.m128247c();
                        List listM118958J2 = AbstractC37056f.m118958J("payment_method");
                        this.f162286x = 2;
                        objM7072R = ((C2273z0) interfaceC2227c2).m7072R(str2, c39857fM128247c2, listM118958J2, this);
                        if (objM7072R == enumC31071a6) {
                            return enumC31071a6;
                        }
                    } else {
                        if (!(interfaceC38786b2 instanceof C38984w1)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        C39857f c39857fM128247c3 = c40018l.m128247c();
                        C38775a1 c38775a1 = ((C38984w1) interfaceC38786b2).f167813x;
                        long timeInMillis = Calendar.getInstance().getTimeInMillis();
                        InterfaceC39010z0 interfaceC39010z0 = c38775a1.f166898w;
                        List list = c38775a1.f166899x;
                        if (interfaceC39010z0 instanceof C38983w0) {
                            C38983w0 c38983w0 = (C38983w0) interfaceC39010z0;
                            c38840g6 = new C38887l3(c38775a1.f166900y, list, Long.valueOf(c38983w0.f167800w), 0L, null, null, null, null, null, timeInMillis, c38775a1.f166898w.mo124402k0(), null, c39857fM128247c3.m127934f(), null, null, null, null, null, null, null, c25271y, null, null, c38983w0.f167799E, list.isEmpty(), 7334072);
                        } else {
                            if (!(interfaceC39010z0 instanceof C39001y0)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            c38840g6 = new C38840g6(c38775a1.f166900y, timeInMillis, null, c39857fM128247c3.m127934f(), list, null, c25271y, c25271y, list.isEmpty());
                        }
                        objM7072R = c38840g6;
                    }
                } else {
                    if (i24 != 1 && i24 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    objM7072R = ((C23468n) obj).f92940w;
                }
                Throwable th4 = (Throwable) obj2;
                if (!(objM7072R instanceof C23467m)) {
                    InterfaceC38802c8 interfaceC38802c8 = (InterfaceC38802c8) objM7072R;
                    List listMo124336p = interfaceC38802c8.mo124336p();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : listMo124336p) {
                        C33623c0 c33623c0 = EnumC38828f4.f167088G;
                        if (!AbstractC22676k.m65745e((String) obj4, "wechat_pay")) {
                            arrayList.add(obj4);
                        }
                    }
                    boolean zIsEmpty = arrayList.isEmpty();
                    List listM118958J3 = arrayList;
                    if (zIsEmpty) {
                        listM118958J3 = AbstractC37056f.m118958J("card");
                    }
                    List list2 = listM118958J3;
                    if (interfaceC38802c8 instanceof C38887l3) {
                        C38887l3 c38887l3 = (C38887l3) interfaceC38802c8;
                        String str3 = c38887l3.f167391w;
                        Long l7 = c38887l3.f167393y;
                        long j7 = c38887l3.f167394z;
                        EnumC38807d3 enumC38807d3 = c38887l3.f167370E;
                        EnumC38817e3 captureMethod = c38887l3.f167371F;
                        String str4 = c38887l3.f167372G;
                        EnumC38837g3 confirmationMethod = c38887l3.f167373H;
                        String str5 = c38887l3.f167374I;
                        long j13 = c38887l3.f167375J;
                        String str6 = c38887l3.f167376K;
                        String str7 = c38887l3.f167377L;
                        boolean z4 = c38887l3.f167378M;
                        C38915o4 c38915o4 = c38887l3.f167379N;
                        String str8 = c38887l3.f167380O;
                        String str9 = c38887l3.f167381P;
                        StripeIntent$Status stripeIntent$Status = c38887l3.f167382Q;
                        StripeIntent$Usage stripeIntent$Usage = c38887l3.f167383R;
                        C38857i3 c38857i3 = c38887l3.f167384S;
                        C38867j3 c38867j3 = c38887l3.f167385T;
                        List unactivatedPaymentMethods = c38887l3.f167386U;
                        List linkFundingSources = c38887l3.f167387V;
                        AbstractC38792b8 abstractC38792b8 = c38887l3.f167388W;
                        String str10 = c38887l3.f167389X;
                        boolean z13 = c38887l3.f167390Y;
                        AbstractC22676k.m65750j(captureMethod, "captureMethod");
                        AbstractC22676k.m65750j(confirmationMethod, "confirmationMethod");
                        AbstractC22676k.m65750j(unactivatedPaymentMethods, "unactivatedPaymentMethods");
                        AbstractC22676k.m65750j(linkFundingSources, "linkFundingSources");
                        interfaceC38802c8M124349b = new C38887l3(str3, list2, l7, j7, enumC38807d3, captureMethod, str4, confirmationMethod, str5, j13, str6, str7, z4, c38915o4, str8, str9, stripeIntent$Status, stripeIntent$Usage, c38857i3, c38867j3, unactivatedPaymentMethods, linkFundingSources, abstractC38792b8, str10, z13);
                    } else {
                        if (!(interfaceC38802c8 instanceof C38840g6)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        interfaceC38802c8M124349b = C38840g6.m124349b((C38840g6) interfaceC38802c8, null, list2, 261631);
                    }
                    InterfaceC38802c8 interfaceC38802c9 = interfaceC38802c8M124349b;
                    String elementsSessionId = UUID.randomUUID().toString();
                    AbstractC22676k.m65750j(elementsSessionId, "elementsSessionId");
                    objM7072R = new C38966u1(null, null, null, interfaceC38802c9, interfaceC38802c9.mo124336p(), C25272z.f99163w, null, null, null, null, null, true, th4, c25271y, elementsSessionId, null, null, null, null);
                }
                return new C23468n(objM7072R);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37902k0(Object obj, Object obj2, InterfaceC30057d interfaceC30057d, int i13) {
        super(2, interfaceC30057d);
        this.f162285w = i13;
        this.f162288z = obj;
        this.f162284E = obj2;
    }
}
