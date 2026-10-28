package tk;

import android.os.StrictMode;
import com.whoop.service.network.model.UserSessionDto;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import lu.C24743e;
import p031b9.C2817b;
import q30.C29934u0;

/* JADX INFO: renamed from: tk.d */
/* JADX INFO: loaded from: classes.dex */
public final class C33873d implements Closeable {

    /* JADX INFO: renamed from: F */
    public final long f141878F;

    /* JADX INFO: renamed from: I */
    public BufferedWriter f141881I;

    /* JADX INFO: renamed from: K */
    public int f141883K;

    /* JADX INFO: renamed from: w */
    public final File f141887w;

    /* JADX INFO: renamed from: x */
    public final File f141888x;

    /* JADX INFO: renamed from: y */
    public final File f141889y;

    /* JADX INFO: renamed from: z */
    public final File f141890z;

    /* JADX INFO: renamed from: H */
    public long f141880H = 0;

    /* JADX INFO: renamed from: J */
    public final LinkedHashMap f141882J = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: L */
    public long f141884L = 0;

    /* JADX INFO: renamed from: M */
    public final ThreadPoolExecutor f141885M = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC33871b());

    /* JADX INFO: renamed from: N */
    public final CallableC33870a f141886N = new CallableC33870a(this);

    /* JADX INFO: renamed from: E */
    public final int f141877E = 1;

    /* JADX INFO: renamed from: G */
    public final int f141879G = 1;

    public C33873d(File file, long j7) {
        this.f141887w = file;
        this.f141888x = new File(file, "journal");
        this.f141889y = new File(file, "journal.tmp");
        this.f141890z = new File(file, "journal.bkp");
        this.f141878F = j7;
    }

    /* JADX INFO: renamed from: J */
    public static C33873d m107109J(File file, long j7) throws IOException {
        if (j7 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m107114p0(file2, file3, false);
            }
        }
        C33873d c33873d = new C33873d(file, j7);
        if (c33873d.f141888x.exists()) {
            try {
                c33873d.m107116a0();
                c33873d.m107115T();
                return c33873d;
            } catch (IOException e5) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e5.getMessage() + ", removing");
                c33873d.close();
                AbstractC33874e.m107123a(c33873d.f141887w);
            }
        }
        file.mkdirs();
        C33873d c33873d2 = new C33873d(file, j7);
        c33873d2.m107119o0();
        return c33873d2;
    }

    /* JADX INFO: renamed from: b */
    public static void m107110b(C33873d c33873d, C2817b c2817b, boolean z4) {
        synchronized (c33873d) {
            C33872c c33872cM8000c = C2817b.m8000c(c2817b);
            if (c33872cM8000c.f141875f != c2817b) {
                throw new IllegalStateException();
            }
            if (z4 && !c33872cM8000c.f141874e) {
                for (int i13 = 0; i13 < c33873d.f141879G; i13++) {
                    if (!C2817b.m8001d(c2817b)[i13]) {
                        c2817b.m8004a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i13);
                    }
                    if (!c33872cM8000c.m107107j(i13).exists()) {
                        c2817b.m8004a();
                        return;
                    }
                }
            }
            for (int i14 = 0; i14 < c33873d.f141879G; i14++) {
                File fileM107107j = c33872cM8000c.m107107j(i14);
                if (!z4) {
                    m107112i(fileM107107j);
                } else if (fileM107107j.exists()) {
                    File fileM107106i = c33872cM8000c.m107106i(i14);
                    fileM107107j.renameTo(fileM107106i);
                    long j7 = c33872cM8000c.f141871b[i14];
                    long length = fileM107106i.length();
                    c33872cM8000c.f141871b[i14] = length;
                    c33873d.f141880H = (c33873d.f141880H - j7) + length;
                }
            }
            c33873d.f141883K++;
            c33872cM8000c.f141875f = null;
            if (c33872cM8000c.f141874e || z4) {
                c33872cM8000c.f141874e = true;
                c33873d.f141881I.append((CharSequence) "CLEAN");
                c33873d.f141881I.append(' ');
                c33873d.f141881I.append((CharSequence) c33872cM8000c.f141870a);
                c33873d.f141881I.append((CharSequence) c33872cM8000c.m107108k());
                c33873d.f141881I.append('\n');
                if (z4) {
                    c33873d.f141884L = 1 + c33873d.f141884L;
                    c33872cM8000c.getClass();
                }
            } else {
                c33873d.f141882J.remove(c33872cM8000c.f141870a);
                c33873d.f141881I.append((CharSequence) "REMOVE");
                c33873d.f141881I.append(' ');
                c33873d.f141881I.append((CharSequence) c33872cM8000c.f141870a);
                c33873d.f141881I.append('\n');
            }
            m107113m(c33873d.f141881I);
            if (c33873d.f141880H > c33873d.f141878F || c33873d.m107121x()) {
                c33873d.f141885M.submit(c33873d.f141886N);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m107111h(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m107112i(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: m */
    public static void m107113m(BufferedWriter bufferedWriter) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            bufferedWriter.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static void m107114p0(File file, File file2, boolean z4) throws IOException {
        if (z4) {
            m107112i(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m107115T() throws IOException {
        m107112i(this.f141889y);
        Iterator it = this.f141882J.values().iterator();
        while (it.hasNext()) {
            C33872c c33872c = (C33872c) it.next();
            C2817b c2817b = c33872c.f141875f;
            int i13 = this.f141879G;
            int i14 = 0;
            if (c2817b == null) {
                while (i14 < i13) {
                    this.f141880H += c33872c.f141871b[i14];
                    i14++;
                }
            } else {
                c33872c.f141875f = null;
                while (i14 < i13) {
                    m107112i(c33872c.m107106i(i14));
                    m107112i(c33872c.m107107j(i14));
                    i14++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m107116a0() {
        File file = this.f141888x;
        C24743e c24743e = new C24743e(new FileInputStream(file), AbstractC33874e.f141891a, 1);
        try {
            String strM72449h = c24743e.m72449h();
            String strM72449h2 = c24743e.m72449h();
            String strM72449h3 = c24743e.m72449h();
            String strM72449h4 = c24743e.m72449h();
            String strM72449h5 = c24743e.m72449h();
            if (!"libcore.io.DiskLruCache".equals(strM72449h) || !UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE.equals(strM72449h2) || !Integer.toString(this.f141877E).equals(strM72449h3) || !Integer.toString(this.f141879G).equals(strM72449h4) || !"".equals(strM72449h5)) {
                throw new IOException("unexpected journal header: [" + strM72449h + ", " + strM72449h2 + ", " + strM72449h4 + ", " + strM72449h5 + "]");
            }
            int i13 = 0;
            while (true) {
                try {
                    m107117b0(c24743e.m72449h());
                    i13++;
                } catch (EOFException unused) {
                    this.f141883K = i13 - this.f141882J.size();
                    if (c24743e.m72448b()) {
                        m107119o0();
                    } else {
                        this.f141881I = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), AbstractC33874e.f141891a));
                    }
                    try {
                        c24743e.close();
                        return;
                    } catch (RuntimeException e5) {
                        throw e5;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th3) {
            try {
                c24743e.close();
            } catch (RuntimeException e13) {
                throw e13;
            } catch (Exception unused3) {
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m107117b0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i13 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i13);
        LinkedHashMap linkedHashMap = this.f141882J;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i13);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i13, iIndexOf2);
        }
        C33872c c33872c = (C33872c) linkedHashMap.get(strSubstring);
        if (c33872c == null) {
            c33872c = new C33872c(this, strSubstring);
            linkedHashMap.put(strSubstring, c33872c);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            c33872c.f141874e = true;
            c33872c.f141875f = null;
            C33872c.m107105h(c33872c, strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            c33872c.f141875f = new C2817b(this, c33872c);
        } else if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f141881I == null) {
                return;
            }
            for (C33872c c33872c : new ArrayList(this.f141882J.values())) {
                if (c33872c.f141875f != null) {
                    c33872c.f141875f.m8004a();
                }
            }
            m107122x0();
            m107111h(this.f141881I);
            this.f141881I = null;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: k */
    public final C2817b m107118k(String str) {
        synchronized (this) {
            try {
                if (this.f141881I == null) {
                    throw new IllegalStateException("cache is closed");
                }
                C33872c c33872c = (C33872c) this.f141882J.get(str);
                if (c33872c == null) {
                    c33872c = new C33872c(this, str);
                    this.f141882J.put(str, c33872c);
                } else if (c33872c.f141875f != null) {
                    return null;
                }
                C2817b c2817b = new C2817b(this, c33872c);
                c33872c.f141875f = c2817b;
                this.f141881I.append((CharSequence) "DIRTY");
                this.f141881I.append(' ');
                this.f141881I.append((CharSequence) str);
                this.f141881I.append('\n');
                m107113m(this.f141881I);
                return c2817b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final synchronized void m107119o0() {
        try {
            BufferedWriter bufferedWriter = this.f141881I;
            if (bufferedWriter != null) {
                m107111h(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f141889y), AbstractC33874e.f141891a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f141877E));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f141879G));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C33872c c33872c : this.f141882J.values()) {
                    if (c33872c.f141875f != null) {
                        bufferedWriter2.write("DIRTY " + c33872c.f141870a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c33872c.f141870a + c33872c.m107108k() + '\n');
                    }
                }
                m107111h(bufferedWriter2);
                if (this.f141888x.exists()) {
                    m107114p0(this.f141888x, this.f141890z, true);
                }
                m107114p0(this.f141889y, this.f141888x, false);
                this.f141890z.delete();
                this.f141881I = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f141888x, true), AbstractC33874e.f141891a));
            } catch (Throwable th3) {
                m107111h(bufferedWriter2);
                throw th3;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    /* JADX INFO: renamed from: s */
    public final synchronized C29934u0 m107120s(String str) {
        if (this.f141881I == null) {
            throw new IllegalStateException("cache is closed");
        }
        C33872c c33872c = (C33872c) this.f141882J.get(str);
        if (c33872c == null) {
            return null;
        }
        if (!c33872c.f141874e) {
            return null;
        }
        for (File file : c33872c.f141872c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f141883K++;
        this.f141881I.append((CharSequence) "READ");
        this.f141881I.append(' ');
        this.f141881I.append((CharSequence) str);
        this.f141881I.append('\n');
        if (m107121x()) {
            this.f141885M.submit(this.f141886N);
        }
        return new C29934u0(c33872c.f141872c, 22);
    }

    /* JADX INFO: renamed from: x */
    public final boolean m107121x() {
        int i13 = this.f141883K;
        return i13 >= 2000 && i13 >= this.f141882J.size();
    }

    /* JADX INFO: renamed from: x0 */
    public final void m107122x0() {
        while (this.f141880H > this.f141878F) {
            String str = (String) ((Map.Entry) this.f141882J.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.f141881I == null) {
                        throw new IllegalStateException("cache is closed");
                    }
                    C33872c c33872c = (C33872c) this.f141882J.get(str);
                    if (c33872c != null && c33872c.f141875f == null) {
                        for (int i13 = 0; i13 < this.f141879G; i13++) {
                            File fileM107106i = c33872c.m107106i(i13);
                            if (fileM107106i.exists() && !fileM107106i.delete()) {
                                throw new IOException("failed to delete " + fileM107106i);
                            }
                            this.f141880H -= c33872c.f141871b[i13];
                            c33872c.f141871b[i13] = 0;
                        }
                        this.f141883K++;
                        this.f141881I.append((CharSequence) "REMOVE");
                        this.f141881I.append(' ');
                        this.f141881I.append((CharSequence) str);
                        this.f141881I.append('\n');
                        this.f141882J.remove(str);
                        if (m107121x()) {
                            this.f141885M.submit(this.f141886N);
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }
}
