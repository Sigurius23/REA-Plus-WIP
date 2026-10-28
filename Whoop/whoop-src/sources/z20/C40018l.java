package z20;

import a30.AbstractC0326t0;
import a30.C0316o0;
import a30.C0318p0;
import a30.C0320q0;
import a30.C0322r0;
import a30.C0324s0;
import b10.C2225c;
import b10.C2273z0;
import b10.InterfaceC2227c1;
import bc3.AbstractC3006f0;
import com.stripe.android.core.exception.StripeException;
import h20.C16624a2;
import h20.C16636c2;
import h20.C16720q2;
import h20.C16744u2;
import h20.C16767y1;
import h20.C16773z1;
import h20.EnumC16738t2;
import h20.InterfaceC16630b2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import k83.InterfaceC22297a;
import l83.C23464j;
import l83.C23468n;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
import p537ux.C35363y;
import p664yy.C39857f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import sc3.AbstractC32398l;
import se.AbstractC32410a;
import x30.C37902k0;
import y00.C38776a2;
import y00.C38984w1;
import y00.C38993x1;
import y00.C39002y1;
import y00.InterfaceC38786b2;

/* JADX INFO: renamed from: z20.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C40018l {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2227c1 f172639a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC22297a f172640b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC30063j f172641c;

    /* JADX INFO: renamed from: d */
    public final C2225c f172642d;

    /* JADX INFO: renamed from: e */
    public final String f172643e;

    public C40018l(InterfaceC2227c1 stripeRepository, InterfaceC22297a lazyPaymentConfig, InterfaceC30063j workContext, C2225c c2225c, String appId) {
        AbstractC22676k.m65750j(stripeRepository, "stripeRepository");
        AbstractC22676k.m65750j(lazyPaymentConfig, "lazyPaymentConfig");
        AbstractC22676k.m65750j(workContext, "workContext");
        AbstractC22676k.m65750j(appId, "appId");
        this.f172639a = stripeRepository;
        this.f172640b = lazyPaymentConfig;
        this.f172641c = workContext;
        this.f172642d = c2225c;
        this.f172643e = appId;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m128245a(InterfaceC38786b2 interfaceC38786b2, Throwable th3, AbstractC32269c abstractC32269c) {
        C40016j c40016j;
        if (abstractC32269c instanceof C40016j) {
            c40016j = (C40016j) abstractC32269c;
            int i13 = c40016j.f172633y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40016j.f172633y = i13 - Integer.MIN_VALUE;
            } else {
                c40016j = new C40016j(this, abstractC32269c);
            }
        } else {
            c40016j = new C40016j(this, abstractC32269c);
        }
        Object objM8705K = c40016j.f172631w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c40016j.f172633y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C37902k0 c37902k0 = new C37902k0(interfaceC38786b2, this, th3, null, 5);
            c40016j.f172633y = 1;
            objM8705K = AbstractC3006f0.m8705K(this.f172641c, c37902k0, c40016j);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX INFO: renamed from: b */
    public final Object m128246b(AbstractC0326t0 abstractC0326t0, C16636c2 c16636c2, List customPaymentMethods, List externalPaymentMethods, String str, String str2, Set linkDisallowedFundingSourceCreation, AbstractC32269c abstractC32269c) {
        C40017k c40017k;
        String str3;
        String str4;
        InterfaceC38786b2 c38984w1;
        InterfaceC38786b2 interfaceC38786b2;
        Object objM7069O;
        C40018l c40018l;
        String str5;
        String str6;
        if (abstractC32269c instanceof C40017k) {
            c40017k = (C40017k) abstractC32269c;
            int i13 = c40017k.f172634E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40017k.f172634E = i13 - Integer.MIN_VALUE;
            } else {
                c40017k = new C40017k(this, abstractC32269c);
            }
        } else {
            c40017k = new C40017k(this, abstractC32269c);
        }
        Object obj = c40017k.f172637y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c40017k.f172634E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            String str7 = (String) this.f172642d.get();
            AbstractC22676k.m65750j(abstractC0326t0, "<this>");
            AbstractC22676k.m65750j(customPaymentMethods, "customPaymentMethods");
            AbstractC22676k.m65750j(externalPaymentMethods, "externalPaymentMethods");
            String appId = this.f172643e;
            AbstractC22676k.m65750j(appId, "appId");
            AbstractC22676k.m65750j(linkDisallowedFundingSourceCreation, "linkDisallowedFundingSourceCreation");
            if (c16636c2 != null) {
                InterfaceC16630b2 interfaceC16630b2 = c16636c2.f63985y;
                if (interfaceC16630b2 instanceof C16773z1) {
                    str6 = ((C16773z1) interfaceC16630b2).f64473w;
                } else {
                    if (!(interfaceC16630b2 instanceof C16624a2)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str6 = null;
                }
                str3 = str6;
            } else {
                str3 = null;
            }
            if (c16636c2 != null) {
                InterfaceC16630b2 interfaceC16630b3 = c16636c2.f63985y;
                if (interfaceC16630b3 instanceof C16773z1) {
                    str5 = null;
                } else {
                    if (!(interfaceC16630b3 instanceof C16624a2)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    str5 = ((C16624a2) interfaceC16630b3).f63959w;
                }
                str4 = str5;
            } else {
                str4 = null;
            }
            List list = customPaymentMethods;
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((C16767y1) it.next()).f64443w);
            }
            C38993x1 c38993x1 = new C38993x1(linkDisallowedFundingSourceCreation);
            if (abstractC0326t0 instanceof C0322r0) {
                c38984w1 = new C39002y1(((C0322r0) abstractC0326t0).f1117w, Locale.getDefault().toLanguageTag(), str3, str4, str, str7, arrayList, externalPaymentMethods, appId, c38993x1, str2);
            } else {
                String str8 = str3;
                if (abstractC0326t0 instanceof C0324s0) {
                    c38984w1 = new C38776a2(((C0324s0) abstractC0326t0).f1126w, Locale.getDefault().toLanguageTag(), str8, str4, str, str7, arrayList, externalPaymentMethods, appId, c38993x1, str2);
                } else if (abstractC0326t0 instanceof C0320q0) {
                    C16744u2 c16744u2 = ((C0320q0) abstractC0326t0).f1106w;
                    c38984w1 = new C38984w1(AbstractC32410a.m101031g0(c16744u2), arrayList, externalPaymentMethods, str, str8, str4, str7, appId, AbstractC32398l.m100979l(c16744u2), c38993x1, str2);
                } else {
                    if (!(abstractC0326t0 instanceof C0318p0)) {
                        if (abstractC0326t0 instanceof C0316o0) {
                            throw new C23464j("An operation is not implemented: CheckoutSession elements session not yet supported.");
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    C16744u2 c16744u3 = new C16744u2(new C16720q2(null, EnumC16738t2.f64292x), null, null, 30);
                    c38984w1 = new C38984w1(AbstractC32410a.m101031g0(c16744u3), arrayList, externalPaymentMethods, str, str8, str4, str7, appId, AbstractC32398l.m100979l(c16744u3), c38993x1, str2);
                }
            }
            interfaceC38786b2 = c38984w1;
            C39857f c39857fM128247c = m128247c();
            c40017k.f172635w = this;
            c40017k.f172636x = interfaceC38786b2;
            c40017k.f172634E = 1;
            objM7069O = ((C2273z0) this.f172639a).m7069O(interfaceC38786b2, c39857fM128247c, c40017k);
            if (objM7069O != enumC31071a) {
                c40018l = this;
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        interfaceC38786b2 = c40017k.f172636x;
        c40018l = c40017k.f172635w;
        AbstractC34132o.m107864I(obj);
        objM7069O = ((C23468n) obj).f92940w;
        Throwable thM68037a = C23468n.m68037a(objM7069O);
        if (thM68037a != null) {
            c40018l.getClass();
            Throwable thM68037a2 = C23468n.m68037a(objM7069O);
            StripeException stripeException = thM68037a2 instanceof StripeException ? (StripeException) thM68037a2 : null;
            if (stripeException != null && stripeException.f22157y >= 500) {
                c40017k.f172635w = null;
                c40017k.f172636x = null;
                c40017k.f172634E = 2;
                Object objM128245a = c40018l.m128245a(interfaceC38786b2, thM68037a, c40017k);
                return objM128245a == enumC31071a ? enumC31071a : objM128245a;
            }
        }
        return objM7069O;
    }

    /* JADX INFO: renamed from: c */
    public final C39857f m128247c() {
        InterfaceC22297a interfaceC22297a = this.f172640b;
        return new C39857f(((C35363y) interfaceC22297a.get()).f150633w, ((C35363y) interfaceC22297a.get()).f150634x, 4);
    }
}
