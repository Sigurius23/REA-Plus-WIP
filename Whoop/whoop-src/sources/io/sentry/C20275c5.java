package io.sentry;

import com.iterable.iterableapi.CallableC5351m1;
import com.iterable.iterableapi.CallableC5355n1;
import ge3.AbstractC15751g;
import io.sentry.clientreport.C20294b;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.protocol.C20473d0;
import io.sentry.protocol.profiling.C20493a;
import io.sentry.vendor.AbstractC20609a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import p088dc.AbstractC11895b;
import p581we.C37199o;
import pf.AbstractC29125c;

/* JADX INFO: renamed from: io.sentry.c5 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20275c5 {

    /* JADX INFO: renamed from: d */
    public static final Charset f76146d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a */
    public final C20312d5 f76147a;

    /* JADX INFO: renamed from: b */
    public final Callable f76148b;

    /* JADX INFO: renamed from: c */
    public byte[] f76149c;

    public C20275c5(C20312d5 c20312d5, byte[] bArr) {
        this.f76147a = c20312d5;
        this.f76149c = bArr;
        this.f76148b = null;
    }

    /* JADX INFO: renamed from: a */
    public static void m56241a(long j7, long j13, String str) throws SentryEnvelopeException {
        if (j7 > j13) {
            throw new SentryEnvelopeException(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j7), Long.valueOf(j13)));
        }
    }

    /* JADX INFO: renamed from: b */
    public static C20275c5 m56242b(InterfaceC20390j1 interfaceC20390j1, C20294b c20294b) {
        AbstractC29125c.m88510S(interfaceC20390j1, "ISerializer is required.");
        C37199o c37199o = new C37199o(new CallableC5355n1(3, interfaceC20390j1, c20294b));
        return new C20275c5(new C20312d5(EnumC20424m5.resolve(c20294b), new CallableC20627x4(c37199o, 7), "application/json", null, null), new CallableC20627x4(c37199o, 8));
    }

    /* JADX INFO: renamed from: c */
    public static C20275c5 m56243c(final C20457p3 c20457p3, final InterfaceC20390j1 interfaceC20390j1, final InterfaceC20042a1 interfaceC20042a1) {
        final File file = c20457p3.f76562K;
        C37199o c37199o = new C37199o(new Callable() { // from class: io.sentry.b5
            @Override // java.util.concurrent.Callable
            public final Object call() throws SentryEnvelopeException {
                InterfaceC20390j1 interfaceC20390j2 = interfaceC20390j1;
                File file2 = file;
                C20457p3 c20457p4 = c20457p3;
                if (file2 != null) {
                    if (!file2.exists()) {
                        throw new SentryEnvelopeException(AbstractC11895b.m31996o("Dropping profile chunk, because the file '", file2.getName(), "' doesn't exists"));
                    }
                    if ("java".equals(c20457p4.f76557F)) {
                        C20574u2 c20574u2 = C20574u2.f77059a;
                        InterfaceC20042a1 interfaceC20042a2 = interfaceC20042a1;
                        if (c20574u2.equals(interfaceC20042a2)) {
                            throw new SentryEnvelopeException("No ProfileConverter available, dropping chunk.");
                        }
                        try {
                            file2.getAbsolutePath();
                            ((C20574u2) interfaceC20042a2).getClass();
                            c20457p4.f76564M = new C20493a();
                        } catch (Exception e5) {
                            throw new SentryEnvelopeException("Profile conversion failed", e5);
                        }
                    } else {
                        String strM56731b = AbstractC20609a.m56731b(AbstractC15751g.m44435O(52428800L, file2.getPath()));
                        if (strM56731b.isEmpty()) {
                            throw new SentryEnvelopeException("Profiling trace file is empty");
                        }
                        c20457p4.f76563L = strM56731b;
                    }
                }
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C20275c5.f76146d));
                            try {
                                interfaceC20390j2.mo56235a(bufferedWriter, c20457p4);
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                bufferedWriter.close();
                                byteArrayOutputStream.close();
                                if (file2 != null) {
                                    file2.delete();
                                }
                                return byteArray;
                            } catch (Throwable th3) {
                                try {
                                    bufferedWriter.close();
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } catch (Throwable th5) {
                            try {
                                byteArrayOutputStream.close();
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (IOException e13) {
                        throw new SentryEnvelopeException("Failed to serialize profile chunk\n" + e13.getMessage());
                    }
                } catch (Throwable th7) {
                    if (file2 != null) {
                        file2.delete();
                    }
                    throw th7;
                }
            }
        });
        return new C20275c5(new C20312d5(EnumC20424m5.ProfileChunk, new CallableC20627x4(c37199o, 12), "application-json", file != null ? file.getName() : null, (String) null, c20457p3.f76557F, (Integer) null), new CallableC20627x4(c37199o, 13));
    }

    /* JADX INFO: renamed from: d */
    public static C20275c5 m56244d(InterfaceC20390j1 interfaceC20390j1, C20265b7 c20265b7) {
        AbstractC29125c.m88510S(interfaceC20390j1, "ISerializer is required.");
        AbstractC29125c.m88510S(c20265b7, "Session is required.");
        C37199o c37199o = new C37199o(new CallableC5351m1(2, interfaceC20390j1, c20265b7));
        return new C20275c5(new C20312d5(EnumC20424m5.Session, new CallableC20643z4(c37199o, 2), "application/json", null, null), new CallableC20643z4(c37199o, 3));
    }

    /* JADX INFO: renamed from: j */
    public static byte[] m56245j(LinkedHashMap linkedHashMap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (linkedHashMap.size() | 128));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(f76146d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] bArr = (byte[]) entry.getValue();
                int length2 = bArr.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: e */
    public final C20294b m56246e(InterfaceC20390j1 interfaceC20390j1) throws IOException {
        C20312d5 c20312d5 = this.f76147a;
        if (c20312d5 == null || c20312d5.f76265E != EnumC20424m5.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m56247f()), f76146d));
        try {
            C20294b c20294b = (C20294b) interfaceC20390j1.mo56239e(bufferedReader, C20294b.class);
            bufferedReader.close();
            return c20294b;
        } catch (Throwable th3) {
            try {
                bufferedReader.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: f */
    public final byte[] m56247f() {
        Callable callable;
        if (this.f76149c == null && (callable = this.f76148b) != null) {
            this.f76149c = (byte[]) callable.call();
        }
        return this.f76149c;
    }

    /* JADX INFO: renamed from: g */
    public final C20541s5 m56248g(InterfaceC20390j1 interfaceC20390j1) throws IOException {
        C20312d5 c20312d5 = this.f76147a;
        if (c20312d5 == null || c20312d5.f76265E != EnumC20424m5.Log) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m56247f()), f76146d));
        try {
            C20541s5 c20541s5 = (C20541s5) interfaceC20390j1.mo56239e(bufferedReader, C20541s5.class);
            bufferedReader.close();
            return c20541s5;
        } catch (Throwable th3) {
            try {
                bufferedReader.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: h */
    public final C20620w5 m56249h(InterfaceC20390j1 interfaceC20390j1) throws IOException {
        C20312d5 c20312d5 = this.f76147a;
        if (c20312d5 == null || c20312d5.f76265E != EnumC20424m5.TraceMetric) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m56247f()), f76146d));
        try {
            C20620w5 c20620w5 = (C20620w5) interfaceC20390j1.mo56239e(bufferedReader, C20620w5.class);
            bufferedReader.close();
            return c20620w5;
        } catch (Throwable th3) {
            try {
                bufferedReader.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: i */
    public final C20473d0 m56250i(InterfaceC20390j1 interfaceC20390j1) throws IOException {
        C20312d5 c20312d5 = this.f76147a;
        if (c20312d5 == null || c20312d5.f76265E != EnumC20424m5.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(m56247f()), f76146d));
        try {
            C20473d0 c20473d0 = (C20473d0) interfaceC20390j1.mo56239e(bufferedReader, C20473d0.class);
            bufferedReader.close();
            return c20473d0;
        } catch (Throwable th3) {
            try {
                bufferedReader.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public C20275c5(C20312d5 c20312d5, Callable callable) {
        this.f76147a = c20312d5;
        this.f76148b = callable;
        this.f76149c = null;
    }
}
