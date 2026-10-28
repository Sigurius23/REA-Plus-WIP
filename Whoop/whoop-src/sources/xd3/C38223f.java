package xd3;

import com.whoop.service.network.model.UserSessionDto;
import fe3.AbstractC14421e;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import le3.C23885f;
import ne3.AbstractC26604b;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import ne3.C26617h0;
import ne3.C26621j0;
import ne3.InterfaceC26629n0;
import p031b9.C2817b;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import r80.AbstractC31061c;
import wd3.AbstractC37172f;
import wd3.AbstractC37174h;
import x30.C37894h1;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39412p;
import yd3.C39472c;
import yd3.C39473d;

/* JADX INFO: renamed from: xd3.f */
/* JADX INFO: loaded from: classes3.dex */
public final class C38223f implements Closeable, Flushable {

    /* JADX INFO: renamed from: T */
    public static final C39412p f163828T = new C39412p("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: U */
    public static final String f163829U = "CLEAN";

    /* JADX INFO: renamed from: V */
    public static final String f163830V = "DIRTY";

    /* JADX INFO: renamed from: W */
    public static final String f163831W = "REMOVE";

    /* JADX INFO: renamed from: X */
    public static final String f163832X = "READ";

    /* JADX INFO: renamed from: E */
    public final C26611e0 f163833E;

    /* JADX INFO: renamed from: F */
    public final C26611e0 f163834F;

    /* JADX INFO: renamed from: G */
    public long f163835G;

    /* JADX INFO: renamed from: H */
    public C26617h0 f163836H;

    /* JADX INFO: renamed from: I */
    public final LinkedHashMap f163837I;

    /* JADX INFO: renamed from: J */
    public int f163838J;

    /* JADX INFO: renamed from: K */
    public boolean f163839K;

    /* JADX INFO: renamed from: L */
    public boolean f163840L;

    /* JADX INFO: renamed from: M */
    public boolean f163841M;

    /* JADX INFO: renamed from: N */
    public boolean f163842N;

    /* JADX INFO: renamed from: O */
    public boolean f163843O;

    /* JADX INFO: renamed from: P */
    public boolean f163844P;

    /* JADX INFO: renamed from: Q */
    public long f163845Q;

    /* JADX INFO: renamed from: R */
    public final C39472c f163846R;

    /* JADX INFO: renamed from: S */
    public final C23885f f163847S;

    /* JADX INFO: renamed from: w */
    public final C26611e0 f163848w;

    /* JADX INFO: renamed from: x */
    public final C38222e f163849x;

    /* JADX INFO: renamed from: y */
    public final long f163850y;

    /* JADX INFO: renamed from: z */
    public final C26611e0 f163851z;

    public C38223f(AbstractC26632p fileSystem, C26611e0 c26611e0, C39473d taskRunner) {
        AbstractC22676k.m65750j(fileSystem, "fileSystem");
        AbstractC22676k.m65750j(taskRunner, "taskRunner");
        this.f163848w = c26611e0;
        this.f163849x = new C38222e(fileSystem);
        this.f163850y = AttachmentConstants.MAX_SIZE_BEFORE_DOWNLOAD_WARNING_IN_BYTES;
        this.f163837I = new LinkedHashMap(0, 0.75f, true);
        this.f163846R = taskRunner.m126126d();
        this.f163847S = new C23885f(this, AbstractC25012a.m73376i(AbstractC37174h.f158963b, " Cache", new StringBuilder()));
        this.f163851z = c26611e0.m79176e("journal");
        this.f163833E = c26611e0.m79176e("journal.tmp");
        this.f163834F = c26611e0.m79176e("journal.bkp");
    }

    /* JADX INFO: renamed from: p0 */
    public static void m122491p0(String str) {
        if (!f163828T.m125851e(str)) {
            throw new IllegalArgumentException(AbstractC31061c.m95633i('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    /* JADX INFO: renamed from: J */
    public final void m122492J() throws Throwable {
        C38222e c38222e = this.f163849x;
        C26611e0 file = this.f163851z;
        C26621j0 c26621j0M79158c = AbstractC26604b.m79158c(c38222e.mo79155x0(file));
        try {
            String strMo79187M = c26621j0M79158c.mo79187M(Long.MAX_VALUE);
            String strMo79187M2 = c26621j0M79158c.mo79187M(Long.MAX_VALUE);
            String strMo79187M3 = c26621j0M79158c.mo79187M(Long.MAX_VALUE);
            String strMo79187M4 = c26621j0M79158c.mo79187M(Long.MAX_VALUE);
            String strMo79187M5 = c26621j0M79158c.mo79187M(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strMo79187M) || !UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE.equals(strMo79187M2) || !AbstractC22676k.m65745e(String.valueOf(201105), strMo79187M3) || !AbstractC22676k.m65745e(String.valueOf(2), strMo79187M4) || strMo79187M5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strMo79187M + ", " + strMo79187M2 + ", " + strMo79187M4 + ", " + strMo79187M5 + ']');
            }
            int i13 = 0;
            while (true) {
                try {
                    m122493T(c26621j0M79158c.mo79187M(Long.MAX_VALUE));
                    i13++;
                } catch (EOFException unused) {
                    this.f163838J = i13 - this.f163837I.size();
                    if (c26621j0M79158c.mo79222o()) {
                        C26617h0 c26617h0 = this.f163836H;
                        if (c26617h0 != null) {
                            AbstractC37172f.m119117b(c26617h0);
                        }
                        c38222e.getClass();
                        AbstractC22676k.m65750j(file, "file");
                        this.f163836H = AbstractC26604b.m79157b(new C38224g(c38222e.mo79149b(file), new C37894h1(this, 7)));
                    } else {
                        m122494a0();
                    }
                    try {
                        c26621j0M79158c.close();
                        th = null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                    if (th == null) {
                        throw th;
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
            if (th == null) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m122493T(String str) throws IOException {
        String strSubstring;
        int iM125887f0 = AbstractC39414r.m125887f0(str, ' ', 0, false, 6);
        if (iM125887f0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i13 = iM125887f0 + 1;
        int iM125887f1 = AbstractC39414r.m125887f0(str, ' ', i13, false, 4);
        LinkedHashMap linkedHashMap = this.f163837I;
        if (iM125887f1 == -1) {
            strSubstring = str.substring(i13);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
            String str2 = f163831W;
            if (iM125887f0 == str2.length() && AbstractC39421y.m125930O(str, str2, false)) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i13, iM125887f1);
            AbstractC22676k.m65749i(strSubstring, "substring(...)");
        }
        C38220c c38220c = (C38220c) linkedHashMap.get(strSubstring);
        if (c38220c == null) {
            c38220c = new C38220c(this, strSubstring);
            linkedHashMap.put(strSubstring, c38220c);
        }
        if (iM125887f1 != -1) {
            String str3 = f163829U;
            if (iM125887f0 == str3.length() && AbstractC39421y.m125930O(str, str3, false)) {
                String strSubstring2 = str.substring(iM125887f1 + 1);
                AbstractC22676k.m65749i(strSubstring2, "substring(...)");
                List listM125905x0 = AbstractC39414r.m125905x0(strSubstring2, new char[]{' '}, 0, 6);
                c38220c.f163818e = true;
                c38220c.f163820g = null;
                int size = listM125905x0.size();
                c38220c.f163823j.getClass();
                if (size != 2) {
                    throw new IOException(AbstractC11895b.m31998q("unexpected journal line: ", listM125905x0));
                }
                try {
                    int size2 = listM125905x0.size();
                    for (int i14 = 0; i14 < size2; i14++) {
                        c38220c.f163815b[i14] = Long.parseLong((String) listM125905x0.get(i14));
                    }
                    return;
                } catch (NumberFormatException unused) {
                    throw new IOException(AbstractC11895b.m31998q("unexpected journal line: ", listM125905x0));
                }
            }
        }
        if (iM125887f1 == -1) {
            String str4 = f163830V;
            if (iM125887f0 == str4.length() && AbstractC39421y.m125930O(str, str4, false)) {
                c38220c.f163820g = new C2817b(this, c38220c);
                return;
            }
        }
        if (iM125887f1 == -1) {
            String str5 = f163832X;
            if (iM125887f0 == str5.length() && AbstractC39421y.m125930O(str, str5, false)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    /* JADX INFO: renamed from: a0 */
    public final synchronized void m122494a0() {
        Throwable th3;
        try {
            C26617h0 c26617h0 = this.f163836H;
            if (c26617h0 != null) {
                c26617h0.close();
            }
            C26617h0 c26617h0M79157b = AbstractC26604b.m79157b(this.f163849x.mo37080p0(this.f163833E, false));
            try {
                c26617h0M79157b.mo79193S("libcore.io.DiskLruCache");
                c26617h0M79157b.writeByte(10);
                c26617h0M79157b.mo79193S(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
                c26617h0M79157b.writeByte(10);
                c26617h0M79157b.mo79209h0(201105);
                c26617h0M79157b.writeByte(10);
                c26617h0M79157b.mo79209h0(2);
                c26617h0M79157b.writeByte(10);
                c26617h0M79157b.writeByte(10);
                for (Object obj : this.f163837I.values()) {
                    AbstractC22676k.m65749i(obj, "next(...)");
                    C38220c c38220c = (C38220c) obj;
                    if (c38220c.f163820g != null) {
                        c26617h0M79157b.mo79193S(f163830V);
                        c26617h0M79157b.writeByte(32);
                        c26617h0M79157b.mo79193S(c38220c.f163814a);
                        c26617h0M79157b.writeByte(10);
                    } else {
                        c26617h0M79157b.mo79193S(f163829U);
                        c26617h0M79157b.writeByte(32);
                        c26617h0M79157b.mo79193S(c38220c.f163814a);
                        for (long j7 : c38220c.f163815b) {
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
            if (this.f163849x.m79274x(this.f163851z)) {
                this.f163849x.mo79151h(this.f163851z, this.f163834F);
                this.f163849x.mo79151h(this.f163833E, this.f163851z);
                AbstractC37172f.m119119d(this.f163849x, this.f163834F);
            } else {
                this.f163849x.mo79151h(this.f163833E, this.f163851z);
            }
            C26617h0 c26617h1 = this.f163836H;
            if (c26617h1 != null) {
                AbstractC37172f.m119117b(c26617h1);
            }
            C38222e c38222e = this.f163849x;
            C26611e0 file = this.f163851z;
            c38222e.getClass();
            AbstractC22676k.m65750j(file, "file");
            this.f163836H = AbstractC26604b.m79157b(new C38224g(c38222e.mo79149b(file), new C37894h1(this, 7)));
            this.f163839K = false;
            this.f163844P = false;
        } catch (Throwable th7) {
            throw th7;
        }
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m122495b() {
        if (this.f163842N) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m122496b0(C38220c c38220c) {
        C26617h0 c26617h0;
        String str = c38220c.f163814a;
        if (!this.f163840L) {
            if (c38220c.f163821h > 0 && (c26617h0 = this.f163836H) != null) {
                c26617h0.mo79193S(f163830V);
                c26617h0.writeByte(32);
                c26617h0.mo79193S(str);
                c26617h0.writeByte(10);
                c26617h0.flush();
            }
            if (c38220c.f163821h > 0 || c38220c.f163820g != null) {
                c38220c.f163819f = true;
                return;
            }
        }
        C2817b c2817b = c38220c.f163820g;
        if (c2817b != null) {
            c2817b.m8008i();
        }
        for (int i13 = 0; i13 < 2; i13++) {
            AbstractC37172f.m119119d(this.f163849x, (C26611e0) c38220c.f163816c.get(i13));
            long j7 = this.f163835G;
            long[] jArr = c38220c.f163815b;
            this.f163835G = j7 - jArr[i13];
            jArr[i13] = 0;
        }
        this.f163838J++;
        C26617h0 c26617h1 = this.f163836H;
        if (c26617h1 != null) {
            c26617h1.mo79193S(f163831W);
            c26617h1.writeByte(32);
            c26617h1.mo79193S(str);
            c26617h1.writeByte(10);
        }
        this.f163837I.remove(str);
        if (m122502s()) {
            this.f163846R.m126120d(this.f163847S, 0L);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f163841M && !this.f163842N) {
                Collection collectionValues = this.f163837I.values();
                AbstractC22676k.m65749i(collectionValues, "<get-values>(...)");
                for (C38220c c38220c : (C38220c[]) collectionValues.toArray(new C38220c[0])) {
                    AbstractC22676k.m65747g(c38220c);
                    C2817b c2817b = c38220c.f163820g;
                    if (c2817b != null) {
                        c2817b.m8008i();
                    }
                }
                m122501o0();
                C26617h0 c26617h0 = this.f163836H;
                if (c26617h0 != null) {
                    AbstractC37172f.m119117b(c26617h0);
                }
                this.f163836H = null;
                this.f163842N = true;
                return;
            }
            this.f163842N = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f163841M) {
            m122495b();
            m122501o0();
            C26617h0 c26617h0 = this.f163836H;
            AbstractC22676k.m65747g(c26617h0);
            c26617h0.flush();
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized void m122497h(C2817b c2817b, boolean z4) {
        C38220c c38220c = (C38220c) c2817b.f11024y;
        if (!AbstractC22676k.m65745e(c38220c.f163820g, c2817b)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z4 && !c38220c.f163818e) {
            for (int i13 = 0; i13 < 2; i13++) {
                boolean[] zArr = (boolean[]) c2817b.f11025z;
                AbstractC22676k.m65747g(zArr);
                if (!zArr[i13]) {
                    c2817b.m8004a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i13);
                }
                if (!this.f163849x.m79274x((C26611e0) c38220c.f163817d.get(i13))) {
                    c2817b.m8004a();
                    return;
                }
            }
        }
        for (int i14 = 0; i14 < 2; i14++) {
            C26611e0 c26611e0 = (C26611e0) c38220c.f163817d.get(i14);
            if (!z4 || c38220c.f163819f) {
                AbstractC37172f.m119119d(this.f163849x, c26611e0);
            } else if (this.f163849x.m79274x(c26611e0)) {
                C26611e0 c26611e1 = (C26611e0) c38220c.f163816c.get(i14);
                this.f163849x.mo79151h(c26611e0, c26611e1);
                long j7 = c38220c.f163815b[i14];
                Long l7 = (Long) this.f163849x.m79271T(c26611e1).f104375e;
                long jLongValue = l7 != null ? l7.longValue() : 0L;
                c38220c.f163815b[i14] = jLongValue;
                this.f163835G = (this.f163835G - j7) + jLongValue;
            }
        }
        c38220c.f163820g = null;
        if (c38220c.f163819f) {
            m122496b0(c38220c);
            return;
        }
        this.f163838J++;
        C26617h0 c26617h0 = this.f163836H;
        AbstractC22676k.m65747g(c26617h0);
        if (c38220c.f163818e || z4) {
            c38220c.f163818e = true;
            c26617h0.mo79193S(f163829U);
            c26617h0.writeByte(32);
            c26617h0.mo79193S(c38220c.f163814a);
            for (long j13 : c38220c.f163815b) {
                c26617h0.writeByte(32);
                c26617h0.mo79209h0(j13);
            }
            c26617h0.writeByte(10);
            if (z4) {
                long j14 = this.f163845Q;
                this.f163845Q = 1 + j14;
                c38220c.f163822i = j14;
            }
        } else {
            this.f163837I.remove(c38220c.f163814a);
            c26617h0.mo79193S(f163831W);
            c26617h0.writeByte(32);
            c26617h0.mo79193S(c38220c.f163814a);
            c26617h0.writeByte(10);
        }
        c26617h0.flush();
        if (this.f163835G > this.f163850y || m122502s()) {
            this.f163846R.m126120d(this.f163847S, 0L);
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized C2817b m122498i(long j7, String key) {
        AbstractC22676k.m65750j(key, "key");
        m122500m();
        m122495b();
        m122491p0(key);
        C38220c c38220c = (C38220c) this.f163837I.get(key);
        if (j7 != -1 && (c38220c == null || c38220c.f163822i != j7)) {
            return null;
        }
        if ((c38220c != null ? c38220c.f163820g : null) != null) {
            return null;
        }
        if (c38220c != null && c38220c.f163821h != 0) {
            return null;
        }
        if (!this.f163843O && !this.f163844P) {
            C26617h0 c26617h0 = this.f163836H;
            AbstractC22676k.m65747g(c26617h0);
            c26617h0.mo79193S(f163830V);
            c26617h0.writeByte(32);
            c26617h0.mo79193S(key);
            c26617h0.writeByte(10);
            c26617h0.flush();
            if (this.f163839K) {
                return null;
            }
            if (c38220c == null) {
                c38220c = new C38220c(this, key);
                this.f163837I.put(key, c38220c);
            }
            C2817b c2817b = new C2817b(this, c38220c);
            c38220c.f163820g = c2817b;
            return c2817b;
        }
        this.f163846R.m126120d(this.f163847S, 0L);
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized C38221d m122499k(String key) {
        AbstractC22676k.m65750j(key, "key");
        m122500m();
        m122495b();
        m122491p0(key);
        C38220c c38220c = (C38220c) this.f163837I.get(key);
        if (c38220c == null) {
            return null;
        }
        C38221d c38221dM122490a = c38220c.m122490a();
        if (c38221dM122490a == null) {
            return null;
        }
        this.f163838J++;
        C26617h0 c26617h0 = this.f163836H;
        AbstractC22676k.m65747g(c26617h0);
        c26617h0.mo79193S(f163832X);
        c26617h0.writeByte(32);
        c26617h0.mo79193S(key);
        c26617h0.writeByte(10);
        if (m122502s()) {
            this.f163846R.m126120d(this.f163847S, 0L);
        }
        return c38221dM122490a;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x006c A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #4 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:12:0x001f, B:15:0x002a, B:16:0x0033, B:37:0x0070, B:39:0x007c, B:49:0x00bf, B:43:0x0087, B:45:0x00b8, B:47:0x00bc, B:48:0x00be, B:36:0x006c, B:52:0x00c6, B:27:0x005b, B:24:0x0056, B:44:0x00ae, B:18:0x0049), top: B:62:0x0003, inners: #3, #5, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c6 A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #4 {all -> 0x0027, blocks: (B:4:0x0003, B:8:0x000b, B:10:0x0015, B:12:0x001f, B:15:0x002a, B:16:0x0033, B:37:0x0070, B:39:0x007c, B:49:0x00bf, B:43:0x0087, B:45:0x00b8, B:47:0x00bc, B:48:0x00be, B:36:0x006c, B:52:0x00c6, B:27:0x005b, B:24:0x0056, B:44:0x00ae, B:18:0x0049), top: B:62:0x0003, inners: #3, #5, #7, #8 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x007c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public final synchronized void m122500m() {
        boolean z4;
        try {
            TimeZone timeZone = AbstractC37174h.f158962a;
            if (this.f163841M) {
                return;
            }
            if (this.f163849x.m79274x(this.f163834F)) {
                if (this.f163849x.m79274x(this.f163851z)) {
                    this.f163849x.m79273s(this.f163834F);
                } else {
                    this.f163849x.mo79151h(this.f163834F, this.f163851z);
                }
            }
            C38222e c38222e = this.f163849x;
            C26611e0 file = this.f163834F;
            byte[] bArr = AbstractC37172f.f158958a;
            AbstractC22676k.m65750j(c38222e, "<this>");
            AbstractC22676k.m65750j(file, "file");
            InterfaceC26629n0 interfaceC26629n0Mo37080p0 = c38222e.mo37080p0(file, false);
            try {
                c38222e.mo79153m(file);
                if (interfaceC26629n0Mo37080p0 != null) {
                    try {
                        interfaceC26629n0Mo37080p0.close();
                    } catch (Throwable unused) {
                    }
                }
                z4 = true;
            } catch (IOException unused2) {
                if (interfaceC26629n0Mo37080p0 != null) {
                    try {
                        interfaceC26629n0Mo37080p0.close();
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        if (th != null) {
                            throw th;
                        }
                        c38222e.mo79153m(file);
                        z4 = false;
                        this.f163840L = z4;
                        if (this.f163849x.m79274x(this.f163851z)) {
                            try {
                                m122492J();
                                m122503x();
                                this.f163841M = true;
                                return;
                            } catch (IOException e5) {
                                AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
                                AbstractC14421e.f52594a.mo41121j("DiskLruCache " + this.f163848w + " is corrupt: " + e5.getMessage() + ", removing", 5, e5);
                                try {
                                    close();
                                    AbstractC37172f.m119118c(this.f163849x, this.f163848w);
                                    this.f163842N = false;
                                    m122494a0();
                                    this.f163841M = true;
                                } catch (Throwable th4) {
                                    this.f163842N = false;
                                    throw th4;
                                }
                            }
                        }
                        m122494a0();
                        this.f163841M = true;
                    }
                }
                th = null;
                th = th;
                if (th != null) {
                    throw th;
                }
                c38222e.mo79153m(file);
                z4 = false;
            } catch (Throwable th5) {
                th = th5;
                if (interfaceC26629n0Mo37080p0 != null) {
                    try {
                        interfaceC26629n0Mo37080p0.close();
                    } catch (Throwable th6) {
                        AbstractC29125c.m88530g(th, th6);
                    }
                }
                if (th != null) {
                    throw th;
                }
                c38222e.mo79153m(file);
                z4 = false;
                this.f163840L = z4;
                if (this.f163849x.m79274x(this.f163851z)) {
                    m122492J();
                    m122503x();
                    this.f163841M = true;
                    return;
                }
                m122494a0();
                this.f163841M = true;
            }
            this.f163840L = z4;
            if (this.f163849x.m79274x(this.f163851z)) {
                m122492J();
                m122503x();
                this.f163841M = true;
                return;
            }
            m122494a0();
            this.f163841M = true;
        } catch (Throwable th7) {
            throw th7;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m122501o0() {
        while (this.f163835G > this.f163850y) {
            for (Object obj : this.f163837I.values()) {
                AbstractC22676k.m65749i(obj, "next(...)");
                C38220c c38220c = (C38220c) obj;
                if (!c38220c.f163819f) {
                    m122496b0(c38220c);
                }
            }
            return;
        }
        this.f163843O = false;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m122502s() {
        int i13 = this.f163838J;
        return i13 >= 2000 && i13 >= this.f163837I.size();
    }

    /* JADX INFO: renamed from: x */
    public final void m122503x() {
        C26611e0 c26611e0 = this.f163833E;
        C38222e c38222e = this.f163849x;
        AbstractC37172f.m119119d(c38222e, c26611e0);
        Iterator it = this.f163837I.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC22676k.m65749i(next, "next(...)");
            C38220c c38220c = (C38220c) next;
            int i13 = 0;
            if (c38220c.f163820g == null) {
                while (i13 < 2) {
                    this.f163835G += c38220c.f163815b[i13];
                    i13++;
                }
            } else {
                c38220c.f163820g = null;
                while (i13 < 2) {
                    AbstractC37172f.m119119d(c38222e, (C26611e0) c38220c.f163816c.get(i13));
                    AbstractC37172f.m119119d(c38222e, (C26611e0) c38220c.f163817d.get(i13));
                    i13++;
                }
                it.remove();
            }
        }
    }
}
