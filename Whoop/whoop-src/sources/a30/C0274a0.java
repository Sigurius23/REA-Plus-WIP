package a30;

import a00.C0072g;
import android.content.Context;
import b20.C2326f;
import bc3.AbstractC3006f0;
import bc3.C3022j0;
import bc3.InterfaceC3018i0;
import bz.C3710i;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import h20.C16624a2;
import h20.C16636c2;
import h20.C16663h;
import h20.C16666h2;
import h20.C16669i;
import h20.C16756w2;
import h20.C16773z1;
import h20.EnumC16660g2;
import h20.InterfaceC16630b2;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k20.C22136a;
import k83.InterfaceC22297a;
import kr.C22786e;
import l83.C23468n;
import m83.AbstractC25265s;
import my.C26027a;
import p003a1.C0106e;
import p203hy.C17714c;
import p352ny.C27236h;
import p442qy.C30765d;
import p499t9.C33647p;
import p505ts.AbstractC34132o;
import p537ux.C35330f;
import p537ux.C35334h;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.AbstractC29825j0;
import q20.C29817f0;
import q20.C29819g0;
import q20.C29821h0;
import q20.C29823i0;
import q20.C29824j;
import q20.C29828m;
import q20.C29838w;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s40.C32139c0;
import s83.AbstractC32269c;
import sz.EnumC33131g;
import t40.C33536f;
import tz.C34274a;
import u00.C34377e;
import v00.C35459c0;
import v00.C35473j0;
import v00.C35475k0;
import v00.C35484p;
import x30.C37929t0;
import y00.AbstractC38906n4;
import y00.C38915o4;
import y00.C38921p1;
import y00.EnumC38828f4;
import z20.C40013g;
import z20.C40014h;
import z20.C40018l;

