package p695zx;

import b10.C2222b;
import b10.C2273z0;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import bi.C3278p;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import hc3.AbstractC17182o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kc3.C22365e;
import l83.C23467m;
import l83.C23468n;
import p505ts.AbstractC34132o;
import p664yy.C39857f;
import p664yy.C39865j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import y00.C38783b;
import y00.C38883l;

/* JADX INFO: renamed from: zx.w */
/* JADX INFO: loaded from: classes6.dex */
public final class C41201w implements InterfaceC41184f {

    /* JADX INFO: renamed from: E */
    public final C2222b f177765E;

    /* JADX INFO: renamed from: F */
    public final C13045h2 f177766F;

    /* JADX INFO: renamed from: G */
    public final C13081r1 f177767G;

    /* JADX INFO: renamed from: w */
    public final C2273z0 f177768w;

    /* JADX INFO: renamed from: x */
    public final C39857f f177769x;

    /* JADX INFO: renamed from: y */
    public final C3278p f177770y;

    /* JADX INFO: renamed from: z */
    public final C39865j f177771z;

    public C41201w(C2273z0 c2273z0, C39857f c39857f, C3278p c3278p, C39865j c39865j, C2222b c2222b) {
        this.f177768w = c2273z0;
        this.f177769x = c39857f;
        this.f177770y = c3278p;
        this.f177771z = c39865j;
        this.f177765E = c2222b;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(Boolean.FALSE);
        this.f177766F = c13045h2M36593c;
        this.f177767G = AbstractC13091v.m36598h(c13045h2M36593c);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:44:0x010a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0114  */
    /* JADX WARN: Code duplicated, block: B:52:0x0127  */
    /* JADX WARN: Code duplicated, block: B:55:0x013d  */
    /* JADX WARN: Code duplicated, block: B:58:0x013a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:? A[LOOP:0: B:45:0x010e->B:60:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p695zx.InterfaceC41184f
    /* JADX INFO: renamed from: d */
    public final Object mo102860d(C41185g c41185g, InterfaceC30057d interfaceC30057d) {
        C41199u c41199u;
        C41179a c41179a;
        C41201w c41201w;
        C41201w c41201w2;
        C41199u c41199u2;
        C41185g c41185g2;
        C41199u c41199u3;
        Object obj;
        C41179a c41179a2;
        C41201w c41201w3;
        AbstractC3069w1 abstractC3069w1;
        C41200v c41200v;
        Object obj2;
        C41179a bin;
        C41185g c41185g3;
        C41201w c41201w4;
        boolean z4;
        List accountRanges;
        List list;
        Iterator it;
        C41185g c41185g4 = c41185g;
        if (interfaceC30057d instanceof C41199u) {
            c41199u = (C41199u) interfaceC30057d;
            int i13 = c41199u.f177758H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c41199u.f177758H = i13 - Integer.MIN_VALUE;
            } else {
                c41199u = new C41199u(this, (AbstractC32269c) interfaceC30057d);
            }
        } else {
            c41199u = new C41199u(this, (AbstractC32269c) interfaceC30057d);
        }
        Object obj3 = c41199u.f177756F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c41199u.f177758H;
        int i15 = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj3);
            c41179a = c41185g4.f177699g;
            if (c41179a == null) {
                return null;
            }
            C22365e c22365e = AbstractC3050q0.f12077a;
            AbstractC3069w1 abstractC3069w2 = AbstractC17182o.f65999a;
            C41200v c41200v2 = new C41200v(this, objArr == true ? 1 : 0, 0);
            c41199u.f177759w = this;
            c41199u.f177760x = c41185g4;
            c41199u.f177761y = c41179a;
            c41199u.f177762z = this;
            c41199u.f177755E = c41199u;
            c41199u.f177758H = 1;
            if (AbstractC3006f0.m8705K(abstractC3069w2, c41200v2, c41199u) != enumC31071a) {
                c41201w = this;
                c41201w2 = c41201w;
                c41199u2 = c41199u;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            C41199u c41199u4 = c41199u.f177755E;
            c41201w = (C41201w) c41199u.f177762z;
            c41179a = c41199u.f177761y;
            C41185g c41185g5 = c41199u.f177760x;
            c41201w2 = c41199u.f177759w;
            AbstractC34132o.m107864I(obj3);
            c41199u2 = c41199u4;
            c41185g4 = c41185g5;
        } else {
            if (i14 == 2) {
                c41199u3 = c41199u.f177755E;
                c41201w = (C41201w) c41199u.f177762z;
                c41179a2 = c41199u.f177761y;
                c41185g2 = c41199u.f177760x;
                c41201w3 = c41199u.f177759w;
                AbstractC34132o.m107864I(obj3);
                obj = ((C23468n) obj3).f92940w;
                if (!(obj instanceof C23467m)) {
                    obj = ((C38883l) obj).f167352x;
                }
                C22365e c22365e2 = AbstractC3050q0.f12077a;
                abstractC3069w1 = AbstractC17182o.f65999a;
                c41200v = new C41200v(c41201w, objArr2 == true ? 1 : 0, i15);
                c41199u.f177759w = c41201w3;
                c41199u.f177760x = c41185g2;
                c41199u.f177761y = c41179a2;
                c41199u.f177762z = obj;
                c41199u.f177755E = null;
                c41199u.f177758H = 3;
                if (AbstractC3006f0.m8705K(abstractC3069w1, c41200v, c41199u3) != enumC31071a) {
                    obj2 = obj;
                    bin = c41179a2;
                    c41185g3 = c41185g2;
                    c41201w4 = c41201w3;
                }
                return enumC31071a;
            }
            if (i14 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj2 = c41199u.f177762z;
            bin = c41199u.f177761y;
            c41185g3 = c41199u.f177760x;
            c41201w4 = c41199u.f177759w;
            AbstractC34132o.m107864I(obj3);
        }
        z4 = obj2 instanceof C23467m;
        if (!z4) {
            accountRanges = (List) obj2;
            C3278p c3278p = c41201w4.f177770y;
            AbstractC22676k.m65750j(bin, "bin");
            AbstractC22676k.m65750j(accountRanges, "accountRanges");
            c3278p.f12803a.put(bin, accountRanges);
            if (!accountRanges.isEmpty()) {
                list = accountRanges;
                if ((list instanceof Collection) || !list.isEmpty()) {
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((C38783b) it.next()).f166932w.m124344b(c41185g3)) {
                            }
                        } else if (c41185g3.f177700h) {
                            c41201w4.f177771z.m127938a(C2222b.m7051c(c41201w4.f177765E, PaymentAnalyticsEvent.CardMetadataMissingRange, null, null, null, null, 62));
                        }
                    }
                } else if (c41185g3.f177700h) {
                    c41201w4.f177771z.m127938a(C2222b.m7051c(c41201w4.f177765E, PaymentAnalyticsEvent.CardMetadataMissingRange, null, null, null, null, 62));
                }
            }
        }
        return (List) (z4 ? null : obj2);
        C2273z0 c2273z0 = c41201w2.f177768w;
        C39857f c39857f = c41201w2.f177769x;
        c41199u.f177759w = c41201w2;
        c41199u.f177760x = c41185g4;
        c41199u.f177761y = c41179a;
        c41199u.f177762z = c41201w;
        c41199u.f177755E = c41199u2;
        c41199u.f177758H = 2;
        Object objM7103z = c2273z0.m7103z(c41179a, c39857f, c41199u);
        if (objM7103z != enumC31071a) {
            C41179a c41179a3 = c41179a;
            c41185g2 = c41185g4;
            c41199u3 = c41199u2;
            obj = objM7103z;
            c41179a2 = c41179a3;
            c41201w3 = c41201w2;
            if (!(obj instanceof C23467m)) {
                obj = ((C38883l) obj).f167352x;
            }
            C22365e c22365e3 = AbstractC3050q0.f12077a;
            abstractC3069w1 = AbstractC17182o.f65999a;
            c41200v = new C41200v(c41201w, objArr2 == true ? 1 : 0, i15);
            c41199u.f177759w = c41201w3;
            c41199u.f177760x = c41185g2;
            c41199u.f177761y = c41179a2;
            c41199u.f177762z = obj;
            c41199u.f177755E = null;
            c41199u.f177758H = 3;
            if (AbstractC3006f0.m8705K(abstractC3069w1, c41200v, c41199u3) != enumC31071a) {
                obj2 = obj;
                bin = c41179a2;
                c41185g3 = c41185g2;
                c41201w4 = c41201w3;
                z4 = obj2 instanceof C23467m;
                if (!z4) {
                    accountRanges = (List) obj2;
                    C3278p c3278p2 = c41201w4.f177770y;
                    AbstractC22676k.m65750j(bin, "bin");
                    AbstractC22676k.m65750j(accountRanges, "accountRanges");
                    c3278p2.f12803a.put(bin, accountRanges);
                    if (!accountRanges.isEmpty()) {
                        list = accountRanges;
                        if (list instanceof Collection) {
                            it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((C38783b) it.next()).f166932w.m124344b(c41185g3)) {
                                    }
                                } else if (c41185g3.f177700h) {
                                    c41201w4.f177771z.m127938a(C2222b.m7051c(c41201w4.f177765E, PaymentAnalyticsEvent.CardMetadataMissingRange, null, null, null, null, 62));
                                }
                            }
                        } else {
                            it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((C38783b) it.next()).f166932w.m124344b(c41185g3)) {
                                    }
                                } else if (c41185g3.f177700h) {
                                    c41201w4.f177771z.m127938a(C2222b.m7051c(c41201w4.f177765E, PaymentAnalyticsEvent.CardMetadataMissingRange, null, null, null, null, 62));
                                }
                            }
                        }
                    }
                }
                return (List) (z4 ? null : obj2);
            }
        }
        return enumC31071a;
    }

    @Override // p695zx.InterfaceC41184f
    public final C13081r1 getLoading() {
        return this.f177767G;
    }
}
