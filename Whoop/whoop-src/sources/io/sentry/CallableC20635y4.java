package io.sentry;

import com.iterable.iterableapi.CallableC5355n1;
import ge3.AbstractC15751g;
import io.sentry.exception.SentryEnvelopeException;
import io.sentry.protocol.C20485j0;
import io.sentry.util.AbstractC20582d;
import io.sentry.vendor.AbstractC20609a;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;
import p088dc.AbstractC11895b;

/* JADX INFO: renamed from: io.sentry.y4 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class CallableC20635y4 implements Callable {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ Object f77188E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f77189w = 0;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ long f77190x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC20390j1 f77191y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f77192z;

    public /* synthetic */ CallableC20635y4(C20040a c20040a, long j7, InterfaceC20390j1 interfaceC20390j1, InterfaceC20602v0 interfaceC20602v0) {
        this.f77192z = c20040a;
        this.f77190x = j7;
        this.f77191y = interfaceC20390j1;
        this.f77188E = interfaceC20602v0;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws SentryEnvelopeException {
        int i13 = this.f77189w;
        InterfaceC20390j1 interfaceC20390j1 = this.f77191y;
        Object obj = this.f77188E;
        long j7 = this.f77190x;
        Object obj2 = this.f77192z;
        switch (i13) {
            case 0:
                C20040a c20040a = (C20040a) obj2;
                InterfaceC20602v0 interfaceC20602v0 = (InterfaceC20602v0) obj;
                byte[] byteArray = c20040a.f75184a;
                String str = c20040a.f75187d;
                if (byteArray != null) {
                    C20275c5.m56241a(byteArray.length, j7, str);
                } else {
                    C20485j0 c20485j0 = c20040a.f75185b;
                    if (c20485j0 == null) {
                        CallableC5355n1 callableC5355n1 = c20040a.f75186c;
                        if (callableC5355n1 != null && (byteArray = (byte[]) callableC5355n1.call()) != null) {
                            C20275c5.m56241a(byteArray.length, j7, str);
                        }
                        throw new SentryEnvelopeException(AbstractC11895b.m31996o("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable, path or provider is set."));
                    }
                    Charset charset = AbstractC20582d.f77083a;
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, AbstractC20582d.f77083a));
                            try {
                                interfaceC20390j1.mo56235a(bufferedWriter, c20485j0);
                                byteArray = byteArrayOutputStream.toByteArray();
                                bufferedWriter.close();
                                byteArrayOutputStream.close();
                                if (byteArray != null) {
                                    C20275c5.m56241a(byteArray.length, j7, str);
                                }
                                throw new SentryEnvelopeException(AbstractC11895b.m31996o("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable, path or provider is set."));
                            } catch (Throwable th3) {
                                try {
                                    bufferedWriter.close();
                                    break;
                                } catch (Throwable th4) {
                                    th3.addSuppressed(th4);
                                }
                                throw th3;
                            }
                        } catch (Throwable th5) {
                            try {
                                byteArrayOutputStream.close();
                                break;
                            } catch (Throwable th6) {
                                th5.addSuppressed(th6);
                            }
                            throw th5;
                        }
                    } catch (Throwable th7) {
                        interfaceC20602v0.mo16060j(EnumC20436n5.ERROR, "Could not serialize serializable", th7);
                        byteArray = null;
                    }
                }
                return byteArray;
            default:
                File file = (File) obj2;
                C20539s3 c20539s3 = (C20539s3) obj;
                if (!file.exists()) {
                    throw new SentryEnvelopeException(AbstractC11895b.m31996o("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
                }
                String strM56731b = AbstractC20609a.m56731b(AbstractC15751g.m44435O(j7, file.getPath()));
                if (strM56731b.isEmpty()) {
                    throw new SentryEnvelopeException("Profiling trace file is empty");
                }
                c20539s3.f76978b0 = strM56731b;
                try {
                    c20539s3.f76962L = (List) c20539s3.f76981x.call();
                    break;
                } catch (Throwable unused) {
                }
                try {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, C20275c5.f76146d));
                            try {
                                interfaceC20390j1.mo56235a(bufferedWriter2, c20539s3);
                                byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                bufferedWriter2.close();
                                byteArrayOutputStream2.close();
                                file.delete();
                                return byteArray2;
                            } catch (Throwable th8) {
                                try {
                                    bufferedWriter2.close();
                                    break;
                                } catch (Throwable th9) {
                                    th8.addSuppressed(th9);
                                }
                                throw th8;
                            }
                        } catch (Throwable th10) {
                            try {
                                byteArrayOutputStream2.close();
                                break;
                            } catch (Throwable th11) {
                                th10.addSuppressed(th11);
                            }
                            throw th10;
                        }
                    } catch (Throwable th12) {
                        file.delete();
                        throw th12;
                    }
                } catch (IOException e5) {
                    throw new SentryEnvelopeException("Failed to serialize profiling trace data\n" + e5.getMessage());
                }
        }
    }

    public /* synthetic */ CallableC20635y4(File file, long j7, C20539s3 c20539s3, InterfaceC20390j1 interfaceC20390j1) {
        this.f77192z = file;
        this.f77190x = j7;
        this.f77188E = c20539s3;
        this.f77191y = interfaceC20390j1;
    }
}
