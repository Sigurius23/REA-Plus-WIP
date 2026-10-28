package p664yy;

import android.content.Context;
import com.stripe.android.core.networking.AnalyticsRequestV2;
import l83.C23454a0;
import l83.C23468n;
import p012ab.C0684i0;
import p442qy.C30765d;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29938w0;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: yy.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C39873n {

    /* JADX INFO: renamed from: a */
    public final Context f172182a;

    /* JADX INFO: renamed from: b */
    public final C0684i0 f172183b;

    /* JADX INFO: renamed from: c */
    public final C30765d f172184c;

    /* JADX INFO: renamed from: d */
    public final C29938w0 f172185d;

    public C39873n(Context context, C0684i0 c0684i0, C30765d logger, C29938w0 c29938w0) {
        AbstractC22676k.m65750j(context, "context");
        AbstractC22676k.m65750j(logger, "logger");
        this.f172182a = context;
        this.f172183b = c0684i0;
        this.f172184c = logger;
        this.f172185d = c29938w0;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0074 A[PHI: r2 r8
      0x0074: PHI (r2v4 yy.n) = (r2v2 yy.n), (r2v5 yy.n) binds: [B:24:0x005c, B:29:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x0074: PHI (r8v4 com.stripe.android.core.networking.AnalyticsRequestV2) = 
      (r8v1 com.stripe.android.core.networking.AnalyticsRequestV2)
      (r8v5 com.stripe.android.core.networking.AnalyticsRequestV2)
     binds: [B:24:0x005c, B:29:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0068, code lost:
    
        if (r9 == r1) goto L35;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m127940a(com.stripe.android.core.networking.AnalyticsRequestV2 r8, s83.AbstractC32269c r9) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r9 instanceof p664yy.C39867k
            if (r0 == 0) goto L13
            r0 = r9
            yy.k r0 = (p664yy.C39867k) r0
            int r1 = r0.f172158E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172158E = r1
            goto L18
        L13:
            yy.k r0 = new yy.k
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f172161y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f172158E
            l83.a0 r3 = l83.C23454a0.f92919a
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L47
            if (r2 == r6) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            p505ts.AbstractC34132o.m107864I(r9)
            return r3
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            com.stripe.android.core.networking.AnalyticsRequestV2 r8 = r0.f172160x
            yy.n r2 = r0.f172159w
            p505ts.AbstractC34132o.m107864I(r9)
            goto L6b
        L3f:
            com.stripe.android.core.networking.AnalyticsRequestV2 r8 = r0.f172160x
            yy.n r2 = r0.f172159w
            p505ts.AbstractC34132o.m107864I(r9)
            goto L56
        L47:
            p505ts.AbstractC34132o.m107864I(r9)
            r0.f172159w = r7
            r0.f172160x = r8
            r0.f172158E = r6
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            if (r9 != r1) goto L55
            goto L84
        L55:
            r2 = r7
        L56:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L74
            r0.f172159w = r2
            r0.f172160x = r8
            r0.f172158E = r5
            java.lang.Object r9 = r2.m127941b(r8, r0)
            if (r9 != r1) goto L6b
            goto L84
        L6b:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L74
            goto L75
        L74:
            r6 = 0
        L75:
            if (r6 != 0) goto L85
            r9 = 0
            r0.f172159w = r9
            r0.f172160x = r9
            r0.f172158E = r4
            java.lang.Object r8 = r2.m127942c(r8, r0)
            if (r8 != r1) goto L85
        L84:
            return r1
        L85:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p664yy.C39873n.m127940a(com.stripe.android.core.networking.AnalyticsRequestV2, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0135, code lost:
    
        if (r0 == r3) goto L36;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m127941b(com.stripe.android.core.networking.AnalyticsRequestV2 r22, s83.AbstractC32269c r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p664yy.C39873n.m127941b(com.stripe.android.core.networking.AnalyticsRequestV2, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: c */
    public final Object m127942c(AnalyticsRequestV2 analyticsRequestV2, AbstractC32269c abstractC32269c) {
        C39871m c39871m;
        C39873n c39873n;
        AnalyticsRequestV2 analyticsRequestV3;
        C39873n c39873n2;
        Object objM107888l;
        if (abstractC32269c instanceof C39871m) {
            c39871m = (C39871m) abstractC32269c;
            int i13 = c39871m.f172177F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c39871m.f172177F = i13 - Integer.MIN_VALUE;
            } else {
                c39871m = new C39871m(this, abstractC32269c);
            }
        } else {
            c39871m = new C39871m(this, abstractC32269c);
        }
        Object obj = c39871m.f172181z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c39871m.f172177F;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            try {
                C0684i0 c0684i0 = this.f172183b;
                c39871m.f172178w = this;
                c39871m.f172179x = analyticsRequestV2;
                c39871m.f172180y = this;
                c39871m.f172177F = 1;
                if (c0684i0.m1727r(analyticsRequestV2, c39871m) == enumC31071a) {
                    return enumC31071a;
                }
                c39873n = this;
                analyticsRequestV3 = analyticsRequestV2;
                c39873n2 = c39873n;
            } catch (Throwable th3) {
                th = th3;
                c39873n = this;
                objM107888l = AbstractC34132o.m107888l(th);
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c39873n2 = c39871m.f172180y;
            analyticsRequestV3 = c39871m.f172179x;
            c39873n = c39871m.f172178w;
            try {
                AbstractC34132o.m107864I(obj);
            } catch (Throwable th4) {
                th = th4;
                objM107888l = AbstractC34132o.m107888l(th);
            }
        }
        c39873n2.f172184c.m94511a("EVENT: " + analyticsRequestV3.getEventName());
        objM107888l = c23454a0;
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            c39873n.f172184c.m94512b("Exception while making analytics request", thM68037a);
        }
        return c23454a0;
    }
}
