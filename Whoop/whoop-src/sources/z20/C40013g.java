package z20;

import a30.C0323s;
import b10.C2273z0;
import b10.InterfaceC2227c1;
import b20.C2326f;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import com.stripe.android.paymentsheet.repositories.DuplicatePaymentMethodDetachFailureException;
import d33.C11629t0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k83.InterfaceC22297a;
import l83.C23467m;
import l83.C23468n;
import m83.AbstractC25267u;
import p442qy.C30765d;
import p505ts.AbstractC34132o;
import p537ux.C35363y;
import p664yy.C39857f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import wb3.AbstractC37056f;
import y00.C38915o4;
import y00.C38997x5;
import y00.C39013z3;
import y00.EnumC38828f4;

/* JADX INFO: renamed from: z20.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C40013g {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2227c1 f172620a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC22297a f172621b;

    /* JADX INFO: renamed from: c */
    public final C30765d f172622c;

    /* JADX INFO: renamed from: d */
    public final C2326f f172623d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC30063j f172624e;

    /* JADX INFO: renamed from: f */
    public final Set f172625f;

    public C40013g(InterfaceC2227c1 stripeRepository, InterfaceC22297a lazyPaymentConfig, C30765d logger, C2326f errorReporter, InterfaceC30063j workContext, Set productUsageTokens) {
        AbstractC22676k.m65750j(stripeRepository, "stripeRepository");
        AbstractC22676k.m65750j(lazyPaymentConfig, "lazyPaymentConfig");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(workContext, "workContext");
        AbstractC22676k.m65750j(productUsageTokens, "productUsageTokens");
        this.f172620a = stripeRepository;
        this.f172621b = lazyPaymentConfig;
        this.f172622c = logger;
        this.f172623d = errorReporter;
        this.f172624e = workContext;
        this.f172625f = productUsageTokens;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r8 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r10 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007c, code lost:
    
        if (r8 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009a, code lost:
    
        if (r10 == r0) goto L30;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m128239a(z20.C40014h r8, java.lang.String r9, boolean r10, s83.AbstractC32269c r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof z20.C40007a
            if (r0 == 0) goto L14
            r0 = r11
            z20.a r0 = (z20.C40007a) r0
            int r1 = r0.f172594E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f172594E = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            z20.a r0 = new z20.a
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f172597y
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f172594E
            r2 = 3
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L2b
            if (r1 == r3) goto L2b
            if (r1 != r2) goto L37
        L2b:
            java.lang.String r9 = r6.f172596x
            z20.g r8 = r6.f172595w
            p505ts.AbstractC34132o.m107864I(r11)
            l83.n r11 = (l83.C23468n) r11
            java.lang.Object r10 = r11.f92940w
            goto L9e
        L37:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3f:
            p505ts.AbstractC34132o.m107864I(r11)
            if (r10 == 0) goto L53
            r6.f172595w = r7
            r6.f172596x = r9
            r6.f172594E = r4
            java.lang.Object r8 = r7.m128240b(r7, r8, r9, r6)
            if (r8 != r0) goto L51
            goto L9c
        L51:
            r10 = r8
            goto L9d
        L53:
            r10 = r2
            java.lang.String r2 = r8.f172628c
            java.lang.String r8 = r8.f172627b
            r11 = 4
            k83.a r1 = r7.f172621b
            b10.c1 r4 = r7.f172620a
            if (r2 == 0) goto L7f
            yy.f r5 = new yy.f
            java.lang.Object r10 = r1.get()
            ux.y r10 = (p537ux.C35363y) r10
            java.lang.String r10 = r10.f150634x
            r5.<init>(r8, r10, r11)
            r6.f172595w = r7
            r6.f172596x = r9
            r6.f172594E = r3
            r1 = r4
            b10.z0 r1 = (b10.C2273z0) r1
            java.util.Set r3 = r7.f172625f
            r4 = r9
            java.lang.Object r8 = r1.m7099v(r2, r3, r4, r5, r6)
            if (r8 != r0) goto L51
            goto L9c
        L7f:
            yy.f r2 = new yy.f
            java.lang.Object r1 = r1.get()
            ux.y r1 = (p537ux.C35363y) r1
            java.lang.String r1 = r1.f150634x
            r2.<init>(r8, r1, r11)
            r6.f172595w = r7
            r6.f172596x = r9
            r6.f172594E = r10
            b10.z0 r4 = (b10.C2273z0) r4
            java.util.Set r8 = r7.f172625f
            java.lang.Object r10 = r4.m7098u(r9, r8, r6, r2)
            if (r10 != r0) goto L9d
        L9c:
            return r0
        L9d:
            r8 = r7
        L9e:
            java.lang.Throwable r11 = l83.C23468n.m68037a(r10)
            if (r11 == 0) goto Lbc
            qy.d r8 = r8.f172622c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failed to detach payment method "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r9 = "."
            r0.append(r9)
            java.lang.String r9 = r0.toString()
            r8.m94512b(r9, r11)
        Lbc:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: z20.C40013g.m128239a(z20.h, java.lang.String, boolean, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0171  */
    /* JADX WARN: Code duplicated, block: B:72:0x017b  */
    /* JADX WARN: Code duplicated, block: B:75:0x018e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX INFO: renamed from: b */
    public final Object m128240b(C40013g c40013g, C40014h c40014h, String str, AbstractC32269c abstractC32269c) {
        C40008b c40008b;
        InterfaceC2994c0 interfaceC2994c0M8708b;
        Object objM128241c;
        C40013g c40013g2;
        String str2;
        Object next;
        String str3;
        List list;
        C40014h c40014h2;
        C40013g c40013g3;
        Object objM128239a;
        C40014h c40014h3 = c40014h;
        if (abstractC32269c instanceof C40008b) {
            c40008b = (C40008b) abstractC32269c;
            int i13 = c40008b.f172601G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40008b.f172601G = i13 - Integer.MIN_VALUE;
            } else {
                c40008b = new C40008b(this, abstractC32269c);
            }
        } else {
            c40008b = new C40008b(this, abstractC32269c);
        }
        Object obj = c40008b.f172599E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c40008b.f172601G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            interfaceC2994c0M8708b = AbstractC3006f0.m8708b(this.f172624e);
            List listM118958J = AbstractC37056f.m118958J(EnumC38828f4.f167090I);
            c40008b.f172602w = c40013g;
            c40008b.f172603x = c40014h3;
            c40008b.f172604y = str;
            c40008b.f172605z = interfaceC2994c0M8708b;
            c40008b.f172601G = 1;
            objM128241c = c40013g.m128241c(c40014h3, listM118958J, false, c40008b);
            if (objM128241c != enumC31071a) {
                c40013g2 = c40013g;
                str2 = str;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) c40008b.f172605z;
            String str4 = c40008b.f172604y;
            C40014h c40014h4 = c40008b.f172603x;
            C40013g c40013g4 = c40008b.f172602w;
            AbstractC34132o.m107864I(obj);
            Object obj2 = ((C23468n) obj).f92940w;
            interfaceC2994c0M8708b = interfaceC2994c0;
            str2 = str4;
            c40014h3 = c40014h4;
            objM128241c = obj2;
            c40013g2 = c40013g4;
        } else {
            if (i14 == 2) {
                AbstractC34132o.m107864I(obj);
                return ((C23468n) obj).f92940w;
            }
            if (i14 != 3) {
                if (i14 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return ((C23468n) obj).f92940w;
            }
            list = (List) c40008b.f172605z;
            str3 = c40008b.f172604y;
            c40014h2 = c40008b.f172603x;
            c40013g3 = c40008b.f172602w;
            AbstractC34132o.m107864I(obj);
        }
        if (!list.isEmpty()) {
            return AbstractC34132o.m107888l(new DuplicatePaymentMethodDetachFailureException(list));
        }
        c40008b.f172602w = null;
        c40008b.f172603x = null;
        c40008b.f172604y = null;
        c40008b.f172605z = null;
        c40008b.f172601G = 4;
        objM128239a = c40013g3.m128239a(c40014h2, str3, false, c40008b);
        if (objM128239a != enumC31071a) {
            return enumC31071a;
        }
        return objM128239a;
        Throwable thM68037a = C23468n.m68037a(objM128241c);
        if (thM68037a != null) {
            return AbstractC34132o.m107888l(thM68037a);
        }
        List list2 = (List) objM128241c;
        Iterator it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((C38915o4) next).f167527w, str2));
        C38915o4 c38915o4 = (C38915o4) next;
        if (c38915o4 == null) {
            c40008b.f172602w = null;
            c40008b.f172603x = null;
            c40008b.f172604y = null;
            c40008b.f172605z = null;
            c40008b.f172601G = 2;
            Object objM128239a2 = c40013g2.m128239a(c40014h3, str2, false, c40008b);
            if (objM128239a2 != enumC31071a) {
                return objM128239a2;
            }
        } else {
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list2) {
                C38915o4 c38915o5 = (C38915o4) obj3;
                if (c38915o5.f167511E == EnumC38828f4.f167090I) {
                    C39013z3 c39013z3 = c38915o5.f167514H;
                    String str5 = c39013z3 != null ? c39013z3.f167911F : null;
                    C39013z3 c39013z4 = c38915o4.f167514H;
                    if (AbstractC22676k.m65745e(str5, c39013z4 != null ? c39013z4.f167911F : null) && !AbstractC22676k.m65745e(c38915o5.f167527w, str2)) {
                        arrayList.add(obj3);
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C40014h c40014h5 = c40014h3;
                arrayList3.add(AbstractC3006f0.m8711e(interfaceC2994c0M8708b, null, new C0323s((C38915o4) it3.next(), c40013g2, c40014h5, arrayList2, null, 7), 3));
                c40014h3 = c40014h5;
            }
            C40014h c40014h6 = c40014h3;
            c40008b.f172602w = c40013g2;
            c40008b.f172603x = c40014h6;
            c40008b.f172604y = str2;
            c40008b.f172605z = arrayList2;
            c40008b.f172601G = 3;
            if (AbstractC3006f0.m8712f(arrayList3, c40008b) != enumC31071a) {
                str3 = str2;
                list = arrayList2;
                c40014h2 = c40014h6;
                c40013g3 = c40013g2;
                if (!list.isEmpty()) {
                    return AbstractC34132o.m107888l(new DuplicatePaymentMethodDetachFailureException(list));
                }
                c40008b.f172602w = null;
                c40008b.f172603x = null;
                c40008b.f172604y = null;
                c40008b.f172605z = null;
                c40008b.f172601G = 4;
                objM128239a = c40013g3.m128239a(c40014h2, str3, false, c40008b);
                if (objM128239a != enumC31071a) {
                    return objM128239a;
                }
            }
        }
        return enumC31071a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m128241c(C40014h c40014h, List list, boolean z4, AbstractC32269c abstractC32269c) {
        C40009c c40009c;
        if (abstractC32269c instanceof C40009c) {
            c40009c = (C40009c) abstractC32269c;
            int i13 = c40009c.f172608y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40009c.f172608y = i13 - Integer.MIN_VALUE;
            } else {
                c40009c = new C40009c(this, abstractC32269c);
            }
        } else {
            c40009c = new C40009c(this, abstractC32269c);
        }
        Object objM8705K = c40009c.f172606w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c40009c.f172608y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C11629t0 c11629t0 = new C11629t0(list, this, c40014h, z4, (InterfaceC30057d) null);
            c40009c.f172608y = 1;
            objM8705K = AbstractC3006f0.m8705K(this.f172624e, c11629t0, c40009c);
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

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m128242d(C40014h c40014h, AbstractC32269c abstractC32269c) {
        C40010d c40010d;
        Object objM7068N;
        if (abstractC32269c instanceof C40010d) {
            c40010d = (C40010d) abstractC32269c;
            int i13 = c40010d.f172611y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40010d.f172611y = i13 - Integer.MIN_VALUE;
            } else {
                c40010d = new C40010d(this, abstractC32269c);
            }
        } else {
            c40010d = new C40010d(this, abstractC32269c);
        }
        Object obj = c40010d.f172609w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c40010d.f172611y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            String str = c40014h.f172626a;
            C39857f c39857f = new C39857f(c40014h.f172627b, ((C35363y) this.f172621b.get()).f150634x, 4);
            c40010d.f172611y = 1;
            objM7068N = ((C2273z0) this.f172620a).m7068N(str, this.f172625f, c40010d, c39857f);
            if (objM7068N == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM7068N = ((C23468n) obj).f92940w;
        }
        if (objM7068N instanceof C23467m) {
            return null;
        }
        return objM7068N;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: e */
    public final Object m128243e(C40014h c40014h, String str, AbstractC32269c abstractC32269c) {
        C40011e c40011e;
        if (abstractC32269c instanceof C40011e) {
            c40011e = (C40011e) abstractC32269c;
            int i13 = c40011e.f172614y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40011e.f172614y = i13 - Integer.MIN_VALUE;
            } else {
                c40011e = new C40011e(this, abstractC32269c);
            }
        } else {
            c40011e = new C40011e(this, abstractC32269c);
        }
        Object obj = c40011e.f172612w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c40011e.f172614y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        String str2 = c40014h.f172626a;
        C39857f c39857f = new C39857f(c40014h.f172627b, ((C35363y) this.f172621b.get()).f150634x, 4);
        c40011e.f172614y = 1;
        Object objM7074T = ((C2273z0) this.f172620a).m7074T(str2, str, c40011e, c39857f);
        return objM7074T == enumC31071a ? enumC31071a : objM7074T;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m128244f(C40014h c40014h, String str, C38997x5 c38997x5, AbstractC32269c abstractC32269c) {
        C40012f c40012f;
        Object objM7078X;
        C40013g c40013g;
        if (abstractC32269c instanceof C40012f) {
            c40012f = (C40012f) abstractC32269c;
            int i13 = c40012f.f172615E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c40012f.f172615E = i13 - Integer.MIN_VALUE;
            } else {
                c40012f = new C40012f(this, abstractC32269c);
            }
        } else {
            c40012f = new C40012f(this, abstractC32269c);
        }
        Object obj = c40012f.f172618y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c40012f.f172615E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C39857f c39857f = new C39857f(c40014h.f172627b, ((C35363y) this.f172621b.get()).f150634x, 4);
            c40012f.f172616w = this;
            c40012f.f172617x = str;
            c40012f.f172615E = 1;
            objM7078X = ((C2273z0) this.f172620a).m7078X(str, c38997x5, c39857f, c40012f);
            if (objM7078X == enumC31071a) {
                return enumC31071a;
            }
            c40013g = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = c40012f.f172617x;
            c40013g = c40012f.f172616w;
            AbstractC34132o.m107864I(obj);
            objM7078X = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM7078X);
        if (thM68037a != null) {
            c40013g.f172622c.m94512b("Failed to update payment method " + str + ".", thM68037a);
        }
        return objM7078X;
    }
}
