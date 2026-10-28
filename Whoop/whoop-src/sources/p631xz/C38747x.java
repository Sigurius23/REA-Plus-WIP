package p631xz;

import androidx.room.C1844y;
import b20.C2321a;
import b20.C2326f;
import b20.EnumC2323c;
import b20.EnumC2324d;
import b20.EnumC2325e;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.link.NoLinkAccountFoundException;
import com.stripe.android.link.account.AlreadyLoggedInLinkException;
import com.stripe.android.model.ConsentUi;
import com.stripe.android.model.ConsumerSession;
import com.stripe.android.model.ConsumerSessionLookup;
import com.stripe.android.model.ConsumerSessionRefresh;
import com.stripe.android.model.DisplayablePaymentDetails;
import d00.C11422a;
import d00.C11423b;
import d00.C11424c;
import d00.C11425d;
import d00.C11426e;
import d00.C11429h;
import d00.C11431j;
import d00.C11433l;
import d00.C11434m;
import d00.InterfaceC11427f;
import d00.InterfaceC11432k;
import e00.C12500w;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13081r1;
import hc3.AbstractC17182o;
import j00.EnumC21098e0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kc3.C22365e;
import l83.C23467m;
import l83.C23468n;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import o23.C27486p;
import p479s4.AbstractC32121b;
import p479s4.AbstractC32123d;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35903f;
import p599wz.C37699a;
import p599wz.C37708d;
import p599wz.C37718g0;
import p599wz.C37742o0;
import p599wz.C37745p0;
import p599wz.C37754s0;
import p599wz.InterfaceC37739n0;
import p665yz.C39899b;
import p665yz.C39900c;
import p665yz.EnumC39903f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import wb3.AbstractC37056f;
import y00.AbstractC38794c0;
import y00.C38804d0;
import y00.C38809d5;
import y00.C38850h6;
import y00.C38854i0;
import y00.C38874k0;
import y00.C38876k2;
import y00.C38901n;
import y00.EnumC38872j8;
import y00.EnumC38922p2;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: xz.x */
/* JADX INFO: loaded from: classes6.dex */
public final class C38747x {

    /* JADX INFO: renamed from: a */
    public final C38721f0 f166746a;

    /* JADX INFO: renamed from: b */
    public final C37718g0 f166747b;

    /* JADX INFO: renamed from: c */
    public final C12500w f166748c;

    /* JADX INFO: renamed from: d */
    public final C39899b f166749d;

    /* JADX INFO: renamed from: e */
    public final C2326f f166750e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC37739n0 f166751f;

    /* JADX INFO: renamed from: g */
    public final C38719e0 f166752g;

    /* JADX INFO: renamed from: h */
    public final C13045h2 f166753h;

    /* JADX INFO: renamed from: i */
    public final C13081r1 f166754i;

    /* JADX INFO: renamed from: j */
    public C38874k0 f166755j;

    /* JADX INFO: renamed from: k */
    public final C13045h2 f166756k;

    /* JADX INFO: renamed from: l */
    public final C13081r1 f166757l;

    /* JADX INFO: renamed from: m */
    public final C1844y f166758m;

