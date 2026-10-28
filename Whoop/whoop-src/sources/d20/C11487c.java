package d20;

import b10.C2222b;
import b10.InterfaceC2227c1;
import bc3.AbstractC3034m0;
import com.stripe.android.core.exception.StripeException;
import p442qy.C30765d;
import p505ts.AbstractC34132o;
import p664yy.C39857f;
import p664yy.C39865j;
import p664yy.InterfaceC39860g0;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.AbstractC29894a0;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: d20.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C11487c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2227c1 f36935a;

    /* JADX INFO: renamed from: b */
    public final C39865j f36936b;

    /* JADX INFO: renamed from: c */
    public final C2222b f36937c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC39860g0 f36938d;

    /* JADX INFO: renamed from: e */
    public final C30765d f36939e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC30063j f36940f;

    public C11487c(InterfaceC2227c1 stripeRepository, C39865j analyticsRequestExecutor, C2222b paymentAnalyticsRequestFactory, InterfaceC39860g0 retryDelaySupplier, C30765d logger, InterfaceC30063j workContext) {
        AbstractC22676k.m65750j(stripeRepository, "stripeRepository");
        AbstractC22676k.m65750j(analyticsRequestExecutor, "analyticsRequestExecutor");
        AbstractC22676k.m65750j(paymentAnalyticsRequestFactory, "paymentAnalyticsRequestFactory");
        AbstractC22676k.m65750j(retryDelaySupplier, "retryDelaySupplier");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(workContext, "workContext");
        this.f36935a = stripeRepository;
        this.f36936b = analyticsRequestExecutor;
        this.f36937c = paymentAnalyticsRequestFactory;
        this.f36938d = retryDelaySupplier;
        this.f36939e = logger;
        this.f36940f = workContext;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009a, code lost:
    
        if (r11 == r0) goto L28;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m30907a(q30.AbstractC29894a0 r8, p664yy.C39857f r9, int r10, s83.AbstractC32269c r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof d20.C11485a
            if (r0 == 0) goto L14
            r0 = r11
            d20.a r0 = (d20.C11485a) r0
            int r1 = r0.f36923G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f36923G = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            d20.a r0 = new d20.a
            r0.<init>(r7, r11)
            goto L12
        L1a:
            java.lang.Object r11 = r6.f36921E
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f36923G
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L47
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2d
            p505ts.AbstractC34132o.m107864I(r11)
            goto L9d
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            int r10 = r6.f36927z
            yy.f r9 = r6.f36926y
            q30.a0 r8 = r6.f36925x
            d20.c r1 = r6.f36924w
            p505ts.AbstractC34132o.m107864I(r11)
            l83.n r11 = (l83.C23468n) r11
            java.lang.Object r11 = r11.f92940w
        L44:
            r3 = r9
            r4 = r10
            goto L67
        L47:
            p505ts.AbstractC34132o.m107864I(r11)
            q30.n0 r11 = r8.mo91513f()
            java.lang.String r11 = r11.f122217x
            r6.f36924w = r7
            r6.f36925x = r8
            r6.f36926y = r9
            r6.f36927z = r10
            r6.f36923G = r3
            b10.c1 r1 = r7.f36935a
            b10.z0 r1 = (b10.C2273z0) r1
            java.lang.Object r11 = r1.m7085g(r11, r9, r6)
            if (r11 != r0) goto L65
            goto L9c
        L65:
            r1 = r7
            goto L44
        L67:
            java.lang.Throwable r5 = l83.C23468n.m68037a(r11)
            if (r5 != 0) goto L8c
            y00.d7 r11 = (y00.C38811d7) r11
            int r8 = 3 - r4
            qy.d r9 = r1.f36939e
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "3DS2 challenge completion request was successful. "
            r10.<init>(r11)
            r10.append(r8)
            java.lang.String r8 = " retries attempted."
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.m94511a(r8)
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            return r8
        L8c:
            r9 = 0
            r6.f36924w = r9
            r6.f36925x = r9
            r6.f36926y = r9
            r6.f36923G = r2
            r2 = r8
            java.lang.Object r11 = r1.m30908b(r2, r3, r4, r5, r6)
            if (r11 != r0) goto L9d
        L9c:
            return r0
        L9d:
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            r11.getClass()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: d20.C11487c.m30907a(q30.a0, yy.f, int, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m30908b(AbstractC29894a0 abstractC29894a0, C39857f c39857f, int i13, Throwable th3, AbstractC32269c abstractC32269c) {
        C11486b c11486b;
        C11487c c11487c;
        if (abstractC32269c instanceof C11486b) {
            c11486b = (C11486b) abstractC32269c;
            int i14 = c11486b.f36930G;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c11486b.f36930G = i14 - Integer.MIN_VALUE;
            } else {
                c11486b = new C11486b(this, abstractC32269c);
            }
        } else {
            c11486b = new C11486b(this, abstractC32269c);
        }
        Object obj = c11486b.f36928E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c11486b.f36930G;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            C30765d c30765d = this.f36939e;
            c30765d.m94512b("3DS2 challenge completion request failed. Remaining retries: " + i13, th3);
            boolean z4 = th3 instanceof StripeException ? ((StripeException) th3).f22158z : false;
            if (i13 <= 0 || !z4) {
                c30765d.m94511a("Did not make a successful 3DS2 challenge completion request after retrying.");
                return Boolean.FALSE;
            }
            long jMo127936a = this.f36938d.mo127936a(i13);
            c11486b.f36931w = this;
            c11486b.f36932x = abstractC29894a0;
            c11486b.f36933y = c39857f;
            c11486b.f36934z = i13;
            c11486b.f36930G = 1;
            if (AbstractC3034m0.m8783c(jMo127936a, c11486b) != enumC31071a) {
                c11487c = this;
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        i13 = c11486b.f36934z;
        c39857f = c11486b.f36933y;
        abstractC29894a0 = c11486b.f36932x;
        c11487c = c11486b.f36931w;
        AbstractC34132o.m107864I(obj);
        c11486b.f36931w = null;
        c11486b.f36932x = null;
        c11486b.f36933y = null;
        c11486b.f36930G = 2;
        Object objM30907a = c11487c.m30907a(abstractC29894a0, c39857f, i13 - 1, c11486b);
        return objM30907a == enumC31071a ? enumC31071a : objM30907a;
    }
}
