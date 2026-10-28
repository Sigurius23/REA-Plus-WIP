package uz;

import android.os.Bundle;
import android.os.Handler;
import android.util.AndroidRuntimeException;
import androidx.fragment.app.AbstractActivityC1340r0;
import b20.C2326f;
import b20.EnumC2323c;
import b20.EnumC2325e;
import bc3.C3033m;
import bz.C3702a;
import bz.EnumC3703b;
import bz.InterfaceC3704c;
import c93.InterfaceC4351m;
import com.stripe.hcaptcha.HCaptchaException;
import com.stripe.hcaptcha.config.HCaptchaConfig;
import com.stripe.hcaptcha.config.HCaptchaOrientation;
import com.stripe.hcaptcha.config.HCaptchaSize;
import com.stripe.hcaptcha.config.HCaptchaTheme;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ge3.AbstractC15751g;
import io.sentry.android.replay.video.C20245d;
import java.util.ArrayList;
import l83.C23454a0;
import l83.C23468n;
import m83.C25272z;
import p000.C31931s;
import p408q.C29662f;
import p505ts.AbstractC34132o;
import p550vd.AbstractC35902e;
import p550vd.AbstractC35903f;
import p566vz.C36609a;
import p566vz.C36610b;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationKt;
import p715kotlin.time.DurationUnit;
import r83.EnumC31071a;
import rq0.C31703x;
import s83.AbstractC32269c;
import sc0.C32355c;
import sg2.C32469t;
import u40.C34527c;
import u40.C34530f;
import u40.EnumC34528d;
import u40.InterfaceC34532h;
import v40.C35649a;
import y40.C39205b;

