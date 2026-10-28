package d20;

import a30.C0332w0;
import android.app.Application;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1601k1;
import b10.C2222b;
import b10.C2273z0;
import bc3.AbstractC3006f0;
import com.stripe.android.core.exception.StripeException;
import com.stripe.android.networking.PaymentAnalyticsEvent;
import l83.C23468n;
import p127ev.C13668i;
import p30.C28789a;
import p479s4.AbstractC32123d;
import p505ts.AbstractC34132o;
import p664yy.C39857f;
import p664yy.C39865j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29924p0;
import q83.InterfaceC30057d;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import v10.C35526b;
import y00.C38841g7;

/* JADX INFO: renamed from: d20.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C11502r extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E */
    public final C2222b f36991E;

    /* JADX INFO: renamed from: F */
    public final C28789a f36992F;

    /* JADX INFO: renamed from: G */
    public final C29924p0 f36993G;

    /* JADX INFO: renamed from: H */
    public final C11487c f36994H;

    /* JADX INFO: renamed from: I */
    public final C13668i f36995I;

    /* JADX INFO: renamed from: J */
    public final InterfaceC30063j f36996J;

    /* JADX INFO: renamed from: K */
    public final C1601k1 f36997K;

    /* JADX INFO: renamed from: L */
    public final boolean f36998L;

    /* JADX INFO: renamed from: M */
    public boolean f36999M;

    /* JADX INFO: renamed from: N */
    public final C39857f f37000N;

    /* JADX INFO: renamed from: w */
    public final Application f37001w;

    /* JADX INFO: renamed from: x */
    public final C11496l f37002x;

    /* JADX INFO: renamed from: y */
    public final C2273z0 f37003y;

    /* JADX INFO: renamed from: z */
    public final C39865j f37004z;

    /* JADX WARN: Code duplicated, block: B:10:0x004f  */
    public C11502r(Application application, C11496l c11496l, C2273z0 c2273z0, C39865j c39865j, C2222b c2222b, C28789a threeDs2Service, C29924p0 messageVersionRegistry, C11487c challengeResultProcessor, C13668i c13668i, InterfaceC30063j workContext, C1601k1 c1601k1, boolean z4) {
        C39857f c39857f;
        AbstractC22676k.m65750j(threeDs2Service, "threeDs2Service");
        AbstractC22676k.m65750j(messageVersionRegistry, "messageVersionRegistry");
        AbstractC22676k.m65750j(challengeResultProcessor, "challengeResultProcessor");
        AbstractC22676k.m65750j(workContext, "workContext");
        this.f37001w = application;
        this.f37002x = c11496l;
        this.f37003y = c2273z0;
        this.f37004z = c39865j;
        this.f36991E = c2222b;
        this.f36992F = threeDs2Service;
        this.f36993G = messageVersionRegistry;
        this.f36994H = challengeResultProcessor;
        this.f36995I = c13668i;
        this.f36996J = workContext;
        this.f36997K = c1601k1;
        this.f36998L = z4;
        this.f36999M = c1601k1.m5000a("key_next_step");
        String str = c11496l.f36969z.f167784F;
        if (str == null) {
            c39857f = c11496l.f36961E;
        } else {
            str = str.length() <= 0 ? null : str;
            if (str != null) {
                c39857f = new C39857f(str, (String) null, 6);
            } else {
                c39857f = c11496l.f36961E;
            }
        }
        this.f37000N = c39857f;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0231, code lost:
    
        if (r1 == r6) goto L56;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m30909g(y00.C38841g7 r26, s83.AbstractC32269c r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d20.C11502r.m30909g(y00.g7, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: j */
    public final Object m30910j(C0332w0 c0332w0, C38841g7 c38841g7, C39857f c39857f, int i13, AbstractC32269c abstractC32269c) {
        C11499o c11499o;
        if (abstractC32269c instanceof C11499o) {
            c11499o = (C11499o) abstractC32269c;
            int i14 = c11499o.f36979y;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c11499o.f36979y = i14 - Integer.MIN_VALUE;
            } else {
                c11499o = new C11499o(this, abstractC32269c);
            }
        } else {
            c11499o = new C11499o(this, abstractC32269c);
        }
        C11499o c11499o2 = c11499o;
        Object objM8705K = c11499o2.f36977w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i15 = c11499o2.f36979y;
        if (i15 == 0) {
            AbstractC34132o.m107864I(objM8705K);
            C11500p c11500p = new C11500p(c0332w0, c38841g7, i13, this, c39857f, (InterfaceC30057d) null);
            c11499o2.f36979y = 1;
            objM8705K = AbstractC3006f0.m8705K(this.f36996J, c11500p, c11499o2);
            if (objM8705K == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM8705K);
        }
        return ((C23468n) objM8705K).f92940w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: l */
    public final Object m30911l(AbstractC32269c abstractC32269c) {
        C11501q c11501q;
        Throwable th3;
        C11502r c11502r;
        Object objM107888l;
        if (abstractC32269c instanceof C11501q) {
            c11501q = (C11501q) abstractC32269c;
            int i13 = c11501q.f36990z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c11501q.f36990z = i13 - Integer.MIN_VALUE;
            } else {
                c11501q = new C11501q(this, abstractC32269c);
            }
        } else {
            c11501q = new C11501q(this, abstractC32269c);
        }
        Object objM30909g = c11501q.f36988x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c11501q.f36990z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM30909g);
            this.f37004z.m127938a(C2222b.m7051c(this.f36991E, PaymentAnalyticsEvent.Auth3ds2Fingerprint, null, null, null, null, 62));
            try {
                C38841g7 c38841g7 = new C38841g7(this.f37002x.f36969z);
                c11501q.f36987w = this;
                c11501q.f36990z = 1;
                objM30909g = m30909g(c38841g7, c11501q);
                if (objM30909g == enumC31071a) {
                    return enumC31071a;
                }
                c11502r = this;
            } catch (Throwable th4) {
                th3 = th4;
                c11502r = this;
                objM107888l = AbstractC34132o.m107888l(th3);
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c11502r = c11501q.f36987w;
            try {
                AbstractC34132o.m107864I(objM30909g);
            } catch (Throwable th5) {
                th3 = th5;
                objM107888l = AbstractC34132o.m107888l(th3);
            }
        }
        objM107888l = (AbstractC11492h) objM30909g;
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            c11502r.f37004z.m127938a(C2222b.m7051c(c11502r.f36991E, PaymentAnalyticsEvent.Auth3ds2RequestParamsFailed, null, null, null, null, 62));
            int i15 = StripeException.f22154E;
            objM107888l = new C11489e(new C35526b((String) null, 0, AbstractC32123d.m100024d(thM68037a), false, (String) null, (String) null, 123));
        }
        c11502r.f36997K.m5004e(Boolean.TRUE, "key_next_step");
        c11502r.f36999M = true;
        return objM107888l;
    }
}
