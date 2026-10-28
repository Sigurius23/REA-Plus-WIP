package lu;

import as.C1937a;
import com.whoop.service.network.model.UserSessionDto;
import io.getstream.chat.android.p226ui.common.utils.AttachmentConstants;
import io.seon.androidsdk.service.CallableC20673j;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p014aj.C0926a;
import p031b9.C2817b;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: lu.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C24741c implements Closeable {

    /* JADX INFO: renamed from: O */
    public static final Pattern f96739O = Pattern.compile("[a-z0-9_-]{1,64}");

    /* JADX INFO: renamed from: P */
    public static final C1937a f96740P = new C1937a(1);

    /* JADX INFO: renamed from: I */
    public BufferedWriter f96745I;

    /* JADX INFO: renamed from: K */
    public int f96747K;

    /* JADX INFO: renamed from: w */
    public final File f96751w;

    /* JADX INFO: renamed from: x */
    public final File f96752x;

    /* JADX INFO: renamed from: y */
    public final File f96753y;

    /* JADX INFO: renamed from: z */
    public final File f96754z;

    /* JADX INFO: renamed from: H */
    public long f96744H = 0;

    /* JADX INFO: renamed from: J */
    public final LinkedHashMap f96746J = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: L */
    public long f96748L = 0;

    /* JADX INFO: renamed from: M */
    public final ThreadPoolExecutor f96749M = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: N */
    public final CallableC20673j f96750N = new CallableC20673j(this, 1);

    /* JADX INFO: renamed from: E */
    public final int f96741E = 2;

    /* JADX INFO: renamed from: G */
    public final int f96743G = 2;

    /* JADX INFO: renamed from: F */
    public final long f96742F = AttachmentConstants.MAX_SIZE_BEFORE_DOWNLOAD_WARNING_IN_BYTES;

    public C24741c(File file) {
        this.f96751w = file;
        this.f96752x = new File(file, "journal");
        this.f96753y = new File(file, "journal.tmp");
        this.f96754z = new File(file, "journal.bkp");
    }

    /* JADX INFO: renamed from: b */
    public static void m72434b(C24741c c24741c, C2817b c2817b, boolean z4) {
        synchronized (c24741c) {
            C24740b c24740b = (C24740b) c2817b.f11024y;
            if (c24740b.f96737d != c2817b) {
                throw new IllegalStateException();
            }
            if (z4 && !c24740b.f96736c) {
                for (int i13 = 0; i13 < c24741c.f96743G; i13++) {
                    if (!((boolean[]) c2817b.f11025z)[i13]) {
                        c2817b.m8004a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i13);
                    }
                    if (!c24740b.m72432b(i13).exists()) {
                        c2817b.m8004a();
                        return;
                    }
                }
            }
            for (int i14 = 0; i14 < c24741c.f96743G; i14++) {
                File fileM72432b = c24740b.m72432b(i14);
                if (!z4) {
                    m72435h(fileM72432b);
                } else if (fileM72432b.exists()) {
                    File fileM72431a = c24740b.m72431a(i14);
                    fileM72432b.renameTo(fileM72431a);
                    long j7 = c24740b.f96735b[i14];
                    long length = fileM72431a.length();
                    c24740b.f96735b[i14] = length;
                    c24741c.f96744H = (c24741c.f96744H - j7) + length;
                }
            }
            c24741c.f96747K++;
            c24740b.f96737d = null;
            if (c24740b.f96736c || z4) {
                c24740b.f96736c = true;
                c24741c.f96745I.write("CLEAN " + c24740b.f96734a + c24740b.m72433c() + '\n');
                if (z4) {
                    c24741c.f96748L++;
                }
            } else {
                c24741c.f96746J.remove(c24740b.f96734a);
                c24741c.f96745I.write("REMOVE " + c24740b.f96734a + '\n');
            }
            c24741c.f96745I.flush();
            if (c24741c.f96744H > c24741c.f96742F || c24741c.m72445m()) {
                c24741c.f96749M.submit(c24741c.f96750N);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m72435h(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static void m72436o0(File file, File file2, boolean z4) throws IOException {
        if (z4) {
            m72435h(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: renamed from: s */
    public static C24741c m72437s(File file) throws IOException {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m72436o0(file2, file3, false);
            }
        }
        C24741c c24741c = new C24741c(file);
        File file4 = c24741c.f96752x;
        if (file4.exists()) {
            try {
                c24741c.m72439J();
                c24741c.m72447x();
                c24741c.f96745I = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file4, true), AbstractC24744f.f96763a));
                return c24741c;
            } catch (IOException e5) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e5.getMessage() + ", removing");
                c24741c.close();
                AbstractC24744f.m72451b(c24741c.f96751w);
            }
        }
        file.mkdirs();
        C24741c c24741c2 = new C24741c(file);
        c24741c2.m72441a0();
        return c24741c2;
    }

    /* JADX INFO: renamed from: x0 */
    public static void m72438x0(String str) {
        if (!f96739O.matcher(str).matches()) {
            throw new IllegalArgumentException(AbstractC11895b.m31996o("keys must match regex [a-z0-9_-]{1,64}: \"", str, "\""));
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m72439J() {
        C24743e c24743e = new C24743e(new FileInputStream(this.f96752x), AbstractC24744f.f96763a, 0);
        try {
            String strM72449h = c24743e.m72449h();
            String strM72449h2 = c24743e.m72449h();
            String strM72449h3 = c24743e.m72449h();
            String strM72449h4 = c24743e.m72449h();
            String strM72449h5 = c24743e.m72449h();
            if (!"libcore.io.DiskLruCache".equals(strM72449h) || !UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE.equals(strM72449h2) || !Integer.toString(this.f96741E).equals(strM72449h3) || !Integer.toString(this.f96743G).equals(strM72449h4) || !"".equals(strM72449h5)) {
                throw new IOException("unexpected journal header: [" + strM72449h + ", " + strM72449h2 + ", " + strM72449h4 + ", " + strM72449h5 + "]");
            }
            int i13 = 0;
            while (true) {
                try {
                    m72440T(c24743e.m72449h());
                    i13++;
                } catch (EOFException unused) {
                    this.f96747K = i13 - this.f96746J.size();
                    AbstractC24744f.m72450a(c24743e);
                    return;
                }
            }
        } catch (Throwable th3) {
            AbstractC24744f.m72450a(c24743e);
            throw th3;
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m72440T(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i13 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i13);
        LinkedHashMap linkedHashMap = this.f96746J;
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i13);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                linkedHashMap.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i13, iIndexOf2);
        }
        C24740b c24740b = (C24740b) linkedHashMap.get(strSubstring);
        if (c24740b == null) {
            c24740b = new C24740b(this, strSubstring);
            linkedHashMap.put(strSubstring, c24740b);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                c24740b.f96737d = new C2817b(this, c24740b);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
        c24740b.f96736c = true;
        c24740b.f96737d = null;
        if (strArrSplit.length != c24740b.f96738e.f96743G) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i14 = 0; i14 < strArrSplit.length; i14++) {
            try {
                c24740b.f96735b[i14] = Long.parseLong(strArrSplit[i14]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final synchronized void m72441a0() {
        try {
            BufferedWriter bufferedWriter = this.f96745I;
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f96753y), AbstractC24744f.f96763a));
            try {
                bufferedWriter2.write("libcore.io.DiskLruCache");
                bufferedWriter2.write("\n");
                bufferedWriter2.write(UserSessionDto.NEEDS_PROFILE_COMPLETION_TRUE);
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f96741E));
                bufferedWriter2.write("\n");
                bufferedWriter2.write(Integer.toString(this.f96743G));
                bufferedWriter2.write("\n");
                bufferedWriter2.write("\n");
                for (C24740b c24740b : this.f96746J.values()) {
                    if (c24740b.f96737d != null) {
                        bufferedWriter2.write("DIRTY " + c24740b.f96734a + '\n');
                    } else {
                        bufferedWriter2.write("CLEAN " + c24740b.f96734a + c24740b.m72433c() + '\n');
                    }
                }
                bufferedWriter2.close();
                if (this.f96752x.exists()) {
                    m72436o0(this.f96752x, this.f96754z, true);
                }
                m72436o0(this.f96753y, this.f96752x, false);
                this.f96754z.delete();
                this.f96745I = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f96752x, true), AbstractC24744f.f96763a));
            } catch (Throwable th3) {
                bufferedWriter2.close();
                throw th3;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final synchronized void m72442b0(String str) {
        try {
            if (this.f96745I == null) {
                throw new IllegalStateException("cache is closed");
            }
            m72438x0(str);
            C24740b c24740b = (C24740b) this.f96746J.get(str);
            if (c24740b != null && c24740b.f96737d == null) {
                for (int i13 = 0; i13 < this.f96743G; i13++) {
                    File fileM72431a = c24740b.m72431a(i13);
                    if (fileM72431a.exists() && !fileM72431a.delete()) {
                        throw new IOException("failed to delete " + fileM72431a);
                    }
                    long j7 = this.f96744H;
                    long[] jArr = c24740b.f96735b;
                    this.f96744H = j7 - jArr[i13];
                    jArr[i13] = 0;
                }
                this.f96747K++;
                this.f96745I.append((CharSequence) ("REMOVE " + str + '\n'));
                this.f96746J.remove(str);
                if (m72445m()) {
                    this.f96749M.submit(this.f96750N);
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.f96745I == null) {
                return;
            }
            Iterator it = new ArrayList(this.f96746J.values()).iterator();
            while (it.hasNext()) {
                C2817b c2817b = ((C24740b) it.next()).f96737d;
                if (c2817b != null) {
                    c2817b.m8004a();
                }
            }
            m72446p0();
            this.f96745I.close();
            this.f96745I = null;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: renamed from: i */
    public final C2817b m72443i(String str) {
        synchronized (this) {
            try {
                if (this.f96745I == null) {
                    throw new IllegalStateException("cache is closed");
                }
                m72438x0(str);
                C24740b c24740b = (C24740b) this.f96746J.get(str);
                if (c24740b == null) {
                    c24740b = new C24740b(this, str);
                    this.f96746J.put(str, c24740b);
                } else if (c24740b.f96737d != null) {
                    return null;
                }
                C2817b c2817b = new C2817b(this, c24740b);
                c24740b.f96737d = c2817b;
                this.f96745I.write("DIRTY " + str + '\n');
                this.f96745I.flush();
                return c2817b;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final synchronized C0926a m72444k(String str) {
        InputStream inputStream;
        if (this.f96745I == null) {
            throw new IllegalStateException("cache is closed");
        }
        m72438x0(str);
        C24740b c24740b = (C24740b) this.f96746J.get(str);
        if (c24740b == null) {
            return null;
        }
        if (!c24740b.f96736c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f96743G];
        for (int i13 = 0; i13 < this.f96743G; i13++) {
            try {
                inputStreamArr[i13] = new FileInputStream(c24740b.m72431a(i13));
            } catch (FileNotFoundException unused) {
                for (int i14 = 0; i14 < this.f96743G && (inputStream = inputStreamArr[i14]) != null; i14++) {
                    AbstractC24744f.m72450a(inputStream);
                }
                return null;
            }
        }
        this.f96747K++;
        this.f96745I.append((CharSequence) ("READ " + str + '\n'));
        if (m72445m()) {
            this.f96749M.submit(this.f96750N);
        }
        return new C0926a(inputStreamArr, 1);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m72445m() {
        int i13 = this.f96747K;
        return i13 >= 2000 && i13 >= this.f96746J.size();
    }

    /* JADX INFO: renamed from: p0 */
    public final void m72446p0() {
        while (this.f96744H > this.f96742F) {
            m72442b0((String) ((Map.Entry) this.f96746J.entrySet().iterator().next()).getKey());
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m72447x() throws IOException {
        m72435h(this.f96753y);
        Iterator it = this.f96746J.values().iterator();
        while (it.hasNext()) {
            C24740b c24740b = (C24740b) it.next();
            C2817b c2817b = c24740b.f96737d;
            int i13 = this.f96743G;
            int i14 = 0;
            if (c2817b == null) {
                while (i14 < i13) {
                    this.f96744H += c24740b.f96735b[i14];
                    i14++;
                }
            } else {
                c24740b.f96737d = null;
                while (i14 < i13) {
                    m72435h(c24740b.m72431a(i14));
                    m72435h(c24740b.m72432b(i14));
                    i14++;
                }
                it.remove();
            }
        }
    }
}
