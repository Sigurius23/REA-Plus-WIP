package n10;

import android.content.Context;
import b10.C2273z0;
import b10.InterfaceC2227c1;
import bz.C3710i;
import com.stripe.android.paymentelement.confirmation.intent.CreateIntentWithConfirmationTokenCallbackFailureException;
import e10.C12533a;
import e10.C12535b;
import e10.C12537c;
import e10.C12571t;
import e10.C12572t0;
import e10.C12574u0;
import e10.InterfaceC12576v0;
import h20.C16633c;
import h20.C16639d;
import h20.C16744u2;
import h20.EnumC16738t2;
import h20.InterfaceC16645e;
import js2.C21930h;
import l83.C23467m;
import l83.C23468n;
import m83.C25271y;
import p000.AbstractC11266d;
import p031b9.C2852m1;
import p479s4.AbstractC32121b;
import p479s4.AbstractC32128i;
import p499t9.C33623c0;
import p505ts.AbstractC34132o;
import p664yy.C39857f;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import se.AbstractC32410a;
import x30.AbstractC37926s0;
import y00.AbstractC38833g;
import y00.AbstractC38970u5;
import y00.C38775a1;
import y00.C38809d5;
import y00.C38889l5;
import y00.C38901n;
import y00.C38915o4;
import y00.C38919p;
import y00.C38964u;
import y00.C38973v;
import y00.C38982w;
import y00.C38983w0;
import y00.C38994x2;
import y00.EnumC38817e3;
import y00.EnumC38828f4;
import y00.EnumC38910o;
import y00.InterfaceC38802c8;
import y00.InterfaceC39010z0;

