package p537ux;

import android.content.Context;
import ar0.C1926a;
import b10.C2224b1;
import b10.C2273z0;
import b10.InterfaceC2227c1;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import com.stripe.android.core.exception.StripeException;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import l83.C23468n;
import m83.C25235a0;
import p442qy.C30762a;
import p442qy.C30766e;
import p479s4.AbstractC32123d;
import p505ts.AbstractC34132o;
import p664yy.C39857f;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s40.C32139c0;
import s83.AbstractC32269c;
import y00.C38809d5;
import y00.C38842g8;
import y00.C38892m;
import y00.C38915o4;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: ux.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C35339j0 {

    /* JADX INFO: renamed from: c */
    public static final String f150551c = C30762a.f126687c.m94509a();

    /* JADX INFO: renamed from: d */
    public static final boolean f150552d = true;

    /* JADX INFO: renamed from: a */
    public final C2273z0 f150553a;

    /* JADX INFO: renamed from: b */
    public final String f150554b;

    public C35339j0(Context context, String str) {
        AbstractC22676k.m65750j(context, "context");
        Context applicationContext = context.getApplicationContext();
        AbstractC22676k.m65749i(applicationContext, "getApplicationContext(...)");
        Context applicationContext2 = context.getApplicationContext();
        AbstractC22676k.m65749i(applicationContext2, "getApplicationContext(...)");
        int i13 = 11;
        C1926a c1926a = new C1926a(str, i13);
        InterfaceC2227c1.f8867a.getClass();
        C2273z0 c2273z0 = new C2273z0(applicationContext2, c1926a, C2224b1.f8860b, C30766e.f126697b, null, null, null, null, C25235a0.f99113w, 57312);
        if (AbstractC39414r.m125890i0(str)) {
            throw new IllegalArgumentException("Invalid Publishable Key: You must use a valid Stripe API key to make a Stripe API request. For more info, see https://stripe.com/docs/keys");
        }
        if (AbstractC39421y.m125930O(str, "sk_", false)) {
            throw new IllegalArgumentException("Invalid Publishable Key: You are using a secret key instead of a publishable one. For more info, see https://stripe.com/docs/keys");
        }
        if (AbstractC39421y.m125930O(str, "rk_", false)) {
            throw new IllegalArgumentException("Invalid Publishable Key: You are using a restricted key instead of a publishable one. For more info, see https://stripe.com/docs/keys");
        }
        Context applicationContext3 = applicationContext.getApplicationContext();
        AbstractC22676k.m65749i(applicationContext3, "getApplicationContext(...)");
        new C35357s0(applicationContext3, new C1926a(str, i13), c2273z0, null, 496);
        C22365e c22365e = AbstractC3050q0.f12077a;
        ExecutorC22364d workContext = ExecutorC22364d.f87316w;
        AbstractC22676k.m65750j(workContext, "workContext");
        this.f150553a = c2273z0;
        if (AbstractC39414r.m125890i0(str)) {
            throw new IllegalArgumentException("Invalid Publishable Key: You must use a valid Stripe API key to make a Stripe API request. For more info, see https://stripe.com/docs/keys");
        }
        if (AbstractC39421y.m125930O(str, "sk_", false)) {
            throw new IllegalArgumentException("Invalid Publishable Key: You are using a secret key instead of a publishable one. For more info, see https://stripe.com/docs/keys");
        }
        if (AbstractC39421y.m125930O(str, "rk_", false)) {
            throw new IllegalArgumentException("Invalid Publishable Key: You are using a restricted key instead of a publishable one. For more info, see https://stripe.com/docs/keys");
        }
        this.f150554b = str;
    }

    /* JADX INFO: renamed from: a */
    public static C38842g8 m112191a(C35339j0 c35339j0, C38892m c38892m) {
        return (C38842g8) AbstractC3006f0.m8699E(C30064k.f122676w, new C32139c0(c35339j0, c38892m, (InterfaceC30057d) null, 16));
    }

    /* JADX INFO: renamed from: b */
    public static C38915o4 m112192b(C35339j0 c35339j0, C38809d5 c38809d5) {
        return (C38915o4) AbstractC3006f0.m8699E(C30064k.f122676w, new C32139c0(c35339j0, c38809d5, (InterfaceC30057d) null, 17));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: c */
    public final Object m112193c(C38892m c38892m, AbstractC32269c abstractC32269c) throws StripeException {
        C35337i0 c35337i0;
        Object objM7096s;
        if (abstractC32269c instanceof C35337i0) {
            c35337i0 = (C35337i0) abstractC32269c;
            int i13 = c35337i0.f150547y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c35337i0.f150547y = i13 - Integer.MIN_VALUE;
            } else {
                c35337i0 = new C35337i0(this, abstractC32269c);
            }
        } else {
            c35337i0 = new C35337i0(this, abstractC32269c);
        }
        Object obj = c35337i0.f150545w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c35337i0.f150547y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C39857f c39857f = new C39857f(this.f150554b, (String) null, (String) null);
            c35337i0.f150547y = 1;
            objM7096s = this.f150553a.m7096s(c38892m, c39857f, c35337i0);
            if (objM7096s == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            objM7096s = ((C23468n) obj).f92940w;
        }
        Throwable thM68037a = C23468n.m68037a(objM7096s);
        if (thM68037a == null) {
            return objM7096s;
        }
        int i15 = StripeException.f22154E;
        throw AbstractC32123d.m100024d(thM68037a);
    }
}
