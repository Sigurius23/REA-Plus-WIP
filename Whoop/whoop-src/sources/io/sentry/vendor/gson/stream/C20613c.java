package io.sentry.vendor.gson.stream;

import com.whoop.data.remote.domain.dto.DateTimeRange;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: renamed from: io.sentry.vendor.gson.stream.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C20613c implements Closeable, Flushable {

    /* JADX INFO: renamed from: I */
    public static final String[] f77143I = new String[128];

    /* JADX INFO: renamed from: E */
    public String f77144E;

    /* JADX INFO: renamed from: F */
    public boolean f77145F;

    /* JADX INFO: renamed from: G */
    public String f77146G;

    /* JADX INFO: renamed from: H */
    public final boolean f77147H;

    /* JADX INFO: renamed from: w */
    public final Writer f77148w;

    /* JADX INFO: renamed from: x */
    public int[] f77149x;

    /* JADX INFO: renamed from: y */
    public int f77150y;

    /* JADX INFO: renamed from: z */
    public String f77151z;

    static {
        for (int i13 = 0; i13 <= 31; i13++) {
            f77143I[i13] = String.format("\\u%04x", Integer.valueOf(i13));
        }
        String[] strArr = f77143I;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C20613c(Writer writer) {
        int[] iArr = new int[32];
        this.f77149x = iArr;
        this.f77150y = 0;
        if (iArr.length == 0) {
            this.f77149x = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f77149x;
        int i13 = this.f77150y;
        this.f77150y = i13 + 1;
        iArr2[i13] = 6;
        this.f77144E = ":";
        this.f77147H = true;
        this.f77148w = writer;
    }

    /* JADX INFO: renamed from: b */
    public final void m56751b() throws IOException {
        int iM56755m = m56755m();
        if (iM56755m == 1) {
            this.f77149x[this.f77150y - 1] = 2;
            m56753i();
            return;
        }
        Writer writer = this.f77148w;
        if (iM56755m == 2) {
            writer.append(DateTimeRange.lowerUpperDelimiter);
            m56753i();
        } else {
            if (iM56755m == 4) {
                writer.append((CharSequence) this.f77144E);
                this.f77149x[this.f77150y - 1] = 5;
                return;
            }
            if (iM56755m != 6) {
                if (iM56755m != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f77145F) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f77149x[this.f77150y - 1] = 7;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f77148w.close();
        int i13 = this.f77150y;
        if (i13 > 1 || (i13 == 1 && this.f77149x[i13 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f77150y = 0;
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        if (this.f77150y == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f77148w.flush();
    }

    /* JADX INFO: renamed from: h */
    public final void m56752h(int i13, int i14, char c3) throws IOException {
        int iM56755m = m56755m();
        if (iM56755m != i14 && iM56755m != i13) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f77146G != null) {
            throw new IllegalStateException("Dangling name: " + this.f77146G);
        }
        this.f77150y--;
        if (iM56755m == i14) {
            m56753i();
        }
        this.f77148w.write(c3);
    }

    /* JADX INFO: renamed from: i */
    public final void m56753i() throws IOException {
        if (this.f77151z == null) {
            return;
        }
        Writer writer = this.f77148w;
        writer.write(10);
        int i13 = this.f77150y;
        for (int i14 = 1; i14 < i13; i14++) {
            writer.write(this.f77151z);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m56754k() throws IOException {
        if (this.f77146G != null) {
            if (!this.f77147H) {
                this.f77146G = null;
                return;
            }
            m56757x();
        }
        m56751b();
        this.f77148w.write("null");
    }

    /* JADX INFO: renamed from: m */
    public final int m56755m() {
        int i13 = this.f77150y;
        if (i13 != 0) {
            return this.f77149x[i13 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX INFO: renamed from: s */
    public final void m56756s(String str) throws IOException {
        String str2;
        Writer writer = this.f77148w;
        writer.write(34);
        int length = str.length();
        int i13 = 0;
        for (int i14 = 0; i14 < length; i14++) {
            char cCharAt = str.charAt(i14);
            if (cCharAt < 128) {
                str2 = f77143I[cCharAt];
                if (str2 != null) {
                    if (i13 < i14) {
                        writer.write(str, i13, i14 - i13);
                    }
                    writer.write(str2);
                    i13 = i14 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i13 < i14) {
                    writer.write(str, i13, i14 - i13);
                }
                writer.write(str2);
                i13 = i14 + 1;
            }
        }
        if (i13 < length) {
            writer.write(str, i13, length - i13);
        }
        writer.write(34);
    }

    /* JADX INFO: renamed from: x */
    public final void m56757x() throws IOException {
        if (this.f77146G != null) {
            int iM56755m = m56755m();
            if (iM56755m == 5) {
                this.f77148w.write(44);
            } else if (iM56755m != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m56753i();
            this.f77149x[this.f77150y - 1] = 4;
            m56756s(this.f77146G);
            this.f77146G = null;
        }
    }
}