/* JADX INFO: renamed from: uz.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C35401o {

    /* JADX INFO: renamed from: c */
    public static final long f150836c;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ int f150837d = 0;

    /* JADX INFO: renamed from: a */
    public final C29662f f150838a;

    /* JADX INFO: renamed from: b */
    public final C13045h2 f150839b = AbstractC13091v.m36593c(C35388b.f150796a);

    static {
        Duration.Companion companion = Duration.INSTANCE;
        f150836c = DurationKt.toDuration(6, DurationUnit.SECONDS);
    }

    public C35401o(C35402p c35402p, C29662f c29662f) {
        this.f150838a = c29662f;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bc, code lost:
    
        if (l83.C23454a0.f92919a == r8) goto L44;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m112319a(androidx.fragment.app.AbstractActivityC1340r0 r15, java.lang.String r16, java.lang.String r17, s83.AbstractC32269c r18) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uz.C35401o.m112319a(androidx.fragment.app.r0, java.lang.String, java.lang.String, s83.c):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public final Object m112320b(AbstractActivityC1340r0 abstractActivityC1340r0, String siteKey, String str, AbstractC32269c abstractC32269c) {
        C35393g c35393g;
        Throwable th3;
        C20245d c20245d;
        Object objM107888l;
        if (abstractC32269c instanceof C35393g) {
            c35393g = (C35393g) abstractC32269c;
            int i13 = c35393g.f150807F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c35393g.f150807F = i13 - Integer.MIN_VALUE;
            } else {
                c35393g = new C35393g(this, abstractC32269c);
            }
        } else {
            c35393g = new C35393g(this, abstractC32269c);
        }
        C35393g c35393g2 = c35393g;
        Object objM112321c = c35393g2.f150811z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c35393g2.f150807F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM112321c);
            C35649a c35649a = new C35649a();
            C20245d c20245d2 = new C20245d(3);
            c20245d2.f76051g = c35649a;
            AbstractC22676k.m65750j(siteKey, "siteKey");
            C29662f c29662f = this.f150838a;
            AbstractC35902e.m113963f0((InterfaceC3704c) c29662f.f121232z, EnumC3703b.f15145F);
            c29662f.m91129s0(new C36610b(siteKey, 1), C25272z.f99163w);
            try {
                c35393g2.f150808w = this;
                c35393g2.f150809x = siteKey;
                c35393g2.f150810y = c20245d2;
                c35393g2.f150807F = 1;
                try {
                    objM112321c = m112321c(abstractActivityC1340r0, siteKey, str, c20245d2, c35393g2);
                    if (objM112321c == enumC31071a) {
                        return enumC31071a;
                    }
                    this = this;
                    siteKey = siteKey;
                    c20245d = c20245d2;
                } catch (Throwable th4) {
                    th3 = th4;
                    siteKey = siteKey;
                    c20245d = c20245d2;
                    objM107888l = AbstractC34132o.m107888l(th3);
                }
            } catch (Throwable th5) {
                th3 = th5;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c20245d = c35393g2.f150810y;
            siteKey = c35393g2.f150809x;
            this = c35393g2.f150808w;
            try {
                AbstractC34132o.m107864I(objM112321c);
            } catch (Throwable th6) {
                th3 = th6;
                objM107888l = AbstractC34132o.m107888l(th3);
            }
        }
        objM107888l = (InterfaceC35406t) objM112321c;
        Throwable thM68037a = C23468n.m68037a(objM107888l);
        if (thM68037a != null) {
            objM107888l = new C35404r(thM68037a);
        }
        InterfaceC35406t interfaceC35406t = (InterfaceC35406t) objM107888l;
        if (interfaceC35406t instanceof C35404r) {
            C29662f c29662f2 = this.f150838a;
            C2326f c2326f = (C2326f) c29662f2.f121228E;
            Throwable th7 = ((C35404r) interfaceC35406t).f150842a;
            AbstractC22676k.m65750j(siteKey, "siteKey");
            Duration durationM11527a = ((C3702a) ((InterfaceC3704c) c29662f2.f121232z)).m11527a(EnumC3703b.f15145F);
            if (th7 instanceof HCaptchaException) {
                AbstractC35903f.m113990H(c2326f, EnumC2323c.HCAPTCHA_FAILURE, null, null, 6);
            } else {
                AbstractC35903f.m113990H(c2326f, EnumC2325e.HCAPTCHA_UNEXPECTED_FAILURE, null, null, 6);
            }
            c29662f2.m91129s0(new C36609a(siteKey, th7), C29662f.m91074q0(durationM11527a));
        } else {
            if (!(interfaceC35406t instanceof C35405s)) {
                throw new NoWhenBranchMatchedException();
            }
            C29662f c29662f3 = this.f150838a;
            AbstractC22676k.m65750j(siteKey, "siteKey");
            c29662f3.m91129s0(new C36610b(siteKey, 2), C29662f.m91074q0(((C3702a) ((InterfaceC3704c) c29662f3.f121232z)).m11527a(EnumC3703b.f15145F)));
        }
        c20245d.m56167j();
        return interfaceC35406t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [u40.h] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.fragment.app.r0] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX INFO: renamed from: c */
    public final Object m112321c(AbstractActivityC1340r0 activity, String siteKey, String str, C20245d c20245d, C35393g c35393g) {
        ?? r10;
        Object c39205b;
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c35393g));
        c3033m.m8774s();
        c3033m.m8776u(new C31931s(c20245d, 24));
        ((ArrayList) c20245d.f76047c).add(new C35394h(c3033m));
        c20245d.m56172o();
        ((ArrayList) c20245d.f76048d).add(new C35395i(c3033m));
        c20245d.m56172o();
        HCaptchaSize hCaptchaSize = HCaptchaSize.INVISIBLE;
        ?? r14 = siteKey;
        HCaptchaConfig hCaptchaConfig = new HCaptchaConfig((String) r14, false, false, true, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, hCaptchaSize, (HCaptchaOrientation) null, (HCaptchaTheme) null, "stripecdn.com", (String) null, (InterfaceC4351m) C35396j.f150814w, 0L, true, 178146, (DefaultConstructorMarker) null);
        C35649a internalConfig = (C35649a) c20245d.f76051g;
        AbstractC22676k.m65750j(activity, "activity");
        C34530f c34530f = new C34530f(new C32355c(c20245d, 15), new C32469t(23, c20245d, hCaptchaConfig), new C31703x(c20245d, 27));
        try {
            try {
                if (hCaptchaConfig.getHideDialog()) {
                    AbstractActivityC1340r0 abstractActivityC1340r0 = activity;
                    c39205b = new C39205b(abstractActivityC1340r0, HCaptchaConfig.m134140copyZIzw2bI$default(hCaptchaConfig, null, false, false, false, null, null, null, null, null, null, null, hCaptchaSize, null, null, null, null, null, 0L, false, 522235, null), internalConfig, c34530f);
                    r14 = abstractActivityC1340r0;
                } else {
                    r14 = activity;
                    AbstractC22676k.m65750j(internalConfig, "internalConfig");
                    C34527c c34527c = new C34527c();
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("hCaptchaConfig", hCaptchaConfig);
                    bundle.putSerializable("hCaptchaInternalConfig", internalConfig);
                    bundle.putParcelable("hCaptchaDialogListener", c34530f);
                    c34527c.setArguments(bundle);
                    c39205b = c34527c;
                }
                c20245d.f76052h = c39205b;
                r10 = r14;
            } catch (AndroidRuntimeException unused) {
                c34530f.f145151y.invoke(new HCaptchaException(EnumC34528d.ERROR));
                r10 = r14;
            }
        } catch (AndroidRuntimeException unused2) {
            r14 = activity;
        }
        ?? r15 = (InterfaceC34532h) c20245d.f76052h;
        if (r15 == 0) {
            throw new IllegalStateException("verifyWithHCaptcha must not be called before setup.");
        }
        ((Handler) c20245d.f76050f).removeCallbacksAndMessages(null);
        r15.mo109107j(r10);
        AbstractC22676k.m65750j(siteKey, "siteKey");
        this.f150838a.m91129s0(new C36610b(siteKey, 0), C25272z.f99163w);
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x008d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:34:0x009b  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m112322d(AbstractActivityC1340r0 abstractActivityC1340r0, String str, String str2, AbstractC32269c abstractC32269c) {
        C35400n c35400n;
        String str3;
        String str4;
        AbstractActivityC1340r0 abstractActivityC1340r1;
        C35401o c35401o;
        InterfaceC35406t interfaceC35406t;
        Object c35390d;
        if (abstractC32269c instanceof C35400n) {
            c35400n = (C35400n) abstractC32269c;
            int i13 = c35400n.f150831G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c35400n.f150831G = i13 - Integer.MIN_VALUE;
            } else {
                c35400n = new C35400n(this, abstractC32269c);
            }
        } else {
            c35400n = new C35400n(this, abstractC32269c);
        }
        Object objM112320b = c35400n.f150829E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c35400n.f150831G;
        C23454a0 c23454a0 = C23454a0.f92919a;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM112320b);
            C13045h2 c13045h2 = this.f150839b;
            if (((InterfaceC35391e) c13045h2.getValue()).mo112317a()) {
                c35400n.f150832w = this;
                c35400n.f150833x = abstractActivityC1340r0;
                c35400n.f150834y = str;
                c35400n.f150835z = str2;
                c35400n.f150831G = 1;
                c13045h2.emit(C35389c.f150797a, c35400n);
                if (c23454a0 != enumC31071a) {
                    str3 = str2;
                    str4 = str;
                    abstractActivityC1340r1 = abstractActivityC1340r0;
                    c35401o = this;
                }
                return enumC31071a;
            }
            return c23454a0;
        }
        if (i14 == 1) {
            String str5 = c35400n.f150835z;
            String str6 = c35400n.f150834y;
            AbstractActivityC1340r0 abstractActivityC1340r2 = c35400n.f150833x;
            C35401o c35401o2 = c35400n.f150832w;
            AbstractC34132o.m107864I(objM112320b);
            str3 = str5;
            str4 = str6;
            abstractActivityC1340r1 = abstractActivityC1340r2;
            c35401o = c35401o2;
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM112320b);
                return c23454a0;
            }
            c35401o = c35400n.f150832w;
            AbstractC34132o.m107864I(objM112320b);
        }
        interfaceC35406t = (InterfaceC35406t) objM112320b;
        if (interfaceC35406t instanceof C35404r) {
            c35390d = new C35387a(((C35404r) interfaceC35406t).f150842a);
        } else {
            if (interfaceC35406t instanceof C35405s) {
                throw new NoWhenBranchMatchedException();
            }
            c35390d = new C35390d(((C35405s) interfaceC35406t).f150843a);
        }
        C13045h2 c13045h3 = c35401o.f150839b;
        c35400n.f150832w = null;
        c35400n.f150831G = 3;
        c13045h3.emit(c35390d, c35400n);
        if (c23454a0 != enumC31071a) {
            return enumC31071a;
        }
        return c23454a0;
        c35400n.f150832w = c35401o;
        c35400n.f150833x = null;
        c35400n.f150834y = null;
        c35400n.f150835z = null;
        c35400n.f150831G = 2;
        objM112320b = c35401o.m112320b(abstractActivityC1340r1, str4, str3, c35400n);
        if (objM112320b != enumC31071a) {
            interfaceC35406t = (InterfaceC35406t) objM112320b;
            if (interfaceC35406t instanceof C35404r) {
                c35390d = new C35387a(((C35404r) interfaceC35406t).f150842a);
            } else {
                if (interfaceC35406t instanceof C35405s) {
                    throw new NoWhenBranchMatchedException();
                }
                c35390d = new C35390d(((C35405s) interfaceC35406t).f150843a);
            }
            C13045h2 c13045h4 = c35401o.f150839b;
            c35400n.f150832w = null;
            c35400n.f150831G = 3;
            c13045h4.emit(c35390d, c35400n);
            if (c23454a0 != enumC31071a) {
                return c23454a0;
            }
        }
        return enumC31071a;
    }
}