    public C38747x(C38721f0 linkAccountHolder, C37718g0 config, C12500w linkRepository, C39899b linkEventsReporter, C2326f errorReporter, InterfaceC37739n0 interfaceC37739n0, C38719e0 linkAuth) {
        AbstractC22676k.m65750j(linkAccountHolder, "linkAccountHolder");
        AbstractC22676k.m65750j(config, "config");
        AbstractC22676k.m65750j(linkRepository, "linkRepository");
        AbstractC22676k.m65750j(linkEventsReporter, "linkEventsReporter");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(linkAuth, "linkAuth");
        this.f166746a = linkAccountHolder;
        this.f166747b = config;
        this.f166748c = linkRepository;
        this.f166749d = linkEventsReporter;
        this.f166750e = errorReporter;
        this.f166751f = interfaceC37739n0;
        this.f166752g = linkAuth;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(null);
        this.f166753h = c13045h2M36593c;
        this.f166754i = AbstractC13091v.m36598h(c13045h2M36593c);
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(null);
        this.f166756k = c13045h2M36593c2;
        this.f166757l = AbstractC13091v.m36598h(c13045h2M36593c2);
        this.f166758m = new C1844y(8, linkAccountHolder.f166664b, this);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Object m124149p(C38747x c38747x, ConsumerSession consumerSession, String str, AbstractC32269c abstractC32269c, int i13) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        return c38747x.m124164o(consumerSession, str, null, null, abstractC32269c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0093, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m124150a(java.lang.String r7, java.lang.Boolean r8, s83.AbstractC32269c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof p631xz.C38710a
            if (r0 == 0) goto L13
            r0 = r9
            xz.a r0 = (p631xz.C38710a) r0
            int r1 = r0.f166612z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f166612z = r1
            goto L18
        L13:
            xz.a r0 = new xz.a
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f166610x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f166612z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            p505ts.AbstractC34132o.m107864I(r9)
            goto L96
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            xz.x r7 = r0.f166609w
            p505ts.AbstractC34132o.m107864I(r9)
            l83.n r9 = (l83.C23468n) r9
            java.lang.Object r8 = r9.f92940w
            goto L69
        L3c:
            p505ts.AbstractC34132o.m107864I(r9)
            xz.f0 r9 = r6.f166746a
            ec3.r1 r9 = r9.f166664b
            ec3.f2 r9 = r9.f45200w
            java.lang.Object r9 = r9.getValue()
            wz.d r9 = (p599wz.C37708d) r9
            d00.l r9 = r9.f161571w
            if (r9 != 0) goto L59
            com.stripe.android.link.NoLinkAccountFoundException r7 = new com.stripe.android.link.NoLinkAccountFoundException
            r7.<init>()
            l83.m r7 = p505ts.AbstractC34132o.m107888l(r7)
            return r7
        L59:
            java.lang.String r9 = r9.f36652G
            r0.f166609w = r6
            r0.f166612z = r4
            e00.w r2 = r6.f166748c
            java.lang.Object r8 = r2.m35115c(r7, r9, r8, r0)
            if (r8 != r1) goto L68
            goto L95
        L68:
            r7 = r6
        L69:
            boolean r9 = r8 instanceof l83.C23467m
            r2 = 0
            if (r9 != 0) goto L78
            r4 = r8
            com.stripe.android.model.ConsumerSession r4 = (com.stripe.android.model.ConsumerSession) r4
            yz.b r4 = r7.f166749d
            yz.c r5 = p665yz.C39900c.f172289Q
            r4.m128003a(r5, r2)
        L78:
            java.lang.Throwable r4 = l83.C23468n.m68037a(r8)
            if (r4 == 0) goto L85
            yz.b r4 = r7.f166749d
            yz.c r5 = p665yz.C39900c.f172290R
            r4.m128003a(r5, r2)
        L85:
            if (r9 != 0) goto L99
            com.stripe.android.model.ConsumerSession r8 = (com.stripe.android.model.ConsumerSession) r8
            r0.f166609w = r2
            r0.f166612z = r3
            r9 = 14
            java.lang.Object r9 = m124149p(r7, r8, r2, r0, r9)
            if (r9 != r1) goto L96
        L95:
            return r1
        L96:
            d00.l r9 = (d00.C11433l) r9
            return r9
        L99:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p631xz.C38747x.m124150a(java.lang.String, java.lang.Boolean, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public final Object m124151b(String str, AbstractC32269c abstractC32269c) {
        C38712b c38712b;
        if (abstractC32269c instanceof C38712b) {
            c38712b = (C38712b) abstractC32269c;
            int i13 = c38712b.f166626y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38712b.f166626y = i13 - Integer.MIN_VALUE;
            } else {
                c38712b = new C38712b(this, abstractC32269c);
            }
        } else {
            c38712b = new C38712b(this, abstractC32269c);
        }
        C38712b c38712b2 = c38712b;
        Object obj = c38712b2.f166624w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38712b2.f166626y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C11433l c11433l = ((C37708d) this.f166746a.f166664b.f45200w.getValue()).f161571w;
        if (c11433l == null) {
            AbstractC35903f.m113990H(this.f166750e, EnumC2325e.LINK_ATTACH_BANK_ACCOUNT_WITH_NULL_ACCOUNT, null, null, 6);
            return AbstractC34132o.m107888l(new IllegalStateException("A non-null Link account is needed to create payment details"));
        }
        String str2 = c11433l.f36653H;
        String str3 = c11433l.f36652G;
        C38901n c38901n = this.f166747b.f161635i0;
        c38712b2.f166626y = 1;
        Object objM35117e = this.f166748c.m35117e(str, str2, str3, c38901n, c38712b2);
        return objM35117e == enumC31071a ? enumC31071a : objM35117e;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: c */
    public final Object m124152c(C38809d5 c38809d5, AbstractC32269c abstractC32269c) {
        C38714c c38714c;
        Object objM35118f;
        C38747x c38747x;
        if (abstractC32269c instanceof C38714c) {
            c38714c = (C38714c) abstractC32269c;
            int i13 = c38714c.f166641z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38714c.f166641z = i13 - Integer.MIN_VALUE;
            } else {
                c38714c = new C38714c(this, abstractC32269c);
            }
        } else {
            c38714c = new C38714c(this, abstractC32269c);
        }
        C38714c c38714c2 = c38714c;
        Object obj = c38714c2.f166639x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38714c2.f166641z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C11433l c11433l = ((C37708d) this.f166746a.f166664b.f45200w.getValue()).f161571w;
            if (c11433l == null) {
                AbstractC35903f.m113990H(this.f166750e, EnumC2325e.LINK_ATTACH_CARD_WITH_NULL_ACCOUNT, null, null, 6);
                return AbstractC34132o.m107888l(new IllegalStateException("A non-null Link account is needed to create payment details"));
            }
            String str = c11433l.f36653H;
            C37718g0 c37718g0 = this.f166747b;
            InterfaceC38802c8 interfaceC38802c8 = c37718g0.f161636w;
            String str2 = c11433l.f36652G;
            C38901n c38901n = c37718g0.f161635i0;
            c38714c2.f166638w = this;
            c38714c2.f166641z = 1;
            objM35118f = this.f166748c.m35118f(c38809d5, str, str2, c38901n, c38714c2);
            if (objM35118f == enumC31071a) {
                return enumC31071a;
            }
            c38747x = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c38747x = c38714c2.f166638w;
            AbstractC34132o.m107864I(obj);
            objM35118f = ((C23468n) obj).f92940w;
        }
        if (!(objM35118f instanceof C23467m)) {
            AbstractC35903f.m113990H(c38747x.f166750e, EnumC2324d.LINK_CREATE_CARD_SUCCESS, null, null, 6);
        }
        return objM35118f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m124153d(AbstractC32269c abstractC32269c) {
        C38716d c38716d;
        Object objM35119g;
        if (abstractC32269c instanceof C38716d) {
            c38716d = (C38716d) abstractC32269c;
            int i13 = c38716d.f166647y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38716d.f166647y = i13 - Integer.MIN_VALUE;
            } else {
                c38716d = new C38716d(this, abstractC32269c);
            }
        } else {
            c38716d = new C38716d(this, abstractC32269c);
        }
        Object obj = c38716d.f166645w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38716d.f166647y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                C11433l c11433l = ((C37708d) this.f166746a.f166664b.f45200w.getValue()).f161571w;
                if (c11433l == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                C12500w c12500w = this.f166748c;
                String str = c11433l.f36652G;
                C37718g0 c37718g0 = this.f166747b;
                InterfaceC38802c8 interfaceC38802c8 = c37718g0.f161636w;
                EnumC38922p2 enumC38922p2 = c37718g0.f161620T;
                c38716d.f166647y = 1;
                objM35119g = c12500w.m35119g(str, interfaceC38802c8, enumC38922p2, c38716d);
                if (objM35119g == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM35119g = ((C23468n) obj).f92940w;
            }
            AbstractC34132o.m107864I(objM35119g);
            return (C38876k2) objM35119g;
        } catch (Throwable th3) {
            return AbstractC34132o.m107888l(th3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m124154e(String str, AbstractC32269c abstractC32269c) {
        C38718e c38718e;
        if (abstractC32269c instanceof C38718e) {
            c38718e = (C38718e) abstractC32269c;
            int i13 = c38718e.f166653y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38718e.f166653y = i13 - Integer.MIN_VALUE;
            } else {
                c38718e = new C38718e(this, abstractC32269c);
            }
        } else {
            c38718e = new C38718e(this, abstractC32269c);
        }
        Object obj = c38718e.f166651w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38718e.f166653y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C11433l c11433l = ((C37708d) this.f166746a.f166664b.f45200w.getValue()).f161571w;
        if (c11433l == null) {
            return AbstractC34132o.m107888l(new NoLinkAccountFoundException());
        }
        String str2 = c11433l.f36652G;
        c38718e.f166653y = 1;
        Object objM35120h = this.f166748c.m35120h(str, str2, c38718e);
        return objM35120h == enumC31071a ? enumC31071a : objM35120h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m124155f(C11433l c11433l, boolean z4, AbstractC32269c abstractC32269c) {
        C38720f c38720f;
        if (abstractC32269c instanceof C38720f) {
            c38720f = (C38720f) abstractC32269c;
            int i13 = c38720f.f166662y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38720f.f166662y = i13 - Integer.MIN_VALUE;
            } else {
                c38720f = new C38720f(this, abstractC32269c);
            }
        } else {
            c38720f = new C38720f(this, abstractC32269c);
        }
        Object objM124159j = c38720f.f166660w;
        Object obj = EnumC31071a.f128113w;
        int i14 = c38720f.f166662y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM124159j);
            String str = this.f166747b.f161606F.f161585x;
            if (str == null || !z4) {
                str = null;
            }
            c38720f.f166662y = 1;
            objM124159j = m124159j(c11433l, str, c38720f);
            if (objM124159j == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM124159j);
        }
        C23468n c23468n = (C23468n) objM124159j;
        if (c23468n != null) {
            Object c11422a = c23468n.f92940w;
            if (!(c11422a instanceof C23467m)) {
                C11433l c11433l2 = (C11433l) c11422a;
                c11422a = c11433l2 != null ? c11433l2.f36657L : null;
            }
            Throwable thM68037a = C23468n.m68037a(c11422a);
            if (thM68037a != null) {
                c11422a = new C11422a(thM68037a);
            }
            InterfaceC11427f interfaceC11427f = (InterfaceC11427f) c11422a;
            if (interfaceC11427f != null) {
                return interfaceC11427f;
            }
        }
        return C11424c.f36644a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m124156g(Set set, AbstractC32269c abstractC32269c) {
        C38722g c38722g;
        Object objM35121i;
        C38747x c38747x;
        C37699a c37699a;
        if (abstractC32269c instanceof C38722g) {
            c38722g = (C38722g) abstractC32269c;
            int i13 = c38722g.f166668z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38722g.f166668z = i13 - Integer.MIN_VALUE;
            } else {
                c38722g = new C38722g(this, abstractC32269c);
            }
        } else {
            c38722g = new C38722g(this, abstractC32269c);
        }
        Object obj = c38722g.f166666x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38722g.f166668z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C11433l c11433l = ((C37708d) this.f166746a.f166664b.f45200w.getValue()).f161571w;
            if (c11433l == null) {
                return AbstractC34132o.m107888l(new NoLinkAccountFoundException());
            }
            String str = c11433l.f36652G;
            c38722g.f166665w = this;
            c38722g.f166668z = 1;
            objM35121i = this.f166748c.m35121i(set, str, c38722g);
            if (objM35121i == enumC31071a) {
                return enumC31071a;
            }
            c38747x = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c38747x = c38722g.f166665w;
            AbstractC34132o.m107864I(obj);
            objM35121i = ((C23468n) obj).f92940w;
        }
        if (!(objM35121i instanceof C23467m)) {
            C38804d0 response = (C38804d0) objM35121i;
            C13045h2 c13045h2 = c38747x.f166753h;
            C37699a c37699a2 = (C37699a) c13045h2.getValue();
            if (c37699a2 != null) {
                AbstractC22676k.m65750j(response, "response");
                ArrayList arrayList = c37699a2.f161554a;
                int iM73988W = AbstractC25247g0.m73988W(AbstractC25267u.m74163i0(arrayList, 10));
                if (iM73988W < 16) {
                    iM73988W = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iM73988W);
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((C37754s0) obj2).f161721x.getId(), obj2);
                }
                List<AbstractC38794c0> list = response.f166994w;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list, 10));
                for (AbstractC38794c0 abstractC38794c0 : list) {
                    C37754s0 c37754s0 = (C37754s0) linkedHashMap.get(abstractC38794c0.getId());
                    arrayList2.add(c37754s0 != null ? C37754s0.m121161i(c37754s0, abstractC38794c0, null, 6) : new C37754s0(abstractC38794c0, null, null));
                }
                c37699a = new C37699a(arrayList2);
            } else {
                AbstractC22676k.m65750j(response, "response");
                List list2 = response.f166994w;
                ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new C37754s0((AbstractC38794c0) it.next(), null, null));
                }
                c37699a = new C37699a(arrayList3);
            }
            c13045h2.getClass();
            c13045h2.m36571k(null, c37699a);
        }
        return objM35121i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m124157h(AbstractC32269c abstractC32269c) {
        C38724h c38724h;
        if (abstractC32269c instanceof C38724h) {
            c38724h = (C38724h) abstractC32269c;
            int i13 = c38724h.f166674y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38724h.f166674y = i13 - Integer.MIN_VALUE;
            } else {
                c38724h = new C38724h(this, abstractC32269c);
            }
        } else {
            c38724h = new C38724h(this, abstractC32269c);
        }
        Object obj = c38724h.f166672w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38724h.f166674y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C11433l c11433l = ((C37708d) this.f166746a.f166664b.f45200w.getValue()).f161571w;
        if (c11433l == null) {
            return AbstractC34132o.m107888l(new NoLinkAccountFoundException());
        }
        String str = c11433l.f36652G;
        c38724h.f166674y = 1;
        Object objM35122j = this.f166748c.m35122j(str, c38724h);
        return objM35122j == enumC31071a ? enumC31071a : objM35122j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: i */
    public final Object m124158i(AbstractC32269c abstractC32269c) {
        C38726i c38726i;
        Object objM107888l;
        C38747x c38747x;
        Object objM35123k;
        Object objM107888l2;
        if (abstractC32269c instanceof C38726i) {
            c38726i = (C38726i) abstractC32269c;
            int i13 = c38726i.f166679z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38726i.f166679z = i13 - Integer.MIN_VALUE;
            } else {
                c38726i = new C38726i(this, abstractC32269c);
            }
        } else {
            c38726i = new C38726i(this, abstractC32269c);
        }
        Object obj = c38726i.f166677x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38726i.f166679z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                try {
                    objM107888l = ((C37708d) this.f166746a.f166664b.f45200w.getValue()).f161571w;
                    if (objM107888l == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } catch (Throwable th3) {
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
                if (objM107888l instanceof C23467m) {
                    return objM107888l;
                }
                C11433l c11433l = (C11433l) objM107888l;
                try {
                    C12500w c12500w = this.f166748c;
                    String str = c11433l.f36652G;
                    String str2 = c11433l.f36660x;
                    c38726i.f166676w = this;
                    c38726i.f166679z = 1;
                    objM35123k = c12500w.m35123k(str, str2, c38726i);
                    if (objM35123k == enumC31071a) {
                        return enumC31071a;
                    }
                    c38747x = this;
                } catch (Throwable th4) {
                    th = th4;
                    c38747x = this;
                    objM107888l2 = AbstractC34132o.m107888l(th);
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c38747x = c38726i.f166676w;
                try {
                    AbstractC34132o.m107864I(obj);
                    objM35123k = ((C23468n) obj).f92940w;
                } catch (Throwable th5) {
                    th = th5;
                    objM107888l2 = AbstractC34132o.m107888l(th);
                }
            }
            AbstractC34132o.m107864I(objM35123k);
            objM107888l2 = (ConsumerSession) objM35123k;
            if (!(objM107888l2 instanceof C23467m)) {
                AbstractC35903f.m113990H(c38747x.f166750e, EnumC2324d.LINK_LOG_OUT_SUCCESS, null, null, 6);
            }
            Throwable thM68037a = C23468n.m68037a(objM107888l2);
            if (thM68037a != null) {
                C2326f c2326f = c38747x.f166750e;
                EnumC2323c enumC2323c = EnumC2323c.LINK_LOG_OUT_FAILURE;
                int i15 = StripeException.f22154E;
                AbstractC35903f.m113990H(c2326f, enumC2323c, AbstractC32123d.m100024d(thM68037a), null, 4);
                String msg = "Failed to log out of Link: " + thM68037a;
                AbstractC22676k.m65750j(msg, "msg");
            }
            AbstractC34132o.m107864I(objM107888l2);
            return (ConsumerSession) objM107888l2;
        } catch (Throwable th6) {
            return AbstractC34132o.m107888l(th6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0087, code lost:
    
        if (r8 == r0) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00b0, code lost:
    
        if (r8 == r0) goto L55;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable m124159j(d00.C11433l r8, java.lang.String r9, s83.AbstractC32269c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof p631xz.C38728j
            if (r0 == 0) goto L14
            r0 = r10
            xz.j r0 = (p631xz.C38728j) r0
            int r1 = r0.f166683y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f166683y = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            xz.j r0 = new xz.j
            r0.<init>(r7, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.f166681w
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f166683y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L41
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            p505ts.AbstractC34132o.m107864I(r10)
            l83.n r10 = (l83.C23468n) r10
            java.lang.Object r8 = r10.f92940w
            goto L8a
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L38:
            p505ts.AbstractC34132o.m107864I(r10)
            l83.n r10 = (l83.C23468n) r10
            java.lang.Object r8 = r10.f92940w
            goto Lb3
        L41:
            p505ts.AbstractC34132o.m107864I(r10)
            wz.g0 r10 = r7.f166747b
            r1 = 0
            wz.n0 r4 = r7.f166751f
            if (r4 == 0) goto L96
            boolean r5 = r4 instanceof p599wz.C37724i0
            if (r5 != 0) goto L96
            boolean r5 = r4 instanceof p599wz.C37730k0
            if (r5 != 0) goto L96
            wz.l0 r5 = p599wz.C37733l0.f161684w
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L96
            boolean r5 = r4 instanceof p599wz.C37736m0
            if (r5 == 0) goto L60
            goto L96
        L60:
            boolean r9 = r4 instanceof p599wz.C37727j0
            if (r9 == 0) goto L90
            wz.j0 r4 = (p599wz.C37727j0) r4
            java.lang.String r9 = r4.f161667w
            if (r8 == 0) goto L7d
            d00.m r3 = r8.f36662z
            if (r3 == 0) goto L71
            java.lang.String r3 = r3.f36663w
            goto L72
        L71:
            r3 = r1
        L72:
            boolean r3 = p715kotlin.jvm.internal.AbstractC22676k.m65745e(r3, r9)
            if (r3 == 0) goto L79
            goto L7a
        L79:
            r8 = r1
        L7a:
            if (r8 == 0) goto L7d
            goto L8a
        L7d:
            java.lang.String r8 = r10.m121145b()
            r6.f166683y = r2
            java.lang.Object r8 = r7.m124161l(r9, r8, r6)
            if (r8 != r0) goto L8a
            goto Lb2
        L8a:
            l83.n r9 = new l83.n
            r9.<init>(r8)
            return r9
        L90:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        L96:
            if (r8 == 0) goto L9e
            l83.n r9 = new l83.n
            r9.<init>(r8)
            return r9
        L9e:
            if (r9 == 0) goto Lb9
            r8 = r3
            y00.c2 r3 = y00.EnumC38796c2.CUSTOMER_OBJECT
            java.lang.String r5 = r10.m121145b()
            r6.f166683y = r8
            r4 = 1
            r1 = r7
            r2 = r9
            java.lang.Object r8 = r1.m124160k(r2, r3, r4, r5, r6)
            if (r8 != r0) goto Lb3
        Lb2:
            return r0
        Lb3:
            l83.n r9 = new l83.n
            r9.<init>(r8)
            return r9
        Lb9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p631xz.C38747x.m124159j(d00.l, java.lang.String, s83.c):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r1 == r2) goto L32;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m124160k(java.lang.String r14, y00.EnumC38796c2 r15, boolean r16, java.lang.String r17, s83.AbstractC32269c r18) {
        /*
            r13 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof p631xz.C38730k
            if (r2 == 0) goto L18
            r2 = r1
            xz.k r2 = (p631xz.C38730k) r2
            int r3 = r2.f166685E
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.f166685E = r3
        L16:
            r10 = r2
            goto L1e
        L18:
            xz.k r2 = new xz.k
            r2.<init>(r13, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r10.f166688y
            r83.a r2 = r83.EnumC31071a.f128113w
            int r3 = r10.f166685E
            r11 = 2
            r4 = 1
            r12 = 0
            if (r3 == 0) goto L45
            if (r3 == r4) goto L39
            if (r3 != r11) goto L31
            p505ts.AbstractC34132o.m107864I(r1)
            goto L8d
        L31:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L39:
            boolean r14 = r10.f166687x
            xz.x r15 = r10.f166686w
            p505ts.AbstractC34132o.m107864I(r1)
            l83.n r1 = (l83.C23468n) r1
            java.lang.Object r0 = r1.f92940w
            goto L71
        L45:
            p505ts.AbstractC34132o.m107864I(r1)
            wz.g0 r1 = r13.f166747b
            java.lang.String r8 = r1.f161619S
            y00.j8[] r1 = y00.EnumC38872j8.f167319w
            java.lang.String r1 = "SMS"
            java.util.List r1 = wb3.AbstractC37056f.m118958J(r1)
            if (r0 == 0) goto L58
            r9 = r1
            goto L59
        L58:
            r9 = r12
        L59:
            r10.f166686w = r13
            r10.f166687x = r0
            r10.f166685E = r4
            xz.e0 r3 = r13.f166752g
            r6 = 0
            r4 = r14
            r5 = r15
            r7 = r17
            java.lang.Object r14 = r3.m124141b(r4, r5, r6, r7, r8, r9, r10)
            if (r14 != r2) goto L6d
            goto L8c
        L6d:
            r15 = r0
            r0 = r14
            r14 = r15
            r15 = r13
        L71:
            java.lang.Throwable r1 = l83.C23468n.m68037a(r0)
            if (r1 == 0) goto L7c
            yz.b r3 = r15.f166749d
            r3.m128004b(r1)
        L7c:
            boolean r1 = r0 instanceof l83.C23467m
            if (r1 != 0) goto L90
            com.stripe.android.model.ConsumerSessionLookup r0 = (com.stripe.android.model.ConsumerSessionLookup) r0
            r10.f166686w = r12
            r10.f166685E = r11
            java.lang.Object r1 = r15.m124165q(r0, r14, r12, r10)
            if (r1 != r2) goto L8d
        L8c:
            return r2
        L8d:
            d00.l r1 = (d00.C11433l) r1
            return r1
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p631xz.C38747x.m124160k(java.lang.String, y00.c2, boolean, java.lang.String, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r14 == r0) goto L28;
     */
    /* JADX INFO: renamed from: l */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m124161l(java.lang.String r12, java.lang.String r13, s83.AbstractC32269c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof p631xz.C38732l
            if (r0 == 0) goto L14
            r0 = r14
            xz.l r0 = (p631xz.C38732l) r0
            int r1 = r0.f166691E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f166691E = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            xz.l r0 = new xz.l
            r0.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r8.f166694y
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r8.f166691E
            r9 = 2
            r10 = 1
            if (r1 == 0) goto L40
            if (r1 == r10) goto L34
            if (r1 != r9) goto L2c
            p505ts.AbstractC34132o.m107864I(r14)
            goto L83
        L2c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L34:
            java.lang.String r12 = r8.f166693x
            xz.x r13 = r8.f166692w
            p505ts.AbstractC34132o.m107864I(r14)
            l83.n r14 = (l83.C23468n) r14
            java.lang.Object r14 = r14.f92940w
            goto L64
        L40:
            p505ts.AbstractC34132o.m107864I(r14)
            wz.g0 r14 = r11.f166747b
            java.lang.String r6 = r14.f161619S
            y00.j8[] r14 = y00.EnumC38872j8.f167319w
            java.lang.String r14 = "SMS"
            java.util.List r7 = wb3.AbstractC37056f.m118958J(r14)
            r8.f166692w = r11
            r8.f166693x = r12
            r8.f166691E = r10
            xz.e0 r1 = r11.f166752g
            r2 = 0
            r3 = 0
            r4 = r12
            r5 = r13
            java.lang.Object r14 = r1.m124141b(r2, r3, r4, r5, r6, r7, r8)
            if (r14 != r0) goto L62
            goto L82
        L62:
            r13 = r11
            r12 = r4
        L64:
            java.lang.Throwable r1 = l83.C23468n.m68037a(r14)
            if (r1 == 0) goto L6f
            yz.b r2 = r13.f166749d
            r2.m128004b(r1)
        L6f:
            boolean r1 = r14 instanceof l83.C23467m
            if (r1 != 0) goto L85
            com.stripe.android.model.ConsumerSessionLookup r14 = (com.stripe.android.model.ConsumerSessionLookup) r14
            r1 = 0
            r8.f166692w = r1
            r8.f166693x = r1
            r8.f166691E = r9
            java.lang.Object r14 = r13.m124165q(r14, r10, r12, r8)
            if (r14 != r0) goto L83
        L82:
            return r0
        L83:
            d00.l r14 = (d00.C11433l) r14
        L85:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p631xz.C38747x.m124161l(java.lang.String, java.lang.String, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: m */
    public final Object m124162m(boolean z4, AbstractC32269c abstractC32269c) {
        C38734m c38734m;
        if (abstractC32269c instanceof C38734m) {
            c38734m = (C38734m) abstractC32269c;
            int i13 = c38734m.f166699y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38734m.f166699y = i13 - Integer.MIN_VALUE;
            } else {
                c38734m = new C38734m(this, abstractC32269c);
            }
        } else {
            c38734m = new C38734m(this, abstractC32269c);
        }
        Object obj = c38734m.f166697w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38734m.f166699y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C11433l c11433l = ((C37708d) this.f166746a.f166664b.f45200w.getValue()).f161571w;
        if (c11433l == null) {
            return AbstractC34132o.m107888l(new NoLinkAccountFoundException());
        }
        String str = c11433l.f36652G;
        c38734m.f166699y = 1;
        Object objM35128p = this.f166748c.m35128p(str, z4, c38734m);
        return objM35128p == enumC31071a ? enumC31071a : objM35128p;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: n */
    public final Object m124163n(AbstractC32269c abstractC32269c) {
        C38736n c38736n;
        Object objM124144e;
        C38747x c38747x;
        if (abstractC32269c instanceof C38736n) {
            c38736n = (C38736n) abstractC32269c;
            int i13 = c38736n.f166703z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38736n.f166703z = i13 - Integer.MIN_VALUE;
            } else {
                c38736n = new C38736n(this, abstractC32269c);
            }
        } else {
            c38736n = new C38736n(this, abstractC32269c);
        }
        Object obj = c38736n.f166701x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38736n.f166703z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C11433l c11433l = ((C37708d) this.f166746a.f166664b.f45200w.getValue()).f161571w;
            if (c11433l == null) {
                return AbstractC34132o.m107888l(new NoLinkAccountFoundException());
            }
            String str = c11433l.f36652G;
            EnumC38872j8[] enumC38872j8Arr = EnumC38872j8.f167319w;
            List listM118958J = AbstractC37056f.m118958J("SMS");
            c38736n.f166700w = this;
            c38736n.f166703z = 1;
            objM124144e = this.f166752g.m124144e(str, listM118958J, c38736n);
            if (objM124144e != enumC31071a) {
                c38747x = this;
            }
            return enumC31071a;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = c38736n.f166700w;
            AbstractC34132o.m107864I(obj);
            return obj2;
        }
        c38747x = (C38747x) c38736n.f166700w;
        AbstractC34132o.m107864I(obj);
        objM124144e = ((C23468n) obj).f92940w;
        Throwable thM68037a = C23468n.m68037a(objM124144e);
        if (thM68037a != null) {
            C39899b c39899b = c38747x.f166749d;
            c39899b.getClass();
            c39899b.m128003a(C39900c.f172294y, AbstractC25247g0.m73995d0(AbstractC31061c.m95645u("error_message", AbstractC32121b.m100006k(thM68037a)), C2321a.m7172a(thM68037a)));
        }
        if (!(objM124144e instanceof C23467m)) {
            ConsumerSession consumerSession = ((ConsumerSessionRefresh) objM124144e).getConsumerSession();
            c38736n.f166700w = objM124144e;
            c38736n.f166703z = 2;
            if (m124149p(c38747x, consumerSession, null, c38736n, 14) == enumC31071a) {
                return enumC31071a;
            }
        }
        return objM124144e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: o */
    public final Object m124164o(ConsumerSession consumerSession, String str, DisplayablePaymentDetails displayablePaymentDetails, C11434m c11434m, AbstractC32269c abstractC32269c) {
        C38738o c38738o;
        DisplayablePaymentDetails displayablePaymentDetails2;
        C11434m c11434m2;
        C11434m c11434m3;
        DisplayablePaymentDetails displayablePaymentDetails3;
        if (abstractC32269c instanceof C38738o) {
            c38738o = (C38738o) abstractC32269c;
            int i13 = c38738o.f166708z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38738o.f166708z = i13 - Integer.MIN_VALUE;
            } else {
                c38738o = new C38738o(this, abstractC32269c);
            }
        } else {
            c38738o = new C38738o(this, abstractC32269c);
        }
        Object obj = c38738o.f166706x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38738o.f166708z;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C11433l c11433l = c38738o.f166705w;
            AbstractC34132o.m107864I(obj);
            return c11433l;
        }
        AbstractC34132o.m107864I(obj);
        C11433l c11433l2 = ((C37708d) this.f166746a.f166664b.f45200w.getValue()).f161571w;
        InterfaceC30057d interfaceC30057d = null;
        boolean zM65745e = AbstractC22676k.m65745e(c11433l2 != null ? c11433l2.f36653H : null, consumerSession.getEmailAddress());
        String str2 = (str == null && (c11433l2 == null || (str = c11433l2.f36660x) == null || !zM65745e)) ? null : str;
        if (displayablePaymentDetails == null) {
            displayablePaymentDetails2 = (c11433l2 == null || (displayablePaymentDetails3 = c11433l2.f36661y) == null || !zM65745e) ? null : displayablePaymentDetails3;
        } else {
            displayablePaymentDetails2 = displayablePaymentDetails;
        }
        if (c11434m == null) {
            c11434m2 = (c11433l2 == null || (c11434m3 = c11433l2.f36662z) == null || !zM65745e) ? null : c11434m3;
        } else {
            c11434m2 = c11434m;
        }
        C11433l c11433l3 = new C11433l(consumerSession, str2, displayablePaymentDetails2, c11434m2, false);
        C22365e c22365e = AbstractC3050q0.f12077a;
        AbstractC3069w1 abstractC3069w1Mo8825s = AbstractC17182o.f65999a.mo8825s();
        C27486p c27486p = new C27486p(this, c11433l3, interfaceC30057d, 18);
        c38738o.f166705w = c11433l3;
        c38738o.f166708z = 1;
        return AbstractC3006f0.m8705K(abstractC3069w1Mo8825s, c27486p, c38738o) == enumC31071a ? enumC31071a : c11433l3;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX INFO: renamed from: q */
    public final Object m124165q(ConsumerSessionLookup consumerSessionLookup, boolean z4, String str, AbstractC32269c abstractC32269c) {
        C11434m c11434m;
        InterfaceC11432k c11431j;
        this.f166756k.m36570j(consumerSessionLookup.getSuggestedEmail());
        if (str != null) {
            ConsentUi consentUi = consumerSessionLookup.getConsentUi();
            if (consentUi == null) {
                c11431j = null;
            } else {
                ConsentUi.ConsentPane consentPane = consentUi.getConsentPane();
                if (consentPane != null) {
                    c11431j = new C11429h(consentPane);
                } else {
                    ConsentUi.ConsentSection consentSection = consentUi.getConsentSection();
                    if (consentSection != null) {
                        c11431j = new C11431j(consentSection);
                    } else {
                        c11431j = null;
                    }
                }
            }
            c11434m = new C11434m(str, c11431j);
        } else {
            c11434m = null;
        }
        ConsumerSession consumerSession = consumerSessionLookup.getConsumerSession();
        if (consumerSession == null) {
            return null;
        }
        if (!z4) {
            return new C11433l(consumerSession, consumerSessionLookup.getPublishableKey(), consumerSessionLookup.getDisplayablePaymentDetails(), c11434m, false);
        }
        Object objM124164o = m124164o(consumerSession, consumerSessionLookup.getPublishableKey(), consumerSessionLookup.getDisplayablePaymentDetails(), c11434m, abstractC32269c);
        return objM124164o == EnumC31071a.f128113w ? objM124164o : (C11433l) objM124164o;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: r */
    public final Object m124166r(C37742o0 c37742o0, AbstractC32269c abstractC32269c) {
        C38739p c38739p;
        Object objM107888l;
        Object objM107888l2;
        Object objM35130r;
        if (abstractC32269c instanceof C38739p) {
            c38739p = (C38739p) abstractC32269c;
            int i13 = c38739p.f166711y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38739p.f166711y = i13 - Integer.MIN_VALUE;
            } else {
                c38739p = new C38739p(this, abstractC32269c);
            }
        } else {
            c38739p = new C38739p(this, abstractC32269c);
        }
        C38739p c38739p2 = c38739p;
        Object obj = c38739p2.f166709w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38739p2.f166711y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                try {
                    objM107888l2 = ((C37708d) this.f166746a.f166664b.f45200w.getValue()).f161571w;
                    if (objM107888l2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } catch (Throwable th3) {
                    objM107888l2 = AbstractC34132o.m107888l(th3);
                }
                if (objM107888l2 instanceof C23467m) {
                    return objM107888l2;
                }
                AbstractC38794c0 abstractC38794c0 = c37742o0.f161703w;
                C38809d5 c38809d5 = c37742o0.f161705y;
                C12500w c12500w = this.f166748c;
                String id4 = abstractC38794c0.getId();
                String str = ((C11433l) objM107888l2).f36652G;
                C38901n c38901n = this.f166747b.f161635i0;
                c38739p2.f166711y = 1;
                objM35130r = c12500w.m35130r(c38809d5, id4, str, c38901n, c38739p2);
                if (objM35130r == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM35130r = ((C23468n) obj).f92940w;
            }
            AbstractC34132o.m107864I(objM35130r);
            objM107888l = (C37745p0) objM35130r;
        } catch (Throwable th4) {
            objM107888l = AbstractC34132o.m107888l(th4);
        }
        return objM107888l;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: s */
    public final Object m124167s(String str, String str2, String str3, String str4, String str5, AbstractC32269c abstractC32269c) {
        C38740q c38740q;
        Object objM107888l;
        Object objM107888l2;
        Object objM35131s;
        if (abstractC32269c instanceof C38740q) {
            c38740q = (C38740q) abstractC32269c;
            int i13 = c38740q.f166714y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38740q.f166714y = i13 - Integer.MIN_VALUE;
            } else {
                c38740q = new C38740q(this, abstractC32269c);
            }
        } else {
            c38740q = new C38740q(this, abstractC32269c);
        }
        C38740q c38740q2 = c38740q;
        Object obj = c38740q2.f166712w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38740q2.f166714y;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                try {
                    objM107888l2 = ((C37708d) this.f166746a.f166664b.f45200w.getValue()).f161571w;
                    if (objM107888l2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                } catch (Throwable th3) {
                    objM107888l2 = AbstractC34132o.m107888l(th3);
                }
                if (objM107888l2 instanceof C23467m) {
                    return objM107888l2;
                }
                C12500w c12500w = this.f166748c;
                String str6 = ((C11433l) objM107888l2).f36652G;
                C38901n c38901n = this.f166747b.f161635i0;
                c38740q2.f166714y = 1;
                objM35131s = c12500w.m35131s(str6, str, str2, str3, str4, str5, c38901n, c38740q2);
                if (objM35131s == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                objM35131s = ((C23468n) obj).f92940w;
            }
            AbstractC34132o.m107864I(objM35131s);
            objM107888l = (C38850h6) objM35131s;
        } catch (Throwable th4) {
            objM107888l = AbstractC34132o.m107888l(th4);
        }
        return objM107888l;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r10 == r0) goto L37;
     */
    /* JADX INFO: renamed from: t */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m124168t(j00.AbstractC21106i0 r10, s83.AbstractC32269c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof p631xz.C38741r
            if (r0 == 0) goto L14
            r0 = r11
            xz.r r0 = (p631xz.C38741r) r0
            int r1 = r0.f166717y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f166717y = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            xz.r r0 = new xz.r
            r0.<init>(r9, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f166715w
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f166717y
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L38
            if (r1 != r2) goto L30
            p505ts.AbstractC34132o.m107864I(r11)
            l83.n r11 = (l83.C23468n) r11
            java.lang.Object r10 = r11.f92940w
            return r10
        L30:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L38:
            p505ts.AbstractC34132o.m107864I(r11)
            l83.n r11 = (l83.C23468n) r11
            java.lang.Object r10 = r11.f92940w
            goto L5f
        L40:
            p505ts.AbstractC34132o.m107864I(r11)
            boolean r11 = r10 instanceof j00.C21102g0
            if (r11 == 0) goto L77
            j00.g0 r10 = (j00.C21102g0) r10
            java.lang.String r2 = r10.f80011w
            r10 = r3
            y00.c2 r3 = y00.EnumC38796c2.USER_ACTION
            wz.g0 r11 = r9.f166747b
            java.lang.String r5 = r11.m121145b()
            r6.f166717y = r10
            r4 = 1
            r1 = r9
            java.lang.Object r10 = r1.m124160k(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L5f
            goto L94
        L5f:
            boolean r11 = r10 instanceof l83.C23467m
            if (r11 != 0) goto L76
            d00.l r10 = (d00.C11433l) r10     // Catch: java.lang.Throwable -> L70
            if (r10 == 0) goto L68
            return r10
        L68:
            java.lang.String r10 = "Error fetching user account"
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L70
            r11.<init>(r10)     // Catch: java.lang.Throwable -> L70
            throw r11     // Catch: java.lang.Throwable -> L70
        L70:
            r0 = move-exception
            r10 = r0
            l83.m r10 = p505ts.AbstractC34132o.m107888l(r10)
        L76:
            return r10
        L77:
            boolean r11 = r10 instanceof j00.C21104h0
            if (r11 == 0) goto L96
            j00.h0 r10 = (j00.C21104h0) r10
            r11 = r2
            java.lang.String r2 = r10.f80035w
            java.lang.String r4 = r10.f80037y
            java.lang.String r5 = r10.f80034F
            java.lang.String r3 = r10.f80036x
            r8 = r6
            java.lang.String r6 = r10.f80038z
            j00.e0 r7 = r10.f80033E
            r8.f166717y = r11
            r1 = r9
            java.lang.Object r10 = r1.m124170v(r2, r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L95
        L94:
            return r0
        L95:
            return r10
        L96:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: p631xz.C38747x.m124168t(j00.i0, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
    
        if (r0 == r1) goto L28;
     */
    /* JADX INFO: renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m124169u(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, j00.EnumC21098e0 r17, s83.AbstractC32269c r18) {
        /*
            r11 = this;
            r0 = r18
            boolean r1 = r0 instanceof p631xz.C38742s
            if (r1 == 0) goto L16
            r1 = r0
            xz.s r1 = (p631xz.C38742s) r1
            int r2 = r1.f166721z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.f166721z = r2
        L14:
            r9 = r1
            goto L1c
        L16:
            xz.s r1 = new xz.s
            r1.<init>(r11, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.f166719x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r9.f166721z
            r10 = 2
            r3 = 1
            if (r2 == 0) goto L43
            if (r2 == r3) goto L39
            if (r2 != r10) goto L31
            p505ts.AbstractC34132o.m107864I(r0)     // Catch: java.lang.Throwable -> L2e
            goto L78
        L2e:
            r0 = move-exception
            r12 = r0
            goto L7b
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            xz.x r12 = r9.f166718w
            p505ts.AbstractC34132o.m107864I(r0)
            l83.n r0 = (l83.C23468n) r0
            java.lang.Object r13 = r0.f92940w
            goto L5c
        L43:
            p505ts.AbstractC34132o.m107864I(r0)
            r9.f166718w = r11
            r9.f166721z = r3
            xz.e0 r2 = r11.f166752g
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            java.lang.Object r13 = r2.m124146g(r3, r4, r5, r6, r7, r8, r9)
            if (r13 != r1) goto L5b
            goto L77
        L5b:
            r12 = r11
        L5c:
            boolean r14 = r13 instanceof l83.C23467m
            if (r14 != 0) goto L80
            com.stripe.android.model.ConsumerSessionSignup r13 = (com.stripe.android.model.ConsumerSessionSignup) r13     // Catch: java.lang.Throwable -> L2e
            com.stripe.android.model.ConsumerSession r14 = r13.getConsumerSession()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r13 = r13.getPublishableKey()     // Catch: java.lang.Throwable -> L2e
            r15 = 0
            r9.f166718w = r15     // Catch: java.lang.Throwable -> L2e
            r9.f166721z = r10     // Catch: java.lang.Throwable -> L2e
            r15 = 12
            java.lang.Object r0 = m124149p(r12, r14, r13, r9, r15)     // Catch: java.lang.Throwable -> L2e
            if (r0 != r1) goto L78
        L77:
            return r1
        L78:
            d00.l r0 = (d00.C11433l) r0     // Catch: java.lang.Throwable -> L2e
            return r0
        L7b:
            l83.m r12 = p505ts.AbstractC34132o.m107888l(r12)
            return r12
        L80:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: p631xz.C38747x.m124169u(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, j00.e0, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:51:0x0105  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX INFO: renamed from: v */
    public final Object m124170v(String str, String str2, String str3, String str4, String str5, EnumC21098e0 enumC21098e0, AbstractC32269c abstractC32269c) {
        C38743t c38743t;
        String str6;
        EnumC21098e0 enumC21098e1;
        String str7;
        String str8;
        String str9;
        String str10;
        String str11;
        String str12;
        C38747x c38747x;
        Object objM124169u;
        C38747x c38747x2;
        Throwable thM68037a;
        if (abstractC32269c instanceof C38743t) {
            c38743t = (C38743t) abstractC32269c;
            int i13 = c38743t.f166728K;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38743t.f166728K = i13 - Integer.MIN_VALUE;
            } else {
                c38743t = new C38743t(this, abstractC32269c);
            }
        } else {
            c38743t = new C38743t(this, abstractC32269c);
        }
        C38743t c38743t2 = c38743t;
        Object objM124155f = c38743t2.f166726I;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38743t2.f166728K;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM124155f);
            C11433l c11433l = ((C37708d) this.f166746a.f166664b.f45200w.getValue()).f161571w;
            if (c11433l == null || (str6 = c11433l.f36653H) == null) {
                str6 = this.f166747b.f161606F.f161585x;
            }
            c38743t2.f166729w = this;
            c38743t2.f166730x = str;
            c38743t2.f166731y = str2;
            c38743t2.f166732z = str3;
            c38743t2.f166722E = str4;
            c38743t2.f166723F = str5;
            enumC21098e1 = enumC21098e0;
            c38743t2.f166724G = enumC21098e1;
            c38743t2.f166725H = str6;
            c38743t2.f166728K = 1;
            objM124155f = m124155f(c11433l, true, c38743t2);
            if (objM124155f != enumC31071a) {
                str7 = str2;
                str8 = str3;
                str9 = str4;
                str10 = str5;
                str11 = str;
                str12 = str6;
                c38747x = this;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            str12 = c38743t2.f166725H;
            EnumC21098e0 enumC21098e2 = c38743t2.f166724G;
            String str13 = c38743t2.f166723F;
            String str14 = c38743t2.f166722E;
            String str15 = c38743t2.f166732z;
            String str16 = c38743t2.f166731y;
            str11 = c38743t2.f166730x;
            C38747x c38747x3 = c38743t2.f166729w;
            AbstractC34132o.m107864I(objM124155f);
            enumC21098e1 = enumC21098e2;
            c38747x = c38747x3;
            str10 = str13;
            str7 = str16;
            str9 = str14;
            str8 = str15;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c38747x2 = c38743t2.f166729w;
            AbstractC34132o.m107864I(objM124155f);
            objM124169u = ((C23468n) objM124155f).f92940w;
        }
        if (!(objM124169u instanceof C23467m)) {
            c38747x2.f166749d.m128006d();
        }
        thM68037a = C23468n.m68037a(objM124169u);
        if (thM68037a != null) {
            c38747x2.f166749d.m128007e(thM68037a);
        }
        return objM124169u;
        InterfaceC11427f interfaceC11427f = (InterfaceC11427f) objM124155f;
        if (interfaceC11427f instanceof C11426e) {
            c38747x.f166749d.m128005c(EnumC39903f.f172299x);
            return AbstractC34132o.m107888l(new AlreadyLoggedInLinkException(str12, interfaceC11427f));
        }
        if ((interfaceC11427f instanceof C11423b) || AbstractC22676k.m65745e(interfaceC11427f, C11425d.f36645a)) {
            c38747x.f166749d.m128005c(EnumC39903f.f172298w);
            return AbstractC34132o.m107888l(new AlreadyLoggedInLinkException(str12, interfaceC11427f));
        }
        if (!AbstractC22676k.m65745e(interfaceC11427f, C11424c.f36644a) && !(interfaceC11427f instanceof C11422a)) {
            throw new NoWhenBranchMatchedException();
        }
        c38743t2.f166729w = c38747x;
        c38743t2.f166730x = null;
        c38743t2.f166731y = null;
        c38743t2.f166732z = null;
        c38743t2.f166722E = null;
        c38743t2.f166723F = null;
        c38743t2.f166724G = null;
        c38743t2.f166725H = null;
        c38743t2.f166728K = 2;
        objM124169u = c38747x.m124169u(str11, str7, str8, str9, str10, enumC21098e1, c38743t2);
        if (objM124169u != enumC31071a) {
            c38747x2 = c38747x;
            if (!(objM124169u instanceof C23467m)) {
                c38747x2.f166749d.m128006d();
            }
            thM68037a = C23468n.m68037a(objM124169u);
            if (thM68037a != null) {
                c38747x2.f166749d.m128007e(thM68037a);
            }
            return objM124169u;
        }
        return enumC31071a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008e, code lost:
    
        if (r9 == r1) goto L31;
     */
    /* JADX INFO: renamed from: w */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m124171w(boolean r8, s83.AbstractC32269c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p631xz.C38745v
            if (r0 == 0) goto L13
            r0 = r9
            xz.v r0 = (p631xz.C38745v) r0
            int r1 = r0.f166740z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f166740z = r1
            goto L18
        L13:
            xz.v r0 = new xz.v
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f166738x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f166740z
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            p505ts.AbstractC34132o.m107864I(r9)
            goto L91
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            xz.x r8 = r0.f166737w
            p505ts.AbstractC34132o.m107864I(r9)
            l83.n r9 = (l83.C23468n) r9
            java.lang.Object r9 = r9.f92940w
            goto L71
        L3d:
            p505ts.AbstractC34132o.m107864I(r9)
            xz.f0 r9 = r7.f166746a
            ec3.r1 r9 = r9.f166664b
            ec3.f2 r9 = r9.f45200w
            java.lang.Object r9 = r9.getValue()
            wz.d r9 = (p599wz.C37708d) r9
            d00.l r9 = r9.f161571w
            if (r9 != 0) goto L5a
            com.stripe.android.link.NoLinkAccountFoundException r8 = new com.stripe.android.link.NoLinkAccountFoundException
            r8.<init>()
            l83.m r8 = p505ts.AbstractC34132o.m107888l(r8)
            return r8
        L5a:
            yz.b r2 = r7.f166749d
            yz.c r6 = p665yz.C39900c.f172291S
            r2.m128003a(r6, r5)
            java.lang.String r9 = r9.f36652G
            r0.f166737w = r7
            r0.f166740z = r4
            e00.w r2 = r7.f166748c
            java.lang.Object r9 = r2.m35132t(r9, r8, r0)
            if (r9 != r1) goto L70
            goto L90
        L70:
            r8 = r7
        L71:
            java.lang.Throwable r2 = l83.C23468n.m68037a(r9)
            if (r2 == 0) goto L7e
            yz.b r2 = r8.f166749d
            yz.c r4 = p665yz.C39900c.f172292T
            r2.m128003a(r4, r5)
        L7e:
            boolean r2 = r9 instanceof l83.C23467m
            if (r2 != 0) goto L93
            com.stripe.android.model.ConsumerSession r9 = (com.stripe.android.model.ConsumerSession) r9
            r0.f166737w = r5
            r0.f166740z = r3
            r2 = 14
            java.lang.Object r9 = m124149p(r8, r9, r5, r0, r2)
            if (r9 != r1) goto L91
        L90:
            return r1
        L91:
            d00.l r9 = (d00.C11433l) r9
        L93:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p631xz.C38747x.m124171w(boolean, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: x */
    public final Object m124172x(C38854i0 c38854i0, String str, AbstractC32269c abstractC32269c) {
        C38746w c38746w;
        C38747x c38747x;
        Object obj;
        C37754s0 c37754s0M121161i;
        if (abstractC32269c instanceof C38746w) {
            c38746w = (C38746w) abstractC32269c;
            int i13 = c38746w.f166741E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c38746w.f166741E = i13 - Integer.MIN_VALUE;
            } else {
                c38746w = new C38746w(this, abstractC32269c);
            }
        } else {
            c38746w = new C38746w(this, abstractC32269c);
        }
        Object obj2 = c38746w.f166744y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c38746w.f166741E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            C11433l c11433l = ((C37708d) this.f166746a.f166664b.f45200w.getValue()).f161571w;
            if (c11433l == null) {
                return AbstractC34132o.m107888l(new NoLinkAccountFoundException());
            }
            String str2 = c11433l.f36652G;
            c38746w.f166742w = this;
            c38746w.f166743x = str;
            c38746w.f166741E = 1;
            Object objM35133u = this.f166748c.m35133u(c38854i0, str2, c38746w);
            if (objM35133u == enumC31071a) {
                return enumC31071a;
            }
            c38747x = this;
            obj = objM35133u;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c38746w.f166743x;
            c38747x = c38746w.f166742w;
            AbstractC34132o.m107864I(obj2);
            obj = ((C23468n) obj2).f92940w;
        }
        boolean z4 = obj instanceof C23467m;
        Object obj3 = obj;
        if (!z4) {
            C38804d0 c38804d0 = (C38804d0) obj;
            C13045h2 c13045h2 = c38747x.f166753h;
            C37699a c37699a = (C37699a) c13045h2.getValue();
            C37699a c37699a2 = null;
            if (c37699a != null) {
                AbstractC38794c0 updatedPayment = (AbstractC38794c0) AbstractC25265s.m74096F0(c38804d0.f166994w);
                AbstractC22676k.m65750j(updatedPayment, "updatedPayment");
                ArrayList<C37754s0> arrayList = c37699a.f161554a;
                ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
                for (C37754s0 c37754s0 : arrayList) {
                    AbstractC38794c0 abstractC38794c0 = c37754s0.f161721x;
                    String str3 = c37754s0.f161723z;
                    if (AbstractC22676k.m65745e(abstractC38794c0.getId(), updatedPayment.getId())) {
                        if (str != null) {
                            str3 = str;
                        }
                        c37754s0M121161i = C37754s0.m121161i(c37754s0, updatedPayment, str3, 2);
                    } else {
                        if (str3 == null) {
                            str3 = str;
                        }
                        c37754s0M121161i = C37754s0.m121161i(c37754s0, null, str3, 3);
                    }
                    arrayList2.add(c37754s0M121161i);
                }
                c37699a2 = new C37699a(arrayList2);
            }
            c13045h2.m36570j(c37699a2);
            obj3 = c38804d0;
        }
        return obj3;
    }
}