/* JADX INFO: renamed from: n10.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C26128g implements InterfaceC26133i0 {

    /* JADX INFO: renamed from: a */
    public final C16744u2 f103516a;

    /* JADX INFO: renamed from: b */
    public final String f103517b;

    /* JADX INFO: renamed from: c */
    public final String f103518c;

    /* JADX INFO: renamed from: d */
    public final C38901n f103519d;

    /* JADX INFO: renamed from: e */
    public final Context f103520e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC2227c1 f103521f;

    /* JADX INFO: renamed from: g */
    public final C39857f f103522g;

    /* JADX INFO: renamed from: h */
    public final C3710i f103523h;

    /* JADX INFO: renamed from: i */
    public final C2852m1 f103524i;

    public C26128g(C16744u2 intentConfiguration, String str, String str2, C38901n clientAttributionMetadata, Context context, InterfaceC2227c1 stripeRepository, C39857f requestOptions, C3710i userFacingLogger) {
        AbstractC22676k.m65750j(intentConfiguration, "intentConfiguration");
        AbstractC22676k.m65750j(null, "createIntentCallback");
        AbstractC22676k.m65750j(clientAttributionMetadata, "clientAttributionMetadata");
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(stripeRepository, "stripeRepository");
        AbstractC22676k.m65750j(requestOptions, "requestOptions");
        AbstractC22676k.m65750j(userFacingLogger, "userFacingLogger");
        this.f103516a = intentConfiguration;
        this.f103517b = str;
        this.f103518c = str2;
        this.f103519d = clientAttributionMetadata;
        this.f103520e = context;
        this.f103521f = stripeRepository;
        this.f103522g = requestOptions;
        this.f103523h = userFacingLogger;
        this.f103524i = new C2852m1(requestOptions.m127934f(), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        if (r11 == r0) goto L32;
     */
    @Override // n10.InterfaceC26133i0
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo77680a(y00.InterfaceC38802c8 r8, e10.C12574u0 r9, y00.C38919p r10, q83.InterfaceC30057d r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof n10.C26126f
            if (r0 == 0) goto L14
            r0 = r11
            n10.f r0 = (n10.C26126f) r0
            int r1 = r0.f103511G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f103511G = r1
        L12:
            r6 = r0
            goto L1c
        L14:
            n10.f r0 = new n10.f
            s83.c r11 = (s83.AbstractC32269c) r11
            r0.<init>(r7, r11)
            goto L12
        L1c:
            java.lang.Object r11 = r6.f103509E
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f103511G
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L48
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            p505ts.AbstractC34132o.m107864I(r11)
            goto La0
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            y00.p r10 = r6.f103515z
            e10.u0 r9 = r6.f103514y
            y00.c8 r8 = r6.f103513x
            n10.g r1 = r6.f103512w
            p505ts.AbstractC34132o.m107864I(r11)
            l83.n r11 = (l83.C23468n) r11
            java.lang.Object r11 = r11.f92940w
        L46:
            r4 = r10
            goto L82
        L48:
            p505ts.AbstractC34132o.m107864I(r11)
            y00.o4 r11 = r9.f42940w
            y00.n r1 = r7.f103519d
            y00.w r1 = r7.m77684e(r9, r10, r1)
            java.lang.String r11 = r11.f167513G
            yy.f r4 = r7.f103522g
            if (r11 == 0) goto L6b
            java.lang.String r11 = r7.f103518c
            if (r11 != 0) goto L66
            bz.i r11 = r7.f103523h
            java.lang.String r5 = "Ephemeral key secret is required to confirm with saved payment method"
            r11.m11528a(r5)
            java.lang.String r11 = ""
        L66:
            r5 = 6
            yy.f r4 = p664yy.C39857f.m127933b(r4, r11, r5)
        L6b:
            r6.f103512w = r7
            r6.f103513x = r8
            r6.f103514y = r9
            r6.f103515z = r10
            r6.f103511G = r3
            b10.c1 r11 = r7.f103521f
            b10.z0 r11 = (b10.C2273z0) r11
            java.lang.Object r11 = r11.m7090m(r1, r4, r6)
            if (r11 != r0) goto L80
            goto L9f
        L80:
            r1 = r7
            goto L46
        L82:
            java.lang.Throwable r10 = l83.C23468n.m68037a(r11)
            if (r10 != 0) goto La3
            r3 = r11
            y00.u r3 = (y00.C38964u) r3
            java.lang.String r5 = r9.f42943z
            r9 = 0
            r6.f103512w = r9
            r6.f103513x = r9
            r6.f103514y = r9
            r6.f103515z = r9
            r6.f103511G = r2
            r2 = r8
            java.lang.Object r11 = r1.m77683d(r2, r3, r4, r5, r6)
            if (r11 != r0) goto La0
        L9f:
            return r0
        La0:
            e10.d r11 = (e10.InterfaceC12539d) r11
            return r11
        La3:
            e10.b r8 = new e10.b
            zy.c r9 = x30.AbstractC37926s0.m121456H(r10)
            e10.t r11 = e10.C12571t.f42932a
            r8.<init>(r10, r9, r11)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n10.C26128g.mo77680a(y00.c8, e10.u0, y00.p, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007e, code lost:
    
        if (r11 == r0) goto L26;
     */
    @Override // n10.InterfaceC26133i0
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo77681b(y00.InterfaceC38802c8 r8, e10.C12572t0 r9, y00.C38919p r10, q83.InterfaceC30057d r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof n10.C26124e
            if (r0 == 0) goto L14
            r0 = r11
            n10.e r0 = (n10.C26124e) r0
            int r1 = r0.f103503F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f103503F = r1
        L12:
            r6 = r0
            goto L1c
        L14:
            n10.e r0 = new n10.e
            s83.c r11 = (s83.AbstractC32269c) r11
            r0.<init>(r7, r11)
            goto L12
        L1c:
            java.lang.Object r11 = r6.f103507z
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f103503F
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L46
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            p505ts.AbstractC34132o.m107864I(r11)
            goto L81
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            y00.p r10 = r6.f103506y
            y00.c8 r8 = r6.f103505x
            n10.g r9 = r6.f103504w
            p505ts.AbstractC34132o.m107864I(r11)
            l83.n r11 = (l83.C23468n) r11
            java.lang.Object r11 = r11.f92940w
            r1 = r9
        L44:
            r4 = r10
            goto L66
        L46:
            p505ts.AbstractC34132o.m107864I(r11)
            y00.n r11 = r7.f103519d
            y00.w r9 = r7.m77684e(r9, r10, r11)
            r6.f103504w = r7
            r6.f103505x = r8
            r6.f103506y = r10
            r6.f103503F = r3
            b10.c1 r11 = r7.f103521f
            b10.z0 r11 = (b10.C2273z0) r11
            yy.f r1 = r7.f103522g
            java.lang.Object r11 = r11.m7090m(r9, r1, r6)
            if (r11 != r0) goto L64
            goto L80
        L64:
            r1 = r7
            goto L44
        L66:
            java.lang.Throwable r9 = l83.C23468n.m68037a(r11)
            if (r9 != 0) goto L84
            r3 = r11
            y00.u r3 = (y00.C38964u) r3
            r9 = 0
            r6.f103504w = r9
            r6.f103505x = r9
            r6.f103506y = r9
            r6.f103503F = r2
            r5 = 0
            r2 = r8
            java.lang.Object r11 = r1.m77683d(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L81
        L80:
            return r0
        L81:
            e10.d r11 = (e10.InterfaceC12539d) r11
            return r11
        L84:
            e10.b r8 = new e10.b
            zy.c r10 = x30.AbstractC37926s0.m121456H(r9)
            e10.t r11 = e10.C12571t.f42932a
            r8.<init>(r9, r10, r11)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: n10.C26128g.mo77681b(y00.c8, e10.t0, y00.p, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m77682c(String str, String str2, C38919p c38919p, String str3, AbstractC32269c abstractC32269c) {
        C26120c c26120c;
        Object objM7073S;
        C26128g c26128g;
        Object objM107888l;
        if (abstractC32269c instanceof C26120c) {
            c26120c = (C26120c) abstractC32269c;
            int i13 = c26120c.f103483H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26120c.f103483H = i13 - Integer.MIN_VALUE;
            } else {
                c26120c = new C26120c(this, abstractC32269c);
            }
        } else {
            c26120c = new C26120c(this, abstractC32269c);
        }
        Object obj = c26120c.f103481F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26120c.f103483H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c26120c.f103484w = this;
            c26120c.f103485x = str;
            c26120c.f103486y = str2;
            c26120c.f103487z = c38919p;
            c26120c.f103480E = str3;
            c26120c.f103483H = 1;
            objM7073S = ((C2273z0) this.f103521f).m7073S(str, this.f103522g, C25271y.f99162w, c26120c);
            if (objM7073S == enumC31071a) {
                return enumC31071a;
            }
            c26128g = this;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str3 = c26120c.f103480E;
            c38919p = c26120c.f103487z;
            str2 = c26120c.f103486y;
            str = c26120c.f103485x;
            c26128g = c26120c.f103484w;
            AbstractC34132o.m107864I(obj);
            objM7073S = ((C23468n) obj).f92940w;
        }
        String str4 = str;
        C38919p c38919p2 = c38919p;
        if (!(objM7073S instanceof C23467m)) {
            try {
                InterfaceC38802c8 interfaceC38802c8 = (InterfaceC38802c8) objM7073S;
                if (interfaceC38802c8.mo124334j0()) {
                    objM107888l = new C12533a(interfaceC38802c8, EnumC26121c0.Server, true);
                } else {
                    objM107888l = interfaceC38802c8.mo124339z() ? new C12537c(new C26125e0(interfaceC38802c8), false, EnumC26121c0.Server) : c26128g.f103524i.m8247b(str4, interfaceC38802c8, c38919p2, true, new C21930h(str2, str3, c26128g, 24));
                }
            } catch (Throwable th3) {
                objM107888l = AbstractC34132o.m107888l(th3);
            }
            objM7073S = objM107888l;
        }
        Throwable thM68037a = C23468n.m68037a(objM7073S);
        return thM68037a == null ? objM7073S : new C12535b(thM68037a, AbstractC37926s0.m121456H(thM68037a), C12571t.f42932a);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: d */
    public final Object m77683d(InterfaceC38802c8 interfaceC38802c8, C38964u c38964u, C38919p c38919p, String str, AbstractC32269c abstractC32269c) {
        C26122d c26122d;
        if (abstractC32269c instanceof C26122d) {
            c26122d = (C26122d) abstractC32269c;
            int i13 = c26122d.f103496H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c26122d.f103496H = i13 - Integer.MIN_VALUE;
            } else {
                c26122d = new C26122d(this, abstractC32269c);
            }
        } else {
            c26122d = new C26122d(this, abstractC32269c);
        }
        C26122d c26122d2 = c26122d;
        Object obj = c26122d2.f103494F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c26122d2.f103496H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            c26122d2.f103497w = this;
            c26122d2.f103498x = interfaceC38802c8;
            c26122d2.f103499y = c38964u;
            c26122d2.f103500z = c38919p;
            c26122d2.f103493E = str;
            c26122d2.f103496H = 1;
            throw null;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        String str2 = c26122d2.f103493E;
        C38919p c38919p2 = c26122d2.f103500z;
        C38964u c38964u2 = c26122d2.f103499y;
        InterfaceC38802c8 interfaceC38802c9 = c26122d2.f103498x;
        C26128g c26128g = c26122d2.f103497w;
        AbstractC34132o.m107864I(obj);
        InterfaceC16645e interfaceC16645e = (InterfaceC16645e) obj;
        if (!(interfaceC16645e instanceof C16639d)) {
            if (!(interfaceC16645e instanceof C16633c)) {
                throw new NoWhenBranchMatchedException();
            }
            C16633c c16633c = (C16633c) interfaceC16645e;
            CreateIntentWithConfirmationTokenCallbackFailureException createIntentWithConfirmationTokenCallbackFailureException = new CreateIntentWithConfirmationTokenCallbackFailureException(c16633c.f63977a);
            String str3 = c16633c.f63978b;
            return new C12535b(createIntentWithConfirmationTokenCallbackFailureException, str3 != null ? AbstractC32128i.m100055i(str3) : AbstractC37926s0.m121456H(createIntentWithConfirmationTokenCallbackFailureException), C12571t.f42932a);
        }
        C16639d c16639d = (C16639d) interfaceC16645e;
        if (AbstractC22676k.m65745e(c16639d.f63990a, "COMPLETE_WITHOUT_CONFIRMING_INTENT")) {
            return new C12533a(interfaceC38802c9, EnumC26121c0.None, true);
        }
        String str4 = c16639d.f63990a;
        String str5 = c38964u2.f167715w;
        c26122d2.f103497w = null;
        c26122d2.f103498x = null;
        c26122d2.f103499y = null;
        c26122d2.f103500z = null;
        c26122d2.f103493E = null;
        c26122d2.f103496H = 2;
        Object objM77682c = c26128g.m77682c(str4, str5, c38919p2, str2, c26122d2);
        return objM77682c == enumC31071a ? enumC31071a : objM77682c;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b7  */
    /* JADX INFO: renamed from: e */
    public final C38982w m77684e(InterfaceC12576v0 interfaceC12576v0, C38919p c38919p, C38901n c38901n) {
        EnumC38910o enumC38910oM121457I;
        EnumC38828f4 enumC38828f4M106237k;
        boolean z4;
        String str;
        C38973v c38973v;
        EnumC38910o enumC38910o;
        EnumC38817e3 enumC38817e3;
        C38915o4 c38915o4;
        C16744u2 c16744u2 = this.f103516a;
        InterfaceC12576v0 interfaceC12576v0Mo35254Z = interfaceC12576v0.mo35254Z(c16744u2);
        Context context = this.f103520e;
        AbstractC22676k.m65750j(context, "context");
        String packageName = context.getPackageName();
        AbstractC22676k.m65749i(packageName, "getPackageName(...)");
        String strM30461o = AbstractC11266d.m30461o("stripesdk://payment_return_url/", packageName);
        boolean z13 = interfaceC12576v0Mo35254Z instanceof C12574u0;
        C12574u0 c12574u0 = z13 ? (C12574u0) interfaceC12576v0Mo35254Z : null;
        String str2 = (c12574u0 == null || (c38915o4 = c12574u0.f42940w) == null) ? null : c38915o4.f167527w;
        boolean z14 = interfaceC12576v0Mo35254Z instanceof C12572t0;
        C12572t0 c12572t0 = z14 ? (C12572t0) interfaceC12576v0Mo35254Z : null;
        C38809d5 c38809d5 = c12572t0 != null ? c12572t0.f42935w : null;
        AbstractC38970u5 abstractC38970u5Mo35255n = interfaceC12576v0Mo35254Z.mo35255n();
        if (abstractC38970u5Mo35255n == null || (enumC38910oM121457I = AbstractC38833g.m124348d(abstractC38970u5Mo35255n)) == null) {
            EnumC16738t2 enumC16738t2Mo47258b = c16744u2.f64308w.mo47258b();
            enumC38910oM121457I = enumC16738t2Mo47258b != null ? AbstractC37926s0.m121457I(enumC16738t2Mo47258b) : null;
        }
        if (z14) {
            C33623c0 c33623c0 = EnumC38828f4.f167088G;
            String str3 = ((C12572t0) interfaceC12576v0Mo35254Z).f42935w.f167026w;
            c33623c0.getClass();
            enumC38828f4M106237k = C33623c0.m106237k(str3);
        } else {
            if (!z13) {
                throw new NoWhenBranchMatchedException();
            }
            enumC38828f4M106237k = ((C12574u0) interfaceC12576v0Mo35254Z).f42940w.f167511E;
        }
        if (z14) {
            z4 = ((C12572t0) interfaceC12576v0Mo35254Z).f42935w.f167027x;
        } else {
            if (!z13) {
                throw new NoWhenBranchMatchedException();
            }
            z4 = false;
        }
        AbstractC38970u5 abstractC38970u5Mo35255n2 = interfaceC12576v0Mo35254Z.mo35255n();
        EnumC16738t2 enumC16738t2Mo47258b2 = c16744u2.f64308w.mo47258b();
        C38994x2 c38994x2M100013s = AbstractC32121b.m100013s(enumC38828f4M106237k, z4, abstractC38970u5Mo35255n2, enumC16738t2Mo47258b2 != null ? AbstractC37926s0.m121457I(enumC16738t2Mo47258b2) : null);
        boolean zMo35253V = interfaceC12576v0Mo35254Z.mo35253V();
        if (c16744u2.f64306E) {
            AbstractC38970u5 abstractC38970u5Mo35255n3 = interfaceC12576v0Mo35254Z.mo35255n();
            C38889l5 c38889l5 = abstractC38970u5Mo35255n3 instanceof C38889l5 ? (C38889l5) abstractC38970u5Mo35255n3 : null;
            if (c38889l5 != null) {
                str = c38889l5.f167404x;
            } else {
                str = null;
            }
        } else {
            str = null;
        }
        if (this.f103522g.m127934f()) {
            c38973v = null;
        } else {
            AbstractC38970u5 abstractC38970u5Mo35255n4 = interfaceC12576v0Mo35254Z.mo35255n();
            C38775a1 c38775a1M101031g0 = AbstractC32410a.m101031g0(c16744u2);
            InterfaceC39010z0 interfaceC39010z0 = c38775a1M101031g0.f166898w;
            C38983w0 c38983w0 = interfaceC39010z0 instanceof C38983w0 ? (C38983w0) interfaceC39010z0 : null;
            String strMo124403v = interfaceC39010z0.mo124403v();
            String strMo124402k0 = interfaceC39010z0.mo124402k0();
            if (abstractC38970u5Mo35255n4 == null || (enumC38910oM121457I = AbstractC38833g.m124348d(abstractC38970u5Mo35255n4)) == null) {
                EnumC16738t2 enumC16738t2Mo47258b3 = c16744u2.f64308w.mo47258b();
                if (enumC16738t2Mo47258b3 != null) {
                    EnumC38910o enumC38910oM121457I2 = AbstractC37926s0.m121457I(enumC16738t2Mo47258b3);
                    enumC38910o = enumC38910oM121457I2;
                } else {
                    enumC38910o = null;
                }
            } else {
                enumC38910o = enumC38910oM121457I2;
            }
            c38973v = new C38973v(strMo124403v, strMo124402k0, enumC38910o, (c38983w0 == null || (enumC38817e3 = c38983w0.f167803z) == null) ? null : enumC38817e3.f167065w, c38775a1M101031g0.f166899x, c38775a1M101031g0.f166901z, c38775a1M101031g0.f166900y, this.f103517b, c38983w0 != null ? c38983w0.f167799E : null);
        }
        return new C38982w(str2, c38809d5, strM30461o, enumC38910oM121457I, c38919p, c38994x2M100013s, Boolean.valueOf(zMo35253V), str, c38973v, c38901n);
    }
}
