package th;

import a13.C0150h;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.AbstractC3076z;
import bc3.C3004e2;
import bc3.C3073y;
import be3.C3183e;
import com.whoop.service.network.model.UserSessionDto;
import e93.AbstractC12889b;
import hc3.C17171d;
import java.io.EOFException;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kc3.C22365e;
import kc3.ExecutorC22364d;
import ne3.AbstractC26604b;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import ne3.C26617h0;
import ne3.C26621j0;
import p031b9.C2817b;
import p035bp.AbstractC3511b;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import r80.AbstractC31061c;
import rq0.C31703x;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39412p;

/* JADX INFO: renamed from: th.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C33807e implements AutoCloseable {

    /* JADX INFO: renamed from: R */
    public static final C39412p f141591R = new C39412p("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: E */
    public final C26611e0 f141592E;

    /* JADX INFO: renamed from: F */
    public final LinkedHashMap f141593F;

    /* JADX INFO: renamed from: G */
    public final C17171d f141594G;

    /* JADX INFO: renamed from: H */
    public final Object f141595H;

    /* JADX INFO: renamed from: I */
    public long f141596I;

    /* JADX INFO: renamed from: J */
    public int f141597J;

    /* JADX INFO: renamed from: K */
    public C26617h0 f141598K;

    /* JADX INFO: renamed from: L */
    public boolean f141599L;

    /* JADX INFO: renamed from: M */
    public boolean f141600M;

    /* JADX INFO: renamed from: N */
    public boolean f141601N;

    /* JADX INFO: renamed from: O */
    public boolean f141602O;

    /* JADX INFO: renamed from: P */
    public boolean f141603P;

    /* JADX INFO: renamed from: Q */
    public final C33806d f141604Q;

    /* JADX INFO: renamed from: w */
    public final C26611e0 f141605w;

    /* JADX INFO: renamed from: x */
    public final long f141606x;

    /* JADX INFO: renamed from: y */
    public final C26611e0 f141607y;

    /* JADX INFO: renamed from: z */
    public final C26611e0 f141608z;

    public C33807e(long j7, AbstractC26632p abstractC26632p, C26611e0 c26611e0) {
        this.f141605w = c26611e0;
        this.f141606x = j7;
        if (j7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f141607y = c26611e0.m79176e("journal");
        this.f141608z = c26611e0.m79176e("journal.tmp");
        this.f141592E = c26611e0.m79176e("journal.bkp");
        this.f141593F = new LinkedHashMap(0, 0.75f, true);
        C3004e2 c3004e2M8710d = AbstractC3006f0.m8710d();
        C3073y key = AbstractC3076z.Key;
        AbstractC22676k.m65750j(key, "key");
        C22365e c22365e = AbstractC3050q0.f12077a;
        this.f141594G = AbstractC3006f0.m8708b(AbstractC12889b.m36254T(c3004e2M8710d, AbstractC3076z.limitedParallelism$default(ExecutorC22364d.f87316w, 1, null, 2, null)));
        this.f141595H = new Object();
        this.f141604Q = new C33806d(abstractC26632p);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0120 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:8:0x0013, B:12:0x001a, B:14:0x0022, B:16:0x0032, B:24:0x0040, B:26:0x0058, B:34:0x0078, B:36:0x0088, B:38:0x008f, B:27:0x005e, B:29:0x006e, B:30:0x0072, B:33:0x0077, B:42:0x00af, B:44:0x00b6, B:47:0x00bb, B:49:0x00cc, B:52:0x00d1, B:57:0x010c, B:59:0x0117, B:63:0x0120, B:53:0x00e9, B:55:0x00fe, B:56:0x0109, B:41:0x009f, B:66:0x0125, B:67:0x012c), top: B:71:0x0003, inners: #3 }] */
    /* JADX INFO: renamed from: b */
    public static final void m106961b(C33807e c33807e, C2817b c2817b, boolean z4) {
        synchronized (c33807e.f141595H) {
            C33804b c33804b = (C33804b) c2817b.f11024y;
            if (!AbstractC22676k.m65745e(c33804b.f141585g, c2817b)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z4 || c33804b.f141584f) {
                for (int i13 = 0; i13 < 2; i13++) {
                    c33807e.f141604Q.m79273s((C26611e0) c33804b.f141582d.get(i13));
                }
            } else {
                for (int i14 = 0; i14 < 2; i14++) {
                    if (((boolean[]) c2817b.f11025z)[i14] && !c33807e.f141604Q.m79274x((C26611e0) c33804b.f141582d.get(i14))) {
                        c2817b.m8007f(false);
                        return;
                    }
                }
                for (int i15 = 0; i15 < 2; i15++) {
                    C26611e0 c26611e0 = (C26611e0) c33804b.f141582d.get(i15);
                    C26611e0 c26611e1 = (C26611e0) c33804b.f141581c.get(i15);
                    if (c33807e.f141604Q.m79274x(c26611e0)) {
                        c33807e.f141604Q.mo79151h(c26611e0, c26611e1);
                    } else {
                        C33806d c33806d = c33807e.f141604Q;
                        C26611e0 c26611e2 = (C26611e0) c33804b.f141581c.get(i15);
                        if (!c33806d.m79274x(c26611e2)) {
                            try {
                                c33806d.mo37080p0(c26611e2, false).close();
                            } catch (RuntimeException e5) {
                                throw e5;
                            } catch (Exception unused) {
                            }
                        }
                    }
                    long j7 = c33804b.f141580b[i15];
                    Long l7 = (Long) c33807e.f141604Q.m79271T(c26611e1).f104375e;
                    long jLongValue = l7 != null ? l7.longValue() : 0L;
                    c33804b.f141580b[i15] = jLongValue;
                    c33807e.f141596I = (c33807e.f141596I - j7) + jLongValue;
                }
            }
            c33804b.f141585g = null;
            if (c33804b.f141584f) {
                c33807e.m106964T(c33804b);
                return;
            }
            c33807e.f141597J++;
            C26617h0 c26617h0 = c33807e.f141598K;
            AbstractC22676k.m65747g(c26617h0);
            if (z4 || c33804b.f141583e) {
                c33804b.f141583e = true;
                c26617h0.mo79193S("CLEAN");
                c26617h0.writeByte(32);
                c26617h0.mo79193S(c33804b.f141579a);
                for (long j13 : c33804b.f141580b) {
                    c26617h0.writeByte(32);
                    c26617h0.mo79209h0(j13);
                }
                c26617h0.writeByte(10);
            } else {
                c33807e.f141593F.remove(c33804b.f141579a);
                c26617h0.mo79193S("REMOVE");
                c26617h0.writeByte(32);
                c26617h0.mo79193S(c33804b.f141579a);
                c26617h0.writeByte(10);
            }
            c26617h0.flush();
            if (c33807e.f141596I > c33807e.f141606x) {
                c33807e.m106969m();
            } else if (c33807e.f141597J >= 2000) {
                c33807e.m106969m();
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m106962b0(String str) {
        if (!f141591R.m125851e(str)) {
            throw new IllegalArgumentException(AbstractC31061c.m95633i('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m106963J(String str) throws IOException {
        String strSubstring;
        int iM125887f0 = AbstractC39414r.m125887f0(str, ' ', 0, false, 6);
        if (iM125887f0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i13 = iM125887f0 + 1;
        int iM125887f1 = AbstractC39414r.m125887f0(str, ' ', i13, false, 4);
        LinkedHashMap linkedHashMap = this.f141593F;
        if (iM125887f1 == -1) {
            strSubstring = str.substring(i13);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            if (iM125887f0 == 6 && AbstractC39421y.m125930O(str, "REMOVE", false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i13, iM125887f1);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
        }
        Object c33804b = linkedHashMap.get(strSubstring);
        if (c33804b == null) {
            c33804b = new C33804b(this, strSubstring);
            linkedHashMap.put(strSubstring, c33804b);
        }
        C33804b c33804b2 = (C33804b) c33804b;
        if (iM125887f1 == -1 || iM125887f0 != 5 || !AbstractC39421y.m125930O(str, "CLEAN", false)) {
            if (iM125887f1 == -1 && iM125887f0 == 5 && AbstractC39421y.m125930O(str, "DIRTY", false)) {
                c33804b2.f141585g = new C2817b(this, c33804b2);
                return;
            } else {
                if (iM125887f1 != -1 || iM125887f0 != 4 || !AbstractC39421y.m125930O(str, "READ", false)) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String strSubstring2 = str.substring(iM125887f1 + 1);
        AbstractC22676k.m65749i(strSubstring2, "substring(...)");
        List listM125905x0 = AbstractC39414r.m125905x0(strSubstring2, new char[]{' '}, 0, 6);
        c33804b2.f141583e = true;
        c33804b2.f141585g = null;
        if (listM125905x0.size() != 2) {
            throw new IOException(AbstractC11895b.m31998q("unexpected journal line: ", listM125905x0));
        }
        try {
            int size = listM125905x0.size();
            for (int i14 = 0; i14 < size; i14++) {
                c33804b2.f141580b[i14] = Long.parseLong((String) listM125905x0.get(i14));
            }
        } catch (NumberFormatException unused) {
            throw new IOException(AbstractC11895b.m31998q("unexpected journal line: ", listM125905x0));
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m106964T(C33804b c33804b) {
        C26617h0 c26617h0;
        int i13 = c33804b.f141586h;
        String str = c33804b.f141579a;
        if (i13 > 0 && (c26617h0 = this.f141598K) != null) {
            c26617h0.mo79193S("DIRTY");
            c26617h0.writeByte(32);
            c26617h0.mo79193S(str);
            c26617h0.writeByte(10);
            c26617h0.flush();
        }
        if (c33804b.f141586h > 0 || c33804b.f141585g != null) {
            c33804b.f141584f = true;
            return;
        }
        for (int i14 = 0; i14 < 2; i14++) {
            this.f141604Q.m79273s((C26611e0) c33804b.f141581c.get(i14));
            long j7 = this.f141596I;
            long[] jArr = c33804b.f141580b;
            this.f141596I = j7 - jArr[i14];
            jArr[i14] = 0;
        }
        this.f141597J++;
        C26617h0 c26617h1 = this.f141598K;
        if (c26617h1 != null) {
            c26617h1.mo79193S("REMOVE");
            c26617h1.writeByte(32);
            c26617h1.mo79193S(str);
            c26617h1.writeByte(10);
            c26617h1.flush();
        }
        this.f141593F.remove(str);
        if (this.f141597J >= 2000) {
            m106969m();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m106965a0() {
        while (this.f141596I > this.f141606x) {
            for (C33804b c33804b : this.f141593F.values()) {
                if (!c33804b.f141584f) {
                    m106964T(c33804b);
                }
            }
            return;
        }
        this.f141602O = false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f141595H) {
            try {
                if (this.f141600M && !this.f141601N) {
                    for (C33804b c33804b : (C33804b[]) this.f141593F.values().toArray(new C33804b[0])) {
                        C2817b c2817b = c33804b.f141585g;
                        if (c2817b != null) {
                            C33804b c33804b2 = (C33804b) c2817b.f11024y;
                            if (AbstractC22676k.m65745e(c33804b2.f141585g, c2817b)) {
                                c33804b2.f141584f = true;
                            }
                        }
                    }
                    m106965a0();
                    AbstractC3006f0.m8714h(this.f141594G, null);
                    C26617h0 c26617h0 = this.f141598K;
                    AbstractC22676k.m65747g(c26617h0);
                    c26617h0.close();
                    this.f141598K = null;
                    this.f141601N = true;
                    return;
                }
                this.f141601N = true;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final C2817b m106966h(String str) {
        synchronized (this.f141595H) {
            if (this.f141601N) {
                throw new IllegalStateException("cache is closed");
            }
            m106962b0(str);
            m106968k();
            C33804b c33804b = (C33804b) this.f141593F.get(str);
            if ((c33804b != null ? c33804b.f141585g : null) != null) {
                return null;
            }
            if (c33804b != null && c33804b.f141586h != 0) {
                return null;
            }
            if (!this.f141602O && !this.f141603P) {
                C26617h0 c26617h0 = this.f141598K;
                AbstractC22676k.m65747g(c26617h0);
                c26617h0.mo79193S("DIRTY");
                c26617h0.writeByte(32);
                c26617h0.mo79193S(str);
                c26617h0.writeByte(10);
                c26617h0.flush();
                if (this.f141599L) {
                    return null;
                }
                if (c33804b == null) {
                    c33804b = new C33804b(this, str);
                    this.f141593F.put(str, c33804b);
                }
                C2817b c2817b = new C2817b(this, c33804b);
                c33804b.f141585g = c2817b;
                return c2817b;
            }
            m106969m();
            return null;
        }
    }

    /* JADX INFO: renamed from: i */
    public final C33805c m106967i(String str) {
        C33805c c33805cM106960a;
        synchronized (this.f141595H) {
            if (this.f141601N) {
                throw new IllegalStateException("cache is closed");
            }
            m106962b0(str);
            m106968k();
            C33804b c33804b = (C33804b) this.f141593F.get(str);
            if (c33804b != null && (c33805cM106960a = c33804b.m106960a()) != null) {
                boolean z4 = true;
                this.f141597J++;
                C26617h0 c26617h0 = this.f141598K;
                AbstractC22676k.m65747g(c26617h0);
                c26617h0.mo79193S("READ");
                c26617h0.writeByte(32);
                c26617h0.mo79193S(str);
                c26617h0.writeByte(10);
                c26617h0.flush();
                if (this.f141597J < 2000) {
                    z4 = false;
                }
                if (z4) {
                    m106969m();
                }
                return c33805cM106960a;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m106968k() {
        synchronized (this.f141595H) {
            try {
                if (this.f141600M) {
                    return;
                }
                this.f141604Q.m79273s(this.f141608z);
                if (this.f141604Q.m79274x(this.f141592E)) {
                    if (this.f141604Q.m79274x(this.f141607y)) {
                        this.f141604Q.m79273s(this.f141592E);
                    } else {
                        this.f141604Q.mo79151h(this.f141592E, this.f141607y);
                    }
                }
                if (this.f141604Q.m79274x(this.f141607y)) {
                    try {
                        m106972x();
                        m106971s();
                        this.f141600M = true;
                        return;
                    } catch (IOException unused) {
                        try {
                            close();
                            AbstractC3511b.m10390s(this.f141604Q, this.f141605w);
                            this.f141601N = false;
                            m106970o0();
                            this.f141600M = true;
                        } catch (Throwable th3) {
                            this.f141601N = false;
                            throw th3;
                        }
                    }
                }
                m106970o0();
                this.f141600M = true;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m106969m() {
        AbstractC3006f0.m8732z(this.f141594G, null, null, new C0150h(this, null, 20), 3);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m106970o0() {
        Throwable th3;
        synchronized (this.f141595H) {
            try {
                C26617h0 c26617h0 = this.f141598K;
                if (c26617h0 != null) {
                    c26617h0.close();
                }
                C26617h0 c26617h0M79157b = AbstractC26604b.m79157b(this.f141604Q.mo37080p0(this.f141608z, false));
                try {
                    c26617h0M79157b.mo79193S("libcore.io.DiskLruCache");
                    c26617h0M79157b.writeByte(10);
                    c26617h0M79157b.mo79193S(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
                    c26617h0M79157b.writeByte(10);
                    c26617h0M79157b.mo79209h0(3);
                    c26617h0M79157b.writeByte(10);
                    c26617h0M79157b.mo79209h0(2);
                    c26617h0M79157b.writeByte(10);
                    c26617h0M79157b.writeByte(10);
                    for (C33804b c33804b : this.f141593F.values()) {
                        if (c33804b.f141585g != null) {
                            c26617h0M79157b.mo79193S("DIRTY");
                            c26617h0M79157b.writeByte(32);
                            c26617h0M79157b.mo79193S(c33804b.f141579a);
                            c26617h0M79157b.writeByte(10);
                        } else {
                            c26617h0M79157b.mo79193S("CLEAN");
                            c26617h0M79157b.writeByte(32);
                            c26617h0M79157b.mo79193S(c33804b.f141579a);
                            for (long j7 : c33804b.f141580b) {
                                c26617h0M79157b.writeByte(32);
                                c26617h0M79157b.mo79209h0(j7);
                            }
                            c26617h0M79157b.writeByte(10);
                        }
                    }
                    try {
                        c26617h0M79157b.close();
                        th3 = null;
                    } catch (Throwable th4) {
                        th3 = th4;
                    }
                } catch (Throwable th5) {
                    try {
                        c26617h0M79157b.close();
                    } catch (Throwable th6) {
                        AbstractC29125c.m88530g(th5, th6);
                    }
                    th3 = th5;
                }
                if (th3 != null) {
                    throw th3;
                }
                if (this.f141604Q.m79274x(this.f141607y)) {
                    this.f141604Q.mo79151h(this.f141607y, this.f141592E);
                    this.f141604Q.mo79151h(this.f141608z, this.f141607y);
                    this.f141604Q.m79273s(this.f141592E);
                } else {
                    this.f141604Q.mo79151h(this.f141608z, this.f141607y);
                }
                C33806d c33806d = this.f141604Q;
                C26611e0 file = this.f141607y;
                c33806d.getClass();
                AbstractC22676k.m65750j(file, "file");
                this.f141598K = AbstractC26604b.m79157b(new C3183e(c33806d.mo79149b(file), new C31703x(this, 20)));
                this.f141597J = 0;
                this.f141599L = false;
                this.f141603P = false;
            } catch (Throwable th7) {
                throw th7;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m106971s() {
        Iterator it = this.f141593F.values().iterator();
        long j7 = 0;
        while (it.hasNext()) {
            C33804b c33804b = (C33804b) it.next();
            int i13 = 0;
            if (c33804b.f141585g == null) {
                while (i13 < 2) {
                    j7 += c33804b.f141580b[i13];
                    i13++;
                }
            } else {
                c33804b.f141585g = null;
                while (i13 < 2) {
                    C26611e0 c26611e0 = (C26611e0) c33804b.f141581c.get(i13);
                    C33806d c33806d = this.f141604Q;
                    c33806d.m79273s(c26611e0);
                    c33806d.m79273s((C26611e0) c33804b.f141582d.get(i13));
                    i13++;
                }
                it.remove();
            }
        }
        this.f141596I = j7;
    }

    /* JADX INFO: renamed from: x */
    public final void m106972x() throws Throwable {
        C33806d c33806d = this.f141604Q;
        C26611e0 file = this.f141607y;
        C26621j0 c26621j0M79158c = AbstractC26604b.m79158c(c33806d.mo79155x0(file));
        try {
            String strMo79187M = c26621j0M79158c.mo79187M(Long.MAX_VALUE);
            String strMo79187M2 = c26621j0M79158c.mo79187M(Long.MAX_VALUE);
            String strMo79187M3 = c26621j0M79158c.mo79187M(Long.MAX_VALUE);
            String strMo79187M4 = c26621j0M79158c.mo79187M(Long.MAX_VALUE);
            String strMo79187M5 = c26621j0M79158c.mo79187M(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strMo79187M) || !UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE.equals(strMo79187M2) || !AbstractC22676k.m65745e(String.valueOf(3), strMo79187M3) || !AbstractC22676k.m65745e(String.valueOf(2), strMo79187M4) || strMo79187M5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strMo79187M + ", " + strMo79187M2 + ", " + strMo79187M3 + ", " + strMo79187M4 + ", " + strMo79187M5 + ']');
            }
            int i13 = 0;
            while (true) {
                try {
                    m106963J(c26621j0M79158c.mo79187M(Long.MAX_VALUE));
                    i13++;
                } catch (EOFException unused) {
                    this.f141597J = i13 - this.f141593F.size();
                    if (c26621j0M79158c.mo79222o()) {
                        c33806d.getClass();
                        AbstractC22676k.m65750j(file, "file");
                        this.f141598K = AbstractC26604b.m79157b(new C3183e(c33806d.mo79149b(file), new C31703x(this, 20)));
                    } else {
                        m106970o0();
                    }
                    try {
                        c26621j0M79158c.close();
                        th = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
            try {
                c26621j0M79158c.close();
            } catch (Throwable th5) {
                AbstractC29125c.m88530g(th, th5);
            }
        }
        if (th != null) {
            throw th;
        }
    }
}