/* JADX INFO: renamed from: a30.a0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0274a0 {

    /* JADX INFO: renamed from: a */
    public final C16663h f937a;

    /* JADX INFO: renamed from: b */
    public final C34274a f938b;

    /* JADX INFO: renamed from: c */
    public final C40018l f939c;

    /* JADX INFO: renamed from: d */
    public final C40013g f940d;

    /* JADX INFO: renamed from: e */
    public final C34377e f941e;

    /* JADX INFO: renamed from: f */
    public final C30765d f942f;

    /* JADX INFO: renamed from: g */
    public final C22136a f943g;

    /* JADX INFO: renamed from: h */
    public final C2326f f944h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC30063j f945i;

    /* JADX INFO: renamed from: j */
    public final C0288f f946j;

    /* JADX INFO: renamed from: k */
    public final C17714c f947k;

    /* JADX INFO: renamed from: l */
    public final C37929t0 f948l;

    /* JADX INFO: renamed from: m */
    public final C3710i f949m;

    /* JADX INFO: renamed from: n */
    public final C33536f f950n;

    /* JADX INFO: renamed from: o */
    public final C27236h f951o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC22297a f952p;

    /* JADX INFO: renamed from: q */
    public final String f953q;

    /* JADX INFO: renamed from: r */
    public final C0072g f954r;

    /* JADX INFO: renamed from: s */
    public final C22786e f955s;

    /* JADX INFO: renamed from: t */
    public final C33647p f956t;

    public C0274a0(C16663h prefsRepositoryFactory, C34274a googlePayRepositoryFactory, C40018l elementsSessionRepository, C40013g customerRepository, C34377e lpmRepository, C30765d logger, C22136a eventReporter, C2326f errorReporter, InterfaceC30063j workContext, C0288f createLinkState, C17714c logLinkHoldbackExperiment, C37929t0 externalPaymentMethodsRepository, C3710i userFacingLogger, C33536f integrityRequestManager, C27236h tapToAddConnectionManager, InterfaceC22297a paymentConfiguration, String paymentElementCallbackIdentifier, C0072g analyticsMetadataFactory, C22786e paymentMethodFilter, C33647p cardFundingFilterFactory) {
        AbstractC22676k.m65750j(prefsRepositoryFactory, "prefsRepositoryFactory");
        AbstractC22676k.m65750j(googlePayRepositoryFactory, "googlePayRepositoryFactory");
        AbstractC22676k.m65750j(elementsSessionRepository, "elementsSessionRepository");
        AbstractC22676k.m65750j(customerRepository, "customerRepository");
        AbstractC22676k.m65750j(lpmRepository, "lpmRepository");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(eventReporter, "eventReporter");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(workContext, "workContext");
        AbstractC22676k.m65750j(createLinkState, "createLinkState");
        AbstractC22676k.m65750j(logLinkHoldbackExperiment, "logLinkHoldbackExperiment");
        AbstractC22676k.m65750j(externalPaymentMethodsRepository, "externalPaymentMethodsRepository");
        AbstractC22676k.m65750j(userFacingLogger, "userFacingLogger");
        AbstractC22676k.m65750j(integrityRequestManager, "integrityRequestManager");
        AbstractC22676k.m65750j(tapToAddConnectionManager, "tapToAddConnectionManager");
        AbstractC22676k.m65750j(paymentConfiguration, "paymentConfiguration");
        AbstractC22676k.m65750j(paymentElementCallbackIdentifier, "paymentElementCallbackIdentifier");
        AbstractC22676k.m65750j(analyticsMetadataFactory, "analyticsMetadataFactory");
        AbstractC22676k.m65750j(paymentMethodFilter, "paymentMethodFilter");
        AbstractC22676k.m65750j(cardFundingFilterFactory, "cardFundingFilterFactory");
        this.f937a = prefsRepositoryFactory;
        this.f938b = googlePayRepositoryFactory;
        this.f939c = elementsSessionRepository;
        this.f940d = customerRepository;
        this.f941e = lpmRepository;
        this.f942f = logger;
        this.f943g = eventReporter;
        this.f944h = errorReporter;
        this.f945i = workContext;
        this.f946j = createLinkState;
        this.f947k = logLinkHoldbackExperiment;
        this.f948l = externalPaymentMethodsRepository;
        this.f949m = userFacingLogger;
        this.f950n = integrityRequestManager;
        this.f951o = tapToAddConnectionManager;
        this.f952p = paymentConfiguration;
        this.f953q = paymentElementCallbackIdentifier;
        this.f954r = analyticsMetadataFactory;
        this.f955s = paymentMethodFilter;
        this.f956t = cardFundingFilterFactory;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:37:0x011c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0124 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001c  */
    /* JADX INFO: renamed from: a */
    public static final Object m808a(C0274a0 c0274a0, InterfaceC0303k interfaceC0303k, C35459c0 c35459c0, C3022j0 c3022j0, C35473j0 c35473j0, C35475k0 c35475k0, AbstractC32269c abstractC32269c) {
        C0306l c0306l;
        C3022j0 c3022j1;
        C35473j0 c35473j1;
        C35475k0 c35475k1;
        C0274a0 c0274a1;
        C0273a c0273a;
        Object obj;
        C35475k0 c35475k2;
        C34377e c34377e;
        C0274a0 c0274a2;
        C0273a c0273a2;
        C35459c0 c35459c1 = c35459c0;
        c0274a0.getClass();
        if (abstractC32269c instanceof C0306l) {
            c0306l = (C0306l) abstractC32269c;
            int i13 = c0306l.f1053I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0306l.f1053I = i13 - Integer.MIN_VALUE;
            } else {
                c0306l = new C0306l(c0274a0, abstractC32269c);
            }
        } else {
            c0306l = new C0306l(c0274a0, abstractC32269c);
        }
        Object objM65999h = c0306l.f1051G;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = c0306l.f1053I;
        if (i14 != 0) {
            if (i14 == 1) {
                c34377e = c0306l.f1050F;
                c35475k2 = c0306l.f1049E;
                C35473j0 c35473j2 = c0306l.f1057z;
                C3022j0 c3022j2 = c0306l.f1056y;
                C35459c0 c35459c2 = c0306l.f1055x;
                c0274a2 = (C0274a0) c0306l.f1054w;
                AbstractC34132o.m107864I(objM65999h);
                c35473j1 = c35473j2;
                c35459c1 = c35459c2;
                obj = objM65999h;
                c3022j1 = c3022j2;
            } else {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c0273a2 = (C0273a) c0306l.f1054w;
                AbstractC34132o.m107864I(objM65999h);
            }
            return C0273a.m807b(c0273a2, (List) objM65999h, null, 2);
        }
        AbstractC34132o.m107864I(objM65999h);
        if (!(interfaceC0303k instanceof C0297i)) {
            if (interfaceC0303k instanceof C0300j) {
                C16636c2 c16636c2 = ((C0300j) interfaceC0303k).f1039a;
                c0306l.f1054w = c0274a0;
                c0306l.f1055x = c35459c1;
                c3022j1 = c3022j0;
                c0306l.f1056y = c3022j1;
                c35473j1 = c35473j0;
                c0306l.f1057z = c35473j1;
                c0306l.f1049E = c35475k0;
                C34377e c34377e2 = C0273a.f934y;
                c0306l.f1050F = c34377e2;
                c0306l.f1053I = 1;
                Object objM815h = c0274a0.m815h(c35459c1, c16636c2, c0306l);
                if (objM815h != obj2) {
                    obj = objM815h;
                    c35475k2 = c35475k0;
                    c34377e = c34377e2;
                    c0274a2 = c0274a0;
                }
            } else {
                c3022j1 = c3022j0;
                c35473j1 = c35473j0;
                c35475k1 = c35475k0;
                c0274a1 = c0274a0;
                c0273a = null;
            }
            return obj2;
        }
        C38921p1 customer = ((C0297i) interfaceC0303k).f1033a;
        ArrayList arrayListM112536T = c35459c1.m112536T();
        AbstractC22676k.m65750j(customer, "customer");
        Iterable iterable = (Iterable) customer.f167543w;
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : iterable) {
            if (AbstractC25265s.m74155w0(arrayListM112536T, ((C38915o4) obj3).f167511E)) {
                arrayList.add(obj3);
            }
        }
        c0274a1 = c0274a0;
        c35473j1 = c35473j0;
        c35475k1 = c35475k0;
        c0273a = new C0273a(arrayList, customer.f167544x);
        c3022j1 = c3022j0;
        if (c0273a != null) {
            return null;
        }
        C22786e c22786e = c0274a1.f955s;
        List list = c0273a.f935w;
        C0332w0 c0332w0 = new C0332w0(c35459c1.f150997x, c35459c1.f150973P, c0273a.f936x, c35473j1, c35475k1, c3022j1);
        c0306l.f1054w = c0273a;
        c0306l.f1055x = null;
        c0306l.f1056y = null;
        c0306l.f1057z = null;
        c0306l.f1049E = null;
        c0306l.f1050F = null;
        c0306l.f1053I = 2;
        objM65999h = c22786e.m65999h(list, c0332w0, c0306l);
        if (objM65999h != obj2) {
            c0273a2 = c0273a;
            return C0273a.m807b(c0273a2, (List) objM65999h, null, 2);
        }
        return obj2;
        List paymentMethods = (List) obj;
        c34377e.getClass();
        AbstractC22676k.m65750j(paymentMethods, "paymentMethods");
        C35475k0 c35475k3 = c35475k2;
        c0273a = new C0273a(paymentMethods, null);
        c0274a1 = c0274a2;
        c35475k1 = c35475k3;
        if (c0273a != null) {
            return null;
        }
        C22786e c22786e2 = c0274a1.f955s;
        List list2 = c0273a.f935w;
        C0332w0 c0332w1 = new C0332w0(c35459c1.f150997x, c35459c1.f150973P, c0273a.f936x, c35473j1, c35475k1, c3022j1);
        c0306l.f1054w = c0273a;
        c0306l.f1055x = null;
        c0306l.f1056y = null;
        c0306l.f1057z = null;
        c0306l.f1049E = null;
        c0306l.f1050F = null;
        c0306l.f1053I = 2;
        objM65999h = c22786e2.m65999h(list2, c0332w1, c0306l);
        if (objM65999h != obj2) {
            c0273a2 = c0273a;
            return C0273a.m807b(c0273a2, (List) objM65999h, null, 2);
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m809b(C0274a0 c0274a0, C26027a c26027a, AbstractC32269c abstractC32269c) {
        C0312n c0312n;
        boolean zBooleanValue;
        EnumC16660g2 enumC16660g2;
        EnumC33131g enumC33131g;
        if (abstractC32269c instanceof C0312n) {
            c0312n = (C0312n) abstractC32269c;
            int i13 = c0312n.f1076y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0312n.f1076y = i13 - Integer.MIN_VALUE;
            } else {
                c0312n = new C0312n(c0274a0, abstractC32269c);
            }
        } else {
            c0312n = new C0312n(c0274a0, abstractC32269c);
        }
        Object objM36575A = c0312n.f1074w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0312n.f1076y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36575A);
            C16666h2 c16666h2 = c26027a.f102972y;
            if (c16666h2 == null || (enumC16660g2 = c16666h2.f64095w) == null) {
                zBooleanValue = false;
            } else {
                int iOrdinal = enumC16660g2.ordinal();
                if (iOrdinal == 0) {
                    enumC33131g = EnumC33131g.Production;
                } else {
                    if (iOrdinal != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    enumC33131g = EnumC33131g.Test;
                }
                c0312n.f1076y = 1;
                objM36575A = AbstractC13091v.m36575A(new C13084s1(new C32139c0(c0274a0.f938b.m108532a(enumC33131g, C35334h.f150537w, C35330f.f150532w), null, 2)), c0312n);
                if (objM36575A == enumC31071a) {
                    return enumC31071a;
                }
            }
            return Boolean.valueOf(zBooleanValue);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM36575A);
        zBooleanValue = ((Boolean) objM36575A).booleanValue();
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:33:0x0086 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0087 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:35:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r10 == r2) goto L33;
     */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m810c(a30.C0274a0 r6, my.C26027a r7, y00.C38966u1 r8, bc3.InterfaceC3018i0 r9, s83.AbstractC32269c r10) {
        /*
            bz.i r0 = r6.f949m
            boolean r1 = r10 instanceof a30.C0309m
            if (r1 == 0) goto L15
            r1 = r10
            a30.m r1 = (a30.C0309m) r1
            int r2 = r1.f1067F
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f1067F = r2
            goto L1a
        L15:
            a30.m r1 = new a30.m
            r1.<init>(r6, r10)
        L1a:
            java.lang.Object r10 = r1.f1071z
            r83.a r2 = r83.EnumC31071a.f128113w
            int r3 = r1.f1067F
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3e
            if (r3 == r5) goto L34
            if (r3 != r4) goto L2c
            p505ts.AbstractC34132o.m107864I(r10)
            return r10
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            bc3.i0 r9 = r1.f1070y
            y00.u1 r8 = r1.f1069x
            a30.a0 r6 = r1.f1068w
            p505ts.AbstractC34132o.m107864I(r10)
            goto L64
        L3e:
            p505ts.AbstractC34132o.m107864I(r10)
            boolean r10 = r8.f167727L
            if (r10 != 0) goto L4b
            java.lang.String r6 = "Google Pay is not enabled for this session."
            r0.m11528a(r6)
            goto L73
        L4b:
            h20.h2 r7 = r7.f102972y
            if (r7 != 0) goto L55
            java.lang.String r6 = "GooglePayConfiguration is not set."
            r0.m11528a(r6)
            goto L73
        L55:
            r1.f1068w = r6
            r1.f1069x = r8
            r1.f1070y = r9
            r1.f1067F = r5
            java.lang.Object r10 = r9.await(r1)
            if (r10 != r2) goto L64
            goto L86
        L64:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r7 = r10.booleanValue()
            if (r7 != 0) goto L73
            bz.i r6 = r6.f949m
            java.lang.String r7 = "Google Pay API check failed.\nPossible reasons:\n- Google Play service is not available on this device.\n- Google account is not signed in on this device.\nSee https://developers.google.com/android/reference/com/google/android/gms/wallet/PaymentsClient#public-taskboolean-isreadytopay-isreadytopayrequest-request for more details."
            r6.m11528a(r7)
        L73:
            boolean r6 = r8.f167727L
            if (r6 == 0) goto L88
            r6 = 0
            r1.f1068w = r6
            r1.f1069x = r6
            r1.f1070y = r6
            r1.f1067F = r4
            java.lang.Object r6 = r9.await(r1)
            if (r6 != r2) goto L87
        L86:
            return r2
        L87:
            return r6
        L88:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a30.C0274a0.m810c(a30.a0, my.a, y00.u1, bc3.i0, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    public static final Object m811d(C0274a0 c0274a0, AbstractC0326t0 abstractC0326t0, C16636c2 c16636c2, List list, List list2, String str, C16756w2 c16756w2, String str2, AbstractC32269c abstractC32269c) {
        C0333x c0333x;
        if (abstractC32269c instanceof C0333x) {
            c0333x = (C0333x) abstractC32269c;
            int i13 = c0333x.f1173y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0333x.f1173y = i13 - Integer.MIN_VALUE;
            } else {
                c0333x = new C0333x(c0274a0, abstractC32269c);
            }
        } else {
            c0333x = new C0333x(c0274a0, abstractC32269c);
        }
        C0333x c0333x2 = c0333x;
        Object obj = c0333x2.f1171w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0333x2.f1173y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C40018l c40018l = c0274a0.f939c;
        ?? r14 = c16756w2.f64376E;
        c0333x2.f1173y = 1;
        Object objM128246b = c40018l.m128246b(abstractC0326t0, c16636c2, list, list2, str, str2, r14, c0333x2);
        return objM128246b == enumC31071a ? enumC31071a : objM128246b;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x00ef A[PHI: r9 r10 r11
      0x00ef: PHI (r9v1 a30.a) = (r9v0 a30.a), (r9v0 a30.a), (r9v3 a30.a), (r9v3 a30.a), (r9v3 a30.a), (r9v3 a30.a), (r9v3 a30.a) binds: [B:19:0x0049, B:33:0x0075, B:72:0x00f3, B:66:0x00e5, B:68:0x00ec, B:49:0x00a8, B:44:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r10v1 boolean) = (r10v0 boolean), (r10v0 boolean), (r10v3 boolean), (r10v3 boolean), (r10v3 boolean), (r10v3 boolean), (r10v3 boolean) binds: [B:19:0x0049, B:33:0x0075, B:72:0x00f3, B:66:0x00e5, B:68:0x00ec, B:49:0x00a8, B:44:0x009a] A[DONT_GENERATE, DONT_INLINE]
      0x00ef: PHI (r11v1 boolean) = (r11v0 boolean), (r11v0 boolean), (r11v3 boolean), (r11v3 boolean), (r11v3 boolean), (r11v3 boolean), (r11v3 boolean) binds: [B:19:0x0049, B:33:0x0075, B:72:0x00f3, B:66:0x00e5, B:68:0x00ec, B:49:0x00a8, B:44:0x009a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:79:0x010a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code duplicated, block: B:81:0x010d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x010e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0115 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:87:0x0116 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:88:0x0117 A[RETURN] */
    /* JADX INFO: renamed from: e */
    public static final Object m812e(C0274a0 c0274a0, InterfaceC3018i0 interfaceC3018i0, C35459c0 c35459c0, C0273a c0273a, boolean z4, boolean z13, AbstractC32269c abstractC32269c) {
        C0335y c0335y;
        Object next;
        Object c29838w;
        C38915o4 c38915o4;
        String str;
        C29838w c29838w2;
        C38915o4 c38915o5;
        C38915o4 c38915o6;
        Object next2;
        c0274a0.getClass();
        if (abstractC32269c instanceof C0335y) {
            c0335y = (C0335y) abstractC32269c;
            int i13 = c0335y.f1178F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0335y.f1178F = i13 - Integer.MIN_VALUE;
            } else {
                c0335y = new C0335y(c0274a0, abstractC32269c);
            }
        } else {
            c0335y = new C0335y(c0274a0, abstractC32269c);
        }
        Object objAwait = c0335y.f1182z;
        Object obj = EnumC31071a.f128113w;
        int i14 = c0335y.f1178F;
        C29824j c29824j = C29824j.f121906x;
        boolean z14 = false;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objAwait);
            C35484p c35484p = c35459c0.f150973P;
            if (!(c35484p != null ? c35484p.f151062z : false)) {
                c0335y.f1179w = c0273a;
                c0335y.f1180x = z4;
                c0335y.f1181y = z13;
                c0335y.f1178F = 1;
                objAwait = interfaceC3018i0.await(c0335y);
                if (objAwait == obj) {
                    return obj;
                }
            } else if (c0273a != null) {
                Iterator it = c0273a.f935w.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    c38915o4 = (C38915o4) next;
                    str = c0273a.f936x;
                } while (!(str != null && AbstractC22676k.m65745e(c38915o4.f167527w, str)));
                C38915o4 c38915o7 = (C38915o4) next;
                if (c38915o7 != null) {
                    c29838w = new C29838w(c38915o7, null, null);
                } else {
                    c29838w = null;
                }
            } else {
                c29838w = null;
            }
            if (c29838w == null) {
                return c29838w;
            }
            if (c0273a != null || (c38915o5 = (C38915o4) AbstractC25265s.m74100H0(c0273a.f935w)) == null) {
                c29838w2 = null;
            } else {
                c29838w2 = new C29838w(c38915o5, null, null);
            }
            if (c29838w2 != null) {
                return c29838w2;
            }
            if (!z13 && z4) {
                z14 = true;
            }
            if (z14) {
                return c29824j;
            }
            return null;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z13 = c0335y.f1181y;
        z4 = c0335y.f1180x;
        c0273a = c0335y.f1179w;
        AbstractC34132o.m107864I(objAwait);
        AbstractC29825j0 abstractC29825j0 = (AbstractC29825j0) objAwait;
        if (abstractC29825j0 instanceof C29817f0) {
            if (!z13 && z4) {
                c29838w = c29824j;
            } else {
                c29838w = null;
            }
        } else if (abstractC29825j0 instanceof C29819g0) {
            c29838w = new C29828m(null, null, null, 7);
            if (z13) {
                c29838w = null;
            }
        } else {
            if (abstractC29825j0 instanceof C29823i0) {
                if (c0273a != null) {
                    Iterator it3 = c0273a.f935w.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (!AbstractC22676k.m65745e(((C38915o4) next2).f167527w, ((C29823i0) abstractC29825j0).f121904w));
                    c38915o6 = (C38915o4) next2;
                } else {
                    c38915o6 = null;
                }
                if (c38915o6 != null) {
                    c29838w = new C29838w(c38915o6, null, null);
                } else if (((C29823i0) abstractC29825j0).f121905x) {
                    c29838w = new C29828m(null, null, null, 7);
                    if (z13) {
                    }
                }
            } else if (!(abstractC29825j0 instanceof C29821h0)) {
                throw new NoWhenBranchMatchedException();
            }
            c29838w = null;
        }
        if (c29838w == null) {
            return c29838w;
        }
        if (c0273a != null) {
            c29838w2 = null;
        } else {
            c29838w2 = null;
        }
        if (c29838w2 != null) {
            return c29838w2;
        }
        if (!z13) {
            z14 = true;
        }
        if (z14) {
            return c29824j;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public static final Object m813f(C0274a0 c0274a0, C26027a c26027a, AbstractC32269c abstractC32269c) throws Throwable {
        C0337z c0337z;
        if (abstractC32269c instanceof C0337z) {
            c0337z = (C0337z) abstractC32269c;
            int i13 = c0337z.f1188y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0337z.f1188y = i13 - Integer.MIN_VALUE;
            } else {
                c0337z = new C0337z(c0274a0, abstractC32269c);
            }
        } else {
            c0337z = new C0337z(c0274a0, abstractC32269c);
        }
        Object objM8705K = c0337z.f1186w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0337z.f1188y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C16636c2 c16636c2 = c26027a.f102971x;
            InterfaceC16630b2 interfaceC16630b2 = c16636c2 != null ? c16636c2.f63985y : null;
            if (interfaceC16630b2 instanceof C16773z1) {
                c0337z.f1188y = 1;
                C16663h c16663h = c0274a0.f937a;
                String str = c16636c2 != null ? c16636c2.f63983w : null;
                Context context = c16663h.f64075a;
                InterfaceC30063j interfaceC30063j = c16663h.f64076b;
                objM8705K = AbstractC3006f0.m8705K(interfaceC30063j, new C16669i(new C0072g(context, str, interfaceC30063j), false, false, (InterfaceC30057d) null), c0337z);
                if (objM8705K == enumC31071a) {
                    return enumC31071a;
                }
            } else if (!(interfaceC16630b2 instanceof C16624a2) && interfaceC16630b2 != null) {
                throw new NoWhenBranchMatchedException();
            }
            return null;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM8705K);
        if (objM8705K instanceof C29823i0) {
            return (C29823i0) objM8705K;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public final Object m814g(AbstractC0326t0 abstractC0326t0, C0313n0 c0313n0, C0328u0 c0328u0, AbstractC32269c abstractC32269c) throws Throwable {
        C0315o c0315o;
        if (abstractC32269c instanceof C0315o) {
            c0315o = (C0315o) abstractC32269c;
            int i13 = c0315o.f1090y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0315o.f1090y = i13 - Integer.MIN_VALUE;
            } else {
                c0315o = new C0315o(this, abstractC32269c);
            }
        } else {
            c0315o = new C0315o(this, abstractC32269c);
        }
        C0315o c0315o2 = c0315o;
        Object obj = c0315o2.f1088w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0315o2.f1090y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C0106e c0106e = new C0106e(1, this, C0274a0.class, "reportFailedLoad", "reportFailedLoad(Ljava/lang/Throwable;)V", 0, 4);
        C0329v c0329v = new C0329v(c0313n0, abstractC0326t0, this, c0328u0, null);
        c0315o2.f1090y = 1;
        Object objM65708P = AbstractC22674j.m65708P(this.f945i, c0106e, c0329v, c0315o2);
        return objM65708P == enumC31071a ? enumC31071a : objM65708P;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Serializable m815h(C35459c0 c35459c0, C16636c2 c16636c2, AbstractC32269c abstractC32269c) {
        C0331w c0331w;
        Object objM128241c;
        if (abstractC32269c instanceof C0331w) {
            c0331w = (C0331w) abstractC32269c;
            int i13 = c0331w.f1163y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c0331w.f1163y = i13 - Integer.MIN_VALUE;
            } else {
                c0331w = new C0331w(this, abstractC32269c);
            }
        } else {
            c0331w = new C0331w(this, abstractC32269c);
        }
        Object obj = c0331w.f1161w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c0331w.f1163y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            ArrayList arrayListM112536T = c35459c0.m112536T();
            InterfaceC16630b2 interfaceC16630b2 = c16636c2.f63985y;
            C16773z1 c16773z1 = interfaceC16630b2 instanceof C16773z1 ? (C16773z1) interfaceC16630b2 : null;
            C40014h c40014h = new C40014h(c16636c2.f63983w, c16636c2.f63984x, c16773z1 != null ? c16773z1.f64473w : null);
            boolean zMo124338q0 = c35459c0.f150996w.mo124338q0();
            c0331w.f1163y = 1;
            objM128241c = this.f940d.m128241c(c40014h, arrayListM112536T, zMo124338q0, c0331w);
            if (objM128241c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM128241c = ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(objM128241c);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (List) objM128241c) {
            C38915o4 c38915o4 = (C38915o4) obj2;
            EnumC38828f4 enumC38828f4 = c38915o4.f167511E;
            switch (enumC38828f4 == null ? -1 : AbstractC38906n4.f167477a[enumC38828f4.ordinal()]) {
                case 1:
                    if (c38915o4.f167514H != null) {
                        arrayList.add(obj2);
                    }
                    break;
                case 2:
                    if (c38915o4.f167515I != null) {
                        arrayList.add(obj2);
                    }
                    break;
                case 3:
                    if (c38915o4.f167516J != null) {
                        arrayList.add(obj2);
                    }
                    break;
                case 4:
                    if (c38915o4.f167517K != null) {
                        arrayList.add(obj2);
                    }
                    break;
                case 5:
                    if (c38915o4.f167518L != null) {
                        arrayList.add(obj2);
                    }
                    break;
                case 6:
                    if (c38915o4.f167519M != null) {
                        arrayList.add(obj2);
                    }
                    break;
                case 7:
                    if (c38915o4.f167520N != null) {
                        arrayList.add(obj2);
                    }
                    break;
                case 8:
                    if (c38915o4.f167523Q != null) {
                        arrayList.add(obj2);
                    }
                    break;
                default:
                    arrayList.add(obj2);
                    break;
            }
        }
        return arrayList;
    }
}
