package p087db;

import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import e53.InterfaceC12744c;
import ed3.C13117a;
import ih0.AbstractC18489d0;
import java.io.IOException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p044c5.ExecutorC4220l;
import p088dc.AbstractC11895b;
import p100dw.C12400e;
import p185h6.C16969x;
import p185h6.InterfaceC16961p;
import p319m4.AbstractC25012a;
import p366oe.C27865a;
import p607x8.C38059n;
import p715kotlin.jvm.internal.AbstractC22676k;
import re.C31282l0;
import s83.AbstractC32269c;
import u00.C34377e;
import uc3.InterfaceC34767e;
import y00.C38793c;
import zd3.C40580x;

/* JADX INFO: renamed from: db.j0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C11856j0 implements InterfaceC12744c, InterfaceC16961p, InterfaceC34767e {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f38684w;

    /* JADX INFO: renamed from: x */
    public String f38685x;

    public /* synthetic */ C11856j0(int i13) {
        this.f38684w = i13;
    }

    /* JADX INFO: renamed from: k */
    public static C11856j0 m31815k(C13117a c13117a) {
        String str;
        c13117a.m36690L(2);
        int iM36715y = c13117a.m36715y();
        int i13 = iM36715y >> 1;
        int iM36715y2 = ((c13117a.m36715y() >> 3) & 31) | ((iM36715y & 1) << 5);
        if (i13 == 4 || i13 == 5 || i13 == 7) {
            str = "dvhe";
        } else if (i13 == 8) {
            str = "hev1";
        } else {
            if (i13 != 9) {
                return null;
            }
            str = "avc3";
        }
        String str2 = iM36715y2 < 10 ? ".0" : ".";
        StringBuilder sb4 = new StringBuilder(str2.length() + str.length() + 24);
        sb4.append(str);
        sb4.append(".0");
        sb4.append(i13);
        sb4.append(str2);
        sb4.append(iM36715y2);
        return new C11856j0(sb4.toString(), 7, false);
    }

    /* JADX INFO: renamed from: l */
    public static C11856j0 m31816l(C38059n c38059n) {
        String str;
        c38059n.m121847G(2);
        int iM121867t = c38059n.m121867t();
        int i13 = iM121867t >> 1;
        int iM121867t2 = ((c38059n.m121867t() >> 3) & 31) | ((iM121867t & 1) << 5);
        if (i13 == 4 || i13 == 5 || i13 == 7 || i13 == 8) {
            str = "dvhe";
        } else if (i13 == 9) {
            str = "dvav";
        } else {
            if (i13 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sbM53374o = AbstractC18489d0.m53374o(str);
        sbM53374o.append(i13 < 10 ? ".0" : ".");
        sbM53374o.append(i13);
        sbM53374o.append(iM121867t2 < 10 ? ".0" : ".");
        sbM53374o.append(iM121867t2);
        return new C11856j0(sbM53374o.toString(), 11, false);
    }

    /* JADX INFO: renamed from: s */
    public static String m31817s(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e5) {
                Log.e("PlayCore", "Unable to format ".concat(String.valueOf(str2)), e5);
                str2 = AbstractC11895b.m31997p(str2, " [", TextUtils.join(", ", objArr), "]");
            }
        }
        return AbstractC18489d0.m53370k(str, " : ", str2);
    }

    @Override // p185h6.InterfaceC16961p
    /* JADX INFO: renamed from: a */
    public boolean mo31818a(CharSequence charSequence, int i13, int i14, C16969x c16969x) {
        if (!TextUtils.equals(charSequence.subSequence(i13, i14), this.f38685x)) {
            return true;
        }
        c16969x.f65126c = (c16969x.f65126c & 3) | 4;
        return false;
    }

    @Override // uc3.InterfaceC34767e
    /* JADX INFO: renamed from: b */
    public String mo30616b() {
        return AbstractC25012a.m73377j(new StringBuilder("expected '"), this.f38685x, '\'');
    }

    /* JADX INFO: renamed from: c */
    public void m31819c(StringBuilder sb4, Iterator it) {
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb4.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb4.append((CharSequence) this.f38685x);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb4.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
        } catch (IOException e5) {
            throw new AssertionError(e5);
        }
    }

    @Override // p185h6.InterfaceC16961p
    /* JADX INFO: renamed from: d */
    public Object mo31820d() {
        return this;
    }

    @Override // e53.InterfaceC12744c
    /* JADX INFO: renamed from: e */
    public Object mo31821e(AbstractC32269c abstractC32269c) {
        return this.f38685x;
    }

    /* JADX INFO: renamed from: f */
    public C12400e m31822f() {
        ExecutorC4220l executorC4220l = new ExecutorC4220l(1);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 5L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        String str = this.f38685x;
        if (str != null) {
            return new C12400e(executorC4220l, threadPoolExecutor, str);
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX INFO: renamed from: g */
    public C27865a m31823g() {
        return new C27865a(this);
    }

    /* JADX INFO: renamed from: h */
    public C31282l0 m31824h() {
        return new C31282l0(this);
    }

    /* JADX INFO: renamed from: i */
    public C38793c m31825i() {
        return new C38793c(null, null, null, null, this.f38685x, null);
    }

    /* JADX INFO: renamed from: j */
    public String m31826j() {
        return this.f38685x;
    }

    /* JADX INFO: renamed from: m */
    public void m31827m(String str) {
        this.f38685x = str;
    }

    /* JADX INFO: renamed from: n */
    public void m31828n(String str) {
        this.f38685x = str;
    }

    /* JADX INFO: renamed from: o */
    public void m31829o(String str) {
        this.f38685x = str;
    }

    /* JADX INFO: renamed from: p */
    public void m31830p(String str) {
        this.f38685x = str;
    }

    /* JADX INFO: renamed from: q */
    public void m31831q(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", m31817s(this.f38685x, str, objArr));
        }
    }

    /* JADX INFO: renamed from: r */
    public void m31832r(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", m31817s(this.f38685x, str, objArr));
        }
    }

    public String toString() {
        boolean zContainsAlias;
        switch (this.f38684w) {
            case 10:
                StringBuilder sb4 = new StringBuilder("MasterKey{keyAlias=");
                String str = this.f38685x;
                sb4.append(str);
                sb4.append(", isKeyStoreBacked=");
                try {
                    KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                    keyStore.load(null);
                    zContainsAlias = keyStore.containsAlias(str);
                    break;
                } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException unused) {
                    zContainsAlias = false;
                }
                return AbstractC18489d0.m53372m(sb4, zContainsAlias, "}");
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C11856j0(String str, int i13, boolean z4) {
        this.f38684w = i13;
        this.f38685x = str;
    }

    public C11856j0(C34377e c34377e, String apiKey) {
        this.f38684w = 3;
        AbstractC22676k.m65750j(apiKey, "apiKey");
        this.f38685x = apiKey;
    }

    public C11856j0(String expected, int i13) {
        this.f38684w = i13;
        switch (i13) {
            case 6:
                this.f38685x = expected;
                if (expected.length() <= 0) {
                    throw new IllegalArgumentException("userId should not be empty");
                }
                return;
            case 12:
                AbstractC22676k.m65750j(expected, "expected");
                this.f38685x = expected;
                return;
            case 13:
                this.f38685x = AbstractC25012a.m73372e(Process.myUid(), Process.myPid(), "UID: [", "]  PID: [", "] ").concat(expected);
                return;
            case 15:
                expected.getClass();
                this.f38685x = expected;
                return;
            default:
                AbstractC22676k.m65750j(expected, "token");
                this.f38685x = expected;
                return;
        }
    }

    public C11856j0(String str, Object obj) {
        this.f38684w = 10;
        this.f38685x = str;
    }

    public C11856j0(C40580x c40580x) {
        this.f38684w = 17;
        c40580x.m131576l("gcm.n.title");
        c40580x.m131573i("gcm.n.title");
        Object[] objArrM131572h = c40580x.m131572h("gcm.n.title");
        if (objArrM131572h != null) {
            String[] strArr = new String[objArrM131572h.length];
            for (int i13 = 0; i13 < objArrM131572h.length; i13++) {
                strArr[i13] = String.valueOf(objArrM131572h[i13]);
            }
        }
        this.f38685x = c40580x.m131576l("gcm.n.body");
        c40580x.m131573i("gcm.n.body");
        Object[] objArrM131572h2 = c40580x.m131572h("gcm.n.body");
        if (objArrM131572h2 != null) {
            String[] strArr2 = new String[objArrM131572h2.length];
            for (int i14 = 0; i14 < objArrM131572h2.length; i14++) {
                strArr2[i14] = String.valueOf(objArrM131572h2[i14]);
            }
        }
        c40580x.m131576l("gcm.n.icon");
        if (TextUtils.isEmpty(c40580x.m131576l("gcm.n.sound2"))) {
            c40580x.m131576l("gcm.n.sound");
        }
        c40580x.m131576l("gcm.n.tag");
        c40580x.m131576l("gcm.n.color");
        c40580x.m131576l("gcm.n.click_action");
        c40580x.m131576l("gcm.n.android_channel_id");
        String strM131576l = c40580x.m131576l("gcm.n.link_android");
        strM131576l = TextUtils.isEmpty(strM131576l) ? c40580x.m131576l("gcm.n.link") : strM131576l;
        if (!TextUtils.isEmpty(strM131576l)) {
            Uri.parse(strM131576l);
        }
        c40580x.m131576l("gcm.n.image");
        c40580x.m131576l("gcm.n.ticker");
        c40580x.m131569e("gcm.n.notification_priority");
        c40580x.m131569e("gcm.n.visibility");
        c40580x.m131569e("gcm.n.notification_count");
        c40580x.m131568c("gcm.n.sticky");
        c40580x.m131568c("gcm.n.local_only");
        c40580x.m131568c("gcm.n.default_sound");
        c40580x.m131568c("gcm.n.default_vibrate_timings");
        c40580x.m131568c("gcm.n.default_light_settings");
        c40580x.m131574j();
        c40580x.m131571g();
        c40580x.m131577m();
    }
}
