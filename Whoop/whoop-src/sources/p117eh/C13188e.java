package p117eh;

import a13.C0150h;
import bc3.AbstractC3006f0;
import bc3.AbstractC3076z;
import com.whoop.service.network.model.UserSessionDto;
import e93.AbstractC12889b;
import hc3.C17171d;
import java.io.Closeable;
import java.io.EOFException;
import java.io.Flushable;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import ne3.AbstractC26604b;
import ne3.AbstractC26632p;
import ne3.C26611e0;
import ne3.C26617h0;
import ne3.C26621j0;
import p007a6.C0428i;
import p088dc.AbstractC11895b;
import p425qh.AbstractC30358d;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import pf.AbstractC29125c;
import r80.AbstractC31061c;
import yb3.AbstractC39414r;
import yb3.AbstractC39421y;
import yb3.C39412p;

/* JADX INFO: renamed from: eh.e */
/* JADX INFO: loaded from: classes.dex */
public final class C13188e implements Closeable, Flushable {

    /* JADX INFO: renamed from: Q */
    public static final C39412p f45712Q = new C39412p("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: E */
    public final C26611e0 f45713E;

    /* JADX INFO: renamed from: F */
    public final LinkedHashMap f45714F;

    /* JADX INFO: renamed from: G */
    public final C17171d f45715G;

    /* JADX INFO: renamed from: H */
    public long f45716H;

    /* JADX INFO: renamed from: I */
    public int f45717I;

    /* JADX INFO: renamed from: J */
    public C26617h0 f45718J;

    /* JADX INFO: renamed from: K */
    public boolean f45719K;

    /* JADX INFO: renamed from: L */
    public boolean f45720L;

    /* JADX INFO: renamed from: M */
    public boolean f45721M;

    /* JADX INFO: renamed from: N */
    public boolean f45722N;

    /* JADX INFO: renamed from: O */
    public boolean f45723O;

    /* JADX INFO: renamed from: P */
    public final C13187d f45724P;

    /* JADX INFO: renamed from: w */
    public final C26611e0 f45725w;

    /* JADX INFO: renamed from: x */
    public final long f45726x;

    /* JADX INFO: renamed from: y */
    public final C26611e0 f45727y;

    /* JADX INFO: renamed from: z */
    public final C26611e0 f45728z;

    public C13188e(long j7, AbstractC3076z abstractC3076z, AbstractC26632p abstractC26632p, C26611e0 c26611e0) {
        this.f45725w = c26611e0;
        this.f45726x = j7;
        if (j7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f45727y = c26611e0.m79176e("journal");
        this.f45728z = c26611e0.m79176e("journal.tmp");
        this.f45713E = c26611e0.m79176e("journal.bkp");
        this.f45714F = new LinkedHashMap(0, 0.75f, true);
        this.f45715G = AbstractC3006f0.m8708b(AbstractC12889b.m36254T(AbstractC3006f0.m8710d(), abstractC3076z.limitedParallelism(1)));
        this.f45724P = new C13187d(abstractC26632p);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x011b A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x0011, B:11:0x0018, B:13:0x0020, B:15:0x0030, B:23:0x003e, B:25:0x0056, B:29:0x0073, B:31:0x0083, B:33:0x008a, B:26:0x005c, B:28:0x006c, B:37:0x00aa, B:39:0x00b1, B:42:0x00b6, B:44:0x00c7, B:47:0x00cc, B:52:0x0107, B:54:0x0112, B:58:0x011b, B:48:0x00e4, B:50:0x00f9, B:51:0x0104, B:36:0x009a, B:61:0x0120, B:62:0x0127), top: B:65:0x0001 }] */
    /* JADX INFO: renamed from: b */
    public static final void m37081b(C13188e c13188e, C13184a c13184a, boolean z4) {
        synchronized (c13188e) {
            C13185b c13185b = (C13185b) c13184a.f45697b;
            if (!AbstractC22676k.m65745e(c13185b.f45706g, c13184a)) {
                throw new IllegalStateException("Check failed.");
            }
            if (!z4 || c13185b.f45705f) {
                for (int i13 = 0; i13 < 2; i13++) {
                    c13188e.f45724P.m79273s((C26611e0) c13185b.f45703d.get(i13));
                }
            } else {
                for (int i14 = 0; i14 < 2; i14++) {
                    if (((boolean[]) c13184a.f45698c)[i14] && !c13188e.f45724P.m79274x((C26611e0) c13185b.f45703d.get(i14))) {
                        c13184a.m37075a(false);
                        return;
                    }
                }
                for (int i15 = 0; i15 < 2; i15++) {
                    C26611e0 c26611e0 = (C26611e0) c13185b.f45703d.get(i15);
                    C26611e0 c26611e1 = (C26611e0) c13185b.f45702c.get(i15);
                    if (c13188e.f45724P.m79274x(c26611e0)) {
                        c13188e.f45724P.mo79151h(c26611e0, c26611e1);
                    } else {
                        C13187d c13187d = c13188e.f45724P;
                        C26611e0 c26611e2 = (C26611e0) c13185b.f45702c.get(i15);
                        if (!c13187d.m79274x(c26611e2)) {
                            AbstractC30358d.m92827a(c13187d.mo37080p0(c26611e2, false));
                        }
                    }
                    long j7 = c13185b.f45701b[i15];
                    Long l7 = (Long) c13188e.f45724P.m79271T(c26611e1).f104375e;
                    long jLongValue = l7 != null ? l7.longValue() : 0L;
                    c13185b.f45701b[i15] = jLongValue;
                    c13188e.f45716H = (c13188e.f45716H - j7) + jLongValue;
                }
            }
            c13185b.f45706g = null;
            if (c13185b.f45705f) {
                c13188e.m37084T(c13185b);
                return;
            }
            c13188e.f45717I++;
            C26617h0 c26617h0 = c13188e.f45718J;
            AbstractC22676k.m65747g(c26617h0);
            if (z4 || c13185b.f45704e) {
                c13185b.f45704e = true;
                c26617h0.mo79193S("CLEAN");
                c26617h0.writeByte(32);
                c26617h0.mo79193S(c13185b.f45700a);
                for (long j13 : c13185b.f45701b) {
                    c26617h0.writeByte(32);
                    c26617h0.mo79209h0(j13);
                }
                c26617h0.writeByte(10);
            } else {
                c13188e.f45714F.remove(c13185b.f45700a);
                c26617h0.mo79193S("REMOVE");
                c26617h0.writeByte(32);
                c26617h0.mo79193S(c13185b.f45700a);
                c26617h0.writeByte(10);
            }
            c26617h0.flush();
            if (c13188e.f45716H > c13188e.f45726x) {
                c13188e.m37089m();
            } else if (c13188e.f45717I >= 2000) {
                c13188e.m37089m();
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public static void m37082b0(String str) {
        if (!f45712Q.m125851e(str)) {
            throw new IllegalArgumentException(AbstractC31061c.m95633i('\"', "keys must match regex [a-z0-9_-]{1,120}: \"", str).toString());
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m37083J(String str) throws IOException {
        String strSubstring;
        int iM125887f0 = AbstractC39414r.m125887f0(str, ' ', 0, false, 6);
        if (iM125887f0 == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i13 = iM125887f0 + 1;
        int iM125887f1 = AbstractC39414r.m125887f0(str, ' ', i13, false, 4);
        LinkedHashMap linkedHashMap = this.f45714F;
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
        Object c13185b = linkedHashMap.get(strSubstring);
        if (c13185b == null) {
            c13185b = new C13185b(this, strSubstring);
            linkedHashMap.put(strSubstring, c13185b);
        }
        C13185b c13185b2 = (C13185b) c13185b;
        if (iM125887f1 == -1 || iM125887f0 != 5 || !AbstractC39421y.m125930O(str, "CLEAN", false)) {
            if (iM125887f1 == -1 && iM125887f0 == 5 && AbstractC39421y.m125930O(str, "DIRTY", false)) {
                c13185b2.f45706g = new C13184a(this, c13185b2);
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
        c13185b2.f45704e = true;
        c13185b2.f45706g = null;
        if (listM125905x0.size() != 2) {
            throw new IOException(AbstractC11895b.m31998q("unexpected journal line: ", listM125905x0));
        }
        try {
            int size = listM125905x0.size();
            for (int i14 = 0; i14 < size; i14++) {
                c13185b2.f45701b[i14] = Long.parseLong((String) listM125905x0.get(i14));
            }
        } catch (NumberFormatException unused) {
            throw new IOException(AbstractC11895b.m31998q("unexpected journal line: ", listM125905x0));
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m37084T(C13185b c13185b) {
        C26617h0 c26617h0;
        int i13 = c13185b.f45707h;
        String str = c13185b.f45700a;
        if (i13 > 0 && (c26617h0 = this.f45718J) != null) {
            c26617h0.mo79193S("DIRTY");
            c26617h0.writeByte(32);
            c26617h0.mo79193S(str);
            c26617h0.writeByte(10);
            c26617h0.flush();
        }
        if (c13185b.f45707h > 0 || c13185b.f45706g != null) {
            c13185b.f45705f = true;
            return;
        }
        for (int i14 = 0; i14 < 2; i14++) {
            this.f45724P.m79273s((C26611e0) c13185b.f45702c.get(i14));
            long j7 = this.f45716H;
            long[] jArr = c13185b.f45701b;
            this.f45716H = j7 - jArr[i14];
            jArr[i14] = 0;
        }
        this.f45717I++;
        C26617h0 c26617h1 = this.f45718J;
        if (c26617h1 != null) {
            c26617h1.mo79193S("REMOVE");
            c26617h1.writeByte(32);
            c26617h1.mo79193S(str);
            c26617h1.writeByte(10);
        }
        this.f45714F.remove(str);
        if (this.f45717I >= 2000) {
            m37089m();
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m37085a0() {
        while (this.f45716H > this.f45726x) {
            for (C13185b c13185b : this.f45714F.values()) {
                if (!c13185b.f45705f) {
                    m37084T(c13185b);
                }
            }
            return;
        }
        this.f45722N = false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f45720L && !this.f45721M) {
                for (C13185b c13185b : (C13185b[]) this.f45714F.values().toArray(new C13185b[0])) {
                    C13184a c13184a = c13185b.f45706g;
                    if (c13184a != null) {
                        C13185b c13185b2 = (C13185b) c13184a.f45697b;
                        if (AbstractC22676k.m65745e(c13185b2.f45706g, c13184a)) {
                            c13185b2.f45705f = true;
                        }
                    }
                }
                m37085a0();
                AbstractC3006f0.m8714h(this.f45715G, null);
                C26617h0 c26617h0 = this.f45718J;
                AbstractC22676k.m65747g(c26617h0);
                c26617h0.close();
                this.f45718J = null;
                this.f45721M = true;
                return;
            }
            this.f45721M = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() {
        if (this.f45720L) {
            if (this.f45721M) {
                throw new IllegalStateException("cache is closed");
            }
            m37085a0();
            C26617h0 c26617h0 = this.f45718J;
            AbstractC22676k.m65747g(c26617h0);
            c26617h0.flush();
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized C13184a m37086h(String str) {
        if (this.f45721M) {
            throw new IllegalStateException("cache is closed");
        }
        m37082b0(str);
        m37088k();
        C13185b c13185b = (C13185b) this.f45714F.get(str);
        if ((c13185b != null ? c13185b.f45706g : null) != null) {
            return null;
        }
        if (c13185b != null && c13185b.f45707h != 0) {
            return null;
        }
        if (!this.f45722N && !this.f45723O) {
            C26617h0 c26617h0 = this.f45718J;
            AbstractC22676k.m65747g(c26617h0);
            c26617h0.mo79193S("DIRTY");
            c26617h0.writeByte(32);
            c26617h0.mo79193S(str);
            c26617h0.writeByte(10);
            c26617h0.flush();
            if (this.f45719K) {
                return null;
            }
            if (c13185b == null) {
                c13185b = new C13185b(this, str);
                this.f45714F.put(str, c13185b);
            }
            C13184a c13184a = new C13184a(this, c13185b);
            c13185b.f45706g = c13184a;
            return c13184a;
        }
        m37089m();
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final synchronized C13186c m37087i(String str) {
        C13186c c13186cM37079a;
        if (this.f45721M) {
            throw new IllegalStateException("cache is closed");
        }
        m37082b0(str);
        m37088k();
        C13185b c13185b = (C13185b) this.f45714F.get(str);
        if (c13185b != null && (c13186cM37079a = c13185b.m37079a()) != null) {
            boolean z4 = true;
            this.f45717I++;
            C26617h0 c26617h0 = this.f45718J;
            AbstractC22676k.m65747g(c26617h0);
            c26617h0.mo79193S("READ");
            c26617h0.writeByte(32);
            c26617h0.mo79193S(str);
            c26617h0.writeByte(10);
            if (this.f45717I < 2000) {
                z4 = false;
            }
            if (z4) {
                m37089m();
            }
            return c13186cM37079a;
        }
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m37088k() {
        try {
            if (this.f45720L) {
                return;
            }
            this.f45724P.m79273s(this.f45728z);
            if (this.f45724P.m79274x(this.f45713E)) {
                if (this.f45724P.m79274x(this.f45727y)) {
                    this.f45724P.m79273s(this.f45713E);
                } else {
                    this.f45724P.mo79151h(this.f45713E, this.f45727y);
                }
            }
            if (this.f45724P.m79274x(this.f45727y)) {
                try {
                    m37092x();
                    m37091s();
                    this.f45720L = true;
                    return;
                } catch (IOException unused) {
                    try {
                        close();
                        AbstractC34132o.m107889q(this.f45724P, this.f45725w);
                        this.f45721M = false;
                        m37090o0();
                        this.f45720L = true;
                    } catch (Throwable th3) {
                        this.f45721M = false;
                        throw th3;
                    }
                }
            }
            m37090o0();
            this.f45720L = true;
        } catch (Throwable th4) {
            throw th4;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m37089m() {
        AbstractC3006f0.m8732z(this.f45715G, null, null, new C0150h(this, null, 10), 3);
    }

    /* JADX INFO: renamed from: o0 */
    public final synchronized void m37090o0() {
        Throwable th3;
        try {
            C26617h0 c26617h0 = this.f45718J;
            if (c26617h0 != null) {
                c26617h0.close();
            }
            C26617h0 c26617h0M79157b = AbstractC26604b.m79157b(this.f45724P.mo37080p0(this.f45728z, false));
            try {
                c26617h0M79157b.mo79193S("libcore.io.DiskLruCache");
                c26617h0M79157b.writeByte(10);
                c26617h0M79157b.mo79193S(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
                c26617h0M79157b.writeByte(10);
                c26617h0M79157b.mo79209h0(1);
                c26617h0M79157b.writeByte(10);
                c26617h0M79157b.mo79209h0(2);
                c26617h0M79157b.writeByte(10);
                c26617h0M79157b.writeByte(10);
                for (C13185b c13185b : this.f45714F.values()) {
                    if (c13185b.f45706g != null) {
                        c26617h0M79157b.mo79193S("DIRTY");
                        c26617h0M79157b.writeByte(32);
                        c26617h0M79157b.mo79193S(c13185b.f45700a);
                        c26617h0M79157b.writeByte(10);
                    } else {
                        c26617h0M79157b.mo79193S("CLEAN");
                        c26617h0M79157b.writeByte(32);
                        c26617h0M79157b.mo79193S(c13185b.f45700a);
                        for (long j7 : c13185b.f45701b) {
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
            if (this.f45724P.m79274x(this.f45727y)) {
                this.f45724P.mo79151h(this.f45727y, this.f45713E);
                this.f45724P.mo79151h(this.f45728z, this.f45727y);
                this.f45724P.m79273s(this.f45713E);
            } else {
                this.f45724P.mo79151h(this.f45728z, this.f45727y);
            }
            C13187d c13187d = this.f45724P;
            C26611e0 file = this.f45727y;
            c13187d.getClass();
            AbstractC22676k.m65750j(file, "file");
            this.f45718J = AbstractC26604b.m79157b(new C13189f(c13187d.mo79149b(file), new C0428i(this, 10)));
            this.f45717I = 0;
            this.f45719K = false;
            this.f45723O = false;
        } catch (Throwable th7) {
            throw th7;
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m37091s() {
        Iterator it = this.f45714F.values().iterator();
        long j7 = 0;
        while (it.hasNext()) {
            C13185b c13185b = (C13185b) it.next();
            int i13 = 0;
            if (c13185b.f45706g == null) {
                while (i13 < 2) {
                    j7 += c13185b.f45701b[i13];
                    i13++;
                }
            } else {
                c13185b.f45706g = null;
                while (i13 < 2) {
                    C26611e0 c26611e0 = (C26611e0) c13185b.f45702c.get(i13);
                    C13187d c13187d = this.f45724P;
                    c13187d.m79273s(c26611e0);
                    c13187d.m79273s((C26611e0) c13185b.f45703d.get(i13));
                    i13++;
                }
                it.remove();
            }
        }
        this.f45716H = j7;
    }

    /* JADX INFO: renamed from: x */
    public final void m37092x() throws Throwable {
        C13187d c13187d = this.f45724P;
        C26611e0 file = this.f45727y;
        C26621j0 c26621j0M79158c = AbstractC26604b.m79158c(c13187d.mo79155x0(file));
        try {
            String strMo79187M = c26621j0M79158c.mo79187M(Long.MAX_VALUE);
            String strMo79187M2 = c26621j0M79158c.mo79187M(Long.MAX_VALUE);
            String strMo79187M3 = c26621j0M79158c.mo79187M(Long.MAX_VALUE);
            String strMo79187M4 = c26621j0M79158c.mo79187M(Long.MAX_VALUE);
            String strMo79187M5 = c26621j0M79158c.mo79187M(Long.MAX_VALUE);
            if (!"libcore.io.DiskLruCache".equals(strMo79187M) || !UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE.equals(strMo79187M2) || !AbstractC22676k.m65745e(String.valueOf(1), strMo79187M3) || !AbstractC22676k.m65745e(String.valueOf(2), strMo79187M4) || strMo79187M5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strMo79187M + ", " + strMo79187M2 + ", " + strMo79187M3 + ", " + strMo79187M4 + ", " + strMo79187M5 + ']');
            }
            int i13 = 0;
            while (true) {
                try {
                    m37083J(c26621j0M79158c.mo79187M(Long.MAX_VALUE));
                    i13++;
                } catch (EOFException unused) {
                    this.f45717I = i13 - this.f45714F.size();
                    if (c26621j0M79158c.mo79222o()) {
                        c13187d.getClass();
                        AbstractC22676k.m65750j(file, "file");
                        this.f45718J = AbstractC26604b.m79157b(new C13189f(c13187d.mo79149b(file), new C0428i(this, 10)));
                    } else {
                        m37090o0();
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
