package p537ux;

import android.content.Context;
import android.content.Intent;
import b10.C2219a;
import b10.C2222b;
import b10.C2273z0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3069w1;
import c20.C3873a;
import c93.InterfaceC4339a;
import com.stripe.android.core.exception.StripeException;
import hc3.AbstractC17182o;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23468n;
import p048ce.AbstractC4482w;
import p108e4.AbstractC12667a;
import p442qy.C30765d;
import p442qy.C30766e;
import p505ts.AbstractC34132o;
import p664yy.C39857f;
import p664yy.C39865j;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30063j;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import uo1.C35141b;
import v10.C35525a;
import v10.C35526b;
import v10.C35535k;
import v10.C35539o;
import wb3.AbstractC37056f;
import y00.C38928q;
import y00.C38937r;

/* JADX INFO: renamed from: ux.s0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35357s0 {

    /* JADX INFO: renamed from: l */
    public static final List f150612l = AbstractC37056f.m118958J("payment_method");

    /* JADX INFO: renamed from: m */
    public static final long f150613m = TimeUnit.SECONDS.toMillis(2);

    /* JADX INFO: renamed from: a */
    public final InterfaceC4339a f150614a;

    /* JADX INFO: renamed from: b */
    public final C2273z0 f150615b;

    /* JADX INFO: renamed from: c */
    public final C39865j f150616c;

    /* JADX INFO: renamed from: d */
    public final C2222b f150617d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC30063j f150618e;

    /* JADX INFO: renamed from: f */
    public final C35535k f150619f;

    /* JADX INFO: renamed from: g */
    public final C35539o f150620g;

    /* JADX INFO: renamed from: h */
    public final C35525a f150621h;

    /* JADX INFO: renamed from: i */
    public final boolean f150622i;

    /* JADX INFO: renamed from: j */
    public final C35141b f150623j;

    /* JADX INFO: renamed from: k */
    public final C3873a f150624k;

    public C35357s0(Context context, InterfaceC4339a interfaceC4339a, C2273z0 c2273z0, InterfaceC30063j interfaceC30063j, int i13) {
        if ((i13 & 16) != 0) {
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC30063j = ExecutorC22364d.f87316w;
        }
        InterfaceC30063j workContext = interfaceC30063j;
        C30765d c30765d = C30766e.f126697b;
        C39865j c39865j = new C39865j(c30765d, workContext);
        Context applicationContext = context.getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
        C2222b c2222b = new C2222b(applicationContext, new C2219a(interfaceC4339a, 2));
        C22365e c22365e2 = AbstractC3050q0.f12077a;
        AbstractC3069w1 uiContext = AbstractC17182o.f65999a;
        AbstractC22676k.m65750j(workContext, "workContext");
        AbstractC22676k.m65750j(uiContext, "uiContext");
        this.f150614a = interfaceC4339a;
        this.f150615b = c2273z0;
        this.f150616c = c39865j;
        this.f150617d = c2222b;
        this.f150618e = uiContext;
        this.f150619f = new C35535k(context, interfaceC4339a, c2273z0, c30765d, workContext);
        this.f150620g = new C35539o(context, interfaceC4339a, c2273z0, c30765d, workContext);
        String packageName = context.getPackageName();
        AbstractC22676k.m65749i(packageName, "getPackageName(...)");
        this.f150621h = new C35525a(packageName);
        boolean zM35436G = AbstractC12667a.m35436G(context);
        this.f150622i = zM35436G;
        this.f150623j = new C35141b(this, 2);
        this.f150624k = AbstractC4482w.m13970F(context, c2222b, false, workContext, uiContext, interfaceC4339a, c2222b.f8855j, zM35436G, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m112197a(C38928q c38928q, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C35347n0 c35347n0;
        if (abstractC32269c instanceof C35347n0) {
            c35347n0 = (C35347n0) abstractC32269c;
            int i13 = c35347n0.f150572y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c35347n0.f150572y = i13 - Integer.MIN_VALUE;
            } else {
                c35347n0 = new C35347n0(this, abstractC32269c);
            }
        } else {
            c35347n0 = new C35347n0(this, abstractC32269c);
        }
        Object obj = c35347n0.f150570w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c35347n0.f150572y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C38928q c38928qM124365b = c38928q.mo124367w0();
        c35347n0.f150572y = 1;
        Object objM7086h = this.f150615b.m7086h(c38928qM124365b, c39857f, f150612l, c35347n0);
        return objM7086h == enumC31071a ? enumC31071a : objM7086h;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m112198b(C38937r c38937r, C39857f c39857f, AbstractC32269c abstractC32269c) {
        C35349o0 c35349o0;
        if (abstractC32269c instanceof C35349o0) {
            c35349o0 = (C35349o0) abstractC32269c;
            int i13 = c35349o0.f150580y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c35349o0.f150580y = i13 - Integer.MIN_VALUE;
            } else {
                c35349o0 = new C35349o0(this, abstractC32269c);
            }
        } else {
            c35349o0 = new C35349o0(this, abstractC32269c);
        }
        Object obj = c35349o0.f150578w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c35349o0.f150580y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        C38937r c38937rM124368b = c38937r.mo124367w0();
        c35349o0.f150580y = 1;
        Object objM7088j = this.f150615b.m7088j(c38937rM124368b, c39857f, f150612l, c35349o0);
        return objM7088j == enumC31071a ? enumC31071a : objM7088j;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m112199c(Intent intent, AbstractC32269c abstractC32269c) {
        C35351p0 c35351p0;
        C35526b c35526b;
        if (abstractC32269c instanceof C35351p0) {
            c35351p0 = (C35351p0) abstractC32269c;
            int i13 = c35351p0.f150590y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c35351p0.f150590y = i13 - Integer.MIN_VALUE;
            } else {
                c35351p0 = new C35351p0(this, abstractC32269c);
            }
        } else {
            c35351p0 = new C35351p0(this, abstractC32269c);
        }
        Object obj = c35351p0.f150588w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c35351p0.f150590y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        if (intent == null || (c35526b = (C35526b) intent.getParcelableExtra("extra_args")) == null) {
            c35526b = new C35526b((String) null, 0, (StripeException) null, false, (String) null, (String) null, 127);
        }
        c35351p0.f150590y = 1;
        Object objM112689e = this.f150619f.m112689e(c35526b, c35351p0);
        return objM112689e == enumC31071a ? enumC31071a : objM112689e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m112200d(Intent intent, AbstractC32269c abstractC32269c) {
        C35353q0 c35353q0;
        C35526b c35526b;
        if (abstractC32269c instanceof C35353q0) {
            c35353q0 = (C35353q0) abstractC32269c;
            int i13 = c35353q0.f150601y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c35353q0.f150601y = i13 - Integer.MIN_VALUE;
            } else {
                c35353q0 = new C35353q0(this, abstractC32269c);
            }
        } else {
            c35353q0 = new C35353q0(this, abstractC32269c);
        }
        Object obj = c35353q0.f150599w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c35353q0.f150601y;
        if (i14 != 0) {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return ((C23468n) obj).f92940w;
        }
        AbstractC34132o.m107864I(obj);
        if (intent == null || (c35526b = (C35526b) intent.getParcelableExtra("extra_args")) == null) {
            c35526b = new C35526b((String) null, 0, (StripeException) null, false, (String) null, (String) null, 127);
        }
        c35353q0.f150601y = 1;
        Object objM112689e = this.f150620g.m112689e(c35526b, c35353q0);
        return objM112689e == enumC31071a ? enumC31071a : objM112689e;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x0140 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:71:0x0141 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c6, code lost:
    
        if (r4 == r6) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
    
        r7 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e4, code lost:
    
        if (r4 == r6) goto L70;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m112201e(s40.C32132a r23, y00.InterfaceC38946s r24, p664yy.C39857f r25, s83.AbstractC32269c r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p537ux.C35357s0.m112201e(s40.a, y00.s, yy.f, s83.c):java.lang.Object");
    }
}
